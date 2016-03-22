package qcm.models;



/**
* Classe Groupe_utilisateur
*/
public class Groupe_utilisateur {
	private int groupe_id;
	private int utilisateur_id;
	private Groupe groupe;
	private Utilisateur utilisateur;

	public Groupe_utilisateur() {
		super();
		utilisateur=new Utilisateur();groupe=new Groupe();
	}
	/**
	 * return the value of groupe_id
	 * @return groupe_id
	 */
	public int getGroupe_id(){
		return this.groupe_id;
	}
	/**
	 * return the value of utilisateur_id
	 * @return utilisateur_id
	 */
	public int getUtilisateur_id(){
		return this.utilisateur_id;
	}
	/**
	 * return the value of groupe
	 * @return groupe
	 */
	public Groupe getGroupe(){
		return this.groupe;
	}
	/**
	 * return the value of utilisateur
	 * @return utilisateur
	 */
	public Utilisateur getUtilisateur(){
		return this.utilisateur;
	}

	/**
	 * set the value of groupe_id
	 * @param aGroupe_id
	 */
	public void setGroupe_id(int aGroupe_id){
		this.groupe_id=aGroupe_id;
	}
	/**
	 * set the value of utilisateur_id
	 * @param aUtilisateur_id
	 */
	public void setUtilisateur_id(int aUtilisateur_id){
		this.utilisateur_id=aUtilisateur_id;
	}
	/**
	 * set the value of groupe
	 * @param aGroupe
	 */
	public void setGroupe(Groupe aGroupe){
		this.groupe=aGroupe;
	}
	/**
	 * set the value of utilisateur
	 * @param aUtilisateur
	 */
	public void setUtilisateur(Utilisateur aUtilisateur){
		this.utilisateur=aUtilisateur;
	}
	@Override
	public String toString() {
		return " [utilisateur_id] = " + utilisateur_id+" [groupe_id] = " + groupe_id;
	}
}