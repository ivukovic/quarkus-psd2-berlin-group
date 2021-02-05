package io.swagger.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
  * Card account details. 
 **/
@Schema(description = "Card account details. ")
public class CardAccountDetails {

	@Schema(description = "This is the data element to be used in the path when retrieving data from a dedicated account. This shall be filled, if addressable resource are created by the ASPSP on the /card-accounts endpoint. ")
	/**
	  * This is the data element to be used in the path when retrieving data from a dedicated account. This shall be filled, if addressable resource are created by the ASPSP on the /card-accounts endpoint.   
	 **/
	private String resourceId = null;

	@Schema(required = true, description = "")
	private String maskedPan = null;

	@Schema(required = true, description = "")
	private String currency = null;

	@Schema(description = "")
	private String ownerName = null;

	@Schema(description = "Name of the account, as assigned by the ASPSP,  in agreement with the account owner in order to provide an additional means of identification of the account. ")
	/**
	  * Name of the account, as assigned by the ASPSP,  in agreement with the account owner in order to provide an additional means of identification of the account.   
	 **/
	private String name = null;

	@Schema(description = "")
	private String displayName = null;

	@Schema(description = "Product Name of the Bank for this account, proprietary definition. ")
	/**
	  * Product Name of the Bank for this account, proprietary definition.   
	 **/
	private String product = null;

	@Schema(description = "")
	private Boolean debitAccounting = null;

	@Schema(description = "")
	private AccountStatus status = null;

	public enum UsageEnum {
		PRIV("PRIV"), ORGA("ORGA");

		private String value;

		UsageEnum(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static UsageEnum fromValue(String text) {
			for (UsageEnum b : UsageEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	@Schema(description = "Specifies the usage of the account:   * PRIV: private personal account   * ORGA: professional account ")
	/**
	  * Specifies the usage of the account:   * PRIV: private personal account   * ORGA: professional account   
	 **/
	private UsageEnum usage = null;

	@Schema(description = "Specifications that might be provided by the ASPSP:   - characteristics of the account   - characteristics of the relevant card ")
	/**
	  * Specifications that might be provided by the ASPSP:   - characteristics of the account   - characteristics of the relevant card   
	 **/
	private String details = null;

	@Schema(description = "")
	private Amount creditLimit = null;

	@Schema(description = "")
	private BalanceList balances = null;

	@Schema(description = "")
	private LinksAccountDetails _links = null;

	/**
	  * This is the data element to be used in the path when retrieving data from a dedicated account. This shall be filled, if addressable resource are created by the ASPSP on the /card-accounts endpoint. 
	  * @return resourceId
	 **/
	@JsonProperty("resourceId")
	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public CardAccountDetails resourceId(String resourceId) {
		this.resourceId = resourceId;
		return this;
	}

	/**
	  * Get maskedPan
	  * @return maskedPan
	 **/
	@JsonProperty("maskedPan")
	@NotNull
	@Size(max = 35)
	public String getMaskedPan() {
		return maskedPan;
	}

	public void setMaskedPan(String maskedPan) {
		this.maskedPan = maskedPan;
	}

	public CardAccountDetails maskedPan(String maskedPan) {
		this.maskedPan = maskedPan;
		return this;
	}

	/**
	  * Get currency
	  * @return currency
	 **/
	@JsonProperty("currency")
	@NotNull
	@Pattern(regexp = "[A-Z]{3}")
	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public CardAccountDetails currency(String currency) {
		this.currency = currency;
		return this;
	}

	/**
	  * Get ownerName
	  * @return ownerName
	 **/
	@JsonProperty("ownerName")
	@Size(max = 140)
	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public CardAccountDetails ownerName(String ownerName) {
		this.ownerName = ownerName;
		return this;
	}

	/**
	  * Name of the account, as assigned by the ASPSP,  in agreement with the account owner in order to provide an additional means of identification of the account. 
	  * @return name
	 **/
	@JsonProperty("name")
	@Size(max = 70)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CardAccountDetails name(String name) {
		this.name = name;
		return this;
	}

	/**
	  * Get displayName
	  * @return displayName
	 **/
	@JsonProperty("displayName")
	@Size(max = 70)
	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public CardAccountDetails displayName(String displayName) {
		this.displayName = displayName;
		return this;
	}

	/**
	  * Product Name of the Bank for this account, proprietary definition. 
	  * @return product
	 **/
	@JsonProperty("product")
	@Size(max = 35)
	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public CardAccountDetails product(String product) {
		this.product = product;
		return this;
	}

	/**
	  * Get debitAccounting
	  * @return debitAccounting
	 **/
	@JsonProperty("debitAccounting")
	public Boolean getDebitAccounting() {
		return debitAccounting;
	}

	public void setDebitAccounting(Boolean debitAccounting) {
		this.debitAccounting = debitAccounting;
	}

	public CardAccountDetails debitAccounting(Boolean debitAccounting) {
		this.debitAccounting = debitAccounting;
		return this;
	}

	/**
	  * Get status
	  * @return status
	 **/
	@JsonProperty("status")
	public AccountStatus getStatus() {
		return status;
	}

	public void setStatus(AccountStatus status) {
		this.status = status;
	}

	public CardAccountDetails status(AccountStatus status) {
		this.status = status;
		return this;
	}

	/**
	  * Specifies the usage of the account:   * PRIV: private personal account   * ORGA: professional account 
	  * @return usage
	 **/
	@JsonProperty("usage")
	@Size(max = 4)
	public String getUsage() {
		if (usage == null) {
			return null;
		}
		return usage.getValue();
	}

	public void setUsage(UsageEnum usage) {
		this.usage = usage;
	}

	public CardAccountDetails usage(UsageEnum usage) {
		this.usage = usage;
		return this;
	}

	/**
	  * Specifications that might be provided by the ASPSP:   - characteristics of the account   - characteristics of the relevant card 
	  * @return details
	 **/
	@JsonProperty("details")
	@Size(max = 500)
	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public CardAccountDetails details(String details) {
		this.details = details;
		return this;
	}

	/**
	  * Get creditLimit
	  * @return creditLimit
	 **/
	@JsonProperty("creditLimit")
	public Amount getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(Amount creditLimit) {
		this.creditLimit = creditLimit;
	}

	public CardAccountDetails creditLimit(Amount creditLimit) {
		this.creditLimit = creditLimit;
		return this;
	}

	/**
	  * Get balances
	  * @return balances
	 **/
	@JsonProperty("balances")
	public BalanceList getBalances() {
		return balances;
	}

	public void setBalances(BalanceList balances) {
		this.balances = balances;
	}

	public CardAccountDetails balances(BalanceList balances) {
		this.balances = balances;
		return this;
	}

	/**
	  * Get _links
	  * @return _links
	 **/
	@JsonProperty("_links")
	public LinksAccountDetails getLinks() {
		return _links;
	}

	public void setLinks(LinksAccountDetails _links) {
		this._links = _links;
	}

	public CardAccountDetails _links(LinksAccountDetails _links) {
		this._links = _links;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CardAccountDetails {\n");

		sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
		sb.append("    maskedPan: ").append(toIndentedString(maskedPan)).append("\n");
		sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
		sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
		sb.append("    product: ").append(toIndentedString(product)).append("\n");
		sb.append("    debitAccounting: ").append(toIndentedString(debitAccounting)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
		sb.append("    details: ").append(toIndentedString(details)).append("\n");
		sb.append("    creditLimit: ").append(toIndentedString(creditLimit)).append("\n");
		sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
		sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private static String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
