package io.swagger.model;

import io.swagger.model.AccountReference;
import io.swagger.model.Amount;
import io.swagger.model.PurposeCode;
import io.swagger.model.RemittanceInformationStructured;
import io.swagger.model.RemittanceInformationStructuredArray;
import io.swagger.model.RemittanceInformationUnstructuredArray;
import io.swagger.model.ReportExchangeRateList;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class EntryDetailsElement   {
  private @Valid String endToEndId = null;
  private @Valid String mandateId = null;
  private @Valid String checkId = null;
  private @Valid String creditorId = null;
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
  private @Valid RemittanceInformationStructured remittanceInformationStructured = null;
  private @Valid RemittanceInformationStructuredArray remittanceInformationStructuredArray = null;
  private @Valid PurposeCode purposeCode = null;

  /**
   * Unique end to end identity.
   **/
  public EntryDetailsElement endToEndId(String endToEndId) {
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
   * Identification of Mandates, e.g. a SEPA Mandate ID.
   **/
  public EntryDetailsElement mandateId(String mandateId) {
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
  public EntryDetailsElement checkId(String checkId) {
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
  public EntryDetailsElement creditorId(String creditorId) {
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
  public EntryDetailsElement transactionAmount(Amount transactionAmount) {
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
  public EntryDetailsElement currencyExchange(ReportExchangeRateList currencyExchange) {
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
  public EntryDetailsElement creditorName(String creditorName) {
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
  public EntryDetailsElement creditorAccount(AccountReference creditorAccount) {
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
  public EntryDetailsElement creditorAgent(String creditorAgent) {
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
  public EntryDetailsElement ultimateCreditor(String ultimateCreditor) {
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
  public EntryDetailsElement debtorName(String debtorName) {
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
  public EntryDetailsElement debtorAccount(AccountReference debtorAccount) {
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
  public EntryDetailsElement debtorAgent(String debtorAgent) {
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
  public EntryDetailsElement ultimateDebtor(String ultimateDebtor) {
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
  public EntryDetailsElement remittanceInformationUnstructured(String remittanceInformationUnstructured) {
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
  public EntryDetailsElement remittanceInformationUnstructuredArray(RemittanceInformationUnstructuredArray remittanceInformationUnstructuredArray) {
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
  public EntryDetailsElement remittanceInformationStructured(RemittanceInformationStructured remittanceInformationStructured) {
    this.remittanceInformationStructured = remittanceInformationStructured;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("remittanceInformationStructured")

  public RemittanceInformationStructured getRemittanceInformationStructured() {
    return remittanceInformationStructured;
  }
  public void setRemittanceInformationStructured(RemittanceInformationStructured remittanceInformationStructured) {
    this.remittanceInformationStructured = remittanceInformationStructured;
  }

  /**
   **/
  public EntryDetailsElement remittanceInformationStructuredArray(RemittanceInformationStructuredArray remittanceInformationStructuredArray) {
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
  public EntryDetailsElement purposeCode(PurposeCode purposeCode) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntryDetailsElement entryDetailsElement = (EntryDetailsElement) o;
    return Objects.equals(endToEndId, entryDetailsElement.endToEndId) &&
        Objects.equals(mandateId, entryDetailsElement.mandateId) &&
        Objects.equals(checkId, entryDetailsElement.checkId) &&
        Objects.equals(creditorId, entryDetailsElement.creditorId) &&
        Objects.equals(transactionAmount, entryDetailsElement.transactionAmount) &&
        Objects.equals(currencyExchange, entryDetailsElement.currencyExchange) &&
        Objects.equals(creditorName, entryDetailsElement.creditorName) &&
        Objects.equals(creditorAccount, entryDetailsElement.creditorAccount) &&
        Objects.equals(creditorAgent, entryDetailsElement.creditorAgent) &&
        Objects.equals(ultimateCreditor, entryDetailsElement.ultimateCreditor) &&
        Objects.equals(debtorName, entryDetailsElement.debtorName) &&
        Objects.equals(debtorAccount, entryDetailsElement.debtorAccount) &&
        Objects.equals(debtorAgent, entryDetailsElement.debtorAgent) &&
        Objects.equals(ultimateDebtor, entryDetailsElement.ultimateDebtor) &&
        Objects.equals(remittanceInformationUnstructured, entryDetailsElement.remittanceInformationUnstructured) &&
        Objects.equals(remittanceInformationUnstructuredArray, entryDetailsElement.remittanceInformationUnstructuredArray) &&
        Objects.equals(remittanceInformationStructured, entryDetailsElement.remittanceInformationStructured) &&
        Objects.equals(remittanceInformationStructuredArray, entryDetailsElement.remittanceInformationStructuredArray) &&
        Objects.equals(purposeCode, entryDetailsElement.purposeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endToEndId, mandateId, checkId, creditorId, transactionAmount, currencyExchange, creditorName, creditorAccount, creditorAgent, ultimateCreditor, debtorName, debtorAccount, debtorAgent, ultimateDebtor, remittanceInformationUnstructured, remittanceInformationUnstructuredArray, remittanceInformationStructured, remittanceInformationStructuredArray, purposeCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntryDetailsElement {\n");
    
    sb.append("    endToEndId: ").append(toIndentedString(endToEndId)).append("\n");
    sb.append("    mandateId: ").append(toIndentedString(mandateId)).append("\n");
    sb.append("    checkId: ").append(toIndentedString(checkId)).append("\n");
    sb.append("    creditorId: ").append(toIndentedString(creditorId)).append("\n");
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
    sb.append("    purposeCode: ").append(toIndentedString(purposeCode)).append("\n");
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
