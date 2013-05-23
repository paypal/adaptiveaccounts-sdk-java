package com.paypal.svcs.types.aa;
import com.paypal.svcs.types.common.RequestEnvelope;
import com.paypal.svcs.types.aa.AuditeeInfoType;
import com.paypal.svcs.types.aa.AuditorList;
import com.paypal.svcs.types.aa.AuditDetailsType;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;

/**
 * 
 */
public class UpdateComplianceStatusRequest{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private RequestEnvelope requestEnvelope;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private AuditeeInfoType auditeeInfo;

	/**
	 * 	 
	 */ 
	private AuditorList auditorList;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private AuditDetailsType auditDetails;

	

	/**
	 * Constructor with arguments
	 */
	public UpdateComplianceStatusRequest (RequestEnvelope requestEnvelope, AuditeeInfoType auditeeInfo, AuditDetailsType auditDetails){
		this.requestEnvelope = requestEnvelope;
		this.auditeeInfo = auditeeInfo;
		this.auditDetails = auditDetails;
	}	

	/**
	 * Default Constructor
	 */
	public UpdateComplianceStatusRequest (){
	}	

	/**
	 * Getter for requestEnvelope
	 */
	 public RequestEnvelope getRequestEnvelope() {
	 	return requestEnvelope;
	 }
	 
	/**
	 * Setter for requestEnvelope
	 */
	 public void setRequestEnvelope(RequestEnvelope requestEnvelope) {
	 	this.requestEnvelope = requestEnvelope;
	 }
	 
	/**
	 * Getter for auditeeInfo
	 */
	 public AuditeeInfoType getAuditeeInfo() {
	 	return auditeeInfo;
	 }
	 
	/**
	 * Setter for auditeeInfo
	 */
	 public void setAuditeeInfo(AuditeeInfoType auditeeInfo) {
	 	this.auditeeInfo = auditeeInfo;
	 }
	 
	/**
	 * Getter for auditorList
	 */
	 public AuditorList getAuditorList() {
	 	return auditorList;
	 }
	 
	/**
	 * Setter for auditorList
	 */
	 public void setAuditorList(AuditorList auditorList) {
	 	this.auditorList = auditorList;
	 }
	 
	/**
	 * Getter for auditDetails
	 */
	 public AuditDetailsType getAuditDetails() {
	 	return auditDetails;
	 }
	 
	/**
	 * Setter for auditDetails
	 */
	 public void setAuditDetails(AuditDetailsType auditDetails) {
	 	this.auditDetails = auditDetails;
	 }
	 


	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}
	
	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if (this.requestEnvelope != null) {
			String newPrefix = prefix + "requestEnvelope.";
			sb.append(this.requestEnvelope.toNVPString(newPrefix));
		}
		if (this.auditeeInfo != null) {
			String newPrefix = prefix + "auditeeInfo.";
			sb.append(this.auditeeInfo.toNVPString(newPrefix));
		}
		if (this.auditorList != null) {
			String newPrefix = prefix + "auditorList.";
			sb.append(this.auditorList.toNVPString(newPrefix));
		}
		if (this.auditDetails != null) {
			String newPrefix = prefix + "auditDetails.";
			sb.append(this.auditDetails.toNVPString(newPrefix));
		}
		return sb.toString();
	}

}