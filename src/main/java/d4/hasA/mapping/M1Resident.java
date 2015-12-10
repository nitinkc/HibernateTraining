package d4.hasA.mapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Resident")
public class M1Resident {
	
	private String name;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int resId;
	
	@OneToOne
	@JoinColumn(name="mySSN")
	private M1SSNCard ssn;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHomeTown() {
		return resId;
	}
	public void resId(int resId) {
		this.resId = resId;
	}
	public M1SSNCard getSsn() {
		return ssn;
	}
	public void setSsn(M1SSNCard ssn) {
		this.ssn = ssn;
	}

}
