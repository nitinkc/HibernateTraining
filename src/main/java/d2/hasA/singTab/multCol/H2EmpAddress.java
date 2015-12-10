package d2.hasA.singTab.multCol;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class H2EmpAddress {
	
	/* Exception in thread "main" org.hibernate.MappingException: 
	 * Repeated column in mapping for entity: d2.hasA.singTab.multCol.H2Emp 
	 * column: empCity (should be mapped with insert="false" update="false")*/
	@Column(name="ZipCode")
	private int zipCode;
	
	@Column(name="empCity")
	private String empCity;

	// Getters and Setters
	
	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getEmpCity() {
		return empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}

}
