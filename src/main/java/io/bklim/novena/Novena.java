package io.bklim.novena;

import java.util.Date;

public class Novena {
	
	private String id;
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
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
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
