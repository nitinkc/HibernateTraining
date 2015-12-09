package d2.data.hasA.singleTable;

/**
 * HAS-A Relationship between Student class and Address Class
 * One Table for all the classes  
 */

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student_tb")
public class Student {
	@Id
	@Column(name = "Student_Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "Student_Name")
	private String name;
	@Column(name = "Student_Address")
	private String Address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	

}
