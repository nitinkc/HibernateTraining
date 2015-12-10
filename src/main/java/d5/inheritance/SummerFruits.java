package d5.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;

/* No Primary key in the main table */

@Entity
@Inheritance
@DiscriminatorValue(value="Light_Summers")
public class SummerFruits extends Fruits {
	
	private String name;
	private String taste;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
}
