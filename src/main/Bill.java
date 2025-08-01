package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Bill extends Account{
	// attribute //
	private Car car;
	private String startReturnPoint;
	private int day;
	private int insurance;
	private int childSeat;
	private int gps;

	// method //
	public Bill() {
		super();
		car = null;
		startReturnPoint = "";
		day = 1;
		insurance = 0;
		childSeat = 0;
		gps = 0;

	}

	public Bill(String email, Car car, String startReturnPoint, int day, int insurance, int childSeat,
			int gps) throws IOException {
		super(email);
		this.car = car;
		this.startReturnPoint = startReturnPoint;
		this.day = day;
		this.insurance = insurance;
		this.childSeat = childSeat;
		this.gps = gps;
	}

	public boolean getCoupon(String email) throws IOException {
		BufferedReader br2 = new BufferedReader(
				new FileReader("billpayment.txt"));
		BufferedReader br1 = new BufferedReader(
				new FileReader("register.txt"));
		BufferedWriter bw1 = new BufferedWriter(
				new FileWriter("checkcoupon.txt", true));
		String m;
		while ((m = br1.readLine()) != null) {
			String[] data = m.split(",");
			if (data[4].equalsIgnoreCase(email)) {
				String m2;
				while ((m2 = br2.readLine()) != null) {
					if (m2.equals(email)) {
						bw1.close();
						br2.close();
						br1.close();
						return false;
					}
				}
				bw1.write(email+"\n");
			}
		}
		bw1.close();
		br2.close();
		br1.close();
		return true;
	}

	public float getCouponPrice() throws IOException {
		return getCoupon(super.getEmail()) ?getTotalPrice() * 0.1f : 0f;
	}

	public int getPriceAddon() {
		return insurance + childSeat + gps;
	}
	
	public float getTotalPrice() {
		return (car.getPrice() * day) + getPriceAddon();
	}

	public float getNetPrice() throws IOException {
		return getTotalPrice() - getCouponPrice();
	}
	
	public Car getCar() {
		return car;
	}
	
	public int getDays() {
		return day;
	}
	
	public int getBabyseat() {
		return childSeat;
	}
	
	public int getCarinsur() {
		return insurance;
	}
	
	public int getGPS() {
		return gps;
	}
	
	public String getStartReturnPoint() {
		return startReturnPoint;
	}
	
	

	public void saveBill() throws IOException {
		BufferedWriter bw = new BufferedWriter(
				(new FileWriter("billpayment.txt", true)));
		bw.write(super.getFName() + "," + super.getLName() + "," + super.getId() + "," + super.getDriverLicense() + ","
				+ super.getEmail() + "," + startReturnPoint + "," + day + "," + car.getType() + ","
			    + "," + car.getPrice() + "," + insurance + "," + childSeat + ","
				+ gps + "," + getCouponPrice() + "," + getNetPrice());
		bw.close();

	}

}
