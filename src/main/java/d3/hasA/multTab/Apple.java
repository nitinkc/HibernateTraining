package d3.hasA.multTab;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Apple {
	@Id
	private int appleId;
	private String appleLocation;

	public int getAppleId() {
		return appleId;
	}

	public void setAppleId(int appleId) {
		this.appleId = appleId;
	}

	public String getAppleLocation() {
		return appleLocation;
	}

	public void setAppleLocation(String appleLocation) {
		this.appleLocation = appleLocation;
	}

}
