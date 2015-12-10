package d1.basic.singleTable;

import javax.persistence.Embeddable;

@Embeddable
public class H1Address {
	//@Column(name="User_Pincode")
	private int pincode;
	
	//@Column(name="User_City")
	private String city;

	// Getters and Setters
	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
