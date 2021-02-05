package io.swagger.model;

import java.util.HashMap;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * A list of hyperlinks to be recognised by the TPP.  Type of links admitted in this response (which might be extended by single ASPSPs as indicated in its XS2A  documentation):   * 'scaRedirect':      In case of an SCA Redirect Approach, the ASPSP is transmitting the link to which to redirect the      PSU browser.   * 'scaOAuth':      In case of an OAuth2 based Redirect Approach, the ASPSP is transmitting the link where the configuration      of the OAuth2 Server is defined.      The configuration follows the OAuth 2.0 Authorisation Server Metadata specification.  * 'confirmation':    Might be added by the ASPSP if either the \"scaRedirect\" or \"scaOAuth\" hyperlink is returned    in the same response message.    This hyperlink defines the URL to the resource which needs to be updated with      * a confirmation code as retrieved after the plain redirect authentication process with the ASPSP authentication server or     * an access token as retrieved by submitting an authorization code after the integrated OAuth based authentication process with the ASPSP authentication server.   * 'startAuthorisation':      In case, where an explicit start of the transaction authorisation is needed,      but no more data needs to be updated (no authentication method to be selected,      no PSU identification nor PSU authentication data to be uploaded).   * 'startAuthorisationWithPsuIdentification':      The link to the authorisation end-point, where the authorisation sub-resource has to be generated      while uploading the PSU identification data.   * 'startAuthorisationWithPsuAuthentication':     The link to the authorisation end-point, where the authorisation sub-resource has to be generated      while uploading the PSU authentication data.   * 'startAuthorisationWithEncryptedPsuAuthentication':     Same as startAuthorisactionWithPsuAuthentication where the authentication data need to be encrypted on      application layer in uploading.   * 'startAuthorisationWithAuthenticationMethodSelection':     The link to the authorisation end-point, where the authorisation sub-resource has to be generated      while selecting the authentication method. This link is contained under exactly the same conditions      as the data element 'scaMethods'    * 'startAuthorisationWithTransactionAuthorisation':     The link to the authorisation end-point, where the authorisation sub-resource has to be generated      while authorising the transaction e.g. by uploading an OTP received by SMS.   * 'self':      The link to the Establish Account Information Consent resource created by this request.      This link can be used to retrieve the resource data.    * 'status':      The link to retrieve the status of the account information consent.   * 'scaStatus': The link to retrieve the scaStatus of the corresponding authorisation sub-resource.      This link is only contained, if an authorisation sub-resource has been already created. 
 **/
@Schema(description = "A list of hyperlinks to be recognised by the TPP.  Type of links admitted in this response (which might be extended by single ASPSPs as indicated in its XS2A  documentation):   * 'scaRedirect':      In case of an SCA Redirect Approach, the ASPSP is transmitting the link to which to redirect the      PSU browser.   * 'scaOAuth':      In case of an OAuth2 based Redirect Approach, the ASPSP is transmitting the link where the configuration      of the OAuth2 Server is defined.      The configuration follows the OAuth 2.0 Authorisation Server Metadata specification.  * 'confirmation':    Might be added by the ASPSP if either the \"scaRedirect\" or \"scaOAuth\" hyperlink is returned    in the same response message.    This hyperlink defines the URL to the resource which needs to be updated with      * a confirmation code as retrieved after the plain redirect authentication process with the ASPSP authentication server or     * an access token as retrieved by submitting an authorization code after the integrated OAuth based authentication process with the ASPSP authentication server.   * 'startAuthorisation':      In case, where an explicit start of the transaction authorisation is needed,      but no more data needs to be updated (no authentication method to be selected,      no PSU identification nor PSU authentication data to be uploaded).   * 'startAuthorisationWithPsuIdentification':      The link to the authorisation end-point, where the authorisation sub-resource has to be generated      while uploading the PSU identification data.   * 'startAuthorisationWithPsuAuthentication':     The link to the authorisation end-point, where the authorisation sub-resource has to be generated      while uploading the PSU authentication data.   * 'startAuthorisationWithEncryptedPsuAuthentication':     Same as startAuthorisactionWithPsuAuthentication where the authentication data need to be encrypted on      application layer in uploading.   * 'startAuthorisationWithAuthenticationMethodSelection':     The link to the authorisation end-point, where the authorisation sub-resource has to be generated      while selecting the authentication method. This link is contained under exactly the same conditions      as the data element 'scaMethods'    * 'startAuthorisationWithTransactionAuthorisation':     The link to the authorisation end-point, where the authorisation sub-resource has to be generated      while authorising the transaction e.g. by uploading an OTP received by SMS.   * 'self':      The link to the Establish Account Information Consent resource created by this request.      This link can be used to retrieve the resource data.    * 'status':      The link to retrieve the status of the account information consent.   * 'scaStatus': The link to retrieve the scaStatus of the corresponding authorisation sub-resource.      This link is only contained, if an authorisation sub-resource has been already created. ")
public class LinksConsents extends HashMap<String, HrefType> {

