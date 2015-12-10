package d5.inheritance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Fruits")
@DiscriminatorColumn(
		// Sets the name of the DTYPE Field in the Table generated
		name = "FruitsClass"//,
		//discriminatorType = DiscriminatorType.STRING //OPTIONAL
		)

//@Inheritance(strategy = InheritanceType.JOINED)
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorValue(value="Fruit_Parent")
public class Fruits {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Fruit_Code")
	private int sNo;
	
	private String color;

	public int getsNo() {
		return sNo;
	}

	public void setsNo(int sNo) {
		this.sNo = sNo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
