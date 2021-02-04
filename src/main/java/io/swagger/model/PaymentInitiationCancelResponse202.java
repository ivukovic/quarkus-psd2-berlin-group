package io.swagger.model;

import io.swagger.model.ChallengeData;
import io.swagger.model.ChosenScaMethod;
import io.swagger.model.LinksPaymentInitiationCancel;
import io.swagger.model.ScaMethods;
import io.swagger.model.TransactionStatus;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Body of the response for a successful cancel payment request.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "Body of the response for a successful cancel payment request.")

public class PaymentInitiationCancelResponse202   {
  private @Valid TransactionStatus transactionStatus = null;
  private @Valid ScaMethods scaMethods = null;
  private @Valid ChosenScaMethod chosenScaMethod = null;
  private @Valid ChallengeData challengeData = null;
  private @Valid LinksPaymentInitiationCancel _links = null;

  /**
   **/
  public PaymentInitiationCancelResponse202 transactionStatus(TransactionStatus transactionStatus) {
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
  public PaymentInitiationCancelResponse202 scaMethods(ScaMethods scaMethods) {
    this.scaMethods = scaMethods;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("scaMethods")

  public ScaMethods getScaMethods() {
    return scaMethods;
  }
  public void setScaMethods(ScaMethods scaMethods) {
    this.scaMethods = scaMethods;
  }

  /**
   **/
  public PaymentInitiationCancelResponse202 chosenScaMethod(ChosenScaMethod chosenScaMethod) {
    this.chosenScaMethod = chosenScaMethod;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("chosenScaMethod")

  public ChosenScaMethod getChosenScaMethod() {
    return chosenScaMethod;
  }
  public void setChosenScaMethod(ChosenScaMethod chosenScaMethod) {
    this.chosenScaMethod = chosenScaMethod;
  }

  /**
   **/
  public PaymentInitiationCancelResponse202 challengeData(ChallengeData challengeData) {
    this.challengeData = challengeData;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("challengeData")

  public ChallengeData getChallengeData() {
    return challengeData;
  }
  public void setChallengeData(ChallengeData challengeData) {
    this.challengeData = challengeData;
  }

  /**
   **/
  public PaymentInitiationCancelResponse202 _links(LinksPaymentInitiationCancel _links) {
    this._links = _links;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("_links")

  public LinksPaymentInitiationCancel getLinks() {
    return _links;
  }
  public void setLinks(LinksPaymentInitiationCancel _links) {
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
    PaymentInitiationCancelResponse202 paymentInitiationCancelResponse202 = (PaymentInitiationCancelResponse202) o;
    return Objects.equals(transactionStatus, paymentInitiationCancelResponse202.transactionStatus) &&
        Objects.equals(scaMethods, paymentInitiationCancelResponse202.scaMethods) &&
        Objects.equals(chosenScaMethod, paymentInitiationCancelResponse202.chosenScaMethod) &&
        Objects.equals(challengeData, paymentInitiationCancelResponse202.challengeData) &&
        Objects.equals(_links, paymentInitiationCancelResponse202._links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionStatus, scaMethods, chosenScaMethod, challengeData, _links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInitiationCancelResponse202 {\n");
    
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    scaMethods: ").append(toIndentedString(scaMethods)).append("\n");
    sb.append("    chosenScaMethod: ").append(toIndentedString(chosenScaMethod)).append("\n");
    sb.append("    challengeData: ").append(toIndentedString(challengeData)).append("\n");
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
