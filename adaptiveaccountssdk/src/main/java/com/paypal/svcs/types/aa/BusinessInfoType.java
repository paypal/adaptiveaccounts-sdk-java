package com.paypal.svcs.types.aa;
import com.paypal.svcs.types.aa.AddressType;
import com.paypal.svcs.types.aa.BusinessType;
import com.paypal.svcs.types.aa.BusinessSubtypeType;
import java.util.List;
import java.util.ArrayList;
import com.paypal.svcs.types.aa.SalesVenueType;
import com.paypal.svcs.types.aa.BusinessStakeholderType;
import com.paypal.svcs.types.aa.BusinessEntityForThirdPartyType;
import com.paypal.svcs.types.aa.YesNoType;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;

/**
 * PayPal Business Category. i.e., baby - 1004 
 */
public class BusinessInfoType{


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
	 * Business entity acting on behalf of Third Party. 	 
	 */ 
	private BusinessEntityForThirdPartyType businessEntityForThirdParty;

	/**
	 * Values: Yes or No 	 
	 */ 
	private YesNoType hasDirectors;

	/**
	 * Values: Yes or No 	 
	 */ 
	private YesNoType hasBeneficialOwners;

	/**
	 * Values: Yes or No 	 
	 */ 
	private YesNoType hasThirdPartyAssociates;

	

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
	 
	/**
	 * Getter for businessEntityForThirdParty
	 */
	 public BusinessEntityForThirdPartyType getBusinessEntityForThirdParty() {
	 	return businessEntityForThirdParty;
	 }
	 
	/**
	 * Setter for businessEntityForThirdParty
	 */
	 public void setBusinessEntityForThirdParty(BusinessEntityForThirdPartyType businessEntityForThirdParty) {
	 	this.businessEntityForThirdParty = businessEntityForThirdParty;
	 }
	 
	/**
	 * Getter for hasDirectors
	 */
	 public YesNoType getHasDirectors() {
	 	return hasDirectors;
	 }
	 
	/**
	 * Setter for hasDirectors
	 */
	 public void setHasDirectors(YesNoType hasDirectors) {
	 	this.hasDirectors = hasDirectors;
	 }
	 
	/**
	 * Getter for hasBeneficialOwners
	 */
	 public YesNoType getHasBeneficialOwners() {
	 	return hasBeneficialOwners;
	 }
	 
	/**
	 * Setter for hasBeneficialOwners
	 */
	 public void setHasBeneficialOwners(YesNoType hasBeneficialOwners) {
	 	this.hasBeneficialOwners = hasBeneficialOwners;
	 }
	 
	/**
	 * Getter for hasThirdPartyAssociates
	 */
	 public YesNoType getHasThirdPartyAssociates() {
	 	return hasThirdPartyAssociates;
	 }
	 
