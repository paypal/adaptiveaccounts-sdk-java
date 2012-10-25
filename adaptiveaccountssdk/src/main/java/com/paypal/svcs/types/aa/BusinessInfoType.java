package com.paypal.svcs.types.aa;
import com.paypal.svcs.types.aa.AddressType;
import com.paypal.svcs.types.aa.BusinessType;
import com.paypal.svcs.types.aa.BusinessSubtypeType;
import java.util.List;
import java.util.ArrayList;
import com.paypal.svcs.types.aa.SalesVenueType;
import com.paypal.svcs.types.aa.BusinessStakeholderType;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;

/**
 * PayPal Business Category. i.e., baby - 1004 
 */
public class BusinessInfoType{

	private static final String nameSpace="com.paypal.svcs.types.aa";
	private static final String preferredPrefix="";

	/**
	 * 	  
	 *@Required	 
	 */ 
	private String businessName;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private AddressType businessAddress;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private String workPhone;

	/**
	 * PayPal Business Category. i.e., baby - 1004 	 
	 */ 
	private Integer category;

	/**
	 * Paypal Business subcategory. i.e., baby-clothing - 2027 	 
	 */ 
	private Integer subCategory;

	/**
	 * If Category and Subcategory is specified, then this is
	 * optional. PayPal uses the industry standard Merchant
	 * Category Codes. Please refer to your Association Merchant
	 * Category Code documentation for a list of codes 	 
	 */ 
	private Integer merchantCategoryCode;

	/**
	 * 	 
	 */ 
	private String doingBusinessAs;

	/**
	 * 	 
	 */ 
	private String customerServicePhone;

	/**
	 * 	 
	 */ 
	private String customerServiceEmail;

	/**
	 * 	 
	 */ 
	private String disputeEmail;

	/**
	 * 	 
	 */ 
	private String webSite;

	/**
	 * Company Id: tax id, acn, abn, etc. 	 
	 */ 
	private String companyId;

	/**
	 * 	 
	 */ 
	private String dateOfEstablishment;

	/**
	 * 	 
	 */ 
	private BusinessType businessType;

	/**
	 * 	 
	 */ 
	private BusinessSubtypeType businessSubtype;

	/**
	 * 	 
	 */ 
	private String incorporationId;

	/**
	 * Average transaction value. 	 
	 */ 
	private Double averagePrice;

	/**
	 * Average monthly transaction value. 	 
	 */ 
	private Double averageMonthlyVolume;

	/**
	 * Percentage of the revenue that is from online sales
	 * (0%-100%). 	 
	 */ 
	private Integer percentageRevenueFromOnline;

	/**
	 * 	 
	 */ 
	private List<SalesVenueType> salesVenue = new ArrayList<SalesVenueType>();

	/**
	 * Description of store front or place for sales. Only required
	 * when "OTHER" is specified for salesVenue. 	 
	 */ 
	private String salesVenueDesc;

	/**
	 * Value Added Tax (VAT) ID number 	 
	 */ 
	private String vatId;

	/**
	 * Country code for country on the vat id. 	 
	 */ 
	private String vatCountryCode;

	/**
	 * Official commercial registration location. 	 
	 */ 
	private String commercialRegistrationLocation;

	/**
	 * 	 
	 */ 
	private AddressType principalPlaceOfBusinessAddress;

	/**
	 * 	 
	 */ 
	private AddressType registeredOfficeAddress;

	/**
	 * 	 
	 */ 
	private String establishmentCountryCode;

	/**
	 * 	 
	 */ 
	private String establishmentState;

	/**
	 * All the stakeholders of the company. 	 
	 */ 
	private List<BusinessStakeholderType> businessStakeholder = new ArrayList<BusinessStakeholderType>();

	

	/**
	 * Constructor with arguments
	 */
	public BusinessInfoType (String businessName, AddressType businessAddress, String workPhone){
		this.businessName = businessName;
		this.businessAddress = businessAddress;
		this.workPhone = workPhone;
	}	

	/**
	 * Default Constructor
	 */
	public BusinessInfoType (){
	}	

	/**
	 * Getter for businessName
	 */
	 public String getBusinessName() {
	 	return businessName;
	 }
	 
	/**
	 * Setter for businessName
	 */
	 public void setBusinessName(String businessName) {
	 	this.businessName = businessName;
	 }
	 
	/**
	 * Getter for businessAddress
	 */
	 public AddressType getBusinessAddress() {
	 	return businessAddress;
	 }
	 
	/**
	 * Setter for businessAddress
	 */
	 public void setBusinessAddress(AddressType businessAddress) {
	 	this.businessAddress = businessAddress;
	 }
	 
	/**
	 * Getter for workPhone
	 */
	 public String getWorkPhone() {
	 	return workPhone;
	 }
	 
