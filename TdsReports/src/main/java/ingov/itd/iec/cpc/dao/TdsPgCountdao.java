package ingov.itd.iec.cpc.dao;

import java.math.BigInteger;

public interface TdsPgCountdao {
	
public Long getTdsAllCount(BigInteger minoutid,BigInteger maxoutid,int ay);
	
	
	public Integer  getSummarisedCount(long minoutid,long maxoutid);


}
