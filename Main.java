package Restaurant;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Menu> menus = new ArrayList<Menu>();
		menus.add(new Menu("nann",2.00));
		menus.add(new Menu("pouletcurry",9.50));
		menus.add(new Menu("legumescurry",7.90));
		System.out.println("                    Menus dans notre Restaurant                  ");
		for(Menu m : menus)//for every Menu object m present in the menu list
		{
		m.displayMenuInfo();			
		}
		
		Scanner sc = new Scanner(System.in);

		System.out.println("entrer plats:  ");
		String comPnom = sc.next();
		System.out.println("entrer platsquantity:  ");
		int qtyPnom = sc.nextInt();
		
		System.out.println(comPnom);
		Orders order=new Orders(comPnom,qtyPnom);
		
		//object order created for Orders Class
		order.Addition(menus);
		
		
		}
			
		
		
		
		
		

	}


