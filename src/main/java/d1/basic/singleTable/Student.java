package d1.basic.singleTable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/* POJO class to hold the data
 *  In relation to a database , an entity is a single person, place, or thing about which data can be stored.
 * */

//@Entity cannot be removed.
@Entity
//@Table to give user desired table name
@Table(name = "student")

public class Student {
	//@id defines the primary key
	@Id
	//setting up user desired column name 
	@Column(name = "Student_Id")
	//Auto-generaed user id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "Student_Name")
	private String name;

	/* ------------ GETTERS AND SETTERS ----------- */
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

}
