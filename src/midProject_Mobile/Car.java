package midProject_Mobile;

public class Car extends Vehicle {
	private int entertainmentSystem;

	public int getEntertainmentSystem() {
		return entertainmentSystem;
	}

	public void setEntertainmentSystem(int entertainmentSystem) {
		this.entertainmentSystem = entertainmentSystem;
	}
	
	public void turnOnEntertainmentSystem() {
		System.out.println("Turning on entertainment system...");
	}
}
