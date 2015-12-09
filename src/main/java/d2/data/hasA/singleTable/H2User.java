package d2.data.hasA.singleTable;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
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
@Table(name = "hasASingleTable")
public class H2User {
	
	@Id
	@Column(name="User_Id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int uId;
	@Column(name="User_Name")
	private String uName;
	
	/* The user can have multiple addresses
	 * To resolve the column name convention 
	 * @attributes annotation is used giving custom names to each column
	 * 
	 */
	@Embedded
	private H2AddressHas_A homeAddress;	
	
	@Embedded
	private H2AddressHas_A officeAddress;
	
	
	//------------	getters and setters----------------------//
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
	public H2AddressHas_A getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(H2AddressHas_A homeAddress) {
		this.homeAddress = homeAddress;
	}
	public H2AddressHas_A getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(H2AddressHas_A officeAddress) {
		this.officeAddress = officeAddress;
	}
}
