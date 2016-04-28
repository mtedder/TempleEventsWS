/**
 * 
 */
package com.gc.temple.db.dto;

import java.util.Date;

/**
 * @author Maurice
 * Hibernate Pojo for Event table.
 */
public class Events {
	private int eventKey;
	private String eventname;
	private String eventdesc;
	private String eventlocation;
	private Date eventdatetime;
	/**
	 * Default constructor
	 */
	public Events() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the eventKey
	 */
	public int getEventKey() {
		return eventKey;
	}
	/**
	 * @param eventKey the eventKey to set
	 */
	public void setEventKey(int eventKey) {
		this.eventKey = eventKey;
	}
	/**
	 * @return the eventname
	 */
	public String getEventname() {
		return eventname;
	}
	/**
	 * @param eventname the eventname to set
	 */
	public void setEventname(String eventname) {
		this.eventname = eventname;
	}
	/**
	 * @return the eventdesc
	 */
	public String getEventdesc() {
		return eventdesc;
	}
	/**
	 * @param eventdesc the eventdesc to set
	 */
	public void setEventdesc(String eventdesc) {
		this.eventdesc = eventdesc;
	}
	/**
	 * @return the eventlocation
	 */
	public String getEventlocation() {
		return eventlocation;
	}
	/**
	 * @param eventlocation the eventlocation to set
	 */
	public void setEventlocation(String eventlocation) {
		this.eventlocation = eventlocation;
	}
	/**
	 * @return the eventdatetime
	 */
	public Date getEventdatetime() {
		return eventdatetime;
	}
	/**
	 * @param eventdatetime the eventdatetime to set
	 */
	public void setEventdatetime(Date eventdatetime) {
		this.eventdatetime = eventdatetime;
	}
	
	
}
