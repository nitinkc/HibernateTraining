package day2.data.entity;

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
	
	/*@Embedded
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
	private Address homeAddress;*/

	@CollectionOfElements
	@JoinTable(
		name="User_Addresses_tb" ,
		joinColumns=@JoinColumn(name="User_Id")
	)
	private List<Address> listOfAddresses=new ArrayList<Address>();
	
	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	

	

	/*public Address getuAddress() {
		return uAddress;
	}

	public void setuAddress(Address uAddress) {
		this.uAddress = uAddress;
	}*/
	
	/*public Address getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}*/

	public List<Address> getListOfAddresses() {
		return listOfAddresses;
	}

	public void setListOfAddresses(List<Address> listOfAddresses) {
		this.listOfAddresses = listOfAddresses;
	}
	
}
