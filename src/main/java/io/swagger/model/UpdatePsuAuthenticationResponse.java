package io.swagger.model;

import io.swagger.model.Amount;
import io.swagger.model.ChallengeData;
import io.swagger.model.ChosenScaMethod;
import io.swagger.model.LinksUpdatePsuAuthentication;
import io.swagger.model.ScaMethods;
import io.swagger.model.ScaStatus;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Body of the JSON response for a successful update PSU authentication request.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "Body of the JSON response for a successful update PSU authentication request.")

public class UpdatePsuAuthenticationResponse  implements OneOfinlineResponse2002  {
  private @Valid Amount transactionFees = null;
  private @Valid Amount currencyConversionFees = null;
  private @Valid Amount estimatedTotalAmount = null;
  private @Valid Amount estimatedInterbankSettlementAmount = null;
  private @Valid ChosenScaMethod chosenScaMethod = null;
  private @Valid ChallengeData challengeData = null;
  private @Valid ScaMethods scaMethods = null;
  private @Valid LinksUpdatePsuAuthentication _links = null;
  private @Valid ScaStatus scaStatus = null;
  private @Valid String psuMessage = null;
  private @Valid String authorisationId = null;

  /**
   **/
  public UpdatePsuAuthenticationResponse transactionFees(Amount transactionFees) {
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
  public UpdatePsuAuthenticationResponse currencyConversionFees(Amount currencyConversionFees) {
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
  public UpdatePsuAuthenticationResponse estimatedTotalAmount(Amount estimatedTotalAmount) {
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
  public UpdatePsuAuthenticationResponse estimatedInterbankSettlementAmount(Amount estimatedInterbankSettlementAmount) {
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
  public UpdatePsuAuthenticationResponse chosenScaMethod(ChosenScaMethod chosenScaMethod) {
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
  public UpdatePsuAuthenticationResponse challengeData(ChallengeData challengeData) {
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
  public UpdatePsuAuthenticationResponse scaMethods(ScaMethods scaMethods) {
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
  public UpdatePsuAuthenticationResponse _links(LinksUpdatePsuAuthentication _links) {
    this._links = _links;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("_links")

  public LinksUpdatePsuAuthentication getLinks() {
    return _links;
  }
  public void setLinks(LinksUpdatePsuAuthentication _links) {
    this._links = _links;
  }

  /**
   **/
  public UpdatePsuAuthenticationResponse scaStatus(ScaStatus scaStatus) {
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
  public UpdatePsuAuthenticationResponse psuMessage(String psuMessage) {
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
  public UpdatePsuAuthenticationResponse authorisationId(String authorisationId) {
    this.authorisationId = authorisationId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("authorisationId")

  public String getAuthorisationId() {
    return authorisationId;
  }
  public void setAuthorisationId(String authorisationId) {
    this.authorisationId = authorisationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePsuAuthenticationResponse updatePsuAuthenticationResponse = (UpdatePsuAuthenticationResponse) o;
    return Objects.equals(transactionFees, updatePsuAuthenticationResponse.transactionFees) &&
        Objects.equals(currencyConversionFees, updatePsuAuthenticationResponse.currencyConversionFees) &&
        Objects.equals(estimatedTotalAmount, updatePsuAuthenticationResponse.estimatedTotalAmount) &&
        Objects.equals(estimatedInterbankSettlementAmount, updatePsuAuthenticationResponse.estimatedInterbankSettlementAmount) &&
        Objects.equals(chosenScaMethod, updatePsuAuthenticationResponse.chosenScaMethod) &&
        Objects.equals(challengeData, updatePsuAuthenticationResponse.challengeData) &&
        Objects.equals(scaMethods, updatePsuAuthenticationResponse.scaMethods) &&
        Objects.equals(_links, updatePsuAuthenticationResponse._links) &&
        Objects.equals(scaStatus, updatePsuAuthenticationResponse.scaStatus) &&
        Objects.equals(psuMessage, updatePsuAuthenticationResponse.psuMessage) &&
        Objects.equals(authorisationId, updatePsuAuthenticationResponse.authorisationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionFees, currencyConversionFees, estimatedTotalAmount, estimatedInterbankSettlementAmount, chosenScaMethod, challengeData, scaMethods, _links, scaStatus, psuMessage, authorisationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePsuAuthenticationResponse {\n");
    
    sb.append("    transactionFees: ").append(toIndentedString(transactionFees)).append("\n");
    sb.append("    currencyConversionFees: ").append(toIndentedString(currencyConversionFees)).append("\n");
    sb.append("    estimatedTotalAmount: ").append(toIndentedString(estimatedTotalAmount)).append("\n");
    sb.append("    estimatedInterbankSettlementAmount: ").append(toIndentedString(estimatedInterbankSettlementAmount)).append("\n");
    sb.append("    chosenScaMethod: ").append(toIndentedString(chosenScaMethod)).append("\n");
    sb.append("    challengeData: ").append(toIndentedString(challengeData)).append("\n");
    sb.append("    scaMethods: ").append(toIndentedString(scaMethods)).append("\n");
    sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
    sb.append("    scaStatus: ").append(toIndentedString(scaStatus)).append("\n");
    sb.append("    psuMessage: ").append(toIndentedString(psuMessage)).append("\n");
    sb.append("    authorisationId: ").append(toIndentedString(authorisationId)).append("\n");
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
