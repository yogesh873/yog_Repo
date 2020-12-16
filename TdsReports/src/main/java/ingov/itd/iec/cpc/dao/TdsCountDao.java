package ingov.itd.iec.cpc.dao;

import java.math.BigInteger;

public interface TdsCountDao {

	
	public Long getStgCount(BigInteger minoutid,BigInteger maxoutid,int ay );
	
	
	public BigInteger getMaxOutId();

	public BigInteger getMinOutId();
	
	
	
	
	
}
