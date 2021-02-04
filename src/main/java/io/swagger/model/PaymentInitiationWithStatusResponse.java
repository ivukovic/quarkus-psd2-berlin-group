package io.swagger.model;

import io.swagger.model.AccountReference;
import io.swagger.model.Address;
import io.swagger.model.Amount;
import io.swagger.model.TransactionStatus;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Generic JSON response body consistion of the corresponding payment initation JSON body together with an optional transaction status field. 
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "Generic JSON response body consistion of the corresponding payment initation JSON body together with an optional transaction status field. ")

public class PaymentInitiationWithStatusResponse  implements OneOfinlineResponse200  {
  private @Valid String endToEndIdentification = null;
  private @Valid AccountReference debtorAccount = null;
  private @Valid Amount instructedAmount = null;
  private @Valid AccountReference creditorAccount = null;
  private @Valid String creditorAgent = null;
  private @Valid String creditorName = null;
  private @Valid Address creditorAddress = null;
  private @Valid String remittanceInformationUnstructured = null;
  private @Valid TransactionStatus transactionStatus = null;

  /**
   **/
  public PaymentInitiationWithStatusResponse endToEndIdentification(String endToEndIdentification) {
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
  public PaymentInitiationWithStatusResponse debtorAccount(AccountReference debtorAccount) {
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
  public PaymentInitiationWithStatusResponse instructedAmount(Amount instructedAmount) {
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
  public PaymentInitiationWithStatusResponse creditorAccount(AccountReference creditorAccount) {
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
  public PaymentInitiationWithStatusResponse creditorAgent(String creditorAgent) {
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
  public PaymentInitiationWithStatusResponse creditorName(String creditorName) {
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
  public PaymentInitiationWithStatusResponse creditorAddress(Address creditorAddress) {
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
  public PaymentInitiationWithStatusResponse remittanceInformationUnstructured(String remittanceInformationUnstructured) {
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
  public PaymentInitiationWithStatusResponse transactionStatus(TransactionStatus transactionStatus) {
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
    PaymentInitiationWithStatusResponse paymentInitiationWithStatusResponse = (PaymentInitiationWithStatusResponse) o;
    return Objects.equals(endToEndIdentification, paymentInitiationWithStatusResponse.endToEndIdentification) &&
        Objects.equals(debtorAccount, paymentInitiationWithStatusResponse.debtorAccount) &&
        Objects.equals(instructedAmount, paymentInitiationWithStatusResponse.instructedAmount) &&
        Objects.equals(creditorAccount, paymentInitiationWithStatusResponse.creditorAccount) &&
        Objects.equals(creditorAgent, paymentInitiationWithStatusResponse.creditorAgent) &&
        Objects.equals(creditorName, paymentInitiationWithStatusResponse.creditorName) &&
        Objects.equals(creditorAddress, paymentInitiationWithStatusResponse.creditorAddress) &&
        Objects.equals(remittanceInformationUnstructured, paymentInitiationWithStatusResponse.remittanceInformationUnstructured) &&
        Objects.equals(transactionStatus, paymentInitiationWithStatusResponse.transactionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endToEndIdentification, debtorAccount, instructedAmount, creditorAccount, creditorAgent, creditorName, creditorAddress, remittanceInformationUnstructured, transactionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInitiationWithStatusResponse {\n");
    
    sb.append("    endToEndIdentification: ").append(toIndentedString(endToEndIdentification)).append("\n");
    sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
    sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
    sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
    sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
    sb.append("    creditorName: ").append(toIndentedString(creditorName)).append("\n");
    sb.append("    creditorAddress: ").append(toIndentedString(creditorAddress)).append("\n");
    sb.append("    remittanceInformationUnstructured: ").append(toIndentedString(remittanceInformationUnstructured)).append("\n");
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
