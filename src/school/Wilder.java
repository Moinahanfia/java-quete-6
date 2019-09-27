// creation package
package school;
// creation classe_contenant_methode_debut
public class Wilder {

	// Mes_attribut + valeur_ou_valeur_par_défaut_en privé
	private String firstname = null;

	private boolean aware = true;

	// Le_constructeur : public + nom_de_ma_classe + (mes_attributs)_guillemet
	public Wilder(String firstname, boolean aware) {

		// this.nom_de_mon_attribut: new nom_de_mon_attribut = getter
		this.firstname = firstname;
		this.aware = aware;
	}
	//fin_constructeur
	
	//getteur_seteur_premier_attribut_en_public
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	//getteur_setteur_second_attribut_en_public
	public boolean isAware() {
		return aware;
	}

	public void setAware(boolean aware) {
		this.aware = aware;
	}

	// creation methode_que_nomme_par_exemple_whoAmI - S_le_bolean_est_true_alors_elle_renvoie_sinon_elle_renvoie
	public String whoAmI() {
		if (aware = true) {
			return "Je m'appelle " + firstname + " et je suis aware";
		} else {
			return " Je m'appelle " + firstname + " je ne suis pas aware";
		}
	}

}
