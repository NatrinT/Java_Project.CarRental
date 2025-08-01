package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Account {
	// attribute //
	private String fname;
	private String lname;
	private String id;
	private String driver_license;
	private String email;
	private String password;

	// private String start_point;
	// private String meeting_point;
	// private String time;

	// method //
	public Account() {
		fname = "";
		lname = "";
		id = "";
		driver_license = "";
		email = "";
		password = "";
	}

	public Account(String email) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("register.txt"));
		String s;
		while ((s = br.readLine()) != null) {
			String[] data = s.split(",");
			if (email.equalsIgnoreCase(data[4])) {
				fname = data[0];
				lname = data[1];
				id = data[2];
				driver_license = data[3];
				this.email = data[4];
				password = data[5];
			}
		}
		br.close();
	}

	public String getFName() {
		return fname;
	}

	public String getLName() {
		return lname;
	}

	public String getName() {
		return fname.toLowerCase().charAt(0) + fname.substring(1) + " " + lname.toLowerCase().charAt(0)
				+ lname.substring(1);
	}

	public String getId() {
		return id;
	}

	public String getDriverLicense() {
		return driver_license;
	}

	public String getEmail() {
		return email;
	}

	public void register() throws IOException{
			BufferedWriter bw = new BufferedWriter(
					(new FileWriter("register.txt", true)));
			bw.write(fname + "," + lname + "," + id + "," + driver_license + "," + email + "," + password + "\n");
			bw.close();
	}

	public boolean login(String email, String password) throws IOException{
			BufferedReader br = new BufferedReader(
					new FileReader("register.txt"));
			String s;
			while ((s = br.readLine()) != null) {
				String[] data = s.split(",");
				if (data[4].equalsIgnoreCase(email) && data[5].equals(password)) {
					this.email = email.toLowerCase();
					br.close();
					return true;
				}
			}
			br.close();
			return false;
	}// end chkLogin //

	public void setData(String fname, String lname, String email, String password, String id, String driver_license) {
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.id = id;
		this.driver_license = driver_license;
	}

	public String chkData(String FNAME, String LNAME, String EMAIL, String PASS1, String PASS2, String ID, String DL) throws IOException {
			if (FNAME.equals("") || LNAME.equals("") || EMAIL.equals("") || PASS1.equals("") || PASS2.equals("")
					|| ID.equals("") || DL.equals(""))
				return "blank";

			EMAIL = EMAIL.toLowerCase();
			if (EMAIL.startsWith("@") || EMAIL.contains(" ")
					|| !(EMAIL.endsWith("@hotmail.com")) && !(EMAIL.endsWith("@gmail.com")))
				return "email";

			if (PASS1.length() < 6 || PASS2.length() < 6) {
				return "shortPassword";
			}

			if (!PASS1.equals(PASS2))
				return "password";

			if (ID.length() == 13) {
				for (int i = 0; i < 13; i++) {
					if (!Character.isDigit(ID.charAt(i)))
						return "ID";
				}
			} else
				return "ID";

			if (DL.length() == 8) {
				for (int i = 0; i < 8; i++) {
					if (!Character.isDigit(DL.charAt(i)))
						return "DL";
				}
			} else
				return "DL";

			BufferedReader br = new BufferedReader(
					(new FileReader("register.txt")));
			String read;
			while ((read = br.readLine()) != null) {
				String[] data = read.split(",");
				if (data[2].equals(ID) || data[3].equals(DL) || data[4].equals(EMAIL)) {
					br.close();
					return "file";
				}
			}
			br.close();
			setData(FNAME, LNAME, EMAIL, PASS1, ID, DL);
			return "correct";
	}

}
