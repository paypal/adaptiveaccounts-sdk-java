
/**
 * Auto generated code
 */

package com.paypal.svcs.types.aa;

import java.io.UnsupportedEncodingException;


/**
 * Month in integer format, between 1 and 12
 */
public class CardDateType {

	/**
	 * Month in integer format, between 1 and 12
	 *
	 * @Required
	 */
	private Integer month;
	public Integer getMonth() {
		return month;
	}
	public void setMonth(Integer value) {
		this.month = value;
	}

	/**
	 * Year in four digit format- YYYY
	 *
	 * @Required
	 */
	private Integer year;
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer value) {
		this.year = value;
	}


	public CardDateType(Integer month, Integer year) {
		this.month = month;
		this.year = year;
	}
	public CardDateType() {
	}

	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}

	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if( month != null ) {
			sb.append(prefix).append("month=").append(month);
			sb.append('&');
		}
		if( year != null ) {
			sb.append(prefix).append("year=").append(year);
			sb.append('&');
		}
		return sb.toString();
	}

}
