package midProject_Mobile;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	ArrayList<Car> car = new ArrayList<>();
	ArrayList<Motorcycle> motorcycle = new ArrayList<>();
	
	void getGeneralInfo() {
		
	}
	
	void makeMotorcycle() {
		
	}
	
	void makeCar() {
		
	}
	
	void view() {
		
	}
	
	void makeVehicle() {
		boolean typeValid = false;
		String type;
		do {			
			System.out.print("Input type [Car | Motorcycle]");
			type = scan.nextLine();
			if(type.equalsIgnoreCase("car")) {
				typeValid = true;
				makeCar();
			} else if(type.equalsIgnoreCase("motorcycle")) {
				typeValid = true;
				makeMotorcycle();
			} else System.out.println("Wrong input, try again!");
		} while (!typeValid);
	}
	
	void menu() {
		boolean inApp = true;
		do {
			System.out.println("========================");
			System.out.println("Main menu");
			System.out.println("1. Input");
			System.out.println("2. View");
			System.out.println("3. Exit");
			System.out.print("Choose what you want to do >> ");
			int input = scan.nextInt(); scan.nextLine();
			switch (input) {
			case 1:
				makeVehicle();
				break;
			case 2:
				view();
				break;
			case 3:
				System.out.println("Thank you for using the application.");
				inApp = false;
				break;
			}
		} while (inApp);
		return;
	}
	
	public Main() {
		menu();
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
