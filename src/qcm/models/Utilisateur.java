package qcm.models;

import java.util.List;
import java.util.ArrayList;


/**
* Classe Utilisateur
*/
public class Utilisateur {
	private int id;
	private String mail;
	private String nom;
	private String password;
	private String prenom;
	private int rang_id;
	private Rang rang;
	private List<Groupe_utilisateur> groupe_utilisateurs;
	private List<Realisation> realisations;

	public Utilisateur() {
		super();
		realisations=new ArrayList<>();groupe_utilisateurs=new ArrayList<>();rang=new Rang();
	}
	/**
	 * return the value of id
	 * @return id
	 */
	public int getId(){
		return this.id;
	}
	/**
	 * return the value of mail
	 * @return mail
	 */
	public String getMail(){
		return this.mail;
	}
	/**
	 * return the value of nom
	 * @return nom
	 */
	public String getNom(){
		return this.nom;
	}
	/**
	 * return the value of password
	 * @return password
	 */
	public String getPassword(){
		return this.password;
	}
	/**
	 * return the value of prenom
	 * @return prenom
	 */
	public String getPrenom(){
		return this.prenom;
	}
	/**
	 * return the value of rang_id
	 * @return rang_id
	 */
	public int getRang_id(){
		return this.rang_id;
	}
	/**
	 * return the value of rang
	 * @return rang
	 */
	public Rang getRang(){
		return this.rang;
	}
	/**
	 * return the value of groupe_utilisateurs
	 * @return groupe_utilisateurs
	 */
	public List<Groupe_utilisateur> getGroupe_utilisateurs(){
		return this.groupe_utilisateurs;
	}
	/**
	 * return the value of realisations
	 * @return realisations
	 */
	public List<Realisation> getRealisations(){
		return this.realisations;
	}

	/**
	 * set the value of id
	 * @param aId
	 */
	public void setId(int aId){
		this.id=aId;
	}
	/**
	 * set the value of mail
	 * @param aMail
	 */
	public void setMail(String aMail){
		this.mail=aMail;
	}
	/**
	 * set the value of nom
	 * @param aNom
	 */
	public void setNom(String aNom){
		this.nom=aNom;
	}
	/**
	 * set the value of password
	 * @param aPassword
	 */
	public void setPassword(String aPassword){
		this.password=aPassword;
	}
	/**
	 * set the value of prenom
	 * @param aPrenom
	 */
	public void setPrenom(String aPrenom){
		this.prenom=aPrenom;
	}
	/**
	 * set the value of rang_id
	 * @param aRang_id
	 */
	public void setRang_id(int aRang_id){
		this.rang_id=aRang_id;
	}
	/**
	 * set the value of rang
	 * @param aRang
	 */
	public void setRang(Rang aRang){
		this.rang=aRang;
	}
	/**
	 * set the value of groupe_utilisateurs
	 * @param aGroupe_utilisateurs
	 */
	public void setGroupe_utilisateurs(List<Groupe_utilisateur> aGroupe_utilisateurs){
		this.groupe_utilisateurs=aGroupe_utilisateurs;
	}
	/**
	 * set the value of realisations
	 * @param aRealisations
	 */
	public void setRealisations(List<Realisation> aRealisations){
		this.realisations=aRealisations;
	}
	@Override
	public String toString() {
		return " [password] = " + password+" [mail] = " + mail+" [rang_id] = " + rang_id+" [id] = " + id+" [nom] = " + nom+" [prenom] = " + prenom;
	}
}