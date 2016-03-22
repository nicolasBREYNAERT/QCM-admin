package qcm.models;

import java.util.List;
import java.util.ArrayList;


/**
* Classe Groupe
*/
public class Groupe {
	private String code;
	private int id;
	private String libelle;
	private List<Groupe_questionnaire> groupe_questionnaires;
	private List<Groupe_utilisateur> groupe_utilisateurs;

	public Groupe() {
		super();
		groupe_utilisateurs=new ArrayList<>();groupe_questionnaires=new ArrayList<>();
	}
	/**
	 * return the value of code
	 * @return code
	 */
	public String getCode(){
		return this.code;
	}
	/**
	 * return the value of id
	 * @return id
	 */
	public int getId(){
		return this.id;
	}
	/**
	 * return the value of libelle
	 * @return libelle
	 */
	public String getLibelle(){
		return this.libelle;
	}
	/**
	 * return the value of groupe_questionnaires
	 * @return groupe_questionnaires
	 */
	public List<Groupe_questionnaire> getGroupe_questionnaires(){
		return this.groupe_questionnaires;
	}
	/**
	 * return the value of groupe_utilisateurs
	 * @return groupe_utilisateurs
	 */
	public List<Groupe_utilisateur> getGroupe_utilisateurs(){
		return this.groupe_utilisateurs;
	}

	/**
	 * set the value of code
	 * @param aCode
	 */
	public void setCode(String aCode){
		this.code=aCode;
	}
	/**
	 * set the value of id
	 * @param aId
	 */
	public void setId(int aId){
		this.id=aId;
	}
	/**
	 * set the value of libelle
	 * @param aLibelle
	 */
	public void setLibelle(String aLibelle){
		this.libelle=aLibelle;
	}
	/**
	 * set the value of groupe_questionnaires
	 * @param aGroupe_questionnaires
	 */
	public void setGroupe_questionnaires(List<Groupe_questionnaire> aGroupe_questionnaires){
		this.groupe_questionnaires=aGroupe_questionnaires;
	}
	/**
	 * set the value of groupe_utilisateurs
	 * @param aGroupe_utilisateurs
	 */
	public void setGroupe_utilisateurs(List<Groupe_utilisateur> aGroupe_utilisateurs){
		this.groupe_utilisateurs=aGroupe_utilisateurs;
	}
	@Override
	public String toString() {
		return " [code] = " + code+" [libelle] = " + libelle+" [id] = " + id;
	}
}