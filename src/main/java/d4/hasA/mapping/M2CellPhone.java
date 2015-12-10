package d4.hasA.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

@Entity
public class M2CellPhone {
	
	/* In this example the primary key is not declared to be int
	 * String type is set and manually set. It works*/
	
	//Testing the String primary Key
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private String modelNo;
	
	private String model;
	
	@ManyToOne
	@JoinTable(name="COMMON_NAME")
	private M2CellUser user;
	
	public String getModelNo() {
		return modelNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public M2CellUser getUser() {
		return user;
	}
	public void setUser(M2CellUser user) {
		this.user = user;
	}
}
