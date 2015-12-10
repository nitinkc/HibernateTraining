package d4.hasA.mapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class M2CellPhone {
	
	//Testing the String primary Key
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String modelNo;
	
	private String model;
	
	@ManyToOne
	@JoinColumn
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
