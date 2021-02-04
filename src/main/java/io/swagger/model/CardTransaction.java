package io.swagger.model;

import io.swagger.model.Address;
import io.swagger.model.Amount;
import io.swagger.model.ReportExchangeRateList;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import java.util.Date;
import org.joda.time.LocalDate;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Card transaction information.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "Card transaction information.")

public class CardTransaction   {
  private @Valid String cardTransactionId = null;
  private @Valid String terminalId = null;
  private @Valid LocalDate transactionDate = null;
  private @Valid Date acceptorTransactionDateTime = null;
  private @Valid LocalDate bookingDate = null;
  private @Valid Amount transactionAmount = null;
  private @Valid ReportExchangeRateList currencyExchange = null;
  private @Valid Amount originalAmount = null;
  private @Valid Amount markupFee = null;
  private @Valid String markupFeePercentage = null;
  private @Valid String cardAcceptorId = null;
  private @Valid Address cardAcceptorAddress = null;
  private @Valid String cardAcceptorPhone = null;
  private @Valid String merchantCategoryCode = null;
  private @Valid String maskedPAN = null;
  private @Valid String transactionDetails = null;
  private @Valid Boolean invoiced = null;
  private @Valid String proprietaryBankTransactionCode = null;

  /**
   **/
  public CardTransaction cardTransactionId(String cardTransactionId) {
    this.cardTransactionId = cardTransactionId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cardTransactionId")
 @Size(max=35)
  public String getCardTransactionId() {
    return cardTransactionId;
  }
  public void setCardTransactionId(String cardTransactionId) {
    this.cardTransactionId = cardTransactionId;
  }

  /**
   **/
  public CardTransaction terminalId(String terminalId) {
    this.terminalId = terminalId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("terminalId")
 @Size(max=35)
  public String getTerminalId() {
    return terminalId;
  }
  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
  }

  /**
   **/
  public CardTransaction transactionDate(LocalDate transactionDate) {
    this.transactionDate = transactionDate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("transactionDate")

  public LocalDate getTransactionDate() {
    return transactionDate;
  }
  public void setTransactionDate(LocalDate transactionDate) {
    this.transactionDate = transactionDate;
  }

  /**
   * Timestamp of the actual card transaction within the acceptance system
   **/
  public CardTransaction acceptorTransactionDateTime(Date acceptorTransactionDateTime) {
    this.acceptorTransactionDateTime = acceptorTransactionDateTime;
    return this;
  }

  
  @ApiModelProperty(value = "Timestamp of the actual card transaction within the acceptance system")
  @JsonProperty("acceptorTransactionDateTime")

  public Date getAcceptorTransactionDateTime() {
    return acceptorTransactionDateTime;
  }
  public void setAcceptorTransactionDateTime(Date acceptorTransactionDateTime) {
    this.acceptorTransactionDateTime = acceptorTransactionDateTime;
  }

  /**
   **/
  public CardTransaction bookingDate(LocalDate bookingDate) {
    this.bookingDate = bookingDate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("bookingDate")

  public LocalDate getBookingDate() {
    return bookingDate;
  }
  public void setBookingDate(LocalDate bookingDate) {
    this.bookingDate = bookingDate;
  }

  /**
   **/
  public CardTransaction transactionAmount(Amount transactionAmount) {
    this.transactionAmount = transactionAmount;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("transactionAmount")
  @NotNull

  public Amount getTransactionAmount() {
    return transactionAmount;
  }
  public void setTransactionAmount(Amount transactionAmount) {
    this.transactionAmount = transactionAmount;
  }

  /**
   **/
  public CardTransaction currencyExchange(ReportExchangeRateList currencyExchange) {
    this.currencyExchange = currencyExchange;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("currencyExchange")

  public ReportExchangeRateList getCurrencyExchange() {
    return currencyExchange;
  }
  public void setCurrencyExchange(ReportExchangeRateList currencyExchange) {
    this.currencyExchange = currencyExchange;
  }

  /**
   **/
  public CardTransaction originalAmount(Amount originalAmount) {
    this.originalAmount = originalAmount;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("originalAmount")

  public Amount getOriginalAmount() {
    return originalAmount;
  }
  public void setOriginalAmount(Amount originalAmount) {
    this.originalAmount = originalAmount;
  }

  /**
   **/
  public CardTransaction markupFee(Amount markupFee) {
    this.markupFee = markupFee;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("markupFee")

  public Amount getMarkupFee() {
    return markupFee;
  }
  public void setMarkupFee(Amount markupFee) {
    this.markupFee = markupFee;
  }

  /**
   **/
  public CardTransaction markupFeePercentage(String markupFeePercentage) {
    this.markupFeePercentage = markupFeePercentage;
    return this;
  }

  
  @ApiModelProperty(example = "0.3", value = "")
  @JsonProperty("markupFeePercentage")

  public String getMarkupFeePercentage() {
    return markupFeePercentage;
  }
  public void setMarkupFeePercentage(String markupFeePercentage) {
    this.markupFeePercentage = markupFeePercentage;
  }

  /**
   **/
  public CardTransaction cardAcceptorId(String cardAcceptorId) {
    this.cardAcceptorId = cardAcceptorId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cardAcceptorId")
 @Size(max=35)
  public String getCardAcceptorId() {
    return cardAcceptorId;
  }
  public void setCardAcceptorId(String cardAcceptorId) {
    this.cardAcceptorId = cardAcceptorId;
  }

  /**
   **/
  public CardTransaction cardAcceptorAddress(Address cardAcceptorAddress) {
    this.cardAcceptorAddress = cardAcceptorAddress;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cardAcceptorAddress")

  public Address getCardAcceptorAddress() {
    return cardAcceptorAddress;
  }
  public void setCardAcceptorAddress(Address cardAcceptorAddress) {
    this.cardAcceptorAddress = cardAcceptorAddress;
  }

  /**
   **/
  public CardTransaction cardAcceptorPhone(String cardAcceptorPhone) {
    this.cardAcceptorPhone = cardAcceptorPhone;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cardAcceptorPhone")
 @Pattern(regexp="\+[0-9]{1,3}\-[0-9()+\-]{1,30}")
  public String getCardAcceptorPhone() {
    return cardAcceptorPhone;
  }
  public void setCardAcceptorPhone(String cardAcceptorPhone) {
    this.cardAcceptorPhone = cardAcceptorPhone;
  }

  /**
   **/
  public CardTransaction merchantCategoryCode(String merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("merchantCategoryCode")
 @Size(min=4,max=4)
  public String getMerchantCategoryCode() {
    return merchantCategoryCode;
  }
  public void setMerchantCategoryCode(String merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
  }

  /**
   **/
  public CardTransaction maskedPAN(String maskedPAN) {
    this.maskedPAN = maskedPAN;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("maskedPAN")
 @Size(max=35)
  public String getMaskedPAN() {
    return maskedPAN;
  }
  public void setMaskedPAN(String maskedPAN) {
    this.maskedPAN = maskedPAN;
  }

  /**
   **/
  public CardTransaction transactionDetails(String transactionDetails) {
    this.transactionDetails = transactionDetails;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("transactionDetails")
 @Size(max=140)
  public String getTransactionDetails() {
    return transactionDetails;
  }
  public void setTransactionDetails(String transactionDetails) {
    this.transactionDetails = transactionDetails;
  }

  /**
   **/
  public CardTransaction invoiced(Boolean invoiced) {
    this.invoiced = invoiced;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("invoiced")

  public Boolean isInvoiced() {
    return invoiced;
  }
  public void setInvoiced(Boolean invoiced) {
    this.invoiced = invoiced;
  }

  /**
   **/
  public CardTransaction proprietaryBankTransactionCode(String proprietaryBankTransactionCode) {
    this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("proprietaryBankTransactionCode")
 @Size(max=35)
  public String getProprietaryBankTransactionCode() {
    return proprietaryBankTransactionCode;
  }
  public void setProprietaryBankTransactionCode(String proprietaryBankTransactionCode) {
    this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardTransaction cardTransaction = (CardTransaction) o;
    return Objects.equals(cardTransactionId, cardTransaction.cardTransactionId) &&
        Objects.equals(terminalId, cardTransaction.terminalId) &&
        Objects.equals(transactionDate, cardTransaction.transactionDate) &&
        Objects.equals(acceptorTransactionDateTime, cardTransaction.acceptorTransactionDateTime) &&
        Objects.equals(bookingDate, cardTransaction.bookingDate) &&
        Objects.equals(transactionAmount, cardTransaction.transactionAmount) &&
        Objects.equals(currencyExchange, cardTransaction.currencyExchange) &&
        Objects.equals(originalAmount, cardTransaction.originalAmount) &&
        Objects.equals(markupFee, cardTransaction.markupFee) &&
        Objects.equals(markupFeePercentage, cardTransaction.markupFeePercentage) &&
        Objects.equals(cardAcceptorId, cardTransaction.cardAcceptorId) &&
        Objects.equals(cardAcceptorAddress, cardTransaction.cardAcceptorAddress) &&
        Objects.equals(cardAcceptorPhone, cardTransaction.cardAcceptorPhone) &&
        Objects.equals(merchantCategoryCode, cardTransaction.merchantCategoryCode) &&
        Objects.equals(maskedPAN, cardTransaction.maskedPAN) &&
        Objects.equals(transactionDetails, cardTransaction.transactionDetails) &&
        Objects.equals(invoiced, cardTransaction.invoiced) &&
        Objects.equals(proprietaryBankTransactionCode, cardTransaction.proprietaryBankTransactionCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardTransactionId, terminalId, transactionDate, acceptorTransactionDateTime, bookingDate, transactionAmount, currencyExchange, originalAmount, markupFee, markupFeePercentage, cardAcceptorId, cardAcceptorAddress, cardAcceptorPhone, merchantCategoryCode, maskedPAN, transactionDetails, invoiced, proprietaryBankTransactionCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardTransaction {\n");
    
    sb.append("    cardTransactionId: ").append(toIndentedString(cardTransactionId)).append("\n");
    sb.append("    terminalId: ").append(toIndentedString(terminalId)).append("\n");
    sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
    sb.append("    acceptorTransactionDateTime: ").append(toIndentedString(acceptorTransactionDateTime)).append("\n");
    sb.append("    bookingDate: ").append(toIndentedString(bookingDate)).append("\n");
    sb.append("    transactionAmount: ").append(toIndentedString(transactionAmount)).append("\n");
    sb.append("    currencyExchange: ").append(toIndentedString(currencyExchange)).append("\n");
    sb.append("    originalAmount: ").append(toIndentedString(originalAmount)).append("\n");
    sb.append("    markupFee: ").append(toIndentedString(markupFee)).append("\n");
    sb.append("    markupFeePercentage: ").append(toIndentedString(markupFeePercentage)).append("\n");
    sb.append("    cardAcceptorId: ").append(toIndentedString(cardAcceptorId)).append("\n");
    sb.append("    cardAcceptorAddress: ").append(toIndentedString(cardAcceptorAddress)).append("\n");
    sb.append("    cardAcceptorPhone: ").append(toIndentedString(cardAcceptorPhone)).append("\n");
    sb.append("    merchantCategoryCode: ").append(toIndentedString(merchantCategoryCode)).append("\n");
    sb.append("    maskedPAN: ").append(toIndentedString(maskedPAN)).append("\n");
    sb.append("    transactionDetails: ").append(toIndentedString(transactionDetails)).append("\n");
    sb.append("    invoiced: ").append(toIndentedString(invoiced)).append("\n");
    sb.append("    proprietaryBankTransactionCode: ").append(toIndentedString(proprietaryBankTransactionCode)).append("\n");
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
