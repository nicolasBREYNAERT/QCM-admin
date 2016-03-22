package qcm.models;

import java.util.List;
import java.util.ArrayList;


/**
* Classe Questionnaire
*/
public class Questionnaire {
	private java.sql.Date date;
	private int domaine_id;
	private int id;
	private String libelle;
	private Domaine domaine;
	private List<Groupe_questionnaire> groupe_questionnaires;
	private List<Question> questions;
	private List<Realisation> realisations;

	public Questionnaire() {
		super();
		realisations=new ArrayList<>();questions=new ArrayList<>();groupe_questionnaires=new ArrayList<>();domaine=new Domaine();
	}
	/**
	 * return the value of date
	 * @return date
	 */
	public java.sql.Date getDate(){
		return this.date;
	}
	/**
	 * return the value of domaine_id
	 * @return domaine_id
	 */
	public int getDomaine_id(){
		return this.domaine_id;
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
	 * return the value of domaine
	 * @return domaine
	 */
	public Domaine getDomaine(){
		return this.domaine;
	}
	/**
	 * return the value of groupe_questionnaires
	 * @return groupe_questionnaires
	 */
	public List<Groupe_questionnaire> getGroupe_questionnaires(){
		return this.groupe_questionnaires;
	}
	/**
	 * return the value of questions
	 * @return questions
	 */
	public List<Question> getQuestions(){
		return this.questions;
	}
	/**
	 * return the value of realisations
	 * @return realisations
	 */
	public List<Realisation> getRealisations(){
		return this.realisations;
	}

	/**
	 * set the value of date
	 * @param aDate
	 */
	public void setDate(java.sql.Date aDate){
		this.date=aDate;
	}
	/**
	 * set the value of domaine_id
	 * @param aDomaine_id
	 */
	public void setDomaine_id(int aDomaine_id){
		this.domaine_id=aDomaine_id;
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
	 * set the value of domaine
	 * @param aDomaine
	 */
	public void setDomaine(Domaine aDomaine){
		this.domaine=aDomaine;
	}
	/**
	 * set the value of groupe_questionnaires
	 * @param aGroupe_questionnaires
	 */
	public void setGroupe_questionnaires(List<Groupe_questionnaire> aGroupe_questionnaires){
		this.groupe_questionnaires=aGroupe_questionnaires;
	}
	/**
	 * set the value of questions
	 * @param aQuestions
	 */
	public void setQuestions(List<Question> aQuestions){
		this.questions=aQuestions;
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
		return " [date] = " + date+" [libelle] = " + libelle+" [domaine_id] = " + domaine_id+" [id] = " + id;
	}
}