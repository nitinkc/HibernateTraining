package d2.data.hasA.singleTable;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionOfElements;

@Entity
@Table(name = "User_tb")
public class User {
	@Id
	@Column(name="User_Id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int uId;
	@Column(name="User_Name")
	private String uName;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "pincode" , column = @Column(name="Office_Pincode")),
		@AttributeOverride(name = "city" , column = @Column(name="Office_City"))		
	})
	private Address officeAddress;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "pincode" , column = @Column(name="Home_Pincode")),
		@AttributeOverride(name = "city" , column = @Column(name="Home_City"))		
	})
	private Address homeAddress;	
}
