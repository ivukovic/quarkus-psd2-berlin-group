package io.swagger.model;

import io.swagger.model.TransactionStatus;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Body of the response for a successful payment initiation status request in case of an JSON based endpoint.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "Body of the response for a successful payment initiation status request in case of an JSON based endpoint.")

public class PaymentInitiationStatusResponse200Json   {
  private @Valid TransactionStatus transactionStatus = null;
  private @Valid Boolean fundsAvailable = null;
  private @Valid String psuMessage = null;

  /**
   **/
  public PaymentInitiationStatusResponse200Json transactionStatus(TransactionStatus transactionStatus) {
    this.transactionStatus = transactionStatus;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("transactionStatus")
  @NotNull

  public TransactionStatus getTransactionStatus() {
    return transactionStatus;
  }
  public void setTransactionStatus(TransactionStatus transactionStatus) {
    this.transactionStatus = transactionStatus;
  }

  /**
   **/
  public PaymentInitiationStatusResponse200Json fundsAvailable(Boolean fundsAvailable) {
    this.fundsAvailable = fundsAvailable;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("fundsAvailable")

  public Boolean getFundsAvailable() {
    return fundsAvailable;
  }
  public void setFundsAvailable(Boolean fundsAvailable) {
    this.fundsAvailable = fundsAvailable;
  }

  /**
   **/
  public PaymentInitiationStatusResponse200Json psuMessage(String psuMessage) {
    this.psuMessage = psuMessage;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("psuMessage")
 @Size(max=500)
  public String getPsuMessage() {
    return psuMessage;
  }
  public void setPsuMessage(String psuMessage) {
    this.psuMessage = psuMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInitiationStatusResponse200Json paymentInitiationStatusResponse200Json = (PaymentInitiationStatusResponse200Json) o;
    return Objects.equals(transactionStatus, paymentInitiationStatusResponse200Json.transactionStatus) &&
        Objects.equals(fundsAvailable, paymentInitiationStatusResponse200Json.fundsAvailable) &&
        Objects.equals(psuMessage, paymentInitiationStatusResponse200Json.psuMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionStatus, fundsAvailable, psuMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInitiationStatusResponse200Json {\n");
    
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    fundsAvailable: ").append(toIndentedString(fundsAvailable)).append("\n");
    sb.append("    psuMessage: ").append(toIndentedString(psuMessage)).append("\n");
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
