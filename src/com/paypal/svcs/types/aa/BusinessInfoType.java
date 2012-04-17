
/**
 * Auto generated code
 */

package com.paypal.svcs.types.aa;

import com.paypal.core.NVPUtil;
import com.paypal.svcs.types.aa.AddressType;
import com.paypal.svcs.types.aa.BusinessStakeholderType;
import com.paypal.svcs.types.aa.BusinessSubtypeType;
import com.paypal.svcs.types.aa.BusinessType;
import com.paypal.svcs.types.aa.SalesVenueType;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;


/**
 * PayPal Business Category. i.e., baby -
 * 1004
 */
public class BusinessInfoType {

	/**
	 *
	 * @Required
	 */
	private String businessName;
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String value) {
		this.businessName = value;
	}

	/**
	 *
	 * @Required
	 */
	private AddressType businessAddress;
	public AddressType getBusinessAddress() {
		return businessAddress;
	}
	public void setBusinessAddress(AddressType value) {
		this.businessAddress = value;
	}

	/**
	 *
	 * @Required
	 */
	private String workPhone;
	public String getWorkPhone() {
		return workPhone;
	}
	public void setWorkPhone(String value) {
		this.workPhone = value;
	}

	/**
	 * PayPal Business Category. i.e., baby -
	 * 1004
	 */
	private Integer category;
	public Integer getCategory() {
		return category;
	}
	public void setCategory(Integer value) {
		this.category = value;
	}

	/**
	 * Paypal Business subcategory. i.e.,
	 * baby-clothing - 2027
	 */
	private Integer subCategory;
	public Integer getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(Integer value) {
		this.subCategory = value;
	}

	/**
	 * If Category and Subcategory is
	 * specified, then this is optional. PayPal
	 * uses the industry standard Merchant
	 * Category Codes. Please refer to your
	 * Association Merchant Category Code
	 * documentation for a list of codes
	 */
	private Integer merchantCategoryCode;
	public Integer getMerchantCategoryCode() {
		return merchantCategoryCode;
	}
	public void setMerchantCategoryCode(Integer value) {
		this.merchantCategoryCode = value;
	}

	/**
	 */
	private String doingBusinessAs;
	public String getDoingBusinessAs() {
		return doingBusinessAs;
	}
	public void setDoingBusinessAs(String value) {
		this.doingBusinessAs = value;
	}

	/**
	 */
	private String customerServicePhone;
	public String getCustomerServicePhone() {
		return customerServicePhone;
	}
	public void setCustomerServicePhone(String value) {
		this.customerServicePhone = value;
	}

	/**
	 */
	private String customerServiceEmail;
	public String getCustomerServiceEmail() {
		return customerServiceEmail;
	}
	public void setCustomerServiceEmail(String value) {
		this.customerServiceEmail = value;
	}

	/**
	 */
	private String disputeEmail;
	public String getDisputeEmail() {
		return disputeEmail;
	}
	public void setDisputeEmail(String value) {
		this.disputeEmail = value;
	}

	/**
	 */
	private String webSite;
	public String getWebSite() {
		return webSite;
	}
	public void setWebSite(String value) {
		this.webSite = value;
	}

	/**
	 * Company Id: tax id, acn, abn, etc.
	 */
	private String companyId;
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String value) {
		this.companyId = value;
	}

	/**
	 */
	private String dateOfEstablishment;
	public String getDateOfEstablishment() {
		return dateOfEstablishment;
	}
	public void setDateOfEstablishment(String value) {
		this.dateOfEstablishment = value;
	}

	/**
	 */
	private BusinessType businessType;
	public BusinessType getBusinessType() {
		return businessType;
	}
	public void setBusinessType(BusinessType value) {
		this.businessType = value;
	}

	/**
	 */
	private BusinessSubtypeType businessSubtype;
	public BusinessSubtypeType getBusinessSubtype() {
		return businessSubtype;
	}
	public void setBusinessSubtype(BusinessSubtypeType value) {
		this.businessSubtype = value;
	}

	/**
	 */
	private String incorporationId;
	public String getIncorporationId() {
		return incorporationId;
	}
	public void setIncorporationId(String value) {
		this.incorporationId = value;
	}

	/**
	 * Average transaction value.
	 */
	private Double averagePrice;
	public Double getAveragePrice() {
		return averagePrice;
	}
	public void setAveragePrice(Double value) {
		this.averagePrice = value;
	}

	/**
	 * Average monthly transaction value.
	 */
	private Double averageMonthlyVolume;
	public Double getAverageMonthlyVolume() {
		return averageMonthlyVolume;
	}
	public void setAverageMonthlyVolume(Double value) {
		this.averageMonthlyVolume = value;
	}

	/**
	 * Percentage of the revenue that is from online sales (0%-100%).
	 */
	private Integer percentageRevenueFromOnline;
	public Integer getPercentageRevenueFromOnline() {
		return percentageRevenueFromOnline;
	}
	public void setPercentageRevenueFromOnline(Integer value) {
		this.percentageRevenueFromOnline = value;
	}

	/**
	 */
	private List<SalesVenueType> salesVenue = new ArrayList<SalesVenueType>();
	public List<SalesVenueType> getSalesVenue() {
		return salesVenue;
	}
	public void setSalesVenue(List<SalesVenueType> value) {
		this.salesVenue = value;
	}

	/**
	 * Description of store front or place for sales.
	 * Only required when "OTHER" is specified for
	 * salesVenue.  
	 */
	private String salesVenueDesc;
	public String getSalesVenueDesc() {
		return salesVenueDesc;
	}
	public void setSalesVenueDesc(String value) {
		this.salesVenueDesc = value;
	}

	/**
	 * Value Added Tax (VAT) ID number
	 */
	private String vatId;
	public String getVatId() {
		return vatId;
	}
	public void setVatId(String value) {
		this.vatId = value;
	}

	/**
	 * Country code for country on the vat id.
	 */
	private String vatCountryCode;
	public String getVatCountryCode() {
		return vatCountryCode;
	}
	public void setVatCountryCode(String value) {
		this.vatCountryCode = value;
	}

	/**
	 * Official commercial registration location.
	 */
	private String commercialRegistrationLocation;
	public String getCommercialRegistrationLocation() {
		return commercialRegistrationLocation;
	}
	public void setCommercialRegistrationLocation(String value) {
		this.commercialRegistrationLocation = value;
	}

	/**
	 */
	private AddressType principalPlaceOfBusinessAddress;
	public AddressType getPrincipalPlaceOfBusinessAddress() {
		return principalPlaceOfBusinessAddress;
	}
	public void setPrincipalPlaceOfBusinessAddress(AddressType value) {
		this.principalPlaceOfBusinessAddress = value;
	}

	/**
	 */
	private AddressType registeredOfficeAddress;
	public AddressType getRegisteredOfficeAddress() {
		return registeredOfficeAddress;
	}
	public void setRegisteredOfficeAddress(AddressType value) {
		this.registeredOfficeAddress = value;
	}

	/**
	 */
	private String establishmentCountryCode;
	public String getEstablishmentCountryCode() {
		return establishmentCountryCode;
	}
	public void setEstablishmentCountryCode(String value) {
		this.establishmentCountryCode = value;
	}

	/**
	 */
	private String establishmentState;
	public String getEstablishmentState() {
		return establishmentState;
	}
	public void setEstablishmentState(String value) {
		this.establishmentState = value;
	}

	/**
	 * All the stakeholders of the company.  
	 */
	private List<BusinessStakeholderType> businessStakeholder = new ArrayList<BusinessStakeholderType>();
	public List<BusinessStakeholderType> getBusinessStakeholder() {
		return businessStakeholder;
	}
	public void setBusinessStakeholder(List<BusinessStakeholderType> value) {
		this.businessStakeholder = value;
	}


	public BusinessInfoType(String businessName, AddressType businessAddress, String workPhone) {
		this.businessName = businessName;
		this.businessAddress = businessAddress;
		this.workPhone = workPhone;
	}
	public BusinessInfoType() {
	}

	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}

	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if( businessName != null ) {
			sb.append(prefix).append("businessName=").append(NVPUtil.encodeUrl(businessName));
			sb.append('&');
		}
		if( businessAddress != null ) {
			String newPrefix = prefix + "businessAddress.";
			sb.append(businessAddress.toNVPString(newPrefix));
		}
		if( workPhone != null ) {
			sb.append(prefix).append("workPhone=").append(NVPUtil.encodeUrl(workPhone));
			sb.append('&');
		}
		if( category != null ) {
			sb.append(prefix).append("category=").append(category);
			sb.append('&');
		}
		if( subCategory != null ) {
			sb.append(prefix).append("subCategory=").append(subCategory);
			sb.append('&');
		}
		if( merchantCategoryCode != null ) {
			sb.append(prefix).append("merchantCategoryCode=").append(merchantCategoryCode);
			sb.append('&');
		}
		if( doingBusinessAs != null ) {
			sb.append(prefix).append("doingBusinessAs=").append(NVPUtil.encodeUrl(doingBusinessAs));
			sb.append('&');
		}
		if( customerServicePhone != null ) {
			sb.append(prefix).append("customerServicePhone=").append(NVPUtil.encodeUrl(customerServicePhone));
			sb.append('&');
		}
		if( customerServiceEmail != null ) {
			sb.append(prefix).append("customerServiceEmail=").append(NVPUtil.encodeUrl(customerServiceEmail));
			sb.append('&');
		}
		if( disputeEmail != null ) {
			sb.append(prefix).append("disputeEmail=").append(NVPUtil.encodeUrl(disputeEmail));
			sb.append('&');
		}
		if( webSite != null ) {
			sb.append(prefix).append("webSite=").append(NVPUtil.encodeUrl(webSite));
			sb.append('&');
		}
		if( companyId != null ) {
			sb.append(prefix).append("companyId=").append(NVPUtil.encodeUrl(companyId));
			sb.append('&');
		}
		if( dateOfEstablishment != null ) {
			sb.append(prefix).append("dateOfEstablishment=").append(NVPUtil.encodeUrl(dateOfEstablishment));
			sb.append('&');
		}
		if( businessType != null ) {
			sb.append(prefix).append("businessType=").append(businessType.getValue());
			sb.append('&');
		}
		if( businessSubtype != null ) {
			sb.append(prefix).append("businessSubtype=").append(businessSubtype.getValue());
			sb.append('&');
		}
		if( incorporationId != null ) {
			sb.append(prefix).append("incorporationId=").append(NVPUtil.encodeUrl(incorporationId));
			sb.append('&');
		}
		if( averagePrice != null ) {
			sb.append(prefix).append("averagePrice=").append(averagePrice);
			sb.append('&');
		}
		if( averageMonthlyVolume != null ) {
			sb.append(prefix).append("averageMonthlyVolume=").append(averageMonthlyVolume);
			sb.append('&');
		}
		if( percentageRevenueFromOnline != null ) {
			sb.append(prefix).append("percentageRevenueFromOnline=").append(percentageRevenueFromOnline);
			sb.append('&');
		}
		if( salesVenue != null ) {
			for(int i=0; i<salesVenue.size(); i++) {
				sb.append(prefix).append("salesVenue(").append(i).append(")=").append(salesVenue.get(i).getValue());
				sb.append('&');
			}
		}
		if( salesVenueDesc != null ) {
			sb.append(prefix).append("salesVenueDesc=").append(NVPUtil.encodeUrl(salesVenueDesc));
			sb.append('&');
		}
		if( vatId != null ) {
			sb.append(prefix).append("vatId=").append(NVPUtil.encodeUrl(vatId));
			sb.append('&');
		}
		if( vatCountryCode != null ) {
			sb.append(prefix).append("vatCountryCode=").append(NVPUtil.encodeUrl(vatCountryCode));
			sb.append('&');
		}
		if( commercialRegistrationLocation != null ) {
			sb.append(prefix).append("commercialRegistrationLocation=").append(NVPUtil.encodeUrl(commercialRegistrationLocation));
			sb.append('&');
		}
		if( principalPlaceOfBusinessAddress != null ) {
			String newPrefix = prefix + "principalPlaceOfBusinessAddress.";
			sb.append(principalPlaceOfBusinessAddress.toNVPString(newPrefix));
		}
		if( registeredOfficeAddress != null ) {
			String newPrefix = prefix + "registeredOfficeAddress.";
			sb.append(registeredOfficeAddress.toNVPString(newPrefix));
		}
		if( establishmentCountryCode != null ) {
			sb.append(prefix).append("establishmentCountryCode=").append(NVPUtil.encodeUrl(establishmentCountryCode));
			sb.append('&');
		}
		if( establishmentState != null ) {
			sb.append(prefix).append("establishmentState=").append(NVPUtil.encodeUrl(establishmentState));
			sb.append('&');
		}
		if( businessStakeholder != null ) {
			for(int i=0; i<businessStakeholder.size(); i++) {
				String newPrefix = prefix + "businessStakeholder" + '(' + i + ").";
				sb.append(businessStakeholder.get(i).toNVPString(newPrefix));
			}
		}
		return sb.toString();
	}

}
