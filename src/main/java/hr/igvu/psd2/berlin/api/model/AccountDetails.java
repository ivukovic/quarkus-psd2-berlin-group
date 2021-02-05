package hr.igvu.psd2.berlin.api.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import hr.igvu.psd2.util.ObjectUtil;

/**
  * The ASPSP shall give at least one of the account reference identifiers:   - iban   - bban   - pan   - maskedPan   - msisdn If the account is a multicurrency account currency code in \"currency\" is set to \"XXX\". 
 **/
@Schema(description = "The ASPSP shall give at least one of the account reference identifiers:   - iban   - bban   - pan   - maskedPan   - msisdn If the account is a multicurrency account currency code in \"currency\" is set to \"XXX\". ")
public class AccountDetails {

	@Schema(description = "This shall be filled, if addressable resource are created by the ASPSP on the /accounts or /card-accounts endpoint.")
	/**
	  * This shall be filled, if addressable resource are created by the ASPSP on the /accounts or /card-accounts endpoint.  
	 **/
	private String resourceId = null;

	@Schema(description = "")
	private String iban = null;

	@Schema(description = "")
	private String bban = null;

	@Schema(description = "")
	private String msisdn = null;

	@Schema(required = true, description = "")
	private String currency = null;

	@Schema(description = "Name of the account, as assigned by the ASPSP, in agreement with the account owner in order to provide an additional means of identification of the account.")
	/**
	  * Name of the account, as assigned by the ASPSP, in agreement with the account owner in order to provide an additional means of identification of the account.  
	 **/
	private String name = null;

	@Schema(description = "")
	private String displayName = null;

	@Schema(description = "Product name of the bank for this account, proprietary definition.")
	/**
	  * Product name of the bank for this account, proprietary definition.  
	 **/
	private String product = null;

	@Schema(description = "")
	private String cashAccountType = null;

	@Schema(description = "")
	private AccountStatus status = null;

	@Schema(description = "")
	private String bic = null;

	@Schema(description = "Case of a set of pending card transactions, the APSP will provide the relevant cash account the card is set up on.")
	/**
	  * Case of a set of pending card transactions, the APSP will provide the relevant cash account the card is set up on.  
	 **/
	private String linkedAccounts = null;

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
	private BalanceList balances = null;

	@Schema(description = "")
	private LinksAccountDetails _links = null;

	@Schema(description = "")
	private String ownerName = null;

	/**
	  * This shall be filled, if addressable resource are created by the ASPSP on the /accounts or /card-accounts endpoint.
	  * @return resourceId
	 **/
	@JsonProperty("resourceId")
	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public AccountDetails resourceId(String resourceId) {
		this.resourceId = resourceId;
		return this;
	}

	/**
	  * Get iban
	  * @return iban
	 **/
	@JsonProperty("iban")
	@Pattern(regexp = "[A-Z]{2,2}[0-9]{2,2}[a-zA-Z0-9]{1,30}")
	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public AccountDetails iban(String iban) {
		this.iban = iban;
		return this;
	}

	/**
	  * Get bban
	  * @return bban
	 **/
	@JsonProperty("bban")
	@Pattern(regexp = "[a-zA-Z0-9]{1,30}")
	public String getBban() {
		return bban;
	}

	public void setBban(String bban) {
		this.bban = bban;
	}

	public AccountDetails bban(String bban) {
		this.bban = bban;
		return this;
	}

	/**
	  * Get msisdn
	  * @return msisdn
	 **/
	@JsonProperty("msisdn")
	@Size(max = 35)
	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public AccountDetails msisdn(String msisdn) {
		this.msisdn = msisdn;
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

	public AccountDetails currency(String currency) {
		this.currency = currency;
		return this;
	}

	/**
	  * Name of the account, as assigned by the ASPSP, in agreement with the account owner in order to provide an additional means of identification of the account.
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

	public AccountDetails name(String name) {
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

	public AccountDetails displayName(String displayName) {
		this.displayName = displayName;
		return this;
	}

	/**
	  * Product name of the bank for this account, proprietary definition.
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

	public AccountDetails product(String product) {
		this.product = product;
		return this;
	}

	/**
	  * Get cashAccountType
	  * @return cashAccountType
	 **/
	@JsonProperty("cashAccountType")
	public String getCashAccountType() {
		return cashAccountType;
	}

	public void setCashAccountType(String cashAccountType) {
		this.cashAccountType = cashAccountType;
	}

	public AccountDetails cashAccountType(String cashAccountType) {
		this.cashAccountType = cashAccountType;
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

	public AccountDetails status(AccountStatus status) {
		this.status = status;
		return this;
	}

	/**
	  * Get bic
	  * @return bic
	 **/
	@JsonProperty("bic")
	@Pattern(regexp = "[A-Z]{6,6}[A-Z2-9][A-NP-Z0-9]([A-Z0-9]{3,3}){0,1}")
	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

	public AccountDetails bic(String bic) {
		this.bic = bic;
		return this;
	}

	/**
	  * Case of a set of pending card transactions, the APSP will provide the relevant cash account the card is set up on.
	  * @return linkedAccounts
	 **/
	@JsonProperty("linkedAccounts")
	@Size(max = 70)
	public String getLinkedAccounts() {
		return linkedAccounts;
	}

	public void setLinkedAccounts(String linkedAccounts) {
		this.linkedAccounts = linkedAccounts;
	}

	public AccountDetails linkedAccounts(String linkedAccounts) {
		this.linkedAccounts = linkedAccounts;
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

	public AccountDetails usage(UsageEnum usage) {
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

	public AccountDetails details(String details) {
		this.details = details;
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

	public AccountDetails balances(BalanceList balances) {
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

	public AccountDetails _links(LinksAccountDetails _links) {
		this._links = _links;
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

	public AccountDetails ownerName(String ownerName) {
		this.ownerName = ownerName;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AccountDetails {\n");

		sb.append("    resourceId: ").append(ObjectUtil.toIndentedString(resourceId)).append("\n");
		sb.append("    iban: ").append(ObjectUtil.toIndentedString(iban)).append("\n");
		sb.append("    bban: ").append(ObjectUtil.toIndentedString(bban)).append("\n");
		sb.append("    msisdn: ").append(ObjectUtil.toIndentedString(msisdn)).append("\n");
		sb.append("    currency: ").append(ObjectUtil.toIndentedString(currency)).append("\n");
		sb.append("    name: ").append(ObjectUtil.toIndentedString(name)).append("\n");
		sb.append("    displayName: ").append(ObjectUtil.toIndentedString(displayName)).append("\n");
		sb.append("    product: ").append(ObjectUtil.toIndentedString(product)).append("\n");
		sb.append("    cashAccountType: ").append(ObjectUtil.toIndentedString(cashAccountType)).append("\n");
		sb.append("    status: ").append(ObjectUtil.toIndentedString(status)).append("\n");
		sb.append("    bic: ").append(ObjectUtil.toIndentedString(bic)).append("\n");
		sb.append("    linkedAccounts: ").append(ObjectUtil.toIndentedString(linkedAccounts)).append("\n");
		sb.append("    usage: ").append(ObjectUtil.toIndentedString(usage)).append("\n");
		sb.append("    details: ").append(ObjectUtil.toIndentedString(details)).append("\n");
		sb.append("    balances: ").append(ObjectUtil.toIndentedString(balances)).append("\n");
		sb.append("    _links: ").append(ObjectUtil.toIndentedString(_links)).append("\n");
		sb.append("    ownerName: ").append(ObjectUtil.toIndentedString(ownerName)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
