package io.swagger.model;

import io.swagger.model.ChallengeData;
import io.swagger.model.ChosenScaMethod;
import io.swagger.model.LinksStartScaProcess;
import io.swagger.model.ScaMethods;
import io.swagger.model.ScaStatus;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Body of the JSON response for a Start SCA authorisation request.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "Body of the JSON response for a Start SCA authorisation request.")

public class StartScaprocessResponse   {
  private @Valid ScaStatus scaStatus = null;
  private @Valid String authorisationId = null;
  private @Valid ScaMethods scaMethods = null;
  private @Valid ChosenScaMethod chosenScaMethod = null;
  private @Valid ChallengeData challengeData = null;
  private @Valid LinksStartScaProcess _links = null;
  private @Valid String psuMessage = null;

  /**
   **/
  public StartScaprocessResponse scaStatus(ScaStatus scaStatus) {
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
  public StartScaprocessResponse authorisationId(String authorisationId) {
    this.authorisationId = authorisationId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("authorisationId")
  @NotNull

  public String getAuthorisationId() {
    return authorisationId;
  }
  public void setAuthorisationId(String authorisationId) {
    this.authorisationId = authorisationId;
  }

  /**
   **/
  public StartScaprocessResponse scaMethods(ScaMethods scaMethods) {
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
  public StartScaprocessResponse chosenScaMethod(ChosenScaMethod chosenScaMethod) {
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
  public StartScaprocessResponse challengeData(ChallengeData challengeData) {
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
  public StartScaprocessResponse _links(LinksStartScaProcess _links) {
    this._links = _links;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("_links")
  @NotNull

  public LinksStartScaProcess getLinks() {
    return _links;
  }
  public void setLinks(LinksStartScaProcess _links) {
    this._links = _links;
  }

  /**
   **/
  public StartScaprocessResponse psuMessage(String psuMessage) {
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
    StartScaprocessResponse startScaprocessResponse = (StartScaprocessResponse) o;
    return Objects.equals(scaStatus, startScaprocessResponse.scaStatus) &&
        Objects.equals(authorisationId, startScaprocessResponse.authorisationId) &&
        Objects.equals(scaMethods, startScaprocessResponse.scaMethods) &&
        Objects.equals(chosenScaMethod, startScaprocessResponse.chosenScaMethod) &&
        Objects.equals(challengeData, startScaprocessResponse.challengeData) &&
        Objects.equals(_links, startScaprocessResponse._links) &&
        Objects.equals(psuMessage, startScaprocessResponse.psuMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scaStatus, authorisationId, scaMethods, chosenScaMethod, challengeData, _links, psuMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartScaprocessResponse {\n");
    
    sb.append("    scaStatus: ").append(toIndentedString(scaStatus)).append("\n");
    sb.append("    authorisationId: ").append(toIndentedString(authorisationId)).append("\n");
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
