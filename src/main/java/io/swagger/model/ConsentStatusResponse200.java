package io.swagger.model;

import io.swagger.model.ConsentStatus;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Body of the JSON response for a successful get status request for a consent.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "Body of the JSON response for a successful get status request for a consent.")

public class ConsentStatusResponse200   {
  private @Valid ConsentStatus consentStatus = null;
  private @Valid String psuMessage = null;

  /**
   **/
  public ConsentStatusResponse200 consentStatus(ConsentStatus consentStatus) {
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
  public ConsentStatusResponse200 psuMessage(String psuMessage) {
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
    ConsentStatusResponse200 consentStatusResponse200 = (ConsentStatusResponse200) o;
    return Objects.equals(consentStatus, consentStatusResponse200.consentStatus) &&
        Objects.equals(psuMessage, consentStatusResponse200.psuMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentStatus, psuMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsentStatusResponse200 {\n");
    
    sb.append("    consentStatus: ").append(toIndentedString(consentStatus)).append("\n");
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
