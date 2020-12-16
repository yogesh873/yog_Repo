package ingov.itd.iec.cpc.api.service;

public interface ReportService {

	
	
	public void createReport(int stgCount,int inwardedCount,int smrsedCount);
	
	public void updateLastReadValue(int maxOutId,int receiptId);
	
	
}
