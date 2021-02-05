package io.swagger.model;

import java.time.LocalDate;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.util.ObjectUtil;

/**
  * Card transaction information.
 **/
@Schema(description = "Card transaction information.")
public class CardTransaction {

	@Schema(description = "")
	private String cardTransactionId = null;

	@Schema(description = "")
	private String terminalId = null;

	@Schema(description = "")
	private LocalDate transactionDate = null;

	@Schema(description = "Timestamp of the actual card transaction within the acceptance system")
	/**
	  * Timestamp of the actual card transaction within the acceptance system  
	 **/
	private Date acceptorTransactionDateTime = null;

	@Schema(description = "")
	private LocalDate bookingDate = null;

	@Schema(required = true, description = "")
	private Amount transactionAmount = null;

	@Schema(description = "")
	private ReportExchangeRateList currencyExchange = null;

	@Schema(description = "")
	private Amount originalAmount = null;

	@Schema(description = "")
	private Amount markupFee = null;

	@Schema(example = "0.3", description = "")
	private String markupFeePercentage = null;

	@Schema(description = "")
	private String cardAcceptorId = null;

	@Schema(description = "")
	private Address cardAcceptorAddress = null;

	@Schema(description = "")
	private String cardAcceptorPhone = null;

	@Schema(description = "")
	private String merchantCategoryCode = null;

	@Schema(description = "")
	private String maskedPAN = null;

	@Schema(description = "")
	private String transactionDetails = null;

	@Schema(description = "")
	private Boolean invoiced = null;

	@Schema(description = "")
	private String proprietaryBankTransactionCode = null;

	/**
	  * Get cardTransactionId
	  * @return cardTransactionId
	 **/
	@JsonProperty("cardTransactionId")
	@Size(max = 35)
	public String getCardTransactionId() {
		return cardTransactionId;
	}

	public void setCardTransactionId(String cardTransactionId) {
		this.cardTransactionId = cardTransactionId;
	}

	public CardTransaction cardTransactionId(String cardTransactionId) {
		this.cardTransactionId = cardTransactionId;
		return this;
	}

	/**
	  * Get terminalId
	  * @return terminalId
	 **/
	@JsonProperty("terminalId")
	@Size(max = 35)
	public String getTerminalId() {
		return terminalId;
	}

	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

	public CardTransaction terminalId(String terminalId) {
		this.terminalId = terminalId;
		return this;
	}

