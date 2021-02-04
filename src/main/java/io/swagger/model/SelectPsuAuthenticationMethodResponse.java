package io.swagger.model;

import io.swagger.model.Amount;
import io.swagger.model.ChallengeData;
import io.swagger.model.ChosenScaMethod;
import io.swagger.model.LinksSelectPsuAuthenticationMethod;
import io.swagger.model.ScaStatus;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Body of the JSON response for a successful select PSU authentication method request.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "Body of the JSON response for a successful select PSU authentication method request.")

public class SelectPsuAuthenticationMethodResponse  implements OneOfinlineResponse2002  {
  private @Valid Amount transactionFees = null;
  private @Valid Amount currencyConversionFees = null;
  private @Valid Amount estimatedTotalAmount = null;
  private @Valid Amount estimatedInterbankSettlementAmount = null;
  private @Valid ChosenScaMethod chosenScaMethod = null;
  private @Valid ChallengeData challengeData = null;
  private @Valid LinksSelectPsuAuthenticationMethod _links = null;
  private @Valid ScaStatus scaStatus = null;
  private @Valid String psuMessage = null;

  /**
   **/
  public SelectPsuAuthenticationMethodResponse transactionFees(Amount transactionFees) {
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
  public SelectPsuAuthenticationMethodResponse currencyConversionFees(Amount currencyConversionFees) {
    this.currencyConversionFees = currencyConversionFees;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("currencyConversionFees")

  public Amount getCurrencyConversionFees() {
    return currencyConversionFees;
  }
  public void setCurrencyConversionFees(Amount currencyConversionFees) {
    this.currencyConversionFees = currencyConversionFees;
  }

  /**
   **/
  public SelectPsuAuthenticationMethodResponse estimatedTotalAmount(Amount estimatedTotalAmount) {
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
  public SelectPsuAuthenticationMethodResponse estimatedInterbankSettlementAmount(Amount estimatedInterbankSettlementAmount) {
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
  public SelectPsuAuthenticationMethodResponse chosenScaMethod(ChosenScaMethod chosenScaMethod) {
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
  public SelectPsuAuthenticationMethodResponse challengeData(ChallengeData challengeData) {
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
  public SelectPsuAuthenticationMethodResponse _links(LinksSelectPsuAuthenticationMethod _links) {
    this._links = _links;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("_links")

  public LinksSelectPsuAuthenticationMethod getLinks() {
    return _links;
  }
  public void setLinks(LinksSelectPsuAuthenticationMethod _links) {
    this._links = _links;
  }

  /**
   **/
  public SelectPsuAuthenticationMethodResponse scaStatus(ScaStatus scaStatus) {
    this.scaStatus = scaStatus;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("scaStatus")
  @NotNull

  public ScaStatus getScaStatus() {
    return scaStatus;
  }
  public void setScaStatus(ScaStatus scaStatus) {
    this.scaStatus = scaStatus;
  }

  /**
   **/
  public SelectPsuAuthenticationMethodResponse psuMessage(String psuMessage) {
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
    SelectPsuAuthenticationMethodResponse selectPsuAuthenticationMethodResponse = (SelectPsuAuthenticationMethodResponse) o;
    return Objects.equals(transactionFees, selectPsuAuthenticationMethodResponse.transactionFees) &&
        Objects.equals(currencyConversionFees, selectPsuAuthenticationMethodResponse.currencyConversionFees) &&
        Objects.equals(estimatedTotalAmount, selectPsuAuthenticationMethodResponse.estimatedTotalAmount) &&
        Objects.equals(estimatedInterbankSettlementAmount, selectPsuAuthenticationMethodResponse.estimatedInterbankSettlementAmount) &&
        Objects.equals(chosenScaMethod, selectPsuAuthenticationMethodResponse.chosenScaMethod) &&
        Objects.equals(challengeData, selectPsuAuthenticationMethodResponse.challengeData) &&
        Objects.equals(_links, selectPsuAuthenticationMethodResponse._links) &&
        Objects.equals(scaStatus, selectPsuAuthenticationMethodResponse.scaStatus) &&
        Objects.equals(psuMessage, selectPsuAuthenticationMethodResponse.psuMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionFees, currencyConversionFees, estimatedTotalAmount, estimatedInterbankSettlementAmount, chosenScaMethod, challengeData, _links, scaStatus, psuMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelectPsuAuthenticationMethodResponse {\n");
    
    sb.append("    transactionFees: ").append(toIndentedString(transactionFees)).append("\n");
    sb.append("    currencyConversionFees: ").append(toIndentedString(currencyConversionFees)).append("\n");
    sb.append("    estimatedTotalAmount: ").append(toIndentedString(estimatedTotalAmount)).append("\n");
    sb.append("    estimatedInterbankSettlementAmount: ").append(toIndentedString(estimatedInterbankSettlementAmount)).append("\n");
    sb.append("    chosenScaMethod: ").append(toIndentedString(chosenScaMethod)).append("\n");
    sb.append("    challengeData: ").append(toIndentedString(challengeData)).append("\n");
    sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
    sb.append("    scaStatus: ").append(toIndentedString(scaStatus)).append("\n");
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
