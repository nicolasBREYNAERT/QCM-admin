package qcm.models;



/**
* Classe Reponse_utilisateur
*/
public class Reponse_utilisateur {
	private int realisation_id;
	private int reponse_id;
	private Realisation realisation;
	private Reponse reponse;

	public Reponse_utilisateur() {
		super();
		reponse=new Reponse();realisation=new Realisation();
	}
	/**
	 * return the value of realisation_id
	 * @return realisation_id
	 */
	public int getRealisation_id(){
		return this.realisation_id;
	}
	/**
	 * return the value of reponse_id
	 * @return reponse_id
	 */
	public int getReponse_id(){
		return this.reponse_id;
	}
	/**
	 * return the value of realisation
	 * @return realisation
	 */
	public Realisation getRealisation(){
		return this.realisation;
	}
	/**
	 * return the value of reponse
	 * @return reponse
	 */
	public Reponse getReponse(){
		return this.reponse;
	}

	/**
	 * set the value of realisation_id
	 * @param aRealisation_id
	 */
	public void setRealisation_id(int aRealisation_id){
		this.realisation_id=aRealisation_id;
	}
	/**
	 * set the value of reponse_id
	 * @param aReponse_id
	 */
	public void setReponse_id(int aReponse_id){
		this.reponse_id=aReponse_id;
	}
	/**
	 * set the value of realisation
	 * @param aRealisation
	 */
	public void setRealisation(Realisation aRealisation){
		this.realisation=aRealisation;
	}
	/**
	 * set the value of reponse
	 * @param aReponse
	 */
	public void setReponse(Reponse aReponse){
		this.reponse=aReponse;
	}
	@Override
	public String toString() {
		return " [realisation_id] = " + realisation_id+" [reponse_id] = " + reponse_id;
	}
}