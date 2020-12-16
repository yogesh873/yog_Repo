package ingov.itd.iec.cpc.dao;

public interface TdsVerification {

	public Integer getAllNonDupSum(String panNumber,String tanNumber,int ay);
	
	public Integer getDupSum(String panNumber,String tanNumber,int ay);
	
	
	
	
	
	
	
}