	/**
	 * Setter for workPhone
	 */
	 public void setWorkPhone(String workPhone) {
	 	this.workPhone = workPhone;
	 }
	 
	/**
	 * Getter for category
	 */
	 public Integer getCategory() {
	 	return category;
	 }
	 
	/**
	 * Setter for category
	 */
	 public void setCategory(Integer category) {
	 	this.category = category;
	 }
	 
	/**
	 * Getter for subCategory
	 */
	 public Integer getSubCategory() {
	 	return subCategory;
	 }
	 
	/**
	 * Setter for subCategory
	 */
	 public void setSubCategory(Integer subCategory) {
	 	this.subCategory = subCategory;
	 }
	 
	/**
	 * Getter for merchantCategoryCode
	 */
	 public Integer getMerchantCategoryCode() {
	 	return merchantCategoryCode;
	 }
	 
	/**
	 * Setter for merchantCategoryCode
	 */
	 public void setMerchantCategoryCode(Integer merchantCategoryCode) {
	 	this.merchantCategoryCode = merchantCategoryCode;
	 }
	 
	/**
	 * Getter for doingBusinessAs
	 */
	 public String getDoingBusinessAs() {
	 	return doingBusinessAs;
	 }
	 
	/**
	 * Setter for doingBusinessAs
	 */
	 public void setDoingBusinessAs(String doingBusinessAs) {
	 	this.doingBusinessAs = doingBusinessAs;
	 }
	 
	/**
	 * Getter for customerServicePhone
	 */
	 public String getCustomerServicePhone() {
	 	return customerServicePhone;
	 }
	 
	/**
	 * Setter for customerServicePhone
	 */
	 public void setCustomerServicePhone(String customerServicePhone) {
	 	this.customerServicePhone = customerServicePhone;
	 }
	 
	/**
	 * Getter for customerServiceEmail
	 */
	 public String getCustomerServiceEmail() {
	 	return customerServiceEmail;
	 }
	 
	/**
	 * Setter for customerServiceEmail
	 */
	 public void setCustomerServiceEmail(String customerServiceEmail) {
	 	this.customerServiceEmail = customerServiceEmail;
	 }
	 
	/**
	 * Getter for disputeEmail
	 */
	 public String getDisputeEmail() {
	 	return disputeEmail;
	 }
	 
	/**
	 * Setter for disputeEmail
	 */
	 public void setDisputeEmail(String disputeEmail) {
	 	this.disputeEmail = disputeEmail;
	 }
	 
	/**
	 * Getter for webSite
	 */
	 public String getWebSite() {
	 	return webSite;
	 }
	 
	/**
	 * Setter for webSite
	 */
	 public void setWebSite(String webSite) {
	 	this.webSite = webSite;
	 }
	 
	/**
	 * Getter for companyId
	 */
	 public String getCompanyId() {
	 	return companyId;
	 }
	 
	/**
	 * Setter for companyId
	 */
	 public void setCompanyId(String companyId) {
	 	this.companyId = companyId;
	 }
	 
	/**
	 * Getter for dateOfEstablishment
	 */
	 public String getDateOfEstablishment() {
	 	return dateOfEstablishment;
	 }
	 
	/**
	 * Setter for dateOfEstablishment
	 */
	 public void setDateOfEstablishment(String dateOfEstablishment) {
	 	this.dateOfEstablishment = dateOfEstablishment;
	 }
	 
	/**
	 * Getter for businessType
	 */
	 public BusinessType getBusinessType() {
	 	return businessType;
	 }
	 
	/**
	 * Setter for businessType
	 */
	 public void setBusinessType(BusinessType businessType) {
	 	this.businessType = businessType;
	 }
	 
	/**
	 * Getter for businessSubtype
	 */
	 public BusinessSubtypeType getBusinessSubtype() {
	 	return businessSubtype;
	 }
	 
	/**
	 * Setter for businessSubtype
	 */
	 public void setBusinessSubtype(BusinessSubtypeType businessSubtype) {
	 	this.businessSubtype = businessSubtype;
	 }
	 
	/**
	 * Getter for incorporationId
	 */
	 public String getIncorporationId() {
	 	return incorporationId;
	 }
	 
	/**
	 * Setter for incorporationId
	 */
	 public void setIncorporationId(String incorporationId) {
	 	this.incorporationId = incorporationId;
	 }
	 
	/**
	 * Getter for averagePrice
	 */
	 public Double getAveragePrice() {
	 	return averagePrice;
	 }
	 
	/**
	 * Setter for averagePrice
	 */
	 public void setAveragePrice(Double averagePrice) {
	 	this.averagePrice = averagePrice;
	 }
	 
	/**
	 * Getter for averageMonthlyVolume
	 */
	 public Double getAverageMonthlyVolume() {
	 	return averageMonthlyVolume;
	 }
	 
