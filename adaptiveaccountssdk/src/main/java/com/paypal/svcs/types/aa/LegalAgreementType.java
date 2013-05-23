package com.paypal.svcs.types.aa;
import com.paypal.svcs.types.aa.LegalAgreementTypes;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;

/**
 * 
 */
public class LegalAgreementType{


	/**
	 * 	 
	 */ 
	private String accepted;

	/**
	 * 	 
	 */ 
	private LegalAgreementTypes type;

	

	/**
	 * Default Constructor
	 */
	public LegalAgreementType (){
	}	

	/**
	 * Getter for accepted
	 */
	 public String getAccepted() {
	 	return accepted;
	 }
	 
	/**
	 * Setter for accepted
	 */
	 public void setAccepted(String accepted) {
	 	this.accepted = accepted;
	 }
	 
	/**
	 * Getter for type
	 */
	 public LegalAgreementTypes getType() {
	 	return type;
	 }
	 
	/**
	 * Setter for type
	 */
	 public void setType(LegalAgreementTypes type) {
	 	this.type = type;
	 }
	 


	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}
	
	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if (this.accepted != null) {
			sb.append(prefix).append("accepted=").append(NVPUtil.encodeUrl(this.accepted));
			sb.append("&");
		}
		if (this.type != null) {
			sb.append(prefix).append("type=").append(this.type.getValue());
			sb.append("&");
		}
		return sb.toString();
	}

}