	/**
	  * Get transactionDate
	  * @return transactionDate
	 **/
	@JsonProperty("transactionDate")
	public LocalDate getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}

	public CardTransaction transactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
		return this;
	}

	/**
	  * Timestamp of the actual card transaction within the acceptance system
	  * @return acceptorTransactionDateTime
	 **/
	@JsonProperty("acceptorTransactionDateTime")
	public Date getAcceptorTransactionDateTime() {
		return acceptorTransactionDateTime;
	}

	public void setAcceptorTransactionDateTime(Date acceptorTransactionDateTime) {
		this.acceptorTransactionDateTime = acceptorTransactionDateTime;
	}

	public CardTransaction acceptorTransactionDateTime(Date acceptorTransactionDateTime) {
		this.acceptorTransactionDateTime = acceptorTransactionDateTime;
		return this;
	}

	/**
	  * Get bookingDate
	  * @return bookingDate
	 **/
	@JsonProperty("bookingDate")
	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public CardTransaction bookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
		return this;
	}

	/**
	  * Get transactionAmount
	  * @return transactionAmount
	 **/
	@JsonProperty("transactionAmount")
	@NotNull
	public Amount getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(Amount transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public CardTransaction transactionAmount(Amount transactionAmount) {
		this.transactionAmount = transactionAmount;
		return this;
	}

	/**
	  * Get currencyExchange
	  * @return currencyExchange
	 **/
	@JsonProperty("currencyExchange")
	public ReportExchangeRateList getCurrencyExchange() {
		return currencyExchange;
	}

	public void setCurrencyExchange(ReportExchangeRateList currencyExchange) {
		this.currencyExchange = currencyExchange;
	}

	public CardTransaction currencyExchange(ReportExchangeRateList currencyExchange) {
		this.currencyExchange = currencyExchange;
		return this;
	}

	/**
	  * Get originalAmount
	  * @return originalAmount
	 **/
	@JsonProperty("originalAmount")
	public Amount getOriginalAmount() {
		return originalAmount;
	}

	public void setOriginalAmount(Amount originalAmount) {
		this.originalAmount = originalAmount;
	}

	public CardTransaction originalAmount(Amount originalAmount) {
		this.originalAmount = originalAmount;
		return this;
	}

	/**
	  * Get markupFee
	  * @return markupFee
	 **/
	@JsonProperty("markupFee")
	public Amount getMarkupFee() {
		return markupFee;
	}

	public void setMarkupFee(Amount markupFee) {
		this.markupFee = markupFee;
	}

	public CardTransaction markupFee(Amount markupFee) {
		this.markupFee = markupFee;
		return this;
	}

	/**
	  * Get markupFeePercentage
	  * @return markupFeePercentage
	 **/
	@JsonProperty("markupFeePercentage")
	public String getMarkupFeePercentage() {
		return markupFeePercentage;
	}

	public void setMarkupFeePercentage(String markupFeePercentage) {
		this.markupFeePercentage = markupFeePercentage;
	}

	public CardTransaction markupFeePercentage(String markupFeePercentage) {
		this.markupFeePercentage = markupFeePercentage;
		return this;
	}

	/**
	  * Get cardAcceptorId
	  * @return cardAcceptorId
	 **/
	@JsonProperty("cardAcceptorId")
	@Size(max = 35)
	public String getCardAcceptorId() {
		return cardAcceptorId;
	}

	public void setCardAcceptorId(String cardAcceptorId) {
		this.cardAcceptorId = cardAcceptorId;
	}

	public CardTransaction cardAcceptorId(String cardAcceptorId) {
		this.cardAcceptorId = cardAcceptorId;
		return this;
	}

	/**
	  * Get cardAcceptorAddress
	  * @return cardAcceptorAddress
	 **/
	@JsonProperty("cardAcceptorAddress")
	public Address getCardAcceptorAddress() {
		return cardAcceptorAddress;
	}

	public void setCardAcceptorAddress(Address cardAcceptorAddress) {
		this.cardAcceptorAddress = cardAcceptorAddress;
	}

	public CardTransaction cardAcceptorAddress(Address cardAcceptorAddress) {
		this.cardAcceptorAddress = cardAcceptorAddress;
		return this;
	}

	/**
	  * Get cardAcceptorPhone
	  * @return cardAcceptorPhone
	 **/
	@JsonProperty("cardAcceptorPhone")
	// @Pattern(regexp="\+[0-9]{1,3}\-[0-9()+\-]{1,30}")  
	public String getCardAcceptorPhone() {
		return cardAcceptorPhone;
	}

	public void setCardAcceptorPhone(String cardAcceptorPhone) {
		this.cardAcceptorPhone = cardAcceptorPhone;
	}

	public CardTransaction cardAcceptorPhone(String cardAcceptorPhone) {
		this.cardAcceptorPhone = cardAcceptorPhone;
		return this;
	}

	/**
	  * Get merchantCategoryCode
	  * @return merchantCategoryCode
	 **/
	@JsonProperty("merchantCategoryCode")
	@Size(min = 4, max = 4)
	public String getMerchantCategoryCode() {
		return merchantCategoryCode;
	}

	public void setMerchantCategoryCode(String merchantCategoryCode) {
		this.merchantCategoryCode = merchantCategoryCode;
	}

	public CardTransaction merchantCategoryCode(String merchantCategoryCode) {
		this.merchantCategoryCode = merchantCategoryCode;
		return this;
	}

	/**
	  * Get maskedPAN
	  * @return maskedPAN
	 **/
	@JsonProperty("maskedPAN")
	@Size(max = 35)
	public String getMaskedPAN() {
		return maskedPAN;
	}

	public void setMaskedPAN(String maskedPAN) {
		this.maskedPAN = maskedPAN;
	}

	public CardTransaction maskedPAN(String maskedPAN) {
		this.maskedPAN = maskedPAN;
		return this;
	}

	/**
	  * Get transactionDetails
	  * @return transactionDetails
	 **/
	@JsonProperty("transactionDetails")
	@Size(max = 140)
	public String getTransactionDetails() {
		return transactionDetails;
	}

	public void setTransactionDetails(String transactionDetails) {
		this.transactionDetails = transactionDetails;
	}

	public CardTransaction transactionDetails(String transactionDetails) {
		this.transactionDetails = transactionDetails;
		return this;
	}

	/**
	  * Get invoiced
	  * @return invoiced
	 **/
	@JsonProperty("invoiced")
	public Boolean isInvoiced() {
		return invoiced;
	}

	public void setInvoiced(Boolean invoiced) {
		this.invoiced = invoiced;
	}

	public CardTransaction invoiced(Boolean invoiced) {
		this.invoiced = invoiced;
		return this;
	}

	/**
	  * Get proprietaryBankTransactionCode
	  * @return proprietaryBankTransactionCode
	 **/
	@JsonProperty("proprietaryBankTransactionCode")
	@Size(max = 35)
	public String getProprietaryBankTransactionCode() {
		return proprietaryBankTransactionCode;
	}

	public void setProprietaryBankTransactionCode(String proprietaryBankTransactionCode) {
		this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
	}

	public CardTransaction proprietaryBankTransactionCode(String proprietaryBankTransactionCode) {
		this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CardTransaction {\n");

		sb.append("    cardTransactionId: ").append(ObjectUtil.toIndentedString(cardTransactionId)).append("\n");
		sb.append("    terminalId: ").append(ObjectUtil.toIndentedString(terminalId)).append("\n");
		sb.append("    transactionDate: ").append(ObjectUtil.toIndentedString(transactionDate)).append("\n");
		sb.append("    acceptorTransactionDateTime: ").append(ObjectUtil.toIndentedString(acceptorTransactionDateTime)).append("\n");
		sb.append("    bookingDate: ").append(ObjectUtil.toIndentedString(bookingDate)).append("\n");
		sb.append("    transactionAmount: ").append(ObjectUtil.toIndentedString(transactionAmount)).append("\n");
		sb.append("    currencyExchange: ").append(ObjectUtil.toIndentedString(currencyExchange)).append("\n");
		sb.append("    originalAmount: ").append(ObjectUtil.toIndentedString(originalAmount)).append("\n");
		sb.append("    markupFee: ").append(ObjectUtil.toIndentedString(markupFee)).append("\n");
		sb.append("    markupFeePercentage: ").append(ObjectUtil.toIndentedString(markupFeePercentage)).append("\n");
		sb.append("    cardAcceptorId: ").append(ObjectUtil.toIndentedString(cardAcceptorId)).append("\n");
		sb.append("    cardAcceptorAddress: ").append(ObjectUtil.toIndentedString(cardAcceptorAddress)).append("\n");
		sb.append("    cardAcceptorPhone: ").append(ObjectUtil.toIndentedString(cardAcceptorPhone)).append("\n");
		sb.append("    merchantCategoryCode: ").append(ObjectUtil.toIndentedString(merchantCategoryCode)).append("\n");
		sb.append("    maskedPAN: ").append(ObjectUtil.toIndentedString(maskedPAN)).append("\n");
		sb.append("    transactionDetails: ").append(ObjectUtil.toIndentedString(transactionDetails)).append("\n");
		sb.append("    invoiced: ").append(ObjectUtil.toIndentedString(invoiced)).append("\n");
		sb.append("    proprietaryBankTransactionCode: ").append(ObjectUtil.toIndentedString(proprietaryBankTransactionCode)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
