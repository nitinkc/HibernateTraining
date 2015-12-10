package d3.hasA.multTab;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionOfElements;

@Entity
@Table(name = "HasAMult")
//DO NOT USE table or desc OR ANY RESERVED KEYEORD. SQL EXCEPTION OCCURS AS RESERVED KEYWORD USED
public class H3Emp { 
	
	@Id
	@Column(name="Emp")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int empId;
	
	@Column(name="name")
	private String empName;
	
	/* It's to keep multiple entries, it is better to use a list
	 * This will ensure that proper joining takes place.
	 * 
	 * Collection of elements needs a joinTable annotation which should be 
	 * customized for the name 
	 * */
	
	@CollectionOfElements
//	@JoinTable(
//			name="User_Addresses" ,
//			joinColumns=@JoinColumn(name="empId")
//		)
	private List<H3EmpAddress> list = new ArrayList<H3EmpAddress>();
	
	
	public List<H3EmpAddress> getList() {
		return list;
	}

	public void setList(List<H3EmpAddress> list) {
		this.list = list;
	}

	//------------	getters and setters -------------//
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
}
