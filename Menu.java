package Restaurant;

public class Menu {

	
	 private String plats;
	private  double prixUnitaire;//get and set methods to access
	public Menu(String plat,double prix)
	{
		this.plats = plat;
		this.prixUnitaire = prix;		
		
	}
	
	public double getPrixUnitaire() {//accessor method
		return prixUnitaire;
	}
	public void setPrixUnitaire(double prix) {//mutator(changes the value)
		prixUnitaire = prix;
	}
	public String getPlats() {
		return plats;
	}
	public void setPlats(String plat) {
		plats = plat;
	}
	public void displayMenuInfo() {
	System.out.println("Plats:" + plats + "--------------------PrixUnitaire:" +prixUnitaire);	
	}
	
	
	
	}


