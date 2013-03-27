package com.paypal.svcs.types.aa;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;

/**
 *  
 */
public class TupleType{


	/**
	*  	  
	 *@Required	 
	 */ 
	private String name;

	/**
	*  	  
	 *@Required	 
	 */ 
	private String value;

	

	/**
	 * Constructor with arguments
	 */
	public TupleType (String name, String value){
		this.name = name;
		this.value = value;
	}	

	/**
	 * Default Constructor
	 */
	public TupleType (){
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
	 * Getter for value
	 */
	 public String getValue() {
	 	return value;
	 }
	 
	/**
	 * Setter for value
	 */
	 public void setValue(String value) {
	 	this.value = value;
	 }
	 


	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}
	
	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if (this.name != null) {
			sb.append(prefix).append("name=").append(NVPUtil.encodeUrl(this.name));
			sb.append("&");
		}
		if (this.value != null) {
			sb.append(prefix).append("value=").append(NVPUtil.encodeUrl(this.value));
			sb.append("&");
		}
		return sb.toString();
	}

}