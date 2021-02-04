package io.swagger.model;

import io.swagger.model.AccountReference;
import io.swagger.model.Address;
import io.swagger.model.Amount;
import io.swagger.model.DayOfExecution;
import io.swagger.model.ExecutionRule;
import io.swagger.model.FrequencyCode;
import io.swagger.model.TransactionStatus;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.joda.time.LocalDate;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Generic JSON response body consistion of the corresponding periodic payment initation JSON body together with an optional transaction status field. 
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "Generic JSON response body consistion of the corresponding periodic payment initation JSON body together with an optional transaction status field. ")

public class PeriodicPaymentInitiationWithStatusResponse  implements OneOfinlineResponse200  {
  private @Valid String endToEndIdentification = null;
  private @Valid AccountReference debtorAccount = null;
  private @Valid Amount instructedAmount = null;
  private @Valid AccountReference creditorAccount = null;
  private @Valid String creditorAgent = null;
  private @Valid String creditorName = null;
  private @Valid Address creditorAddress = null;
  private @Valid String remittanceInformationUnstructured = null;
  private @Valid LocalDate startDate = null;
  private @Valid LocalDate endDate = null;
  private @Valid ExecutionRule executionRule = null;
  private @Valid FrequencyCode frequency = null;
  private @Valid DayOfExecution dayOfExecution = null;
  private @Valid TransactionStatus transactionStatus = null;

