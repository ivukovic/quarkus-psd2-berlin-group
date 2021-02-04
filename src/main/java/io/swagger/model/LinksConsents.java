package io.swagger.model;

import io.swagger.model.HrefType;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * A list of hyperlinks to be recognised by the TPP.  Type of links admitted in this response (which might be extended by single ASPSPs as indicated in its XS2A  documentation):   * &#x27;scaRedirect&#x27;:      In case of an SCA Redirect Approach, the ASPSP is transmitting the link to which to redirect the      PSU browser.   * &#x27;scaOAuth&#x27;:      In case of an OAuth2 based Redirect Approach, the ASPSP is transmitting the link where the configuration      of the OAuth2 Server is defined.      The configuration follows the OAuth 2.0 Authorisation Server Metadata specification.  * &#x27;confirmation&#x27;:    Might be added by the ASPSP if either the \&quot;scaRedirect\&quot; or \&quot;scaOAuth\&quot; hyperlink is returned    in the same response message.    This hyperlink defines the URL to the resource which needs to be updated with      * a confirmation code as retrieved after the plain redirect authentication process with the ASPSP authentication server or     * an access token as retrieved by submitting an authorization code after the integrated OAuth based authentication process with the ASPSP authentication server.   * &#x27;startAuthorisation&#x27;:      In case, where an explicit start of the transaction authorisation is needed,      but no more data needs to be updated (no authentication method to be selected,      no PSU identification nor PSU authentication data to be uploaded).   * &#x27;startAuthorisationWithPsuIdentification&#x27;:      The link to the authorisation end-point, where the authorisation sub-resource has to be generated      while uploading the PSU identification data.   * &#x27;startAuthorisationWithPsuAuthentication&#x27;:     The link to the authorisation end-point, where the authorisation sub-resource has to be generated      while uploading the PSU authentication data.   * &#x27;startAuthorisationWithEncryptedPsuAuthentication&#x27;:     Same as startAuthorisactionWithPsuAuthentication where the authentication data need to be encrypted on      application layer in uploading.   * &#x27;startAuthorisationWithAuthenticationMethodSelection&#x27;:     The link to the authorisation end-point, where the authorisation sub-resource has to be generated      while selecting the authentication method. This link is contained under exactly the same conditions      as the data element &#x27;scaMethods&#x27;    * &#x27;startAuthorisationWithTransactionAuthorisation&#x27;:     The link to the authorisation end-point, where the authorisation sub-resource has to be generated      while authorising the transaction e.g. by uploading an OTP received by SMS.   * &#x27;self&#x27;:      The link to the Establish Account Information Consent resource created by this request.      This link can be used to retrieve the resource data.    * &#x27;status&#x27;:      The link to retrieve the status of the account information consent.   * &#x27;scaStatus&#x27;: The link to retrieve the scaStatus of the corresponding authorisation sub-resource.      This link is only contained, if an authorisation sub-resource has been already created. 
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "A list of hyperlinks to be recognised by the TPP.  Type of links admitted in this response (which might be extended by single ASPSPs as indicated in its XS2A  documentation):   * 'scaRedirect':      In case of an SCA Redirect Approach, the ASPSP is transmitting the link to which to redirect the      PSU browser.   * 'scaOAuth':      In case of an OAuth2 based Redirect Approach, the ASPSP is transmitting the link where the configuration      of the OAuth2 Server is defined.      The configuration follows the OAuth 2.0 Authorisation Server Metadata specification.  * 'confirmation':    Might be added by the ASPSP if either the \"scaRedirect\" or \"scaOAuth\" hyperlink is returned    in the same response message.    This hyperlink defines the URL to the resource which needs to be updated with      * a confirmation code as retrieved after the plain redirect authentication process with the ASPSP authentication server or     * an access token as retrieved by submitting an authorization code after the integrated OAuth based authentication process with the ASPSP authentication server.   * 'startAuthorisation':      In case, where an explicit start of the transaction authorisation is needed,      but no more data needs to be updated (no authentication method to be selected,      no PSU identification nor PSU authentication data to be uploaded).   * 'startAuthorisationWithPsuIdentification':      The link to the authorisation end-point, where the authorisation sub-resource has to be generated      while uploading the PSU identification data.   * 'startAuthorisationWithPsuAuthentication':     The link to the authorisation end-point, where the authorisation sub-resource has to be generated      while uploading the PSU authentication data.   * 'startAuthorisationWithEncryptedPsuAuthentication':     Same as startAuthorisactionWithPsuAuthentication where the authentication data need to be encrypted on      application layer in uploading.   * 'startAuthorisationWithAuthenticationMethodSelection':     The link to the authorisation end-point, where the authorisation sub-resource has to be generated      while selecting the authentication method. This link is contained under exactly the same conditions      as the data element 'scaMethods'    * 'startAuthorisationWithTransactionAuthorisation':     The link to the authorisation end-point, where the authorisation sub-resource has to be generated      while authorising the transaction e.g. by uploading an OTP received by SMS.   * 'self':      The link to the Establish Account Information Consent resource created by this request.      This link can be used to retrieve the resource data.    * 'status':      The link to retrieve the status of the account information consent.   * 'scaStatus': The link to retrieve the scaStatus of the corresponding authorisation sub-resource.      This link is only contained, if an authorisation sub-resource has been already created. ")

