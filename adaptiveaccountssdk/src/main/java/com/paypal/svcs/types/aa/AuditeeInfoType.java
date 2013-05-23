package com.paypal.svcs.types.aa;
import com.paypal.svcs.types.aa.AccountIdentifierType;
import java.util.List;
import java.util.ArrayList;
import com.paypal.svcs.types.aa.DocumentType;
import com.paypal.svcs.types.aa.TupleType;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;

/**
 * 
 */
public class AuditeeInfoType{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private AccountIdentifierType accountIdentifier;

	/**
	 * 	 
	 */ 
	private List<DocumentType> document = new ArrayList<DocumentType>();

	/**
	 * 	 
	 */ 
	private List<TupleType> data = new ArrayList<TupleType>();

	

	/**
	 * Constructor with arguments
	 */
	public AuditeeInfoType (AccountIdentifierType accountIdentifier){
		this.accountIdentifier = accountIdentifier;
	}	

	/**
	 * Default Constructor
	 */
	public AuditeeInfoType (){
	}	

	/**
	 * Getter for accountIdentifier
	 */
	 public AccountIdentifierType getAccountIdentifier() {
	 	return accountIdentifier;
	 }
	 
	/**
	 * Setter for accountIdentifier
	 */
	 public void setAccountIdentifier(AccountIdentifierType accountIdentifier) {
	 	this.accountIdentifier = accountIdentifier;
	 }
	 
	/**
	 * Getter for document
	 */
	 public List<DocumentType> getDocument() {
	 	return document;
	 }
	 
	/**
	 * Setter for document
	 */
	 public void setDocument(List<DocumentType> document) {
	 	this.document = document;
	 }
	 
	/**
	 * Getter for data
	 */
	 public List<TupleType> getData() {
	 	return data;
	 }
	 
	/**
	 * Setter for data
	 */
	 public void setData(List<TupleType> data) {
	 	this.data = data;
	 }
	 


	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}
	
	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if (this.accountIdentifier != null) {
			String newPrefix = prefix + "accountIdentifier.";
			sb.append(this.accountIdentifier.toNVPString(newPrefix));
		}
		if (this.document != null) {
			for(int i=0; i < this.document.size(); i++) {
				String newPrefix = prefix + "document" + "(" + i + ").";
				sb.append(this.document.get(i).toNVPString(newPrefix));
			}
		}
		if (this.data != null) {
			for(int i=0; i < this.data.size(); i++) {
				String newPrefix = prefix + "data" + "(" + i + ").";
				sb.append(this.data.get(i).toNVPString(newPrefix));
			}
		}
		return sb.toString();
	}

}