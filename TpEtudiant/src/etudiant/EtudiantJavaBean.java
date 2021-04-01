package etudiant;

import persistance.entities.Etudiant;
import persistence.Dao.EtudiantDaoImpl;

public class EtudiantJavaBean{
	private int codeEtudiant;
	private String nom;
	private float moyenne;
	/**
	 * @return the codeEtudiant
	 */
	
	EtudiantDaoImpl etudianImpl=new EtudiantDaoImpl();
	Etudiant etudiant=new Etudiant();
	public int getCodeEtudiant() {
		return codeEtudiant;
	}
	/**
	 * @param codeEtudiant the codeEtudiant to set
	 */
	public void setCodeEtudiant(int codeEtudiant) {
		this.codeEtudiant = codeEtudiant;
		etudiant = etudianImpl.findById(codeEtudiant);
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return etudiant.getNom();
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the moyenne
	 */
	public float getMoyenne() {
		return etudiant.getMoyenne().floatValue();
	}
	/**
	 * @param moyenne the moyenne to set
	 */
	public void setMoyenne(float moyenne) {
		this.moyenne = moyenne;
	}
	
	public boolean calculMoyenne() 
	{
		if (getMoyenne() < 10) 
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	

}
