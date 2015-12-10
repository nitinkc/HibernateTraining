package d1.basic.singleTable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GetNLoad_Example")
public class Plant {

	@Id
	@Column(name = "Plant_Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pId;
	@Column(name = "Plant_Name")
	private String pName;

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}
}
