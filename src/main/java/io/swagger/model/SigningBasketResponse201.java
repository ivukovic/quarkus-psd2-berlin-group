package io.swagger.model;

import io.swagger.model.ChallengeData;
import io.swagger.model.ChosenScaMethod;
import io.swagger.model.LinksSigningBasket;
import io.swagger.model.ScaMethods;
import io.swagger.model.TppMessage2XX;
import io.swagger.model.TransactionStatusSBS;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Body of the JSON response for a successful create signing basket request.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "Body of the JSON response for a successful create signing basket request.")

public class SigningBasketResponse201   {
  private @Valid TransactionStatusSBS transactionStatus = null;
  private @Valid String basketId = null;
  private @Valid ScaMethods scaMethods = null;
  private @Valid ChosenScaMethod chosenScaMethod = null;
  private @Valid ChallengeData challengeData = null;
  private @Valid LinksSigningBasket _links = null;
  private @Valid String psuMessage = null;
  private @Valid List<TppMessage2XX> tppMessages = new ArrayList<TppMessage2XX>();

  /**
   **/
  public SigningBasketResponse201 transactionStatus(TransactionStatusSBS transactionStatus) {
    this.transactionStatus = transactionStatus;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("transactionStatus")
  @NotNull

  public TransactionStatusSBS getTransactionStatus() {
    return transactionStatus;
  }
  public void setTransactionStatus(TransactionStatusSBS transactionStatus) {
    this.transactionStatus = transactionStatus;
  }

  /**
   **/
  public SigningBasketResponse201 basketId(String basketId) {
    this.basketId = basketId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("basketId")
  @NotNull

  public String getBasketId() {
    return basketId;
  }
  public void setBasketId(String basketId) {
    this.basketId = basketId;
  }

  /**
   **/
  public SigningBasketResponse201 scaMethods(ScaMethods scaMethods) {
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
  public SigningBasketResponse201 chosenScaMethod(ChosenScaMethod chosenScaMethod) {
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
  public SigningBasketResponse201 challengeData(ChallengeData challengeData) {
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
  public SigningBasketResponse201 _links(LinksSigningBasket _links) {
    this._links = _links;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("_links")
  @NotNull

  public LinksSigningBasket getLinks() {
    return _links;
  }
  public void setLinks(LinksSigningBasket _links) {
    this._links = _links;
  }

  /**
   **/
  public SigningBasketResponse201 psuMessage(String psuMessage) {
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
  public SigningBasketResponse201 tppMessages(List<TppMessage2XX> tppMessages) {
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
    SigningBasketResponse201 signingBasketResponse201 = (SigningBasketResponse201) o;
    return Objects.equals(transactionStatus, signingBasketResponse201.transactionStatus) &&
        Objects.equals(basketId, signingBasketResponse201.basketId) &&
        Objects.equals(scaMethods, signingBasketResponse201.scaMethods) &&
        Objects.equals(chosenScaMethod, signingBasketResponse201.chosenScaMethod) &&
        Objects.equals(challengeData, signingBasketResponse201.challengeData) &&
        Objects.equals(_links, signingBasketResponse201._links) &&
        Objects.equals(psuMessage, signingBasketResponse201.psuMessage) &&
        Objects.equals(tppMessages, signingBasketResponse201.tppMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionStatus, basketId, scaMethods, chosenScaMethod, challengeData, _links, psuMessage, tppMessages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SigningBasketResponse201 {\n");
    
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    basketId: ").append(toIndentedString(basketId)).append("\n");
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
