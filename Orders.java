package Restaurant;
import java.util.*;

public class Orders {
	
	 String comPnom;
	 int qtyPnom;
	 Menu menu;
	public Orders(String s, int q)
	{
		this.comPnom = s;
		this.qtyPnom = q;
		
	}
	public void  Addition(ArrayList<Menu> menus){
		double tot=0.00;
		//String x;
	
		for(Menu m:menus)//for each menu present in menus
		{

				if(m.getPlats().equals(this.comPnom))
				{
			tot=m.getPrixUnitaire()*qtyPnom;
			this.menu = m;
			}		
		}
		
		//x: System.out.println("Bonne journeé");
		if (tot == 0) {
			System.out.println("Non Addition");
		}
		else {
			tot = menu.getPrixUnitaire()*qtyPnom;
			System.out.println("                                   RESTAURANT INDIEN"+"\n"
		                       +"L'Addition De Client"+"\n"
			                   +"Les Plats                                "+this.comPnom+"\n"		
			                   +"Les Plats quantity                       "+qtyPnom+"\n"
			                   +"Le PrixUnitaire                          "+menu.getPrixUnitaire()+"\n"
	
		                       +"Le Prix Totale                           "+tot);
		}
		
		
		
	}
	
	
}
