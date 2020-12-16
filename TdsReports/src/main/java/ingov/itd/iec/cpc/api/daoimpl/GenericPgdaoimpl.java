package ingov.itd.iec.cpc.api.daoimpl;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;


import ingov.itd.iec.cpc.dao.Genericdao;

@Repository("postgress")
public class GenericPgdaoimpl implements Genericdao {

	@Autowired

	@Qualifier("sessionFactorypostgrees")
	SessionFactory pgSf;
	
	@Override
	
	public Long runwithdb(String hql) {
		Session pgsession = pgSf.openSession();
		TypedQuery qry = pgsession.createQuery(hql);
		Long count  = (long) qry.getSingleResult();
		return count;
		
	}
	@Override
	public Long runwithdb(String hql, long sinklastreadid, long currentsinkmaxid) {
		
		Session pgsession = pgSf.openSession();
		TypedQuery qry = pgsession.createQuery(hql);
		qry.setParameter(1, sinklastreadid);
		qry.setParameter(2, currentsinkmaxid);
		long count  = (long) qry.getSingleResult();
		return count;
	}
}
