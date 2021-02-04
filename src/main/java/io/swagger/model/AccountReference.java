package io.swagger.model;

import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Reference to an account by either   * IBAN, of a payment accounts, or   * BBAN, for payment accounts if there is no IBAN, or    * the Primary Account Number (PAN) of a card, can be tokenised by the ASPSP due to PCI DSS requirements, or   * the Primary Account Number (PAN) of a card in a masked form, or   * an alias to access a payment account via a registered mobile phone number (MSISDN). 
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "Reference to an account by either   * IBAN, of a payment accounts, or   * BBAN, for payment accounts if there is no IBAN, or    * the Primary Account Number (PAN) of a card, can be tokenised by the ASPSP due to PCI DSS requirements, or   * the Primary Account Number (PAN) of a card in a masked form, or   * an alias to access a payment account via a registered mobile phone number (MSISDN). ")

public class AccountReference   {
  private @Valid String iban = null;
  private @Valid String bban = null;
  private @Valid String pan = null;
  private @Valid String maskedPan = null;
  private @Valid String msisdn = null;
  private @Valid String currency = null;
  private @Valid String cashAccountType = null;

  /**
   **/
  public AccountReference iban(String iban) {
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
  public AccountReference bban(String bban) {
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
  public AccountReference pan(String pan) {
    this.pan = pan;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pan")
 @Size(max=35)
  public String getPan() {
    return pan;
  }
  public void setPan(String pan) {
    this.pan = pan;
  }

  /**
   **/
  public AccountReference maskedPan(String maskedPan) {
    this.maskedPan = maskedPan;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("maskedPan")
 @Size(max=35)
  public String getMaskedPan() {
    return maskedPan;
  }
  public void setMaskedPan(String maskedPan) {
    this.maskedPan = maskedPan;
  }

  /**
   **/
  public AccountReference msisdn(String msisdn) {
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
  public AccountReference currency(String currency) {
    this.currency = currency;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("currency")
 @Pattern(regexp="[A-Z]{3}")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   **/
  public AccountReference cashAccountType(String cashAccountType) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountReference accountReference = (AccountReference) o;
    return Objects.equals(iban, accountReference.iban) &&
        Objects.equals(bban, accountReference.bban) &&
        Objects.equals(pan, accountReference.pan) &&
        Objects.equals(maskedPan, accountReference.maskedPan) &&
        Objects.equals(msisdn, accountReference.msisdn) &&
        Objects.equals(currency, accountReference.currency) &&
        Objects.equals(cashAccountType, accountReference.cashAccountType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iban, bban, pan, maskedPan, msisdn, currency, cashAccountType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountReference {\n");
    
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    bban: ").append(toIndentedString(bban)).append("\n");
    sb.append("    pan: ").append(toIndentedString(pan)).append("\n");
    sb.append("    maskedPan: ").append(toIndentedString(maskedPan)).append("\n");
    sb.append("    msisdn: ").append(toIndentedString(msisdn)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    cashAccountType: ").append(toIndentedString(cashAccountType)).append("\n");
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
