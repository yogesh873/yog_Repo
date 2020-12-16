package ingov.itd.iec.cpc.api.daoimpl;

import java.math.BigInteger;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import ingov.itd.iec.cpc.dao.TdsPgCountdao;

@Repository
public class TdsPgCountdaoimpl implements TdsPgCountdao {

	@Autowired

	@Qualifier("sessionFactorypostgrees")
	SessionFactory pgSf;

	public Long getTdsAllCount(BigInteger minoutid, BigInteger maxoutud, int ay) { // TODO Auto-generated method stub
				Session pgSession = pgSf.openSession(); 																	// Session pgSession =
																					// sfpg.openSession();
		TypedQuery query = pgSession.getNamedQuery("InwwardedCount");
		query.setParameter(1, minoutid);
		query.setParameter(2, maxoutud);
		Long tdsAllCount = (Long) query.getSingleResult();
		pgSession.close();
		return tdsAllCount;

	}

	@Override
	public Integer getSummarisedCount(long minoutid, long maxoutid) {
		// TODO Auto-generated method stub
		return null;
	}

}