  /**
   **/
  public PeriodicPaymentInitiationWithStatusResponse endToEndIdentification(String endToEndIdentification) {
    this.endToEndIdentification = endToEndIdentification;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("endToEndIdentification")
 @Size(max=35)
  public String getEndToEndIdentification() {
    return endToEndIdentification;
  }
  public void setEndToEndIdentification(String endToEndIdentification) {
    this.endToEndIdentification = endToEndIdentification;
  }

  /**
   **/
  public PeriodicPaymentInitiationWithStatusResponse debtorAccount(AccountReference debtorAccount) {
    this.debtorAccount = debtorAccount;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("debtorAccount")
  @NotNull

  public AccountReference getDebtorAccount() {
    return debtorAccount;
  }
  public void setDebtorAccount(AccountReference debtorAccount) {
    this.debtorAccount = debtorAccount;
  }

  /**
   **/
  public PeriodicPaymentInitiationWithStatusResponse instructedAmount(Amount instructedAmount) {
    this.instructedAmount = instructedAmount;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("instructedAmount")
  @NotNull

  public Amount getInstructedAmount() {
    return instructedAmount;
  }
  public void setInstructedAmount(Amount instructedAmount) {
    this.instructedAmount = instructedAmount;
  }

  /**
   **/
  public PeriodicPaymentInitiationWithStatusResponse creditorAccount(AccountReference creditorAccount) {
    this.creditorAccount = creditorAccount;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("creditorAccount")
  @NotNull

  public AccountReference getCreditorAccount() {
    return creditorAccount;
  }
  public void setCreditorAccount(AccountReference creditorAccount) {
    this.creditorAccount = creditorAccount;
  }

  /**
   **/
  public PeriodicPaymentInitiationWithStatusResponse creditorAgent(String creditorAgent) {
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
  public PeriodicPaymentInitiationWithStatusResponse creditorName(String creditorName) {
    this.creditorName = creditorName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("creditorName")
  @NotNull
 @Size(max=70)
  public String getCreditorName() {
    return creditorName;
  }
  public void setCreditorName(String creditorName) {
    this.creditorName = creditorName;
  }

  /**
   **/
  public PeriodicPaymentInitiationWithStatusResponse creditorAddress(Address creditorAddress) {
    this.creditorAddress = creditorAddress;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("creditorAddress")

  public Address getCreditorAddress() {
    return creditorAddress;
  }
  public void setCreditorAddress(Address creditorAddress) {
    this.creditorAddress = creditorAddress;
  }

  /**
   **/
  public PeriodicPaymentInitiationWithStatusResponse remittanceInformationUnstructured(String remittanceInformationUnstructured) {
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
  public PeriodicPaymentInitiationWithStatusResponse startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("startDate")
  @NotNull

  public LocalDate getStartDate() {
    return startDate;
  }
  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  /**
   **/
  public PeriodicPaymentInitiationWithStatusResponse endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("endDate")

  public LocalDate getEndDate() {
    return endDate;
  }
  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  /**
   **/
  public PeriodicPaymentInitiationWithStatusResponse executionRule(ExecutionRule executionRule) {
    this.executionRule = executionRule;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("executionRule")

  public ExecutionRule getExecutionRule() {
    return executionRule;
  }
  public void setExecutionRule(ExecutionRule executionRule) {
    this.executionRule = executionRule;
  }

  /**
   **/
  public PeriodicPaymentInitiationWithStatusResponse frequency(FrequencyCode frequency) {
    this.frequency = frequency;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("frequency")
  @NotNull

  public FrequencyCode getFrequency() {
    return frequency;
  }
  public void setFrequency(FrequencyCode frequency) {
    this.frequency = frequency;
  }

  /**
   **/
  public PeriodicPaymentInitiationWithStatusResponse dayOfExecution(DayOfExecution dayOfExecution) {
    this.dayOfExecution = dayOfExecution;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dayOfExecution")
 @Size(max=2)
  public DayOfExecution getDayOfExecution() {
    return dayOfExecution;
  }
  public void setDayOfExecution(DayOfExecution dayOfExecution) {
    this.dayOfExecution = dayOfExecution;
  }

  /**
   **/
  public PeriodicPaymentInitiationWithStatusResponse transactionStatus(TransactionStatus transactionStatus) {
    this.transactionStatus = transactionStatus;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("transactionStatus")

  public TransactionStatus getTransactionStatus() {
    return transactionStatus;
  }
  public void setTransactionStatus(TransactionStatus transactionStatus) {
    this.transactionStatus = transactionStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PeriodicPaymentInitiationWithStatusResponse periodicPaymentInitiationWithStatusResponse = (PeriodicPaymentInitiationWithStatusResponse) o;
    return Objects.equals(endToEndIdentification, periodicPaymentInitiationWithStatusResponse.endToEndIdentification) &&
        Objects.equals(debtorAccount, periodicPaymentInitiationWithStatusResponse.debtorAccount) &&
        Objects.equals(instructedAmount, periodicPaymentInitiationWithStatusResponse.instructedAmount) &&
        Objects.equals(creditorAccount, periodicPaymentInitiationWithStatusResponse.creditorAccount) &&
        Objects.equals(creditorAgent, periodicPaymentInitiationWithStatusResponse.creditorAgent) &&
        Objects.equals(creditorName, periodicPaymentInitiationWithStatusResponse.creditorName) &&
        Objects.equals(creditorAddress, periodicPaymentInitiationWithStatusResponse.creditorAddress) &&
        Objects.equals(remittanceInformationUnstructured, periodicPaymentInitiationWithStatusResponse.remittanceInformationUnstructured) &&
        Objects.equals(startDate, periodicPaymentInitiationWithStatusResponse.startDate) &&
        Objects.equals(endDate, periodicPaymentInitiationWithStatusResponse.endDate) &&
        Objects.equals(executionRule, periodicPaymentInitiationWithStatusResponse.executionRule) &&
        Objects.equals(frequency, periodicPaymentInitiationWithStatusResponse.frequency) &&
        Objects.equals(dayOfExecution, periodicPaymentInitiationWithStatusResponse.dayOfExecution) &&
        Objects.equals(transactionStatus, periodicPaymentInitiationWithStatusResponse.transactionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endToEndIdentification, debtorAccount, instructedAmount, creditorAccount, creditorAgent, creditorName, creditorAddress, remittanceInformationUnstructured, startDate, endDate, executionRule, frequency, dayOfExecution, transactionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeriodicPaymentInitiationWithStatusResponse {\n");
    
    sb.append("    endToEndIdentification: ").append(toIndentedString(endToEndIdentification)).append("\n");
    sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
    sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
    sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
    sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
    sb.append("    creditorName: ").append(toIndentedString(creditorName)).append("\n");
    sb.append("    creditorAddress: ").append(toIndentedString(creditorAddress)).append("\n");
    sb.append("    remittanceInformationUnstructured: ").append(toIndentedString(remittanceInformationUnstructured)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    executionRule: ").append(toIndentedString(executionRule)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    dayOfExecution: ").append(toIndentedString(dayOfExecution)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
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
