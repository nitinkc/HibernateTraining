package d4.hasA.mapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class M2CellUser {
	
	private String user;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	/* The list is One to Many */
	@OneToMany
	@JoinColumn
	private List<M2CellPhone> cells;
	
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<M2CellPhone> getCells() {
		return cells;
	}
	public void setCells(List<M2CellPhone> cells) {
		this.cells = cells;
	}
}