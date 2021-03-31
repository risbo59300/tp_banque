package persistence.Dao;

import java.math.BigDecimal;

import org.hibernate.Session;

import persistance.entities.Etudiant;
import persistence.util.HibernateUtil;

public class EtudiantImpl {
	
	public Etudiant findById(int id) 
	{
		Session s = HibernateUtil.getSessionFactory().openSession();
		
		Etudiant e = s.get(Etudiant.class, new BigDecimal(id));
		s.close();
		return e;
	}
}
