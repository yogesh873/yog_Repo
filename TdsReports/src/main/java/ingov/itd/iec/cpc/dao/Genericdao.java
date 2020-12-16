package ingov.itd.iec.cpc.dao;

public interface Genericdao {

	
	public Long runwithdb(String hql);

	public Long runwithdb(String srccnt, long sinklastreadid, long currentsinkmaxid);
	
	
	
}
