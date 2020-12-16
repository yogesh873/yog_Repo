package ingov.itd.iec.cpc.api.connector;

import ingov.itd.iec.cpc.annotations.Connector;
import ingov.itd.iec.cpc.annotations.Sinkconnector;
import ingov.itd.iec.cpc.annotations.Sourceconnector;
import ingov.itd.iec.cpc.api.ssl.Offsetchecker;

@Connector(id = "tds26asOutId", name = "TdsInwarding")
public class TdsInwardingConnector {

	public TdsInwardingConnector() {};
	
	@Sourceconnector(
getSourceCount = "select count(*) from Tds26asOutbndStg Where tds26asoutId >= ?1 and tds26asoutId < ?2", 
getsourcemaxId = "select max(tds26asOutId) from Tds26asOutbndStg ", getdb = "stgoracle" )
	public String sourceQueries()
	{ 
		try {
			Offsetchecker.runCommand("yk1045590","Production@1234","10.176.24.245",22,"./offsetchecker.sh");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		String add = "and assess_year >= '2020'";
		return add;
		
	}
	@Sinkconnector(getsinkmaxid = "select max(tds26asOutId) from TdsReceiptAll",
			getsinkcount = "select count(*) from TdsReceiptAll  Where tds26asOutId >= ?1 and tds26asOutId < ?2 ",
			getdb = "postgress")
	public String sinkQueries()
	{
		return null;
		
	}
	
}
