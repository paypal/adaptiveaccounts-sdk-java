package com.paypal.svcs.types.aa;
import java.util.List;
import java.util.ArrayList;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;

/**
 *  
 */
public class DocumentType{


	/**
	*  	  
	 *@Required	 
	 */ 
	private String type;

	/**
	*  	  
	 *@Required	 
	 */ 
	private List<String> filename = new ArrayList<String>();

	

	/**
	 * Constructor with arguments
	 */
	public DocumentType (String type, List<String> filename){
		this.type = type;
		this.filename = filename;
	}	

	/**
	 * Default Constructor
	 */
	public DocumentType (){
	}	

	/**
	 * Getter for type
	 */
	 public String getType() {
	 	return type;
	 }
	 
	/**
	 * Setter for type
	 */
	 public void setType(String type) {
	 	this.type = type;
	 }
	 
	/**
	 * Getter for filename
	 */
	 public List<String> getFilename() {
	 	return filename;
	 }
	 
	/**
	 * Setter for filename
	 */
	 public void setFilename(List<String> filename) {
	 	this.filename = filename;
	 }
	 


	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}
	
	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if (this.type != null) {
			sb.append(prefix).append("type=").append(NVPUtil.encodeUrl(this.type));
			sb.append("&");
		}
		if (this.filename != null) {
			for(int i=0; i < this.filename.size(); i++) {
				sb.append(prefix).append("filename(").append(i).append(")=").append(NVPUtil.encodeUrl(this.filename.get(i)));
				sb.append("&");
			}
		}
		return sb.toString();
	}

}