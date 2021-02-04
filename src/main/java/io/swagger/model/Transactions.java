package io.swagger.model;

import io.swagger.model.AccountReference;
import io.swagger.model.AdditionalInformationStructured;
import io.swagger.model.Amount;
import io.swagger.model.Balance;
import io.swagger.model.EntryDetails;
import io.swagger.model.LinksTransactionDetails;
import io.swagger.model.PurposeCode;
import io.swagger.model.RemittanceInformationStructuredArray;
import io.swagger.model.RemittanceInformationUnstructuredArray;
import io.swagger.model.ReportExchangeRateList;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.joda.time.LocalDate;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Transaction details.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "Transaction details.")

public class Transactions   {
  private @Valid String transactionId = null;
  private @Valid String entryReference = null;
  private @Valid String endToEndId = null;
  private @Valid Boolean batchIndicator = null;
  private @Valid Integer batchNumberOfTransactions = null;
  private @Valid String mandateId = null;
  private @Valid String checkId = null;
  private @Valid String creditorId = null;
  private @Valid LocalDate bookingDate = null;
  private @Valid LocalDate valueDate = null;
  private @Valid Amount transactionAmount = null;
  private @Valid ReportExchangeRateList currencyExchange = null;
  private @Valid String creditorName = null;
  private @Valid AccountReference creditorAccount = null;
  private @Valid String creditorAgent = null;
  private @Valid String ultimateCreditor = null;
  private @Valid String debtorName = null;
  private @Valid AccountReference debtorAccount = null;
  private @Valid String debtorAgent = null;
  private @Valid String ultimateDebtor = null;
  private @Valid String remittanceInformationUnstructured = null;
  private @Valid RemittanceInformationUnstructuredArray remittanceInformationUnstructuredArray = null;
  private @Valid String remittanceInformationStructured = null;
  private @Valid RemittanceInformationStructuredArray remittanceInformationStructuredArray = null;
  private @Valid EntryDetails entryDetails = null;
  private @Valid String additionalInformation = null;
  private @Valid AdditionalInformationStructured additionalInformationStructured = null;
  private @Valid PurposeCode purposeCode = null;
  private @Valid String bankTransactionCode = null;
  private @Valid String proprietaryBankTransactionCode = null;
  private @Valid Balance balanceAfterTransaction = null;
  private @Valid LinksTransactionDetails _links = null;

  /**
   **/
  public Transactions transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("transactionId")

