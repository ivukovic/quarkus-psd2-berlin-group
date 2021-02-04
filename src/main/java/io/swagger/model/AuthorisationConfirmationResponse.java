package io.swagger.model;

import io.swagger.model.LinksAuthorisationConfirmation;
import io.swagger.model.ScaStatusAuthorisationConfirmation;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Body of the JSON response for an authorisation confirmation request.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "Body of the JSON response for an authorisation confirmation request.")

public class AuthorisationConfirmationResponse  implements OneOfinlineResponse2002  {
  private @Valid ScaStatusAuthorisationConfirmation scaStatus = null;
  private @Valid LinksAuthorisationConfirmation _links = null;
  private @Valid String psuMessage = null;

  /**
   **/
  public AuthorisationConfirmationResponse scaStatus(ScaStatusAuthorisationConfirmation scaStatus) {
    this.scaStatus = scaStatus;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("scaStatus")
  @NotNull

  public ScaStatusAuthorisationConfirmation getScaStatus() {
    return scaStatus;
  }
  public void setScaStatus(ScaStatusAuthorisationConfirmation scaStatus) {
    this.scaStatus = scaStatus;
  }

  /**
   **/
  public AuthorisationConfirmationResponse _links(LinksAuthorisationConfirmation _links) {
    this._links = _links;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("_links")
  @NotNull

  public LinksAuthorisationConfirmation getLinks() {
    return _links;
  }
  public void setLinks(LinksAuthorisationConfirmation _links) {
    this._links = _links;
  }

  /**
   **/
  public AuthorisationConfirmationResponse psuMessage(String psuMessage) {
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
    AuthorisationConfirmationResponse authorisationConfirmationResponse = (AuthorisationConfirmationResponse) o;
    return Objects.equals(scaStatus, authorisationConfirmationResponse.scaStatus) &&
        Objects.equals(_links, authorisationConfirmationResponse._links) &&
        Objects.equals(psuMessage, authorisationConfirmationResponse.psuMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scaStatus, _links, psuMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorisationConfirmationResponse {\n");
    
    sb.append("    scaStatus: ").append(toIndentedString(scaStatus)).append("\n");
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
