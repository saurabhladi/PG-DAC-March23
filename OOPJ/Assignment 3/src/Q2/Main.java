package Q2;

import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	
	public static boolean acceptRecord(Restaurant rest) {
		System.out.println("Enter the name of the dish");
		String name = sc.nextLine();
		System.out.println("Enter the price of the dish");
		String price = sc.nextLine();
		return rest.acceptDish(name, price);
	}
	
	public static boolean changePrice(Restaurant rest) {
		System.out.println("Enter the name of the dish for which you want to change the price");
	
		String name = sc.nextLine();
		System.out.println("Enter the updated price of the dish");
		String price = sc.nextLine();
		return rest.changePrice(name, price);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurant rest = new Restaurant();
		int choice=0;
		while( choice != 5) {
			choice = Restaurant.menu(rest);
			switch (choice) {
			case 1:
				rest.viewRecord();
				break;
			case 2: 
				System.out.println(acceptRecord(rest) ? "Added successfully" : "Not Successful");
				rest.viewRecord();
				break;
			case 3: 
				System.out.println("Enter the name of the dish to be removed");
				System.out.println(rest.removeRecord(sc.nextLine())? "Removed successfully" : "Not found");
				rest.viewRecord();
				break;
			case 4: 
				System.out.println(changePrice(rest) ? "Success" : "Not Successful");
				rest.viewRecord();
				break;
			case 5: 
				System.out.println("Thank You  :) ");
				System.out.println("Visit Again...!!!  ");
				//System.exit(0);
				break;
				
				default:
					System.out.println("Enter appropriate choice ");
				System.out.println();
				
			}
		}
	}

}