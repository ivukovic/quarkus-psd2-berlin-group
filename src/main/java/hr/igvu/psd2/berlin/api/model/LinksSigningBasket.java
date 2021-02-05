package hr.igvu.psd2.berlin.api.model;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import hr.igvu.psd2.util.ObjectUtil;

/**
  * A list of hyperlinks to be recognised by the TPP. The actual hyperlinks used in the  response depend on the dynamical decisions of the ASPSP when processing the request.  Remark: All links can be relative or full links, to be decided by the ASPSP. Type of links admitted in this response, (further links might be added for ASPSP defined  extensions):    * 'scaRedirect':      In case of an SCA Redirect Approach, the ASPSP is transmitting the link to      which to redirect the PSU browser.   * 'scaOAuth':      In case of a SCA OAuth2 Approach, the ASPSP is transmitting the URI where the configuration of      the Authorisation Server can be retrieved. The configuration follows the      OAuth 2.0 Authorisation Server Metadata specification.   * 'startAuthorisation':      In case, where an explicit start of the transaction authorisation is needed,      but no more data needs to be updated (no authentication method to be selected,      no PSU identification nor PSU authentication data to be uploaded).   * 'startAuthorisationWithPsuIdentification':      The link to the authorisation end-point, where the authorisation sub-resource      has to be generated while uploading the PSU identification data.   * 'startAuthorisationWithPsuAuthentication':     The link to the authorisation end-point, where the authorisation sub-resource      has to be generated while uploading the PSU authentication data.   * 'startAuthorisationWithEncryptedPsuAuthentication':     The link to the authorisation end-point, where the authorisation sub-resource has      to be generated while uploading the encrypted PSU authentication data.   * 'startAuthorisationWithAuthenticationMethodSelection':     The link to the authorisation end-point, where the authorisation sub-resource      has to be generated while selecting the authentication method.      This link is contained under exactly the same conditions as the data element 'scaMethods'    * 'startAuthorisationWithTransactionAuthorisation':     The link to the authorisation end-point, where the authorisation sub-resource      has to be generated while authorising the transaction e.g. by uploading an      OTP received by SMS.   * 'self':      The link to the payment initiation resource created by this request.      This link can be used to retrieve the resource data.    * 'status':      The link to retrieve the transaction status of the payment initiation.   * 'scaStatus':      The link to retrieve the scaStatus of the corresponding authorisation sub-resource.      This link is only contained, if an authorisation sub-resource has been already created. 
 **/
@Schema(description = "A list of hyperlinks to be recognised by the TPP. The actual hyperlinks used in the  response depend on the dynamical decisions of the ASPSP when processing the request.  Remark: All links can be relative or full links, to be decided by the ASPSP. Type of links admitted in this response, (further links might be added for ASPSP defined  extensions):    * 'scaRedirect':      In case of an SCA Redirect Approach, the ASPSP is transmitting the link to      which to redirect the PSU browser.   * 'scaOAuth':      In case of a SCA OAuth2 Approach, the ASPSP is transmitting the URI where the configuration of      the Authorisation Server can be retrieved. The configuration follows the      OAuth 2.0 Authorisation Server Metadata specification.   * 'startAuthorisation':      In case, where an explicit start of the transaction authorisation is needed,      but no more data needs to be updated (no authentication method to be selected,      no PSU identification nor PSU authentication data to be uploaded).   * 'startAuthorisationWithPsuIdentification':      The link to the authorisation end-point, where the authorisation sub-resource      has to be generated while uploading the PSU identification data.   * 'startAuthorisationWithPsuAuthentication':     The link to the authorisation end-point, where the authorisation sub-resource      has to be generated while uploading the PSU authentication data.   * 'startAuthorisationWithEncryptedPsuAuthentication':     The link to the authorisation end-point, where the authorisation sub-resource has      to be generated while uploading the encrypted PSU authentication data.   * 'startAuthorisationWithAuthenticationMethodSelection':     The link to the authorisation end-point, where the authorisation sub-resource      has to be generated while selecting the authentication method.      This link is contained under exactly the same conditions as the data element 'scaMethods'    * 'startAuthorisationWithTransactionAuthorisation':     The link to the authorisation end-point, where the authorisation sub-resource      has to be generated while authorising the transaction e.g. by uploading an      OTP received by SMS.   * 'self':      The link to the payment initiation resource created by this request.      This link can be used to retrieve the resource data.    * 'status':      The link to retrieve the transaction status of the payment initiation.   * 'scaStatus':      The link to retrieve the scaStatus of the corresponding authorisation sub-resource.      This link is only contained, if an authorisation sub-resource has been already created. ")
public class LinksSigningBasket {

	@Schema(description = "")
	private HrefType scaRedirect = null;

	@Schema(description = "")
	private HrefType scaOAuth = null;

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

	public LinksSigningBasket scaRedirect(HrefType scaRedirect) {
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

	public LinksSigningBasket scaOAuth(HrefType scaOAuth) {
		this.scaOAuth = scaOAuth;
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

	public LinksSigningBasket startAuthorisation(HrefType startAuthorisation) {
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

	public LinksSigningBasket startAuthorisationWithPsuIdentification(HrefType startAuthorisationWithPsuIdentification) {
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

	public LinksSigningBasket startAuthorisationWithPsuAuthentication(HrefType startAuthorisationWithPsuAuthentication) {
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

	public LinksSigningBasket startAuthorisationWithEncryptedPsuAuthentication(HrefType startAuthorisationWithEncryptedPsuAuthentication) {
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

	public LinksSigningBasket startAuthorisationWithAuthenticationMethodSelection(HrefType startAuthorisationWithAuthenticationMethodSelection) {
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

	public LinksSigningBasket startAuthorisationWithTransactionAuthorisation(HrefType startAuthorisationWithTransactionAuthorisation) {
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

	public LinksSigningBasket self(HrefType self) {
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

	public LinksSigningBasket status(HrefType status) {
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

	public LinksSigningBasket scaStatus(HrefType scaStatus) {
		this.scaStatus = scaStatus;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LinksSigningBasket {\n");

		sb.append("    scaRedirect: ").append(ObjectUtil.toIndentedString(scaRedirect)).append("\n");
		sb.append("    scaOAuth: ").append(ObjectUtil.toIndentedString(scaOAuth)).append("\n");
		sb.append("    startAuthorisation: ").append(ObjectUtil.toIndentedString(startAuthorisation)).append("\n");
		sb.append("    startAuthorisationWithPsuIdentification: ").append(ObjectUtil.toIndentedString(startAuthorisationWithPsuIdentification)).append("\n");
		sb.append("    startAuthorisationWithPsuAuthentication: ").append(ObjectUtil.toIndentedString(startAuthorisationWithPsuAuthentication)).append("\n");
		sb.append("    startAuthorisationWithEncryptedPsuAuthentication: ").append(ObjectUtil.toIndentedString(startAuthorisationWithEncryptedPsuAuthentication)).append("\n");
		sb.append("    startAuthorisationWithAuthenticationMethodSelection: ").append(ObjectUtil.toIndentedString(startAuthorisationWithAuthenticationMethodSelection)).append("\n");
		sb.append("    startAuthorisationWithTransactionAuthorisation: ").append(ObjectUtil.toIndentedString(startAuthorisationWithTransactionAuthorisation)).append("\n");
		sb.append("    self: ").append(ObjectUtil.toIndentedString(self)).append("\n");
		sb.append("    status: ").append(ObjectUtil.toIndentedString(status)).append("\n");
		sb.append("    scaStatus: ").append(ObjectUtil.toIndentedString(scaStatus)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
