package qcm.models;



/**
* Classe Groupe_questionnaire
*/
public class Groupe_questionnaire {
	private int groupe_id;
	private int questionnaire_id;
	private Groupe groupe;
	private Questionnaire questionnaire;

	public Groupe_questionnaire() {
		super();
		questionnaire=new Questionnaire();groupe=new Groupe();
	}
	/**
	 * return the value of groupe_id
	 * @return groupe_id
	 */
	public int getGroupe_id(){
		return this.groupe_id;
	}
	/**
	 * return the value of questionnaire_id
	 * @return questionnaire_id
	 */
	public int getQuestionnaire_id(){
		return this.questionnaire_id;
	}
	/**
	 * return the value of groupe
	 * @return groupe
	 */
	public Groupe getGroupe(){
		return this.groupe;
	}
	/**
	 * return the value of questionnaire
	 * @return questionnaire
	 */
	public Questionnaire getQuestionnaire(){
		return this.questionnaire;
	}

	/**
	 * set the value of groupe_id
	 * @param aGroupe_id
	 */
	public void setGroupe_id(int aGroupe_id){
		this.groupe_id=aGroupe_id;
	}
	/**
	 * set the value of questionnaire_id
	 * @param aQuestionnaire_id
	 */
	public void setQuestionnaire_id(int aQuestionnaire_id){
		this.questionnaire_id=aQuestionnaire_id;
	}
	/**
	 * set the value of groupe
	 * @param aGroupe
	 */
	public void setGroupe(Groupe aGroupe){
		this.groupe=aGroupe;
	}
	/**
	 * set the value of questionnaire
	 * @param aQuestionnaire
	 */
	public void setQuestionnaire(Questionnaire aQuestionnaire){
		this.questionnaire=aQuestionnaire;
	}
	@Override
	public String toString() {
		return " [questionnaire_id] = " + questionnaire_id+" [groupe_id] = " + groupe_id;
	}
}