	/**
	 * Setter for hasThirdPartyAssociates
	 */
	 public void setHasThirdPartyAssociates(YesNoType hasThirdPartyAssociates) {
	 	this.hasThirdPartyAssociates = hasThirdPartyAssociates;
	 }
	 


	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}
	
	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if (this.businessName != null) {
			sb.append(prefix).append("businessName=").append(NVPUtil.encodeUrl(this.businessName));
			sb.append("&");
		}
		if (this.businessAddress != null) {
			String newPrefix = prefix + "businessAddress.";
			sb.append(this.businessAddress.toNVPString(newPrefix));
		}
		if (this.workPhone != null) {
			sb.append(prefix).append("workPhone=").append(NVPUtil.encodeUrl(this.workPhone));
			sb.append("&");
		}
		if (this.category != null) {
			sb.append(prefix).append("category=").append(this.category);
			sb.append("&");
		}
		if (this.subCategory != null) {
			sb.append(prefix).append("subCategory=").append(this.subCategory);
			sb.append("&");
		}
		if (this.merchantCategoryCode != null) {
			sb.append(prefix).append("merchantCategoryCode=").append(this.merchantCategoryCode);
			sb.append("&");
		}
		if (this.doingBusinessAs != null) {
			sb.append(prefix).append("doingBusinessAs=").append(NVPUtil.encodeUrl(this.doingBusinessAs));
			sb.append("&");
		}
		if (this.customerServicePhone != null) {
			sb.append(prefix).append("customerServicePhone=").append(NVPUtil.encodeUrl(this.customerServicePhone));
			sb.append("&");
		}
		if (this.customerServiceEmail != null) {
			sb.append(prefix).append("customerServiceEmail=").append(NVPUtil.encodeUrl(this.customerServiceEmail));
			sb.append("&");
		}
		if (this.disputeEmail != null) {
			sb.append(prefix).append("disputeEmail=").append(NVPUtil.encodeUrl(this.disputeEmail));
			sb.append("&");
		}
		if (this.webSite != null) {
			sb.append(prefix).append("webSite=").append(NVPUtil.encodeUrl(this.webSite));
			sb.append("&");
		}
		if (this.companyId != null) {
			sb.append(prefix).append("companyId=").append(NVPUtil.encodeUrl(this.companyId));
			sb.append("&");
		}
		if (this.dateOfEstablishment != null) {
			sb.append(prefix).append("dateOfEstablishment=").append(NVPUtil.encodeUrl(this.dateOfEstablishment));
			sb.append("&");
		}
		if (this.businessType != null) {
			sb.append(prefix).append("businessType=").append(this.businessType.getValue());
			sb.append("&");
		}
		if (this.businessSubtype != null) {
			sb.append(prefix).append("businessSubtype=").append(this.businessSubtype.getValue());
			sb.append("&");
		}
		if (this.incorporationId != null) {
			sb.append(prefix).append("incorporationId=").append(NVPUtil.encodeUrl(this.incorporationId));
			sb.append("&");
		}
		if (this.averagePrice != null) {
			sb.append(prefix).append("averagePrice=").append(this.averagePrice);
			sb.append("&");
		}
		if (this.averageMonthlyVolume != null) {
			sb.append(prefix).append("averageMonthlyVolume=").append(this.averageMonthlyVolume);
			sb.append("&");
		}
		if (this.percentageRevenueFromOnline != null) {
			sb.append(prefix).append("percentageRevenueFromOnline=").append(this.percentageRevenueFromOnline);
			sb.append("&");
		}
		if (this.salesVenue != null) {
			for(int i=0; i < this.salesVenue.size(); i++) {
				sb.append(prefix).append("salesVenue(").append(i).append(")=").append(this.salesVenue.get(i).getValue());
				sb.append("&");
			}
		}
		if (this.salesVenueDesc != null) {
			sb.append(prefix).append("salesVenueDesc=").append(NVPUtil.encodeUrl(this.salesVenueDesc));
			sb.append("&");
		}
		if (this.vatId != null) {
			sb.append(prefix).append("vatId=").append(NVPUtil.encodeUrl(this.vatId));
			sb.append("&");
		}
		if (this.vatCountryCode != null) {
			sb.append(prefix).append("vatCountryCode=").append(NVPUtil.encodeUrl(this.vatCountryCode));
			sb.append("&");
		}
		if (this.commercialRegistrationLocation != null) {
			sb.append(prefix).append("commercialRegistrationLocation=").append(NVPUtil.encodeUrl(this.commercialRegistrationLocation));
			sb.append("&");
		}
		if (this.principalPlaceOfBusinessAddress != null) {
			String newPrefix = prefix + "principalPlaceOfBusinessAddress.";
			sb.append(this.principalPlaceOfBusinessAddress.toNVPString(newPrefix));
		}
		if (this.registeredOfficeAddress != null) {
			String newPrefix = prefix + "registeredOfficeAddress.";
			sb.append(this.registeredOfficeAddress.toNVPString(newPrefix));
		}
		if (this.establishmentCountryCode != null) {
			sb.append(prefix).append("establishmentCountryCode=").append(NVPUtil.encodeUrl(this.establishmentCountryCode));
			sb.append("&");
		}
		if (this.establishmentState != null) {
			sb.append(prefix).append("establishmentState=").append(NVPUtil.encodeUrl(this.establishmentState));
			sb.append("&");
		}
		if (this.businessStakeholder != null) {
			for(int i=0; i < this.businessStakeholder.size(); i++) {
				String newPrefix = prefix + "businessStakeholder" + "(" + i + ").";
				sb.append(this.businessStakeholder.get(i).toNVPString(newPrefix));
			}
		}
		if (this.businessEntityForThirdParty != null) {
			String newPrefix = prefix + "businessEntityForThirdParty.";
			sb.append(this.businessEntityForThirdParty.toNVPString(newPrefix));
		}
		if (this.hasDirectors != null) {
			sb.append(prefix).append("hasDirectors=").append(this.hasDirectors.getValue());
			sb.append("&");
		}
		if (this.hasBeneficialOwners != null) {
			sb.append(prefix).append("hasBeneficialOwners=").append(this.hasBeneficialOwners.getValue());
			sb.append("&");
		}
		if (this.hasThirdPartyAssociates != null) {
			sb.append(prefix).append("hasThirdPartyAssociates=").append(this.hasThirdPartyAssociates.getValue());
			sb.append("&");
		}
		return sb.toString();
	}

}