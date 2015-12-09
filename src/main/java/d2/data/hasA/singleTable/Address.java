package d2.data.hasA.singleTable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
public class Address {
	@Column(name="User_Pincode")
	private int pincode;
	@Column(name="User_City")
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
