package etudiant;

public class Etudiant {
	private int codeEtudiant;
	private String nom;
	private float moyenne;
	/**
	 * @return the codeEtudiant
	 */
	public int getCodeEtudiant() {
		return codeEtudiant;
	}
	/**
	 * @param codeEtudiant the codeEtudiant to set
	 */
	public void setCodeEtudiant(int codeEtudiant) {
		this.codeEtudiant = codeEtudiant;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
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
		return moyenne;
	}
	/**
	 * @param moyenne the moyenne to set
	 */
	public void setMoyenne(float moyenne) {
		this.moyenne = moyenne;
	}
	
	public boolean calculMoyenne() 
	{
		if (moyenne < 10) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	

}
