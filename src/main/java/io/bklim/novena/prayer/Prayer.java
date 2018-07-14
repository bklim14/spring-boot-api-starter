package io.bklim.novena.prayer;

import java.util.Date;

public class Prayer {
	
	private String id;
	private String mystery;
	private Date dateStarted;
	
	public Prayer(String mystery, Date dateStarted) {
		this.mystery = mystery;
		this.dateStarted = dateStarted;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMystery() {
		return mystery;
	}

	public void setMystery(String mystery) {
		this.mystery = mystery;
	}

	public Date getDateStarted() {
		return dateStarted;
	}

	public void setDateStarted(Date dateStarted) {
		this.dateStarted = dateStarted;
	}

}
