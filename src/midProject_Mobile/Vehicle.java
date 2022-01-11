package midProject_Mobile;

public abstract class Vehicle {
	private String brand, name, license, type, carOrBike;
	private int topSpeed, gasCap, wheel, entertainmentSystem, helm;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public int getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	public int getGasCap() {
		return gasCap;
	}
	public void setGasCap(int gasCap) {
		this.gasCap = gasCap;
	}
	public int getWheel() {
		return wheel;
	}
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCarOrBike() {
		return carOrBike;
	}
	public void setCarOrBike(String carOrBike) {
		this.carOrBike = carOrBike;
	}
	public int getEntertainmentSystem() {
		return entertainmentSystem;
	}
	public void setEntertainmentSystem(int entertainmentSystem) {
		this.entertainmentSystem = entertainmentSystem;
	}
	public int getHelm() {
		return helm;
	}
	public void setHelm(int helm) {
		this.helm = helm;
	}
}
