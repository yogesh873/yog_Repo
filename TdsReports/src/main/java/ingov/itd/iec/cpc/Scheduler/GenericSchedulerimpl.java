package ingov.itd.iec.cpc.Scheduler;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.atteo.classindex.ClassIndex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;


import ingov.itd.iec.cpc.annotations.Connector;
import ingov.itd.iec.cpc.annotations.Sinkconnector;
import ingov.itd.iec.cpc.annotations.Sourceconnector;
import ingov.itd.iec.cpc.api.exception.ConnectorException;
import ingov.itd.iec.cpc.serviceimpl.ConnectorServiceimpl;

@Service
@EnableScheduling
public class GenericSchedulerimpl {

	Map<String,Map<String,String>> querycache = new HashMap<>();
	public static final Logger logger = LoggerFactory.getLogger(GenericSchedulerimpl.class);

	
	@Autowired
	ConnectorServiceimpl connservice;
	
	@PostConstruct
		public void createquery() {
		
		String connectorName = null;
		String sourcecountquery = null;
		String sourcemaxidquery = null;
		String sinkcountquery = null;
		String sinkmaxidquery = null;
		String sourcedb = null;
		String sinkdb = null ;
		String id = null;
		/*
		 * ClassLoader clssloader = Thread.currentThread().getContextClassLoader();
		 * Package[] pkg = clssloader.getDefinedPackages(); Arrays.stream(pkg).filter(p
		 * -> p.getName().equals("ingov.itd.iec.cpc.api.connector")).forEach(p ->
		 * p.getName());
		 */
		Iterable<Class<?>> klassess = ClassIndex.getAnnotated(Connector.class);
		for (Class<?> klass : klassess) {
Annotation[] annotaions = new Annotation[3];

annotaions[0] = klass.getAnnotations()[0];
Method srcqrymthd = null;
try {
	
	srcqrymthd = klass.getDeclaredMethod("sourceQueries");
	annotaions[1] = srcqrymthd.getAnnotations()[0];
	annotaions[2] = klass.getDeclaredMethod("sinkQueries").getAnnotations()[0];
	
} catch (NoSuchMethodException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (SecurityException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

for(Annotation antn:annotaions)	{
	
	if(antn instanceof Connector)
	{
		
	Connector conn =	(Connector) antn;
	connectorName =conn.name();
	id = conn.id();
		
	}
	else if(antn instanceof Sourceconnector) {
		Sourceconnector sourceconn = (Sourceconnector)antn;
		sourcemaxidquery = sourceconn.getsourcemaxId();
		 
		 String add = null;
		 try {
			 add = (String)srcqrymthd.invoke(klass);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 sourcecountquery = sourceconn.getSourceCount()+add;
		 sourcedb = sourceconn.getdb();
		
	}
	else if((antn instanceof Sinkconnector)) {
	Sinkconnector  sinkconn = (Sinkconnector) antn;
	
	sinkcountquery = ((Sinkconnector) antn).getsinkcount();
	sinkmaxidquery = 	((Sinkconnector) antn).getsinkmaxid();
	
	sinkdb = sinkconn.getdb();
	}
	
	
	
	
}

Map<String,String> temp = new HashMap<>();
temp.put("id",id);
temp.put("sourcecountquery",sourcecountquery);
temp.put("sourcemaxidquery",sourcemaxidquery);
temp.put("sinkcountquery",sinkcountquery);
temp.put("sinkmaxidquery",sinkmaxidquery);
temp.put("sinkdb",sinkdb);

temp.put("sourcedb",sourcedb);

querycache.put(klass.getName(),temp);

		}
	}


	@Scheduled(fixedDelay = 20000)
	public void run() throws IOException {
		
		Iterable<String> klassess = ClassIndex.getAnnotatedNames(Connector.class);
		
for(String klassname:klassess) {
	
HashMap<String,String> queries =	(HashMap<String, String>) querycache.get(klassname);
try {
connservice.generateReport(queries,klassname);
}	catch(ConnectorException e) {
	
	logger.info(e.getMessage());
	logger.error(e.getMessage());
}

}
		
	}
}
