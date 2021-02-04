package io.swagger.model;

import io.swagger.model.AccountStatus;
import io.swagger.model.BalanceList;
import io.swagger.model.LinksAccountDetails;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The ASPSP shall give at least one of the account reference identifiers:   - iban   - bban   - pan   - maskedPan   - msisdn If the account is a multicurrency account currency code in \&quot;currency\&quot; is set to \&quot;XXX\&quot;. 
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "The ASPSP shall give at least one of the account reference identifiers:   - iban   - bban   - pan   - maskedPan   - msisdn If the account is a multicurrency account currency code in \"currency\" is set to \"XXX\". ")

public class AccountDetails   {
  private @Valid String resourceId = null;
  private @Valid String iban = null;
  private @Valid String bban = null;
  private @Valid String msisdn = null;
  private @Valid String currency = null;
  private @Valid String name = null;
  private @Valid String displayName = null;
  private @Valid String product = null;
  private @Valid String cashAccountType = null;
  private @Valid AccountStatus status = null;
  private @Valid String bic = null;
  private @Valid String linkedAccounts = null;
public enum UsageEnum {

    PRIV(String.valueOf("PRIV")), ORGA(String.valueOf("ORGA"));


    private String value;

    UsageEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static UsageEnum fromValue(String v) {
        for (UsageEnum b : UsageEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}
  private @Valid UsageEnum usage = null;
  private @Valid String details = null;
  private @Valid BalanceList balances = null;
  private @Valid LinksAccountDetails _links = null;
  private @Valid String ownerName = null;

  /**
   * This shall be filled, if addressable resource are created by the ASPSP on the /accounts or /card-accounts endpoint.
   **/
  public AccountDetails resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  
  @ApiModelProperty(value = "This shall be filled, if addressable resource are created by the ASPSP on the /accounts or /card-accounts endpoint.")
  @JsonProperty("resourceId")

  public String getResourceId() {
    return resourceId;
  }
  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  /**
   **/
  public AccountDetails iban(String iban) {
    this.iban = iban;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("iban")
 @Pattern(regexp="[A-Z]{2,2}[0-9]{2,2}[a-zA-Z0-9]{1,30}")
  public String getIban() {
    return iban;
  }
  public void setIban(String iban) {
    this.iban = iban;
  }

  /**
   **/
  public AccountDetails bban(String bban) {
    this.bban = bban;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("bban")
 @Pattern(regexp="[a-zA-Z0-9]{1,30}")
  public String getBban() {
    return bban;
  }
  public void setBban(String bban) {
    this.bban = bban;
  }

  /**
   **/
  public AccountDetails msisdn(String msisdn) {
    this.msisdn = msisdn;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("msisdn")
 @Size(max=35)
  public String getMsisdn() {
    return msisdn;
  }
  public void setMsisdn(String msisdn) {
    this.msisdn = msisdn;
  }

  /**
   **/
  public AccountDetails currency(String currency) {
    this.currency = currency;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("currency")
  @NotNull
 @Pattern(regexp="[A-Z]{3}")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   * Name of the account, as assigned by the ASPSP, in agreement with the account owner in order to provide an additional means of identification of the account.
   **/
  public AccountDetails name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Name of the account, as assigned by the ASPSP, in agreement with the account owner in order to provide an additional means of identification of the account.")
  @JsonProperty("name")
 @Size(max=70)
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public AccountDetails displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("displayName")
 @Size(max=70)
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * Product name of the bank for this account, proprietary definition.
   **/
  public AccountDetails product(String product) {
    this.product = product;
    return this;
  }

  
  @ApiModelProperty(value = "Product name of the bank for this account, proprietary definition.")
  @JsonProperty("product")
 @Size(max=35)
  public String getProduct() {
    return product;
  }
  public void setProduct(String product) {
    this.product = product;
  }

  /**
   **/
  public AccountDetails cashAccountType(String cashAccountType) {
    this.cashAccountType = cashAccountType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cashAccountType")

  public String getCashAccountType() {
    return cashAccountType;
  }
  public void setCashAccountType(String cashAccountType) {
    this.cashAccountType = cashAccountType;
  }

  /**
   **/
  public AccountDetails status(AccountStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")

  public AccountStatus getStatus() {
    return status;
  }
  public void setStatus(AccountStatus status) {
    this.status = status;
  }

  /**
   **/
  public AccountDetails bic(String bic) {
    this.bic = bic;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("bic")
 @Pattern(regexp="[A-Z]{6,6}[A-Z2-9][A-NP-Z0-9]([A-Z0-9]{3,3}){0,1}")
  public String getBic() {
    return bic;
  }
  public void setBic(String bic) {
    this.bic = bic;
  }

  /**
   * Case of a set of pending card transactions, the APSP will provide the relevant cash account the card is set up on.
   **/
  public AccountDetails linkedAccounts(String linkedAccounts) {
    this.linkedAccounts = linkedAccounts;
    return this;
  }

  
  @ApiModelProperty(value = "Case of a set of pending card transactions, the APSP will provide the relevant cash account the card is set up on.")
  @JsonProperty("linkedAccounts")
 @Size(max=70)
  public String getLinkedAccounts() {
    return linkedAccounts;
  }
  public void setLinkedAccounts(String linkedAccounts) {
    this.linkedAccounts = linkedAccounts;
  }

  /**
   * Specifies the usage of the account:   * PRIV: private personal account   * ORGA: professional account 
   **/
  public AccountDetails usage(UsageEnum usage) {
    this.usage = usage;
    return this;
  }

  
  @ApiModelProperty(value = "Specifies the usage of the account:   * PRIV: private personal account   * ORGA: professional account ")
  @JsonProperty("usage")
 @Size(max=4)
  public UsageEnum getUsage() {
    return usage;
  }
  public void setUsage(UsageEnum usage) {
    this.usage = usage;
  }

  /**
   * Specifications that might be provided by the ASPSP:   - characteristics of the account   - characteristics of the relevant card 
   **/
  public AccountDetails details(String details) {
    this.details = details;
    return this;
  }

  
  @ApiModelProperty(value = "Specifications that might be provided by the ASPSP:   - characteristics of the account   - characteristics of the relevant card ")
  @JsonProperty("details")
 @Size(max=500)
  public String getDetails() {
    return details;
  }
  public void setDetails(String details) {
    this.details = details;
  }

  /**
   **/
  public AccountDetails balances(BalanceList balances) {
    this.balances = balances;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("balances")

  public BalanceList getBalances() {
    return balances;
  }
  public void setBalances(BalanceList balances) {
    this.balances = balances;
  }

  /**
   **/
  public AccountDetails _links(LinksAccountDetails _links) {
    this._links = _links;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("_links")

  public LinksAccountDetails getLinks() {
    return _links;
  }
  public void setLinks(LinksAccountDetails _links) {
    this._links = _links;
  }

  /**
   **/
  public AccountDetails ownerName(String ownerName) {
    this.ownerName = ownerName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ownerName")
 @Size(max=140)
  public String getOwnerName() {
    return ownerName;
  }
  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountDetails accountDetails = (AccountDetails) o;
    return Objects.equals(resourceId, accountDetails.resourceId) &&
        Objects.equals(iban, accountDetails.iban) &&
        Objects.equals(bban, accountDetails.bban) &&
        Objects.equals(msisdn, accountDetails.msisdn) &&
        Objects.equals(currency, accountDetails.currency) &&
        Objects.equals(name, accountDetails.name) &&
        Objects.equals(displayName, accountDetails.displayName) &&
        Objects.equals(product, accountDetails.product) &&
        Objects.equals(cashAccountType, accountDetails.cashAccountType) &&
        Objects.equals(status, accountDetails.status) &&
        Objects.equals(bic, accountDetails.bic) &&
        Objects.equals(linkedAccounts, accountDetails.linkedAccounts) &&
        Objects.equals(usage, accountDetails.usage) &&
        Objects.equals(details, accountDetails.details) &&
        Objects.equals(balances, accountDetails.balances) &&
        Objects.equals(_links, accountDetails._links) &&
        Objects.equals(ownerName, accountDetails.ownerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId, iban, bban, msisdn, currency, name, displayName, product, cashAccountType, status, bic, linkedAccounts, usage, details, balances, _links, ownerName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountDetails {\n");
    
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    bban: ").append(toIndentedString(bban)).append("\n");
    sb.append("    msisdn: ").append(toIndentedString(msisdn)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    cashAccountType: ").append(toIndentedString(cashAccountType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    linkedAccounts: ").append(toIndentedString(linkedAccounts)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
    sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
