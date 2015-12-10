package d2.hasA.singTab.multCol;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HasASingle")
//DO NOT USE table or desc OR ANY RESERVED KEYEORD. SQL EXCEPTION OCCURS AS RESERVED KEYWORD USED
public class H2Emp { 
	
	@Id
	@Column(name="Emp")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int empId;
	
	//@Column(name="city")
	private String empName;
	
	/* Exception in thread "main" org.hibernate.MappingException: 
	 * Repeated column in mapping for entity: d2.hasA.singTab.multCol.H2Emp 
	 * column: empCity (should be mapped with insert="false" update="false")*/
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "zipCode" , column = @Column(name="Office_Pincode")),
		@AttributeOverride(name = "empCity" , column = @Column(name="Office_City"))		
	})
	private H2EmpAddress homeAddress;	

	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "zipCode" , column = @Column(name="Home_Pincode")),
		@AttributeOverride(name = "empCity" , column = @Column(name="Home_City"))		
	})
	private H2EmpAddress officeAddress;
	
	
	//------------	getters and setters----------------------//
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public H2EmpAddress getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(H2EmpAddress homeAddress) {
		this.homeAddress = homeAddress;
	}

	public H2EmpAddress getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(H2EmpAddress officeAddress) {
		this.officeAddress = officeAddress;
	}
}
