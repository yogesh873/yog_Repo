package ingov.itd.iec.cpc.api.daoimpl;

import java.math.BigInteger;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ingov.itd.iec.cpc.dao.TdsCountDao;

@Repository
public class TdsCountDaoimpl implements TdsCountDao {

	@Autowired
	@Qualifier("sessonFactoryOracle")
	SessionFactory sforacle;
	
	
	
	@Transactional
	public BigInteger getMaxOutId() {
		Session oracle = sforacle.openSession();
		TypedQuery query = oracle.getNamedQuery("maxOutId");    
		BigInteger maxoutId =  (BigInteger) query.getSingleResult();
		
		return maxoutId;
		
	}
	
	@Transactional
	public Long getStgCount(BigInteger minoutid, BigInteger maxoutud, int ay) {
		
		Session oracle = sforacle.openSession();
		TypedQuery query = oracle.getNamedQuery("StgCount");  
		query.setParameter(1, minoutid);
		query.setParameter(2, maxoutud);
		Long StgCount =  (Long) query.getSingleResult();
		
		return StgCount;
	}

	

	

	


	public BigInteger getMinOutId() {
		// TODO Auto-generated method stub
		Session oracle = sforacle.openSession();
		TypedQuery query = oracle.getNamedQuery("minOutId");    
		BigInteger minoutId =  (BigInteger) query.getSingleResult();
		sforacle.close();
		return minoutId;
	}

	

}
