package main;

public class CostCalculator {
	//attribute
	private int price;
	private int day;
	private double add_on;
	private boolean coupon;
	
	//method
	public void setPrice(int PRICE) {
		price = PRICE;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setDay(int DAY) {
		day = DAY;
	}
	
	public int getDay() {
		return day;
	}
	
	public void setAddOn(double ADD_ON) {
		add_on = ADD_ON;
	}
	
	public double getAddOn() {
		return add_on;
	}
	
	public void setCoupon(boolean COUPON) {
		coupon = COUPON;
	}
	
	public double getCoupon() {
		return ((price*day)+add_on)*0.1;
	}
	
	public double netPrice() {
		return (coupon)?((price*day)+add_on)*0.9:(price*day)+add_on;
	}

}