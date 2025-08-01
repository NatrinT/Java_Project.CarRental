package main;

public class Car {
	// attribute
	private String type;
	private int price;

	
	public Car(String type,int price) {
		this.type = type;
		this.price = price;
	}
	
	// method
	public String getType() {
		return type;
	}
	
	public int getPrice() {
		return price;
	}
}
