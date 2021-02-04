package io.swagger.model;

import io.swagger.model.Amount;
import io.swagger.model.ChallengeData;
import io.swagger.model.ChosenScaMethod;
import io.swagger.model.LinksPaymentInitiation;
import io.swagger.model.ScaMethods;
import io.swagger.model.TppMessage2XX;
import io.swagger.model.TransactionStatus;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Body of the response for a successful payment initiation request.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "Body of the response for a successful payment initiation request.")

public class PaymentInitationRequestResponse201   {
  private @Valid TransactionStatus transactionStatus = null;
  private @Valid String paymentId = null;
  private @Valid Amount transactionFees = null;
  private @Valid Amount currencyConversionFee = null;
  private @Valid Amount estimatedTotalAmount = null;
  private @Valid Amount estimatedInterbankSettlementAmount = null;
  private @Valid Boolean transactionFeeIndicator = null;
  private @Valid ScaMethods scaMethods = null;
  private @Valid ChosenScaMethod chosenScaMethod = null;
  private @Valid ChallengeData challengeData = null;
  private @Valid LinksPaymentInitiation _links = null;
  private @Valid String psuMessage = null;
  private @Valid List<TppMessage2XX> tppMessages = new ArrayList<TppMessage2XX>();

  /**
   **/
  public PaymentInitationRequestResponse201 transactionStatus(TransactionStatus transactionStatus) {
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
  public PaymentInitationRequestResponse201 paymentId(String paymentId) {
    this.paymentId = paymentId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("paymentId")
  @NotNull

  public String getPaymentId() {
    return paymentId;
  }
  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  /**
   **/
  public PaymentInitationRequestResponse201 transactionFees(Amount transactionFees) {
    this.transactionFees = transactionFees;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("transactionFees")

  public Amount getTransactionFees() {
    return transactionFees;
  }
  public void setTransactionFees(Amount transactionFees) {
    this.transactionFees = transactionFees;
  }

  /**
   **/
  public PaymentInitationRequestResponse201 currencyConversionFee(Amount currencyConversionFee) {
    this.currencyConversionFee = currencyConversionFee;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("currencyConversionFee")

  public Amount getCurrencyConversionFee() {
    return currencyConversionFee;
  }
  public void setCurrencyConversionFee(Amount currencyConversionFee) {
    this.currencyConversionFee = currencyConversionFee;
  }

  /**
   **/
  public PaymentInitationRequestResponse201 estimatedTotalAmount(Amount estimatedTotalAmount) {
    this.estimatedTotalAmount = estimatedTotalAmount;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("estimatedTotalAmount")

  public Amount getEstimatedTotalAmount() {
    return estimatedTotalAmount;
  }
  public void setEstimatedTotalAmount(Amount estimatedTotalAmount) {
    this.estimatedTotalAmount = estimatedTotalAmount;
  }

  /**
   **/
  public PaymentInitationRequestResponse201 estimatedInterbankSettlementAmount(Amount estimatedInterbankSettlementAmount) {
    this.estimatedInterbankSettlementAmount = estimatedInterbankSettlementAmount;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("estimatedInterbankSettlementAmount")

  public Amount getEstimatedInterbankSettlementAmount() {
    return estimatedInterbankSettlementAmount;
  }
  public void setEstimatedInterbankSettlementAmount(Amount estimatedInterbankSettlementAmount) {
    this.estimatedInterbankSettlementAmount = estimatedInterbankSettlementAmount;
  }

  /**
   **/
  public PaymentInitationRequestResponse201 transactionFeeIndicator(Boolean transactionFeeIndicator) {
    this.transactionFeeIndicator = transactionFeeIndicator;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("transactionFeeIndicator")

  public Boolean getTransactionFeeIndicator() {
    return transactionFeeIndicator;
  }
  public void setTransactionFeeIndicator(Boolean transactionFeeIndicator) {
    this.transactionFeeIndicator = transactionFeeIndicator;
  }

  /**
   **/
  public PaymentInitationRequestResponse201 scaMethods(ScaMethods scaMethods) {
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
  public PaymentInitationRequestResponse201 chosenScaMethod(ChosenScaMethod chosenScaMethod) {
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
  public PaymentInitationRequestResponse201 challengeData(ChallengeData challengeData) {
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
  public PaymentInitationRequestResponse201 _links(LinksPaymentInitiation _links) {
    this._links = _links;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("_links")
  @NotNull

  public LinksPaymentInitiation getLinks() {
    return _links;
  }
  public void setLinks(LinksPaymentInitiation _links) {
    this._links = _links;
  }

  /**
   **/
  public PaymentInitationRequestResponse201 psuMessage(String psuMessage) {
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

  /**
   **/
  public PaymentInitationRequestResponse201 tppMessages(List<TppMessage2XX> tppMessages) {
    this.tppMessages = tppMessages;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tppMessages")

  public List<TppMessage2XX> getTppMessages() {
    return tppMessages;
  }
  public void setTppMessages(List<TppMessage2XX> tppMessages) {
    this.tppMessages = tppMessages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInitationRequestResponse201 paymentInitationRequestResponse201 = (PaymentInitationRequestResponse201) o;
    return Objects.equals(transactionStatus, paymentInitationRequestResponse201.transactionStatus) &&
        Objects.equals(paymentId, paymentInitationRequestResponse201.paymentId) &&
        Objects.equals(transactionFees, paymentInitationRequestResponse201.transactionFees) &&
        Objects.equals(currencyConversionFee, paymentInitationRequestResponse201.currencyConversionFee) &&
        Objects.equals(estimatedTotalAmount, paymentInitationRequestResponse201.estimatedTotalAmount) &&
        Objects.equals(estimatedInterbankSettlementAmount, paymentInitationRequestResponse201.estimatedInterbankSettlementAmount) &&
        Objects.equals(transactionFeeIndicator, paymentInitationRequestResponse201.transactionFeeIndicator) &&
        Objects.equals(scaMethods, paymentInitationRequestResponse201.scaMethods) &&
        Objects.equals(chosenScaMethod, paymentInitationRequestResponse201.chosenScaMethod) &&
        Objects.equals(challengeData, paymentInitationRequestResponse201.challengeData) &&
        Objects.equals(_links, paymentInitationRequestResponse201._links) &&
        Objects.equals(psuMessage, paymentInitationRequestResponse201.psuMessage) &&
        Objects.equals(tppMessages, paymentInitationRequestResponse201.tppMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionStatus, paymentId, transactionFees, currencyConversionFee, estimatedTotalAmount, estimatedInterbankSettlementAmount, transactionFeeIndicator, scaMethods, chosenScaMethod, challengeData, _links, psuMessage, tppMessages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInitationRequestResponse201 {\n");
    
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    transactionFees: ").append(toIndentedString(transactionFees)).append("\n");
    sb.append("    currencyConversionFee: ").append(toIndentedString(currencyConversionFee)).append("\n");
    sb.append("    estimatedTotalAmount: ").append(toIndentedString(estimatedTotalAmount)).append("\n");
    sb.append("    estimatedInterbankSettlementAmount: ").append(toIndentedString(estimatedInterbankSettlementAmount)).append("\n");
    sb.append("    transactionFeeIndicator: ").append(toIndentedString(transactionFeeIndicator)).append("\n");
    sb.append("    scaMethods: ").append(toIndentedString(scaMethods)).append("\n");
    sb.append("    chosenScaMethod: ").append(toIndentedString(chosenScaMethod)).append("\n");
    sb.append("    challengeData: ").append(toIndentedString(challengeData)).append("\n");
    sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
    sb.append("    psuMessage: ").append(toIndentedString(psuMessage)).append("\n");
    sb.append("    tppMessages: ").append(toIndentedString(tppMessages)).append("\n");
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
