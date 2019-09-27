//creation package
package school;
//creation de_classe_principale pour_execution_programme
public class Classroom {

	
	public void main(String[] args) {
		
	// La_classe_methode_devient_un_attribut_contenant_les_caracteristiques_Wilder
		//creation_des_news_wilder_appelé_camarade
		Wilder camarade  = new Wilder("Jean pierre" , true); 
		System.out.println(camarade.whoAmI());

		Wilder camarade2  = new Wilder("Henri" ,false); 
		System.out.println(camarade2.whoAmI());
		
	}

}