	/**
	 * Setter for averageMonthlyVolume
	 */
	 public void setAverageMonthlyVolume(Double averageMonthlyVolume) {
	 	this.averageMonthlyVolume = averageMonthlyVolume;
	 }
	 
	/**
	 * Getter for percentageRevenueFromOnline
	 */
	 public Integer getPercentageRevenueFromOnline() {
	 	return percentageRevenueFromOnline;
	 }
	 
	/**
	 * Setter for percentageRevenueFromOnline
	 */
	 public void setPercentageRevenueFromOnline(Integer percentageRevenueFromOnline) {
	 	this.percentageRevenueFromOnline = percentageRevenueFromOnline;
	 }
	 
	/**
	 * Getter for salesVenue
	 */
	 public List<SalesVenueType> getSalesVenue() {
	 	return salesVenue;
	 }
	 
	/**
	 * Setter for salesVenue
	 */
	 public void setSalesVenue(List<SalesVenueType> salesVenue) {
	 	this.salesVenue = salesVenue;
	 }
	 
	/**
	 * Getter for salesVenueDesc
	 */
	 public String getSalesVenueDesc() {
	 	return salesVenueDesc;
	 }
	 
	/**
	 * Setter for salesVenueDesc
	 */
	 public void setSalesVenueDesc(String salesVenueDesc) {
	 	this.salesVenueDesc = salesVenueDesc;
	 }
	 
	/**
	 * Getter for vatId
	 */
	 public String getVatId() {
	 	return vatId;
	 }
	 
	/**
	 * Setter for vatId
	 */
	 public void setVatId(String vatId) {
	 	this.vatId = vatId;
	 }
	 
	/**
	 * Getter for vatCountryCode
	 */
	 public String getVatCountryCode() {
	 	return vatCountryCode;
	 }
	 
	/**
	 * Setter for vatCountryCode
	 */
	 public void setVatCountryCode(String vatCountryCode) {
	 	this.vatCountryCode = vatCountryCode;
	 }
	 
	/**
	 * Getter for commercialRegistrationLocation
	 */
	 public String getCommercialRegistrationLocation() {
	 	return commercialRegistrationLocation;
	 }
	 
	/**
	 * Setter for commercialRegistrationLocation
	 */
	 public void setCommercialRegistrationLocation(String commercialRegistrationLocation) {
	 	this.commercialRegistrationLocation = commercialRegistrationLocation;
	 }
	 
	/**
	 * Getter for principalPlaceOfBusinessAddress
	 */
	 public AddressType getPrincipalPlaceOfBusinessAddress() {
	 	return principalPlaceOfBusinessAddress;
	 }
	 
	/**
	 * Setter for principalPlaceOfBusinessAddress
	 */
	 public void setPrincipalPlaceOfBusinessAddress(AddressType principalPlaceOfBusinessAddress) {
	 	this.principalPlaceOfBusinessAddress = principalPlaceOfBusinessAddress;
	 }
	 
	/**
	 * Getter for registeredOfficeAddress
	 */
	 public AddressType getRegisteredOfficeAddress() {
	 	return registeredOfficeAddress;
	 }
	 
	/**
	 * Setter for registeredOfficeAddress
	 */
	 public void setRegisteredOfficeAddress(AddressType registeredOfficeAddress) {
	 	this.registeredOfficeAddress = registeredOfficeAddress;
	 }
	 
	/**
	 * Getter for establishmentCountryCode
	 */
	 public String getEstablishmentCountryCode() {
	 	return establishmentCountryCode;
	 }
	 
	/**
	 * Setter for establishmentCountryCode
	 */
	 public void setEstablishmentCountryCode(String establishmentCountryCode) {
	 	this.establishmentCountryCode = establishmentCountryCode;
	 }
	 
	/**
	 * Getter for establishmentState
	 */
	 public String getEstablishmentState() {
	 	return establishmentState;
	 }
	 
	/**
	 * Setter for establishmentState
	 */
	 public void setEstablishmentState(String establishmentState) {
	 	this.establishmentState = establishmentState;
	 }
	 
	/**
	 * Getter for businessStakeholder
	 */
	 public List<BusinessStakeholderType> getBusinessStakeholder() {
	 	return businessStakeholder;
	 }
	 
