package com.paypal.svcs.types.aa;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;

/**
 * 
 */
public class Auditor{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private String id;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private String name;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private String action;

	/**
	 * 	 
	 */ 
	private String notes;

	

	/**
	 * Constructor with arguments
	 */
	public Auditor (String id, String name, String action){
		this.id = id;
		this.name = name;
		this.action = action;
	}	

	/**
	 * Default Constructor
	 */
	public Auditor (){
	}	

	/**
	 * Getter for id
	 */
	 public String getId() {
	 	return id;
	 }
	 
	/**
	 * Setter for id
	 */
	 public void setId(String id) {
	 	this.id = id;
	 }
	 
	/**
	 * Getter for name
	 */
	 public String getName() {
	 	return name;
	 }
	 
	/**
	 * Setter for name
	 */
	 public void setName(String name) {
	 	this.name = name;
	 }
	 
	/**
	 * Getter for action
	 */
	 public String getAction() {
	 	return action;
	 }
	 
	/**
	 * Setter for action
	 */
	 public void setAction(String action) {
	 	this.action = action;
	 }
	 
	/**
	 * Getter for notes
	 */
	 public String getNotes() {
	 	return notes;
	 }
	 
	/**
	 * Setter for notes
	 */
	 public void setNotes(String notes) {
	 	this.notes = notes;
	 }
	 


	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}
	
	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if (this.id != null) {
			sb.append(prefix).append("id=").append(NVPUtil.encodeUrl(this.id));
			sb.append("&");
		}
		if (this.name != null) {
			sb.append(prefix).append("name=").append(NVPUtil.encodeUrl(this.name));
			sb.append("&");
		}
		if (this.action != null) {
			sb.append(prefix).append("action=").append(NVPUtil.encodeUrl(this.action));
			sb.append("&");
		}
		if (this.notes != null) {
			sb.append(prefix).append("notes=").append(NVPUtil.encodeUrl(this.notes));
			sb.append("&");
		}
		return sb.toString();
	}

}