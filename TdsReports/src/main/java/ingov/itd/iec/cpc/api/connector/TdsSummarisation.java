package ingov.itd.iec.cpc.api.connector;

import ingov.itd.iec.cpc.annotations.Connector;
import ingov.itd.iec.cpc.annotations.Sinkconnector;
import ingov.itd.iec.cpc.annotations.Sourceconnector;

@Connector(id = "receiptId", name = "TdsSummarisation")
public class TdsSummarisation {

	
	@Sourceconnector(getSourceCount = "select count(distinct receipt_number) from TdsReceiptAll where receiptid > ?1 and receiptid < ?2", 
			getdb = "postgress", 
			getsourcemaxId = "select max(receiptid) from TdsReceiptAll")
	public String sourceQueries() {
		
		return "and receiptCntlStatus = 'N'";
	}
	
	@Sinkconnector(getdb = "postgress", 
			getsinkcount = "select count(*) from TdsReceiptAllUnq where receiptId > ?1 and receiptId < ?2 ",
			getsinkmaxid = "select max(receiptid) from TdsReceiptAllUnq")
	public void sinkQueries() {
		
		
	}
	
	
}