	@Schema(description = "")
	private HrefType scaRedirect = null;

	@Schema(description = "")
	private HrefType scaOAuth = null;

	@Schema(description = "")
	private HrefType confirmation = null;

	@Schema(description = "")
	private HrefType startAuthorisation = null;

	@Schema(description = "")
	private HrefType startAuthorisationWithPsuIdentification = null;

	@Schema(description = "")
	private HrefType startAuthorisationWithPsuAuthentication = null;

	@Schema(description = "")
	private HrefType startAuthorisationWithEncryptedPsuAuthentication = null;

	@Schema(description = "")
	private HrefType startAuthorisationWithAuthenticationMethodSelection = null;

	@Schema(description = "")
	private HrefType startAuthorisationWithTransactionAuthorisation = null;

	@Schema(description = "")
	private HrefType self = null;

	@Schema(description = "")
	private HrefType status = null;

	@Schema(description = "")
	private HrefType scaStatus = null;

	/**
	  * Get scaRedirect
	  * @return scaRedirect
	 **/
	@JsonProperty("scaRedirect")
	public HrefType getScaRedirect() {
		return scaRedirect;
	}

	public void setScaRedirect(HrefType scaRedirect) {
		this.scaRedirect = scaRedirect;
	}

	public LinksConsents scaRedirect(HrefType scaRedirect) {
		this.scaRedirect = scaRedirect;
		return this;
	}

	/**
	  * Get scaOAuth
	  * @return scaOAuth
	 **/
	@JsonProperty("scaOAuth")
	public HrefType getScaOAuth() {
		return scaOAuth;
	}

	public void setScaOAuth(HrefType scaOAuth) {
		this.scaOAuth = scaOAuth;
	}

	public LinksConsents scaOAuth(HrefType scaOAuth) {
		this.scaOAuth = scaOAuth;
		return this;
	}

	/**
	  * Get confirmation
	  * @return confirmation
	 **/
	@JsonProperty("confirmation")
	public HrefType getConfirmation() {
		return confirmation;
	}

	public void setConfirmation(HrefType confirmation) {
		this.confirmation = confirmation;
	}

	public LinksConsents confirmation(HrefType confirmation) {
		this.confirmation = confirmation;
		return this;
	}

	/**
	  * Get startAuthorisation
	  * @return startAuthorisation
	 **/
	@JsonProperty("startAuthorisation")
	public HrefType getStartAuthorisation() {
		return startAuthorisation;
	}

	public void setStartAuthorisation(HrefType startAuthorisation) {
		this.startAuthorisation = startAuthorisation;
	}

	public LinksConsents startAuthorisation(HrefType startAuthorisation) {
		this.startAuthorisation = startAuthorisation;
		return this;
	}

	/**
	  * Get startAuthorisationWithPsuIdentification
	  * @return startAuthorisationWithPsuIdentification
	 **/
	@JsonProperty("startAuthorisationWithPsuIdentification")
	public HrefType getStartAuthorisationWithPsuIdentification() {
		return startAuthorisationWithPsuIdentification;
	}

	public void setStartAuthorisationWithPsuIdentification(HrefType startAuthorisationWithPsuIdentification) {
		this.startAuthorisationWithPsuIdentification = startAuthorisationWithPsuIdentification;
	}

	public LinksConsents startAuthorisationWithPsuIdentification(HrefType startAuthorisationWithPsuIdentification) {
		this.startAuthorisationWithPsuIdentification = startAuthorisationWithPsuIdentification;
		return this;
	}

	/**
	  * Get startAuthorisationWithPsuAuthentication
	  * @return startAuthorisationWithPsuAuthentication
	 **/
	@JsonProperty("startAuthorisationWithPsuAuthentication")
	public HrefType getStartAuthorisationWithPsuAuthentication() {
		return startAuthorisationWithPsuAuthentication;
	}

