package io.swagger.model;

import io.swagger.model.ChallengeData;
import io.swagger.model.ChosenScaMethod;
import io.swagger.model.ConsentStatus;
import io.swagger.model.LinksConsents;
import io.swagger.model.ScaMethods;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Body of the JSON response for a successful consent request.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "Body of the JSON response for a successful consent request.")

public class ConsentsResponse201   {
  private @Valid ConsentStatus consentStatus = null;
  private @Valid String consentId = null;
  private @Valid ScaMethods scaMethods = null;
  private @Valid ChosenScaMethod chosenScaMethod = null;
  private @Valid ChallengeData challengeData = null;
  private @Valid LinksConsents _links = null;
  private @Valid String psuMessage = null;

  /**
   **/
  public ConsentsResponse201 consentStatus(ConsentStatus consentStatus) {
    this.consentStatus = consentStatus;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("consentStatus")
  @NotNull

  public ConsentStatus getConsentStatus() {
    return consentStatus;
  }
  public void setConsentStatus(ConsentStatus consentStatus) {
    this.consentStatus = consentStatus;
  }

  /**
   **/
  public ConsentsResponse201 consentId(String consentId) {
    this.consentId = consentId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("consentId")
  @NotNull

  public String getConsentId() {
    return consentId;
  }
  public void setConsentId(String consentId) {
    this.consentId = consentId;
  }

  /**
   **/
  public ConsentsResponse201 scaMethods(ScaMethods scaMethods) {
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
  public ConsentsResponse201 chosenScaMethod(ChosenScaMethod chosenScaMethod) {
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
  public ConsentsResponse201 challengeData(ChallengeData challengeData) {
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
  public ConsentsResponse201 _links(LinksConsents _links) {
    this._links = _links;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("_links")
  @NotNull

  public LinksConsents getLinks() {
    return _links;
  }
  public void setLinks(LinksConsents _links) {
    this._links = _links;
  }

  /**
   **/
  public ConsentsResponse201 psuMessage(String psuMessage) {
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
    ConsentsResponse201 consentsResponse201 = (ConsentsResponse201) o;
    return Objects.equals(consentStatus, consentsResponse201.consentStatus) &&
        Objects.equals(consentId, consentsResponse201.consentId) &&
        Objects.equals(scaMethods, consentsResponse201.scaMethods) &&
        Objects.equals(chosenScaMethod, consentsResponse201.chosenScaMethod) &&
        Objects.equals(challengeData, consentsResponse201.challengeData) &&
        Objects.equals(_links, consentsResponse201._links) &&
        Objects.equals(psuMessage, consentsResponse201.psuMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentStatus, consentId, scaMethods, chosenScaMethod, challengeData, _links, psuMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsentsResponse201 {\n");
    
    sb.append("    consentStatus: ").append(toIndentedString(consentStatus)).append("\n");
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    scaMethods: ").append(toIndentedString(scaMethods)).append("\n");
    sb.append("    chosenScaMethod: ").append(toIndentedString(chosenScaMethod)).append("\n");
    sb.append("    challengeData: ").append(toIndentedString(challengeData)).append("\n");
    sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
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
