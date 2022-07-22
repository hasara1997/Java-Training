package factory;
import java.util.Scanner;

public class Koththu {

	public static void main(String[] args) {
		
		boolean order = true;
		
		System.out.println(" Welcome to Koththu Lab\n\n ");
		
		do {
			
			System.out.println("Please enter the preferred koththu you want \n 1.Vegetable Koththu\n 2.Chicken Koththu\n 3.Cheese Koththu\n\n ");
		
		    Scanner sc = new Scanner(System.in);
		    int type = sc.nextInt();
		    
		    switch (type) {
			case 1:
				System.out.println(KoththuFactory.orderKoththu(KoththuCode.VEG));
				break;
			case 2:
				System.out.println(KoththuFactory.orderKoththu(KoththuCode.ChICKEN));
				break;
			case 3:
				System.out.println(KoththuFactory.orderKoththu(KoththuCode.CHEESY));
				break;

			default:
				System.out.println("Please enter the valid order type");
			}
		    
		    System.out.println("Do you want to make anothder order \n 1.Yes\n 2.No  ");
		    Scanner sc1 = new Scanner(System.in);
		    int status = sc1.nextInt();
		    
		    if(status == 1) {
		    	order = true;
		    }
		    else if (status == 2 ) {
				order = false;
			}
		    else {
				System.out.println("Please enter a valid number");
			}
		
		
		} while (order == true);

	}

}
