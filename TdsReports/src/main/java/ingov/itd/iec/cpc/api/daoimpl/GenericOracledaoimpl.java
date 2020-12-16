package ingov.itd.iec.cpc.api.daoimpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import ingov.itd.iec.cpc.dao.Genericdao;



@Repository("stgoracle")
public class GenericOracledaoimpl implements Genericdao {

	
	
	@Autowired
	@Qualifier("sessonFactoryOracle")
	SessionFactory sforacle;
	
	@Override
	public Long runwithdb(String hql) {
		// TODO Auto-generated method stub
		Session oracle = sforacle.openSession();
		TypedQuery qry = oracle.createQuery(hql);
		long count  = (long) qry.getSingleResult();
		return count;
	}

	@Override
	public Long runwithdb(String hql, long sinklastreadid, long currentsinkmaxid) {
		
		Session oracle = sforacle.openSession();
		TypedQuery qry = oracle.createQuery(hql);
		qry.setParameter(1, sinklastreadid);
		qry.setParameter(2, currentsinkmaxid);
		long count  = (long) qry.getSingleResult();
		return count;
	}

}
