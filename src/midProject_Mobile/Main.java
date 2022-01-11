package midProject_Mobile;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	ArrayList<Vehicle> vehicles = new ArrayList<>();
	
	String brand, name, license, type;
	int topSpeed, gasCap, wheel, helm, entertainmentSystem;
	Car newCar = new Car();
	Motorcycle newMotorcycle = new Motorcycle();
	
	void makeMotorcycle() {
		Motorcycle newMotor = new Motorcycle();
		newMotor.setCarOrBike("Motorcycle");
		
		boolean brandValid = false;
		do {
			System.out.print("Input brand [>=5]: ");
			brand = scan.nextLine();
			brandValid = brand.length() >= 5;
			if (!brandValid) System.out.println("Input failed, brand length must be atleast 5 characters long");
		} while (!brandValid);
		newMotor.setBrand(brand);
		
		boolean nameValid = false;
		do {
			System.out.print("Input name [>=5]: ");
			name = scan.nextLine();
			nameValid = name.length() >= 5;
			if (!nameValid) System.out.println("Input failed, name length must be atleast 5 characters long");
		} while (!nameValid);
		newMotor.setName(name);
		
		boolean licenseValid = false;
		do {
			System.out.print("Input license plate example. A 1234 ABC: ");
			license = scan.nextLine();
			licenseValid = license.matches("[A-Za-z] [0-9]{1,4} [A-Za-z]{1,3}");
			if (!licenseValid) System.out.println("Input failed, license plate must follow the given example format");
		} while (!licenseValid);
		newMotor.setLicense(license);
		
		boolean topSpeedValid = false;
		do {
			try {
				System.out.print("Input top speed [100 - 250]: ");
				topSpeed = scan.nextInt(); scan.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("Input must be a number");
				scan.next();
			}
			topSpeedValid = topSpeed >= 100 && topSpeed <= 250;
			if (!topSpeedValid) System.out.println("Input failed, top speed must be in range of 100 to 250");
		} while (!topSpeedValid);
		newMotor.setTopSpeed(topSpeed);
		
		boolean gasCapValid = false;
		do {
			try {
				System.out.print("Input gas capacity [30 - 60]: ");
				gasCap = scan.nextInt(); scan.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("Input must be a number");
				scan.next();
			}
			gasCapValid = gasCap >= 30 && gasCap <= 60;
			if (!gasCapValid) System.out.println("Input failed, gas capacity must be in range of 30 to 60");
		} while (!gasCapValid);
		newMotor.setGasCap(gasCap);
		
		boolean wheelValid = false;
		do {
			try {
				System.out.print("Input number of wheel(s) [2 - 3]: ");
				wheel = scan.nextInt(); scan.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("Input must be a number");
				scan.next();
			}
			wheelValid = wheel >= 2 && wheel <= 3;
			if (!wheelValid) System.out.println("Input failed, number of wheels must be in range of 2 to 3");
		} while (!wheelValid);
		newMotor.setWheel(wheel);
		
		boolean typeValid = false;
		do {
			System.out.print("Input type [Automatic or Manual]: ");
			type = scan.nextLine();
			typeValid = type.equalsIgnoreCase("Automatic") || type.equalsIgnoreCase("Manual");
			if (!typeValid) System.out.println("Input failed, type must only be Automatic or Manual");
		} while (!typeValid);
		newMotor.setType(type);
		
		boolean helmValid = false;
		do {
			try {
				System.out.print("Input number of helm(s) [Atleast 1]: ");
				helm = scan.nextInt(); scan.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("Input must be a number");
				scan.next();
			}
			helmValid = helm >= 1;
			if (!helmValid) System.out.println("Input failed, number of helms must be atleast 1");
		} while (!helmValid);
		newMotor.setHelm(helm);
		
		vehicles.add(newMotor);
	}

	void makeCar() {
		Car newCar = new Car();
		newCar.setCarOrBike("Car");
		
		boolean brandValid = false;
		do {
			System.out.print("Input brand [>=5]: ");
			brand = scan.nextLine();
			brandValid = brand.length() >= 5;
			if (!brandValid) System.out.println("Input failed, brand length must be atleast 5 characters long");
		} while (!brandValid);
		newCar.setBrand(brand);
		
		boolean nameValid = false;
		do {
			System.out.print("Input name [>=5]: ");
			name = scan.nextLine();
			nameValid = name.length() >= 5;
			if (!nameValid) System.out.println("Input failed, name length must be atleast 5 characters long");
		} while (!nameValid);
		newCar.setName(name);
		
		boolean licenseValid = false;
		do {
			System.out.print("Input license plate example. A 1234 ABC: ");
			license = scan.nextLine(); license.toUpperCase();
			licenseValid = license.matches("[A-Za-z] [0-9]{1,4} [A-Za-z]{1,3}");
			if (!licenseValid) System.out.println("Input failed, license plate must follow the given example format");
		} while (!licenseValid);
		newCar.setLicense(license);
		
		boolean topSpeedValid = false;
		do {
			try {
				System.out.print("Input top speed [100 - 250]: ");
				topSpeed = scan.nextInt(); scan.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("Input must be a number");
				scan.next();
			}
			topSpeedValid = topSpeed >= 100 && topSpeed <= 250;
			if (!topSpeedValid) System.out.println("Input failed, top speed must be in range of 100 to 250");
		} while (!topSpeedValid);
		newCar.setTopSpeed(topSpeed);
		
		boolean gasCapValid = false;
		do {
			try {
				System.out.print("Input gas capacity [30 - 60]: ");
				gasCap = scan.nextInt(); scan.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("Input must be a number");
				scan.next();
			}
			gasCapValid = gasCap >= 30 && gasCap <= 60;
			if (!gasCapValid) System.out.println("Input failed, gas capacity must be in range of 30 to 60");
		} while (!gasCapValid);
		newCar.setGasCap(gasCap);
		
		boolean wheelValid = false;
		do {
			try {
				System.out.print("Input number of wheel(s) [4 - 6]: ");
				wheel = scan.nextInt(); scan.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("Input must be a number");
				scan.next();
			}
			wheelValid = wheel >= 4 && wheel <= 6;
			if (!wheelValid) System.out.println("Input failed, number of wheels must be in range of 4 to 6");
		} while (!wheelValid);
		newCar.setWheel(wheel);
		
		boolean typeValid = false;
		do {
			System.out.print("Input type [SUV or Supercar or Minivan]: ");
			type = scan.nextLine();
			typeValid = type.equalsIgnoreCase("SUV") || type.equalsIgnoreCase("Supercar") || type.equalsIgnoreCase("Minivan");
			if (!typeValid) System.out.println("Input failed, type must be either SUV, Supercar or Minivan");
		} while (!typeValid);
		newCar.setType(type);
		
		boolean entertainmentSystemValid = false;
		do {
			try {
				System.out.print("Input number of entertainment system(s) [Atleast 1]: ");
				entertainmentSystem = scan.nextInt(); scan.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("Input must be a number");
				scan.next();
			}
			entertainmentSystemValid = entertainmentSystem >= 1;
			if (!entertainmentSystemValid) System.out.println("Input failed, number of entertainment system must be atleast 1");
		} while (!entertainmentSystemValid);
		newCar.setEntertainmentSystem(entertainmentSystem);
		
		vehicles.add(newCar);
	}

	void view() {
		System.out.println("|----|--------------------|-----------------|");
		System.out.println("|No  |Type                |Name             |");
		System.out.println("|----|--------------------|-----------------|");
		for (Vehicle vehicle: vehicles) {
			System.out.println("| "+ (vehicles.indexOf(vehicle) + 1) + "  |" + vehicle.getCarOrBike() + "                 |" + vehicle.getName() + "        |");
			System.out.println("|----|--------------------|-----------------|");
		}
		int find = 100;
		try {
			System.out.print("Pick a vehicle number to test drive[Enter '0' to exit to the main menu]: "); find = scan.nextInt(); scan.nextLine();
		} catch (InputMismatchException e) {
			System.out.println("Input must be a number");
			scan.next();
		}
		if(find == 0) {
			return;
		} else if(find <= vehicles.size()) {
			viewInfo (find-1);
		} else if(find > vehicles.size()) {
			System.out.println("Vehicle number not found!, returning to main menu");
		}
	}
	
	void viewInfo(int index) {
		System.out.println("Type: " + vehicles.get(index).getCarOrBike());
		System.out.println("Type: " + vehicles.get(index).getBrand());
		System.out.println("Type: " + vehicles.get(index).getName());
		System.out.println("Type: " + vehicles.get(index).getLicense());
		System.out.println("Type: " + vehicles.get(index).getTopSpeed());
		System.out.println("Type: " + vehicles.get(index).getGasCap());
		System.out.println("Type: " + vehicles.get(index).getWheel());
		System.out.println("Type: " + vehicles.get(index).getType());
		if(vehicles.get(index).getCarOrBike().equalsIgnoreCase("car")) {
			System.out.println("Type: " + vehicles.get(index).getEntertainmentSystem());
			newCar.turnOnEntertainmentSystem();
			if(vehicles.get(index).getType().equalsIgnoreCase("supercar")) System.out.println("Boosting!");
		}
		else if(vehicles.get(index).getCarOrBike().equalsIgnoreCase("motorcycle")) {
			System.out.println("Type: " + vehicles.get(index).getHelm());
			System.out.println(vehicles.get(index).getName() + " is standing!");
		}
		int price = 0;
		try {
			System.out.print("Please input price: "); price = scan.nextInt(); scan.nextLine();
		} catch (InputMismatchException e) {
			System.out.println("Input must be a number");
			scan.next();
		}
		System.out.println("Price: " + price);
	}

	void makeVehicle() {
		boolean typeValid = false;
		String type;
		do {
			System.out.print("Input type [Car | Motorcycle]: ");
			type = scan.nextLine();
			if (type.equalsIgnoreCase("car")) {
				typeValid = true;
				makeCar();
			} else if (type.equalsIgnoreCase("motorcycle")) {
				typeValid = true;
				makeMotorcycle();
			} else
				System.out.println("Input can only be Car or Motorcycle");
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
			int input = scan.nextInt();
			scan.nextLine();
			switch (input) {
				case 1:
					makeVehicle();
					System.out.println("Press Enter to return to the menu"); scan.nextLine();
					break;
				case 2:
					view();
					System.out.println("Press Enter to return to the menu"); scan.nextLine();
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
