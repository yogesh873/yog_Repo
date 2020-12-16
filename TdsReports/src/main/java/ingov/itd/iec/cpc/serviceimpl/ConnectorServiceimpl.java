package ingov.itd.iec.cpc.serviceimpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import ingov.itd.iec.cpc.api.daoimpl.*;
import ingov.itd.iec.cpc.api.exception.ConnectorException;
import ingov.itd.iec.cpc.api.service.ConnectorService;
import ingov.itd.iec.cpc.dao.Genericdao;


@Service
public class ConnectorServiceimpl implements ConnectorService {
	private static final Logger LOGGER = LoggerFactory.getLogger(ConnectorException.class);
	
	
	@Autowired
Map<String,	Genericdao> genericdao;
	
	

    
	
	
	String connectorName = null;
	String sourcecountquery = null;
	String sourcemaxidquery = null;
	String sinkcountquery = null;
	String sinkmaxidquery = null;
	String sourcedb = null;
	String sinkdb = null ;
	String id = null;
	
	
	//get the max if from source table
	//compare it with the sourcelastreadvalue  to get the no of new records in source
	//get the max id from target table
	//compare it with sinklastreadvalue to get the no of record in sink
	//if no new record in target but source get new record raise error that connector not working
	//calculate the lag(sourcemax - sinkmax) and print it in error
	//take count with sinklastreadvalue and sinkmaxid as boundary from both source and target
	//if count mismatches then raise error.
	//change sourcelastread and sinklastread values in propertyfile.
	
	
	
	@Override
	
	@Transactional
	public void generateReport(HashMap<String, String> queries,String connectorname) throws IOException, ConnectorException {
		File file = ResourceUtils.getFile("classpath:LastReadValue.properties");
	    InputStream in = new FileInputStream(file);
	    Properties props = new Properties();
		props.load(in);
		try {
		ConnectorException connectorerror = new ConnectorException(connectorname);
		String id = queries.get("id");
		String sourcedb = queries.get("sourcedb");
		String sinkdb = queries.get("sinkdb");
	String srcmaxidqry = queries.get("sourcemaxidquery");
	String snkmaxidqry = queries.get("sinkmaxidquery");
	Genericdao sourcedao = genericdao.get(sourcedb);
	Genericdao sinkdao = genericdao.get(sinkdb);
	long currentsourcemaxid =  sourcedao.runwithdb(srcmaxidqry);
	long currentsinkmaxid = sinkdao.runwithdb(snkmaxidqry);
	Long srclastreadid = Long.valueOf((String) props.get("source"+id));
	long sinklastreadid =  Long.valueOf((String) props.get("sink"+id));
	
	String srccntqry = queries.get("sourcecountquery");
	String snkcntqry = queries.get("sinkcountquery");
	
	long srccnt = sourcedao.runwithdb(srccntqry,sinklastreadid,currentsinkmaxid);
	long snkcnt=   sinkdao.runwithdb(snkcntqry,sinklastreadid,currentsinkmaxid);
	long lag = currentsourcemaxid - currentsinkmaxid;
	if(lag > 0)
		 connectorerror.addMessage("lag ="+lag);
	long gap = (srccnt - snkcnt);
	if(gap > 0)
		connectorerror.addMessage("gap ="+gap);
	long newsrcrcrd = (currentsourcemaxid - srclastreadid);
	long newsnkrcrd = (currentsinkmaxid - sinklastreadid );
	
	if(newsrcrcrd!= 0 && newsnkrcrd == 0) {
		
		connectorerror.addMessage("No new record in target table check connector status");	
	}
	props.setProperty("source"+id, String.valueOf(currentsourcemaxid));
	props.setProperty("sink"+id, String.valueOf(currentsinkmaxid));
			
			  OutputStream os = new FileOutputStream(file);
			   OutputStreamWriter osw= new	OutputStreamWriter(os); 
			   osw.write(props.toString()); 
			   osw.close();
			   os.close();
			 
	throw connectorerror;
	}
	catch(ConnectorException ce){
	LOGGER.error(ce.getMessage());
	}
	finally {
		if(in != null)
		in.close();
	}
	
	}

}
