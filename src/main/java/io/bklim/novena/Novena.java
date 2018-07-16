package io.bklim.novena;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="novena")
public class Novena {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String name;
	private String purpose;
	private Date dateStarted;
	private Date dateEnded;
	
	public Novena(String name, String purpose, Date dateStarted, Date dateEnded) {
		this.name = name;
		this.purpose = purpose;
		this.dateStarted = dateStarted;
		this.dateEnded = dateEnded;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public Date getDateStarted() {
		return dateStarted;
	}

	public void setDateStarted(Date dateStarted) {
		this.dateStarted = dateStarted;
	}

	public Date getDateEnded() {
		return dateEnded;
	}

	public void setDateEnded(Date dateEnded) {
		this.dateEnded = dateEnded;
	}

}
