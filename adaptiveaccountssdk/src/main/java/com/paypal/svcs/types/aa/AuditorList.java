package com.paypal.svcs.types.aa;
import java.util.List;
import java.util.ArrayList;
import com.paypal.svcs.types.aa.Auditor;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;

/**
 * 
 */
public class AuditorList{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private List<Auditor> auditor = new ArrayList<Auditor>();

	

	/**
	 * Constructor with arguments
	 */
	public AuditorList (List<Auditor> auditor){
		this.auditor = auditor;
	}	

	/**
	 * Default Constructor
	 */
	public AuditorList (){
	}	

	/**
	 * Getter for auditor
	 */
	 public List<Auditor> getAuditor() {
	 	return auditor;
	 }
	 
	/**
	 * Setter for auditor
	 */
	 public void setAuditor(List<Auditor> auditor) {
	 	this.auditor = auditor;
	 }
	 


	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}
	
	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if (this.auditor != null) {
			for(int i=0; i < this.auditor.size(); i++) {
				String newPrefix = prefix + "auditor" + "(" + i + ").";
				sb.append(this.auditor.get(i).toNVPString(newPrefix));
			}
		}
		return sb.toString();
	}

}