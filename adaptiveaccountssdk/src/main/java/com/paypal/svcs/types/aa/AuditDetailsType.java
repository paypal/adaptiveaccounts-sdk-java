package com.paypal.svcs.types.aa;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;

/**
 * 
 */
public class AuditDetailsType{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private String status;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private String level;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private String method;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private String reason;

	

	/**
	 * Constructor with arguments
	 */
	public AuditDetailsType (String status, String level, String method, String reason){
		this.status = status;
		this.level = level;
		this.method = method;
		this.reason = reason;
	}	

	/**
	 * Default Constructor
	 */
	public AuditDetailsType (){
	}	

	/**
	 * Getter for status
	 */
	 public String getStatus() {
	 	return status;
	 }
	 
	/**
	 * Setter for status
	 */
	 public void setStatus(String status) {
	 	this.status = status;
	 }
	 
	/**
	 * Getter for level
	 */
	 public String getLevel() {
	 	return level;
	 }
	 
	/**
	 * Setter for level
	 */
	 public void setLevel(String level) {
	 	this.level = level;
	 }
	 
	/**
	 * Getter for method
	 */
	 public String getMethod() {
	 	return method;
	 }
	 
	/**
	 * Setter for method
	 */
	 public void setMethod(String method) {
	 	this.method = method;
	 }
	 
	/**
	 * Getter for reason
	 */
	 public String getReason() {
	 	return reason;
	 }
	 
	/**
	 * Setter for reason
	 */
	 public void setReason(String reason) {
	 	this.reason = reason;
	 }
	 


	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}
	
	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if (this.status != null) {
			sb.append(prefix).append("status=").append(NVPUtil.encodeUrl(this.status));
			sb.append("&");
		}
		if (this.level != null) {
			sb.append(prefix).append("level=").append(NVPUtil.encodeUrl(this.level));
			sb.append("&");
		}
		if (this.method != null) {
			sb.append(prefix).append("method=").append(NVPUtil.encodeUrl(this.method));
			sb.append("&");
		}
		if (this.reason != null) {
			sb.append(prefix).append("reason=").append(NVPUtil.encodeUrl(this.reason));
			sb.append("&");
		}
		return sb.toString();
	}

}