  public String getTransactionId() {
    return transactionId;
  }
  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  /**
   **/
  public Transactions entryReference(String entryReference) {
    this.entryReference = entryReference;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("entryReference")
 @Size(max=35)
  public String getEntryReference() {
    return entryReference;
  }
  public void setEntryReference(String entryReference) {
    this.entryReference = entryReference;
  }

  /**
   * Unique end to end identity.
   **/
  public Transactions endToEndId(String endToEndId) {
    this.endToEndId = endToEndId;
    return this;
  }

  
  @ApiModelProperty(value = "Unique end to end identity.")
  @JsonProperty("endToEndId")
 @Size(max=35)
  public String getEndToEndId() {
    return endToEndId;
  }
  public void setEndToEndId(String endToEndId) {
    this.endToEndId = endToEndId;
  }

  /**
   * If this indicator equals true, then the related entry is a batch entry. 
   **/
  public Transactions batchIndicator(Boolean batchIndicator) {
    this.batchIndicator = batchIndicator;
    return this;
  }

  
  @ApiModelProperty(value = "If this indicator equals true, then the related entry is a batch entry. ")
  @JsonProperty("batchIndicator")

  public Boolean isBatchIndicator() {
    return batchIndicator;
  }
  public void setBatchIndicator(Boolean batchIndicator) {
    this.batchIndicator = batchIndicator;
  }

  /**
   * Shall be used if and only if the batchIndicator is contained and equals true. 
   **/
  public Transactions batchNumberOfTransactions(Integer batchNumberOfTransactions) {
    this.batchNumberOfTransactions = batchNumberOfTransactions;
    return this;
  }

  
  @ApiModelProperty(value = "Shall be used if and only if the batchIndicator is contained and equals true. ")
  @JsonProperty("batchNumberOfTransactions")

  public Integer getBatchNumberOfTransactions() {
    return batchNumberOfTransactions;
  }
  public void setBatchNumberOfTransactions(Integer batchNumberOfTransactions) {
    this.batchNumberOfTransactions = batchNumberOfTransactions;
  }

  /**
   * Identification of Mandates, e.g. a SEPA Mandate ID.
   **/
  public Transactions mandateId(String mandateId) {
    this.mandateId = mandateId;
    return this;
  }

  
  @ApiModelProperty(value = "Identification of Mandates, e.g. a SEPA Mandate ID.")
  @JsonProperty("mandateId")
 @Size(max=35)
  public String getMandateId() {
    return mandateId;
  }
  public void setMandateId(String mandateId) {
    this.mandateId = mandateId;
  }

  /**
   * Identification of a Cheque.
   **/
  public Transactions checkId(String checkId) {
    this.checkId = checkId;
    return this;
  }

  
  @ApiModelProperty(value = "Identification of a Cheque.")
  @JsonProperty("checkId")
 @Size(max=35)
  public String getCheckId() {
    return checkId;
  }
  public void setCheckId(String checkId) {
    this.checkId = checkId;
  }

  /**
   **/
  public Transactions creditorId(String creditorId) {
    this.creditorId = creditorId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("creditorId")
 @Size(max=35)
  public String getCreditorId() {
    return creditorId;
  }
  public void setCreditorId(String creditorId) {
    this.creditorId = creditorId;
  }

  /**
   **/
  public Transactions bookingDate(LocalDate bookingDate) {
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
   * The Date at which assets become available to the account owner in case of a credit.
   **/
  public Transactions valueDate(LocalDate valueDate) {
    this.valueDate = valueDate;
    return this;
  }

  
  @ApiModelProperty(value = "The Date at which assets become available to the account owner in case of a credit.")
  @JsonProperty("valueDate")

  public LocalDate getValueDate() {
    return valueDate;
  }
  public void setValueDate(LocalDate valueDate) {
    this.valueDate = valueDate;
  }

  /**
   **/
  public Transactions transactionAmount(Amount transactionAmount) {
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
  public Transactions currencyExchange(ReportExchangeRateList currencyExchange) {
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
  public Transactions creditorName(String creditorName) {
    this.creditorName = creditorName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("creditorName")
 @Size(max=70)
  public String getCreditorName() {
    return creditorName;
  }
  public void setCreditorName(String creditorName) {
    this.creditorName = creditorName;
  }

  /**
   **/
  public Transactions creditorAccount(AccountReference creditorAccount) {
    this.creditorAccount = creditorAccount;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("creditorAccount")

  public AccountReference getCreditorAccount() {
    return creditorAccount;
  }
  public void setCreditorAccount(AccountReference creditorAccount) {
    this.creditorAccount = creditorAccount;
  }

  /**
   **/
  public Transactions creditorAgent(String creditorAgent) {
    this.creditorAgent = creditorAgent;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("creditorAgent")
 @Pattern(regexp="[A-Z]{6,6}[A-Z2-9][A-NP-Z0-9]([A-Z0-9]{3,3}){0,1}")
  public String getCreditorAgent() {
    return creditorAgent;
  }
  public void setCreditorAgent(String creditorAgent) {
    this.creditorAgent = creditorAgent;
  }

  /**
   **/
  public Transactions ultimateCreditor(String ultimateCreditor) {
    this.ultimateCreditor = ultimateCreditor;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ultimateCreditor")
 @Size(max=70)
  public String getUltimateCreditor() {
    return ultimateCreditor;
  }
  public void setUltimateCreditor(String ultimateCreditor) {
    this.ultimateCreditor = ultimateCreditor;
  }

  /**
   **/
  public Transactions debtorName(String debtorName) {
    this.debtorName = debtorName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("debtorName")
 @Size(max=70)
  public String getDebtorName() {
    return debtorName;
  }
  public void setDebtorName(String debtorName) {
    this.debtorName = debtorName;
  }

  /**
   **/
  public Transactions debtorAccount(AccountReference debtorAccount) {
    this.debtorAccount = debtorAccount;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("debtorAccount")

  public AccountReference getDebtorAccount() {
    return debtorAccount;
  }
  public void setDebtorAccount(AccountReference debtorAccount) {
    this.debtorAccount = debtorAccount;
  }

  /**
   **/
  public Transactions debtorAgent(String debtorAgent) {
    this.debtorAgent = debtorAgent;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("debtorAgent")
 @Pattern(regexp="[A-Z]{6,6}[A-Z2-9][A-NP-Z0-9]([A-Z0-9]{3,3}){0,1}")
  public String getDebtorAgent() {
    return debtorAgent;
  }
  public void setDebtorAgent(String debtorAgent) {
    this.debtorAgent = debtorAgent;
  }

  /**
   **/
  public Transactions ultimateDebtor(String ultimateDebtor) {
    this.ultimateDebtor = ultimateDebtor;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ultimateDebtor")
 @Size(max=70)
  public String getUltimateDebtor() {
    return ultimateDebtor;
  }
  public void setUltimateDebtor(String ultimateDebtor) {
    this.ultimateDebtor = ultimateDebtor;
  }

  /**
   **/
  public Transactions remittanceInformationUnstructured(String remittanceInformationUnstructured) {
    this.remittanceInformationUnstructured = remittanceInformationUnstructured;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("remittanceInformationUnstructured")
 @Size(max=140)
  public String getRemittanceInformationUnstructured() {
    return remittanceInformationUnstructured;
  }
  public void setRemittanceInformationUnstructured(String remittanceInformationUnstructured) {
    this.remittanceInformationUnstructured = remittanceInformationUnstructured;
  }

  /**
   **/
  public Transactions remittanceInformationUnstructuredArray(RemittanceInformationUnstructuredArray remittanceInformationUnstructuredArray) {
    this.remittanceInformationUnstructuredArray = remittanceInformationUnstructuredArray;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("remittanceInformationUnstructuredArray")

  public RemittanceInformationUnstructuredArray getRemittanceInformationUnstructuredArray() {
    return remittanceInformationUnstructuredArray;
  }
  public void setRemittanceInformationUnstructuredArray(RemittanceInformationUnstructuredArray remittanceInformationUnstructuredArray) {
    this.remittanceInformationUnstructuredArray = remittanceInformationUnstructuredArray;
  }

  /**
   **/
  public Transactions remittanceInformationStructured(String remittanceInformationStructured) {
    this.remittanceInformationStructured = remittanceInformationStructured;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("remittanceInformationStructured")
 @Size(max=140)
  public String getRemittanceInformationStructured() {
    return remittanceInformationStructured;
  }
  public void setRemittanceInformationStructured(String remittanceInformationStructured) {
    this.remittanceInformationStructured = remittanceInformationStructured;
  }

  /**
   **/
  public Transactions remittanceInformationStructuredArray(RemittanceInformationStructuredArray remittanceInformationStructuredArray) {
    this.remittanceInformationStructuredArray = remittanceInformationStructuredArray;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("remittanceInformationStructuredArray")

  public RemittanceInformationStructuredArray getRemittanceInformationStructuredArray() {
    return remittanceInformationStructuredArray;
  }
  public void setRemittanceInformationStructuredArray(RemittanceInformationStructuredArray remittanceInformationStructuredArray) {
    this.remittanceInformationStructuredArray = remittanceInformationStructuredArray;
  }

  /**
   **/
  public Transactions entryDetails(EntryDetails entryDetails) {
    this.entryDetails = entryDetails;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("entryDetails")

  public EntryDetails getEntryDetails() {
    return entryDetails;
  }
  public void setEntryDetails(EntryDetails entryDetails) {
    this.entryDetails = entryDetails;
  }

  /**
   **/
  public Transactions additionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("additionalInformation")
 @Size(max=500)
  public String getAdditionalInformation() {
    return additionalInformation;
  }
  public void setAdditionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
  }

  /**
   **/
  public Transactions additionalInformationStructured(AdditionalInformationStructured additionalInformationStructured) {
    this.additionalInformationStructured = additionalInformationStructured;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("additionalInformationStructured")

  public AdditionalInformationStructured getAdditionalInformationStructured() {
    return additionalInformationStructured;
  }
  public void setAdditionalInformationStructured(AdditionalInformationStructured additionalInformationStructured) {
    this.additionalInformationStructured = additionalInformationStructured;
  }

  /**
   **/
  public Transactions purposeCode(PurposeCode purposeCode) {
    this.purposeCode = purposeCode;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("purposeCode")

  public PurposeCode getPurposeCode() {
    return purposeCode;
  }
  public void setPurposeCode(PurposeCode purposeCode) {
    this.purposeCode = purposeCode;
  }

  /**
   **/
  public Transactions bankTransactionCode(String bankTransactionCode) {
    this.bankTransactionCode = bankTransactionCode;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("bankTransactionCode")

  public String getBankTransactionCode() {
    return bankTransactionCode;
  }
  public void setBankTransactionCode(String bankTransactionCode) {
    this.bankTransactionCode = bankTransactionCode;
  }

  /**
   **/
  public Transactions proprietaryBankTransactionCode(String proprietaryBankTransactionCode) {
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

  /**
   **/
  public Transactions balanceAfterTransaction(Balance balanceAfterTransaction) {
    this.balanceAfterTransaction = balanceAfterTransaction;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("balanceAfterTransaction")

  public Balance getBalanceAfterTransaction() {
    return balanceAfterTransaction;
  }
  public void setBalanceAfterTransaction(Balance balanceAfterTransaction) {
    this.balanceAfterTransaction = balanceAfterTransaction;
  }

  /**
   **/
  public Transactions _links(LinksTransactionDetails _links) {
    this._links = _links;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("_links")

  public LinksTransactionDetails getLinks() {
    return _links;
  }
  public void setLinks(LinksTransactionDetails _links) {
    this._links = _links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transactions transactions = (Transactions) o;
    return Objects.equals(transactionId, transactions.transactionId) &&
        Objects.equals(entryReference, transactions.entryReference) &&
        Objects.equals(endToEndId, transactions.endToEndId) &&
        Objects.equals(batchIndicator, transactions.batchIndicator) &&
        Objects.equals(batchNumberOfTransactions, transactions.batchNumberOfTransactions) &&
        Objects.equals(mandateId, transactions.mandateId) &&
        Objects.equals(checkId, transactions.checkId) &&
        Objects.equals(creditorId, transactions.creditorId) &&
        Objects.equals(bookingDate, transactions.bookingDate) &&
        Objects.equals(valueDate, transactions.valueDate) &&
        Objects.equals(transactionAmount, transactions.transactionAmount) &&
        Objects.equals(currencyExchange, transactions.currencyExchange) &&
        Objects.equals(creditorName, transactions.creditorName) &&
        Objects.equals(creditorAccount, transactions.creditorAccount) &&
        Objects.equals(creditorAgent, transactions.creditorAgent) &&
        Objects.equals(ultimateCreditor, transactions.ultimateCreditor) &&
        Objects.equals(debtorName, transactions.debtorName) &&
        Objects.equals(debtorAccount, transactions.debtorAccount) &&
        Objects.equals(debtorAgent, transactions.debtorAgent) &&
        Objects.equals(ultimateDebtor, transactions.ultimateDebtor) &&
        Objects.equals(remittanceInformationUnstructured, transactions.remittanceInformationUnstructured) &&
        Objects.equals(remittanceInformationUnstructuredArray, transactions.remittanceInformationUnstructuredArray) &&
        Objects.equals(remittanceInformationStructured, transactions.remittanceInformationStructured) &&
        Objects.equals(remittanceInformationStructuredArray, transactions.remittanceInformationStructuredArray) &&
        Objects.equals(entryDetails, transactions.entryDetails) &&
        Objects.equals(additionalInformation, transactions.additionalInformation) &&
        Objects.equals(additionalInformationStructured, transactions.additionalInformationStructured) &&
        Objects.equals(purposeCode, transactions.purposeCode) &&
        Objects.equals(bankTransactionCode, transactions.bankTransactionCode) &&
        Objects.equals(proprietaryBankTransactionCode, transactions.proprietaryBankTransactionCode) &&
        Objects.equals(balanceAfterTransaction, transactions.balanceAfterTransaction) &&
        Objects.equals(_links, transactions._links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, entryReference, endToEndId, batchIndicator, batchNumberOfTransactions, mandateId, checkId, creditorId, bookingDate, valueDate, transactionAmount, currencyExchange, creditorName, creditorAccount, creditorAgent, ultimateCreditor, debtorName, debtorAccount, debtorAgent, ultimateDebtor, remittanceInformationUnstructured, remittanceInformationUnstructuredArray, remittanceInformationStructured, remittanceInformationStructuredArray, entryDetails, additionalInformation, additionalInformationStructured, purposeCode, bankTransactionCode, proprietaryBankTransactionCode, balanceAfterTransaction, _links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transactions {\n");
    
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    entryReference: ").append(toIndentedString(entryReference)).append("\n");
    sb.append("    endToEndId: ").append(toIndentedString(endToEndId)).append("\n");
    sb.append("    batchIndicator: ").append(toIndentedString(batchIndicator)).append("\n");
    sb.append("    batchNumberOfTransactions: ").append(toIndentedString(batchNumberOfTransactions)).append("\n");
    sb.append("    mandateId: ").append(toIndentedString(mandateId)).append("\n");
    sb.append("    checkId: ").append(toIndentedString(checkId)).append("\n");
    sb.append("    creditorId: ").append(toIndentedString(creditorId)).append("\n");
    sb.append("    bookingDate: ").append(toIndentedString(bookingDate)).append("\n");
    sb.append("    valueDate: ").append(toIndentedString(valueDate)).append("\n");
    sb.append("    transactionAmount: ").append(toIndentedString(transactionAmount)).append("\n");
    sb.append("    currencyExchange: ").append(toIndentedString(currencyExchange)).append("\n");
    sb.append("    creditorName: ").append(toIndentedString(creditorName)).append("\n");
    sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
    sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
    sb.append("    ultimateCreditor: ").append(toIndentedString(ultimateCreditor)).append("\n");
    sb.append("    debtorName: ").append(toIndentedString(debtorName)).append("\n");
    sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
    sb.append("    debtorAgent: ").append(toIndentedString(debtorAgent)).append("\n");
    sb.append("    ultimateDebtor: ").append(toIndentedString(ultimateDebtor)).append("\n");
    sb.append("    remittanceInformationUnstructured: ").append(toIndentedString(remittanceInformationUnstructured)).append("\n");
    sb.append("    remittanceInformationUnstructuredArray: ").append(toIndentedString(remittanceInformationUnstructuredArray)).append("\n");
    sb.append("    remittanceInformationStructured: ").append(toIndentedString(remittanceInformationStructured)).append("\n");
    sb.append("    remittanceInformationStructuredArray: ").append(toIndentedString(remittanceInformationStructuredArray)).append("\n");
    sb.append("    entryDetails: ").append(toIndentedString(entryDetails)).append("\n");
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
    sb.append("    additionalInformationStructured: ").append(toIndentedString(additionalInformationStructured)).append("\n");
    sb.append("    purposeCode: ").append(toIndentedString(purposeCode)).append("\n");
    sb.append("    bankTransactionCode: ").append(toIndentedString(bankTransactionCode)).append("\n");
    sb.append("    proprietaryBankTransactionCode: ").append(toIndentedString(proprietaryBankTransactionCode)).append("\n");
    sb.append("    balanceAfterTransaction: ").append(toIndentedString(balanceAfterTransaction)).append("\n");
    sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
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
