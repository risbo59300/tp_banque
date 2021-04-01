package persistence.Dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import persistance.entities.Etudiant;
import persistence.util.HibernateUtil;

public class EtudiantDaoImpl {
	
	public Etudiant findById(int id) 
	{
		Session s = HibernateUtil.getSessionFactory().openSession();
		
		Etudiant e = s.get(Etudiant.class, new BigDecimal(id));
		s.close();
		return e;
	}
	
	
	public void add(Etudiant e) {
		 Session s = HibernateUtil.getSessionFactory().openSession(); // Ouvrir une session s

       Transaction tx = s.beginTransaction();// Commencer une transaction

       s.save(e);
       tx.commit();// Valider la transaction
       s.close();// Fermer la session
	}
	
	
	public List<Etudiant> findAll() 
	{
		  List<Etudiant> listeEtudiant = new ArrayList<Etudiant>();

	      Session s = HibernateUtil.getSessionFactory().openSession();

	      listeEtudiant = s.createQuery("from Etudiant").list();

	      return listeEtudiant;
	}
}
