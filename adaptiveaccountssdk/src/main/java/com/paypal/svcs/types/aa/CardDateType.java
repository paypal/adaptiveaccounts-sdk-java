package com.paypal.svcs.types.aa;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;

/**
 *  Month in integer format, between 1 and 12 
 */
public class CardDateType{


	/**
	*  Month in integer format, between 1 and 12 	  
	 *@Required	 
	 */ 
	private Integer month;

	/**
	*  Year in four digit format- YYYY 	  
	 *@Required	 
	 */ 
	private Integer year;

	

	/**
	 * Constructor with arguments
	 */
	public CardDateType (Integer month, Integer year){
		this.month = month;
		this.year = year;
	}	

	/**
	 * Default Constructor
	 */
	public CardDateType (){
	}	

	/**
	 * Getter for month
	 */
	 public Integer getMonth() {
	 	return month;
	 }
	 
	/**
	 * Setter for month
	 */
	 public void setMonth(Integer month) {
	 	this.month = month;
	 }
	 
	/**
	 * Getter for year
	 */
	 public Integer getYear() {
	 	return year;
	 }
	 
	/**
	 * Setter for year
	 */
	 public void setYear(Integer year) {
	 	this.year = year;
	 }
	 


	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}
	
	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if (this.month != null) {
			sb.append(prefix).append("month=").append(this.month);
			sb.append("&");
		}
		if (this.year != null) {
			sb.append(prefix).append("year=").append(this.year);
			sb.append("&");
		}
		return sb.toString();
	}

}