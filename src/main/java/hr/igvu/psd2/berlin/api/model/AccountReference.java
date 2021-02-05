package hr.igvu.psd2.berlin.api.model;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import hr.igvu.psd2.util.ObjectUtil;

/**
  * Reference to an account by either   * IBAN, of a payment accounts, or   * BBAN, for payment accounts if there is no IBAN, or    * the Primary Account Number (PAN) of a card, can be tokenised by the ASPSP due to PCI DSS requirements, or   * the Primary Account Number (PAN) of a card in a masked form, or   * an alias to access a payment account via a registered mobile phone number (MSISDN). 
 **/
@Schema(description = "Reference to an account by either   * IBAN, of a payment accounts, or   * BBAN, for payment accounts if there is no IBAN, or    * the Primary Account Number (PAN) of a card, can be tokenised by the ASPSP due to PCI DSS requirements, or   * the Primary Account Number (PAN) of a card in a masked form, or   * an alias to access a payment account via a registered mobile phone number (MSISDN). ")
public class AccountReference {

	@Schema(description = "")
	private String iban = null;

	@Schema(description = "")
	private String bban = null;

	@Schema(description = "")
	private String pan = null;

	@Schema(description = "")
	private String maskedPan = null;

	@Schema(description = "")
	private String msisdn = null;

	@Schema(description = "")
	private String currency = null;

	@Schema(description = "")
	private String cashAccountType = null;

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

	public AccountReference iban(String iban) {
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

	public AccountReference bban(String bban) {
		this.bban = bban;
		return this;
	}

	/**
	  * Get pan
	  * @return pan
	 **/
	@JsonProperty("pan")
	@Size(max = 35)
	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public AccountReference pan(String pan) {
		this.pan = pan;
		return this;
	}

	/**
	  * Get maskedPan
	  * @return maskedPan
	 **/
	@JsonProperty("maskedPan")
	@Size(max = 35)
	public String getMaskedPan() {
		return maskedPan;
	}

	public void setMaskedPan(String maskedPan) {
		this.maskedPan = maskedPan;
	}

	public AccountReference maskedPan(String maskedPan) {
		this.maskedPan = maskedPan;
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

	public AccountReference msisdn(String msisdn) {
		this.msisdn = msisdn;
		return this;
	}

	/**
	  * Get currency
	  * @return currency
	 **/
	@JsonProperty("currency")
	@Pattern(regexp = "[A-Z]{3}")
	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public AccountReference currency(String currency) {
		this.currency = currency;
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

	public AccountReference cashAccountType(String cashAccountType) {
		this.cashAccountType = cashAccountType;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AccountReference {\n");

		sb.append("    iban: ").append(ObjectUtil.toIndentedString(iban)).append("\n");
		sb.append("    bban: ").append(ObjectUtil.toIndentedString(bban)).append("\n");
		sb.append("    pan: ").append(ObjectUtil.toIndentedString(pan)).append("\n");
		sb.append("    maskedPan: ").append(ObjectUtil.toIndentedString(maskedPan)).append("\n");
		sb.append("    msisdn: ").append(ObjectUtil.toIndentedString(msisdn)).append("\n");
		sb.append("    currency: ").append(ObjectUtil.toIndentedString(currency)).append("\n");
		sb.append("    cashAccountType: ").append(ObjectUtil.toIndentedString(cashAccountType)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
