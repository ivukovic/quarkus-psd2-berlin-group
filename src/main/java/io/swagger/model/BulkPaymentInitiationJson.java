package io.swagger.model;

import io.swagger.model.AccountReference;
import io.swagger.model.PaymentInitiationBulkElementJson;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.joda.time.LocalDate;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Generic Body for a bulk payment initation via JSON.  paymentInformationId is contained in code but commented since it is n.a.  and not all ASPSP are able to support this field now. In a later version the field will be mandatory. 
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "Generic Body for a bulk payment initation via JSON.  paymentInformationId is contained in code but commented since it is n.a.  and not all ASPSP are able to support this field now. In a later version the field will be mandatory. ")

public class BulkPaymentInitiationJson   {
  private @Valid Boolean batchBookingPreferred = null;
  private @Valid AccountReference debtorAccount = null;
  private @Valid LocalDate requestedExecutionDate = null;
  private @Valid Date requestedExecutionTime = null;
  private @Valid List<PaymentInitiationBulkElementJson> payments = new ArrayList<PaymentInitiationBulkElementJson>();

  /**
   **/
  public BulkPaymentInitiationJson batchBookingPreferred(Boolean batchBookingPreferred) {
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
  public BulkPaymentInitiationJson debtorAccount(AccountReference debtorAccount) {
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
  public BulkPaymentInitiationJson requestedExecutionDate(LocalDate requestedExecutionDate) {
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
  public BulkPaymentInitiationJson requestedExecutionTime(Date requestedExecutionTime) {
    this.requestedExecutionTime = requestedExecutionTime;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("requestedExecutionTime")

  public Date getRequestedExecutionTime() {
    return requestedExecutionTime;
  }
  public void setRequestedExecutionTime(Date requestedExecutionTime) {
    this.requestedExecutionTime = requestedExecutionTime;
  }

  /**
   * A list of generic JSON bodies payment initations for bulk payments via JSON.  Note: Some fields from single payments do not occcur in a bulk payment element 
   **/
  public BulkPaymentInitiationJson payments(List<PaymentInitiationBulkElementJson> payments) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkPaymentInitiationJson bulkPaymentInitiationJson = (BulkPaymentInitiationJson) o;
    return Objects.equals(batchBookingPreferred, bulkPaymentInitiationJson.batchBookingPreferred) &&
        Objects.equals(debtorAccount, bulkPaymentInitiationJson.debtorAccount) &&
        Objects.equals(requestedExecutionDate, bulkPaymentInitiationJson.requestedExecutionDate) &&
        Objects.equals(requestedExecutionTime, bulkPaymentInitiationJson.requestedExecutionTime) &&
        Objects.equals(payments, bulkPaymentInitiationJson.payments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchBookingPreferred, debtorAccount, requestedExecutionDate, requestedExecutionTime, payments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkPaymentInitiationJson {\n");
    
    sb.append("    batchBookingPreferred: ").append(toIndentedString(batchBookingPreferred)).append("\n");
    sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
    sb.append("    requestedExecutionDate: ").append(toIndentedString(requestedExecutionDate)).append("\n");
    sb.append("    requestedExecutionTime: ").append(toIndentedString(requestedExecutionTime)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
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