	public void setStartAuthorisationWithPsuAuthentication(HrefType startAuthorisationWithPsuAuthentication) {
		this.startAuthorisationWithPsuAuthentication = startAuthorisationWithPsuAuthentication;
	}

	public LinksConsents startAuthorisationWithPsuAuthentication(HrefType startAuthorisationWithPsuAuthentication) {
		this.startAuthorisationWithPsuAuthentication = startAuthorisationWithPsuAuthentication;
		return this;
	}

	/**
	  * Get startAuthorisationWithEncryptedPsuAuthentication
	  * @return startAuthorisationWithEncryptedPsuAuthentication
	 **/
	@JsonProperty("startAuthorisationWithEncryptedPsuAuthentication")
	public HrefType getStartAuthorisationWithEncryptedPsuAuthentication() {
		return startAuthorisationWithEncryptedPsuAuthentication;
	}

	public void setStartAuthorisationWithEncryptedPsuAuthentication(HrefType startAuthorisationWithEncryptedPsuAuthentication) {
		this.startAuthorisationWithEncryptedPsuAuthentication = startAuthorisationWithEncryptedPsuAuthentication;
	}

	public LinksConsents startAuthorisationWithEncryptedPsuAuthentication(HrefType startAuthorisationWithEncryptedPsuAuthentication) {
		this.startAuthorisationWithEncryptedPsuAuthentication = startAuthorisationWithEncryptedPsuAuthentication;
		return this;
	}

	/**
	  * Get startAuthorisationWithAuthenticationMethodSelection
	  * @return startAuthorisationWithAuthenticationMethodSelection
	 **/
	@JsonProperty("startAuthorisationWithAuthenticationMethodSelection")
	public HrefType getStartAuthorisationWithAuthenticationMethodSelection() {
		return startAuthorisationWithAuthenticationMethodSelection;
	}

	public void setStartAuthorisationWithAuthenticationMethodSelection(HrefType startAuthorisationWithAuthenticationMethodSelection) {
		this.startAuthorisationWithAuthenticationMethodSelection = startAuthorisationWithAuthenticationMethodSelection;
	}

	public LinksConsents startAuthorisationWithAuthenticationMethodSelection(HrefType startAuthorisationWithAuthenticationMethodSelection) {
		this.startAuthorisationWithAuthenticationMethodSelection = startAuthorisationWithAuthenticationMethodSelection;
		return this;
	}

	/**
	  * Get startAuthorisationWithTransactionAuthorisation
	  * @return startAuthorisationWithTransactionAuthorisation
	 **/
	@JsonProperty("startAuthorisationWithTransactionAuthorisation")
	public HrefType getStartAuthorisationWithTransactionAuthorisation() {
		return startAuthorisationWithTransactionAuthorisation;
	}

	public void setStartAuthorisationWithTransactionAuthorisation(HrefType startAuthorisationWithTransactionAuthorisation) {
		this.startAuthorisationWithTransactionAuthorisation = startAuthorisationWithTransactionAuthorisation;
	}

	public LinksConsents startAuthorisationWithTransactionAuthorisation(HrefType startAuthorisationWithTransactionAuthorisation) {
		this.startAuthorisationWithTransactionAuthorisation = startAuthorisationWithTransactionAuthorisation;
		return this;
	}

	/**
	  * Get self
	  * @return self
	 **/
	@JsonProperty("self")
	public HrefType getSelf() {
		return self;
	}

	public void setSelf(HrefType self) {
		this.self = self;
	}

	public LinksConsents self(HrefType self) {
		this.self = self;
		return this;
	}

	/**
	  * Get status
	  * @return status
	 **/
	@JsonProperty("status")
	public HrefType getStatus() {
		return status;
	}

	public void setStatus(HrefType status) {
		this.status = status;
	}

	public LinksConsents status(HrefType status) {
		this.status = status;
		return this;
	}

	/**
	  * Get scaStatus
	  * @return scaStatus
	 **/
	@JsonProperty("scaStatus")
	public HrefType getScaStatus() {
		return scaStatus;
	}

	public void setScaStatus(HrefType scaStatus) {
		this.scaStatus = scaStatus;
	}

	public LinksConsents scaStatus(HrefType scaStatus) {
		this.scaStatus = scaStatus;
		return this;
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
	private static String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
