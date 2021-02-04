package io.swagger.model;

import io.swagger.model.Amount;
import io.swagger.model.LinksUpdatePsuIdentification;
import io.swagger.model.ScaMethods;
import io.swagger.model.ScaStatus;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Body of the JSON response for a successful update PSU identification request.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "Body of the JSON response for a successful update PSU identification request.")

public class UpdatePsuIdenticationResponse  implements OneOfinlineResponse2002  {
  private @Valid Amount transactionFees = null;
  private @Valid Amount currencyConversionFees = null;
  private @Valid Amount estimatedTotalAmount = null;
  private @Valid Amount estimatedInterbankSettlementAmount = null;
  private @Valid ScaMethods scaMethods = null;
  private @Valid LinksUpdatePsuIdentification _links = null;
  private @Valid ScaStatus scaStatus = null;
  private @Valid String psuMessage = null;

  /**
   **/
  public UpdatePsuIdenticationResponse transactionFees(Amount transactionFees) {
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
  public UpdatePsuIdenticationResponse currencyConversionFees(Amount currencyConversionFees) {
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
  public UpdatePsuIdenticationResponse estimatedTotalAmount(Amount estimatedTotalAmount) {
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
  public UpdatePsuIdenticationResponse estimatedInterbankSettlementAmount(Amount estimatedInterbankSettlementAmount) {
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
  public UpdatePsuIdenticationResponse scaMethods(ScaMethods scaMethods) {
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
  public UpdatePsuIdenticationResponse _links(LinksUpdatePsuIdentification _links) {
    this._links = _links;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("_links")
  @NotNull

  public LinksUpdatePsuIdentification getLinks() {
    return _links;
  }
  public void setLinks(LinksUpdatePsuIdentification _links) {
    this._links = _links;
  }

  /**
   **/
  public UpdatePsuIdenticationResponse scaStatus(ScaStatus scaStatus) {
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
  public UpdatePsuIdenticationResponse psuMessage(String psuMessage) {
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
    UpdatePsuIdenticationResponse updatePsuIdenticationResponse = (UpdatePsuIdenticationResponse) o;
    return Objects.equals(transactionFees, updatePsuIdenticationResponse.transactionFees) &&
        Objects.equals(currencyConversionFees, updatePsuIdenticationResponse.currencyConversionFees) &&
        Objects.equals(estimatedTotalAmount, updatePsuIdenticationResponse.estimatedTotalAmount) &&
        Objects.equals(estimatedInterbankSettlementAmount, updatePsuIdenticationResponse.estimatedInterbankSettlementAmount) &&
        Objects.equals(scaMethods, updatePsuIdenticationResponse.scaMethods) &&
        Objects.equals(_links, updatePsuIdenticationResponse._links) &&
        Objects.equals(scaStatus, updatePsuIdenticationResponse.scaStatus) &&
        Objects.equals(psuMessage, updatePsuIdenticationResponse.psuMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionFees, currencyConversionFees, estimatedTotalAmount, estimatedInterbankSettlementAmount, scaMethods, _links, scaStatus, psuMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePsuIdenticationResponse {\n");
    
    sb.append("    transactionFees: ").append(toIndentedString(transactionFees)).append("\n");
    sb.append("    currencyConversionFees: ").append(toIndentedString(currencyConversionFees)).append("\n");
    sb.append("    estimatedTotalAmount: ").append(toIndentedString(estimatedTotalAmount)).append("\n");
    sb.append("    estimatedInterbankSettlementAmount: ").append(toIndentedString(estimatedInterbankSettlementAmount)).append("\n");
    sb.append("    scaMethods: ").append(toIndentedString(scaMethods)).append("\n");
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