public class LinksConsents extends HashMap<String, HrefType>  {
  private @Valid HrefType scaRedirect = null;
  private @Valid HrefType scaOAuth = null;
  private @Valid HrefType confirmation = null;
  private @Valid HrefType startAuthorisation = null;
  private @Valid HrefType startAuthorisationWithPsuIdentification = null;
  private @Valid HrefType startAuthorisationWithPsuAuthentication = null;
  private @Valid HrefType startAuthorisationWithEncryptedPsuAuthentication = null;
  private @Valid HrefType startAuthorisationWithAuthenticationMethodSelection = null;
  private @Valid HrefType startAuthorisationWithTransactionAuthorisation = null;
  private @Valid HrefType self = null;
  private @Valid HrefType status = null;
  private @Valid HrefType scaStatus = null;

  /**
   **/
  public LinksConsents scaRedirect(HrefType scaRedirect) {
    this.scaRedirect = scaRedirect;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("scaRedirect")

  public HrefType getScaRedirect() {
    return scaRedirect;
  }
  public void setScaRedirect(HrefType scaRedirect) {
    this.scaRedirect = scaRedirect;
  }

  /**
   **/
  public LinksConsents scaOAuth(HrefType scaOAuth) {
    this.scaOAuth = scaOAuth;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("scaOAuth")

  public HrefType getScaOAuth() {
    return scaOAuth;
  }
  public void setScaOAuth(HrefType scaOAuth) {
    this.scaOAuth = scaOAuth;
  }

  /**
   **/
  public LinksConsents confirmation(HrefType confirmation) {
    this.confirmation = confirmation;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("confirmation")

  public HrefType getConfirmation() {
    return confirmation;
  }
  public void setConfirmation(HrefType confirmation) {
    this.confirmation = confirmation;
  }

  /**
   **/
  public LinksConsents startAuthorisation(HrefType startAuthorisation) {
    this.startAuthorisation = startAuthorisation;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("startAuthorisation")

  public HrefType getStartAuthorisation() {
    return startAuthorisation;
  }
  public void setStartAuthorisation(HrefType startAuthorisation) {
    this.startAuthorisation = startAuthorisation;
  }

  /**
   **/
  public LinksConsents startAuthorisationWithPsuIdentification(HrefType startAuthorisationWithPsuIdentification) {
    this.startAuthorisationWithPsuIdentification = startAuthorisationWithPsuIdentification;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("startAuthorisationWithPsuIdentification")

  public HrefType getStartAuthorisationWithPsuIdentification() {
    return startAuthorisationWithPsuIdentification;
  }
  public void setStartAuthorisationWithPsuIdentification(HrefType startAuthorisationWithPsuIdentification) {
    this.startAuthorisationWithPsuIdentification = startAuthorisationWithPsuIdentification;
  }

  /**
   **/
  public LinksConsents startAuthorisationWithPsuAuthentication(HrefType startAuthorisationWithPsuAuthentication) {
    this.startAuthorisationWithPsuAuthentication = startAuthorisationWithPsuAuthentication;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("startAuthorisationWithPsuAuthentication")

  public HrefType getStartAuthorisationWithPsuAuthentication() {
    return startAuthorisationWithPsuAuthentication;
  }
  public void setStartAuthorisationWithPsuAuthentication(HrefType startAuthorisationWithPsuAuthentication) {
    this.startAuthorisationWithPsuAuthentication = startAuthorisationWithPsuAuthentication;
  }

  /**
   **/
  public LinksConsents startAuthorisationWithEncryptedPsuAuthentication(HrefType startAuthorisationWithEncryptedPsuAuthentication) {
    this.startAuthorisationWithEncryptedPsuAuthentication = startAuthorisationWithEncryptedPsuAuthentication;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("startAuthorisationWithEncryptedPsuAuthentication")

  public HrefType getStartAuthorisationWithEncryptedPsuAuthentication() {
    return startAuthorisationWithEncryptedPsuAuthentication;
  }
  public void setStartAuthorisationWithEncryptedPsuAuthentication(HrefType startAuthorisationWithEncryptedPsuAuthentication) {
    this.startAuthorisationWithEncryptedPsuAuthentication = startAuthorisationWithEncryptedPsuAuthentication;
  }

  /**
   **/
  public LinksConsents startAuthorisationWithAuthenticationMethodSelection(HrefType startAuthorisationWithAuthenticationMethodSelection) {
    this.startAuthorisationWithAuthenticationMethodSelection = startAuthorisationWithAuthenticationMethodSelection;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("startAuthorisationWithAuthenticationMethodSelection")

  public HrefType getStartAuthorisationWithAuthenticationMethodSelection() {
    return startAuthorisationWithAuthenticationMethodSelection;
  }
  public void setStartAuthorisationWithAuthenticationMethodSelection(HrefType startAuthorisationWithAuthenticationMethodSelection) {
    this.startAuthorisationWithAuthenticationMethodSelection = startAuthorisationWithAuthenticationMethodSelection;
  }

  /**
   **/
  public LinksConsents startAuthorisationWithTransactionAuthorisation(HrefType startAuthorisationWithTransactionAuthorisation) {
    this.startAuthorisationWithTransactionAuthorisation = startAuthorisationWithTransactionAuthorisation;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("startAuthorisationWithTransactionAuthorisation")

  public HrefType getStartAuthorisationWithTransactionAuthorisation() {
    return startAuthorisationWithTransactionAuthorisation;
  }
  public void setStartAuthorisationWithTransactionAuthorisation(HrefType startAuthorisationWithTransactionAuthorisation) {
    this.startAuthorisationWithTransactionAuthorisation = startAuthorisationWithTransactionAuthorisation;
  }

  /**
   **/
  public LinksConsents self(HrefType self) {
    this.self = self;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("self")

  public HrefType getSelf() {
    return self;
  }
  public void setSelf(HrefType self) {
    this.self = self;
  }

  /**
   **/
  public LinksConsents status(HrefType status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")

  public HrefType getStatus() {
    return status;
  }
  public void setStatus(HrefType status) {
    this.status = status;
  }

  /**
   **/
  public LinksConsents scaStatus(HrefType scaStatus) {
    this.scaStatus = scaStatus;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("scaStatus")

  public HrefType getScaStatus() {
    return scaStatus;
  }
  public void setScaStatus(HrefType scaStatus) {
    this.scaStatus = scaStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinksConsents _linksConsents = (LinksConsents) o;
    return Objects.equals(scaRedirect, _linksConsents.scaRedirect) &&
        Objects.equals(scaOAuth, _linksConsents.scaOAuth) &&
        Objects.equals(confirmation, _linksConsents.confirmation) &&
        Objects.equals(startAuthorisation, _linksConsents.startAuthorisation) &&
        Objects.equals(startAuthorisationWithPsuIdentification, _linksConsents.startAuthorisationWithPsuIdentification) &&
        Objects.equals(startAuthorisationWithPsuAuthentication, _linksConsents.startAuthorisationWithPsuAuthentication) &&
        Objects.equals(startAuthorisationWithEncryptedPsuAuthentication, _linksConsents.startAuthorisationWithEncryptedPsuAuthentication) &&
        Objects.equals(startAuthorisationWithAuthenticationMethodSelection, _linksConsents.startAuthorisationWithAuthenticationMethodSelection) &&
        Objects.equals(startAuthorisationWithTransactionAuthorisation, _linksConsents.startAuthorisationWithTransactionAuthorisation) &&
        Objects.equals(self, _linksConsents.self) &&
        Objects.equals(status, _linksConsents.status) &&
        Objects.equals(scaStatus, _linksConsents.scaStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scaRedirect, scaOAuth, confirmation, startAuthorisation, startAuthorisationWithPsuIdentification, startAuthorisationWithPsuAuthentication, startAuthorisationWithEncryptedPsuAuthentication, startAuthorisationWithAuthenticationMethodSelection, startAuthorisationWithTransactionAuthorisation, self, status, scaStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinksConsents {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    scaRedirect: ").append(toIndentedString(scaRedirect)).append("\n");
    sb.append("    scaOAuth: ").append(toIndentedString(scaOAuth)).append("\n");
    sb.append("    confirmation: ").append(toIndentedString(confirmation)).append("\n");
    sb.append("    startAuthorisation: ").append(toIndentedString(startAuthorisation)).append("\n");
    sb.append("    startAuthorisationWithPsuIdentification: ").append(toIndentedString(startAuthorisationWithPsuIdentification)).append("\n");
    sb.append("    startAuthorisationWithPsuAuthentication: ").append(toIndentedString(startAuthorisationWithPsuAuthentication)).append("\n");
    sb.append("    startAuthorisationWithEncryptedPsuAuthentication: ").append(toIndentedString(startAuthorisationWithEncryptedPsuAuthentication)).append("\n");
    sb.append("    startAuthorisationWithAuthenticationMethodSelection: ").append(toIndentedString(startAuthorisationWithAuthenticationMethodSelection)).append("\n");
    sb.append("    startAuthorisationWithTransactionAuthorisation: ").append(toIndentedString(startAuthorisationWithTransactionAuthorisation)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    scaStatus: ").append(toIndentedString(scaStatus)).append("\n");
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
