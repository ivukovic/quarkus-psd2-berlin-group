package io.swagger.model;

import io.swagger.model.AccountReference;
import io.swagger.model.PaymentInitiationBulkElementJson;
import io.swagger.model.TransactionStatus;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.joda.time.LocalDate;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Generic JSON response body consistion of the corresponding bulk payment initation JSON body together with an optional transaction status field. 
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "Generic JSON response body consistion of the corresponding bulk payment initation JSON body together with an optional transaction status field. ")

public class BulkPaymentInitiationWithStatusResponse  implements OneOfinlineResponse200  {
  private @Valid Boolean batchBookingPreferred = null;
  private @Valid LocalDate requestedExecutionDate = null;
  private @Valid Date acceptorTransactionDateTime = null;
  private @Valid AccountReference debtorAccount = null;
  private @Valid String paymentInformationId = null;
  private @Valid List<PaymentInitiationBulkElementJson> payments = new ArrayList<PaymentInitiationBulkElementJson>();
  private @Valid TransactionStatus transactionStatus = null;

  /**
   **/
  public BulkPaymentInitiationWithStatusResponse batchBookingPreferred(Boolean batchBookingPreferred) {
    this.batchBookingPreferred = batchBookingPreferred;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("batchBookingPreferred")

  public Boolean getBatchBookingPreferred() {
    return batchBookingPreferred;
  }
  public void setBatchBookingPreferred(Boolean batchBookingPreferred) {
    this.batchBookingPreferred = batchBookingPreferred;
  }

  /**
   **/
  public BulkPaymentInitiationWithStatusResponse requestedExecutionDate(LocalDate requestedExecutionDate) {
    this.requestedExecutionDate = requestedExecutionDate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("requestedExecutionDate")

  public LocalDate getRequestedExecutionDate() {
    return requestedExecutionDate;
  }
  public void setRequestedExecutionDate(LocalDate requestedExecutionDate) {
    this.requestedExecutionDate = requestedExecutionDate;
  }

  /**
   **/
  public BulkPaymentInitiationWithStatusResponse acceptorTransactionDateTime(Date acceptorTransactionDateTime) {
    this.acceptorTransactionDateTime = acceptorTransactionDateTime;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("acceptorTransactionDateTime")

  public Date getAcceptorTransactionDateTime() {
    return acceptorTransactionDateTime;
  }
  public void setAcceptorTransactionDateTime(Date acceptorTransactionDateTime) {
    this.acceptorTransactionDateTime = acceptorTransactionDateTime;
  }

  /**
   **/
  public BulkPaymentInitiationWithStatusResponse debtorAccount(AccountReference debtorAccount) {
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
  public BulkPaymentInitiationWithStatusResponse paymentInformationId(String paymentInformationId) {
    this.paymentInformationId = paymentInformationId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("paymentInformationId")
 @Size(max=35)
  public String getPaymentInformationId() {
    return paymentInformationId;
  }
  public void setPaymentInformationId(String paymentInformationId) {
    this.paymentInformationId = paymentInformationId;
  }

  /**
   * A list of generic JSON bodies payment initations for bulk payments via JSON.  Note: Some fields from single payments do not occcur in a bulk payment element 
   **/
  public BulkPaymentInitiationWithStatusResponse payments(List<PaymentInitiationBulkElementJson> payments) {
    this.payments = payments;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of generic JSON bodies payment initations for bulk payments via JSON.  Note: Some fields from single payments do not occcur in a bulk payment element ")
  @JsonProperty("payments")
  @NotNull

  public List<PaymentInitiationBulkElementJson> getPayments() {
    return payments;
  }
  public void setPayments(List<PaymentInitiationBulkElementJson> payments) {
    this.payments = payments;
  }

  /**
   **/
  public BulkPaymentInitiationWithStatusResponse transactionStatus(TransactionStatus transactionStatus) {
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
    BulkPaymentInitiationWithStatusResponse bulkPaymentInitiationWithStatusResponse = (BulkPaymentInitiationWithStatusResponse) o;
    return Objects.equals(batchBookingPreferred, bulkPaymentInitiationWithStatusResponse.batchBookingPreferred) &&
        Objects.equals(requestedExecutionDate, bulkPaymentInitiationWithStatusResponse.requestedExecutionDate) &&
        Objects.equals(acceptorTransactionDateTime, bulkPaymentInitiationWithStatusResponse.acceptorTransactionDateTime) &&
        Objects.equals(debtorAccount, bulkPaymentInitiationWithStatusResponse.debtorAccount) &&
        Objects.equals(paymentInformationId, bulkPaymentInitiationWithStatusResponse.paymentInformationId) &&
        Objects.equals(payments, bulkPaymentInitiationWithStatusResponse.payments) &&
        Objects.equals(transactionStatus, bulkPaymentInitiationWithStatusResponse.transactionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchBookingPreferred, requestedExecutionDate, acceptorTransactionDateTime, debtorAccount, paymentInformationId, payments, transactionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkPaymentInitiationWithStatusResponse {\n");
    
    sb.append("    batchBookingPreferred: ").append(toIndentedString(batchBookingPreferred)).append("\n");
    sb.append("    requestedExecutionDate: ").append(toIndentedString(requestedExecutionDate)).append("\n");
    sb.append("    acceptorTransactionDateTime: ").append(toIndentedString(acceptorTransactionDateTime)).append("\n");
    sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
    sb.append("    paymentInformationId: ").append(toIndentedString(paymentInformationId)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
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