	/**
	 * Setter for businessStakeholder
	 */
	 public void setBusinessStakeholder(List<BusinessStakeholderType> businessStakeholder) {
	 	this.businessStakeholder = businessStakeholder;
	 }
	 


	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}
	
	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if (businessName != null) {
			sb.append(prefix).append("businessName=").append(NVPUtil.encodeUrl(businessName));
			sb.append("&");
		}
		if (businessAddress != null) {
			String newPrefix = prefix + "businessAddress.";
			sb.append(businessAddress.toNVPString(newPrefix));
		}
		if (workPhone != null) {
			sb.append(prefix).append("workPhone=").append(NVPUtil.encodeUrl(workPhone));
			sb.append("&");
		}
		if (category != null) {
			sb.append(prefix).append("category=").append(category);
			sb.append("&");
		}
		if (subCategory != null) {
			sb.append(prefix).append("subCategory=").append(subCategory);
			sb.append("&");
		}
		if (merchantCategoryCode != null) {
			sb.append(prefix).append("merchantCategoryCode=").append(merchantCategoryCode);
			sb.append("&");
		}
		if (doingBusinessAs != null) {
			sb.append(prefix).append("doingBusinessAs=").append(NVPUtil.encodeUrl(doingBusinessAs));
			sb.append("&");
		}
		if (customerServicePhone != null) {
			sb.append(prefix).append("customerServicePhone=").append(NVPUtil.encodeUrl(customerServicePhone));
			sb.append("&");
		}
		if (customerServiceEmail != null) {
			sb.append(prefix).append("customerServiceEmail=").append(NVPUtil.encodeUrl(customerServiceEmail));
			sb.append("&");
		}
		if (disputeEmail != null) {
			sb.append(prefix).append("disputeEmail=").append(NVPUtil.encodeUrl(disputeEmail));
			sb.append("&");
		}
		if (webSite != null) {
			sb.append(prefix).append("webSite=").append(NVPUtil.encodeUrl(webSite));
			sb.append("&");
		}
		if (companyId != null) {
			sb.append(prefix).append("companyId=").append(NVPUtil.encodeUrl(companyId));
			sb.append("&");
		}
		if (dateOfEstablishment != null) {
			sb.append(prefix).append("dateOfEstablishment=").append(NVPUtil.encodeUrl(dateOfEstablishment));
			sb.append("&");
		}
		if (businessType != null) {
			sb.append(prefix).append("businessType=").append(businessType.getValue());
			sb.append("&");
		}
		if (businessSubtype != null) {
			sb.append(prefix).append("businessSubtype=").append(businessSubtype.getValue());
			sb.append("&");
		}
		if (incorporationId != null) {
			sb.append(prefix).append("incorporationId=").append(NVPUtil.encodeUrl(incorporationId));
			sb.append("&");
		}
		if (averagePrice != null) {
			sb.append(prefix).append("averagePrice=").append(averagePrice);
			sb.append("&");
		}
		if (averageMonthlyVolume != null) {
			sb.append(prefix).append("averageMonthlyVolume=").append(averageMonthlyVolume);
			sb.append("&");
		}
		if (percentageRevenueFromOnline != null) {
			sb.append(prefix).append("percentageRevenueFromOnline=").append(percentageRevenueFromOnline);
			sb.append("&");
		}
		if (salesVenue != null) {
			for(int i=0; i < salesVenue.size(); i++) {
				sb.append(prefix).append("salesVenue(").append(i).append(")=").append(salesVenue.get(i).getValue());
				sb.append("&");
			}
		}
		if (salesVenueDesc != null) {
			sb.append(prefix).append("salesVenueDesc=").append(NVPUtil.encodeUrl(salesVenueDesc));
			sb.append("&");
		}
		if (vatId != null) {
			sb.append(prefix).append("vatId=").append(NVPUtil.encodeUrl(vatId));
			sb.append("&");
		}
		if (vatCountryCode != null) {
			sb.append(prefix).append("vatCountryCode=").append(NVPUtil.encodeUrl(vatCountryCode));
			sb.append("&");
		}
		if (commercialRegistrationLocation != null) {
			sb.append(prefix).append("commercialRegistrationLocation=").append(NVPUtil.encodeUrl(commercialRegistrationLocation));
			sb.append("&");
		}
		if (principalPlaceOfBusinessAddress != null) {
			String newPrefix = prefix + "principalPlaceOfBusinessAddress.";
			sb.append(principalPlaceOfBusinessAddress.toNVPString(newPrefix));
		}
		if (registeredOfficeAddress != null) {
			String newPrefix = prefix + "registeredOfficeAddress.";
			sb.append(registeredOfficeAddress.toNVPString(newPrefix));
		}
		if (establishmentCountryCode != null) {
			sb.append(prefix).append("establishmentCountryCode=").append(NVPUtil.encodeUrl(establishmentCountryCode));
			sb.append("&");
		}
		if (establishmentState != null) {
			sb.append(prefix).append("establishmentState=").append(NVPUtil.encodeUrl(establishmentState));
			sb.append("&");
		}
		if (businessStakeholder != null) {
			for(int i=0; i < businessStakeholder.size(); i++) {
				String newPrefix = prefix + "businessStakeholder" + "(" + i + ").";
				sb.append(businessStakeholder.get(i).toNVPString(newPrefix));
			}
		}
		return sb.toString();
	}

}