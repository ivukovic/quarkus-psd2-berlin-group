package io.swagger.model;

import java.util.HashMap;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.util.ObjectUtil;

/**
  * A list of hyperlinks to be recognised by the TPP. The actual hyperlinks used in  the response depend on the dynamical decisions of the ASPSP when processing the request.  **Remark:** All links can be relative or full links, to be decided by the ASPSP.   **Remark:** This method can be applied before or after PSU identification.  This leads to many possible hyperlink responses. Type of links admitted in this response, (further links might be added for ASPSP defined  extensions):  - 'scaRedirect':    In case of an SCA Redirect Approach, the ASPSP is transmitting the link to which to    redirect the PSU browser. - 'scaOAuth':    In case of a SCA OAuth2 Approach, the ASPSP is transmitting the URI where the    configuration of the Authorisation Server can be retrieved.    The configuration follows the OAuth 2.0 Authorisation Server Metadata specification. * 'confirmation':    Might be added by the ASPSP if either the \"scaRedirect\" or \"scaOAuth\" hyperlink is returned    in the same response message.    This hyperlink defines the URL to the resource which needs to be updated with      * a confirmation code as retrieved after the plain redirect authentication process with the ASPSP authentication server or     * an access token as retrieved by submitting an authorization code after the integrated OAuth based authentication process with the ASPSP authentication server. - 'updatePsuIdentification':    The link to the authorisation or cancellation authorisation sub-resource,    where PSU identification data needs to be uploaded. - 'updatePsuAuthentication':   The link to the authorisation or cancellation authorisation sub-resource,    where PSU authentication data needs to be uploaded.   - 'updateEncryptedPsuAuthentication':   The link to the authorisation or cancellation authorisation sub-resource,    where PSU authentication encrypted data needs to be uploaded. - 'updateAdditionalPsuAuthentication':     The link to the payment initiation or account information resource,      which needs to be updated by an additional PSU password.  - 'updateAdditionalEncryptedPsuAuthentication':      The link to the payment initiation or account information resource,      which needs to be updated by an additional encrypted PSU password.  - 'authoriseTransaction':   The link to the authorisation or cancellation authorisation sub-resource,    where the authorisation data has to be uploaded, e.g. the TOP received by SMS.  - 'scaStatus':    The link to retrieve the scaStatus of the corresponding authorisation sub-resource. 
 **/
@Schema(description = "A list of hyperlinks to be recognised by the TPP. The actual hyperlinks used in  the response depend on the dynamical decisions of the ASPSP when processing the request.  **Remark:** All links can be relative or full links, to be decided by the ASPSP.   **Remark:** This method can be applied before or after PSU identification.  This leads to many possible hyperlink responses. Type of links admitted in this response, (further links might be added for ASPSP defined  extensions):  - 'scaRedirect':    In case of an SCA Redirect Approach, the ASPSP is transmitting the link to which to    redirect the PSU browser. - 'scaOAuth':    In case of a SCA OAuth2 Approach, the ASPSP is transmitting the URI where the    configuration of the Authorisation Server can be retrieved.    The configuration follows the OAuth 2.0 Authorisation Server Metadata specification. * 'confirmation':    Might be added by the ASPSP if either the \"scaRedirect\" or \"scaOAuth\" hyperlink is returned    in the same response message.    This hyperlink defines the URL to the resource which needs to be updated with      * a confirmation code as retrieved after the plain redirect authentication process with the ASPSP authentication server or     * an access token as retrieved by submitting an authorization code after the integrated OAuth based authentication process with the ASPSP authentication server. - 'updatePsuIdentification':    The link to the authorisation or cancellation authorisation sub-resource,    where PSU identification data needs to be uploaded. - 'updatePsuAuthentication':   The link to the authorisation or cancellation authorisation sub-resource,    where PSU authentication data needs to be uploaded.   - 'updateEncryptedPsuAuthentication':   The link to the authorisation or cancellation authorisation sub-resource,    where PSU authentication encrypted data needs to be uploaded. - 'updateAdditionalPsuAuthentication':     The link to the payment initiation or account information resource,      which needs to be updated by an additional PSU password.  - 'updateAdditionalEncryptedPsuAuthentication':      The link to the payment initiation or account information resource,      which needs to be updated by an additional encrypted PSU password.  - 'authoriseTransaction':   The link to the authorisation or cancellation authorisation sub-resource,    where the authorisation data has to be uploaded, e.g. the TOP received by SMS.  - 'scaStatus':    The link to retrieve the scaStatus of the corresponding authorisation sub-resource. ")
public class LinksSelectPsuAuthenticationMethod extends HashMap<String, HrefType> {

	@Schema(description = "")
	private HrefType scaRedirect = null;

	@Schema(description = "")
	private HrefType scaOAuth = null;

	@Schema(description = "")
	private HrefType confirmation = null;

	@Schema(description = "")
	private HrefType updatePsuIdentification = null;

	@Schema(description = "")
	private HrefType updatePsuAuthentication = null;

	@Schema(description = "")
	private HrefType updateAdditionalPsuAuthentication = null;

	@Schema(description = "")
	private HrefType updateAdditionalEncryptedPsuAuthentication = null;

	@Schema(description = "")
	private HrefType authoriseTransaction = null;

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

	public LinksSelectPsuAuthenticationMethod scaRedirect(HrefType scaRedirect) {
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

	public LinksSelectPsuAuthenticationMethod scaOAuth(HrefType scaOAuth) {
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

	public LinksSelectPsuAuthenticationMethod confirmation(HrefType confirmation) {
		this.confirmation = confirmation;
		return this;
	}

	/**
	  * Get updatePsuIdentification
	  * @return updatePsuIdentification
	 **/
	@JsonProperty("updatePsuIdentification")
	public HrefType getUpdatePsuIdentification() {
		return updatePsuIdentification;
	}

	public void setUpdatePsuIdentification(HrefType updatePsuIdentification) {
		this.updatePsuIdentification = updatePsuIdentification;
	}

	public LinksSelectPsuAuthenticationMethod updatePsuIdentification(HrefType updatePsuIdentification) {
		this.updatePsuIdentification = updatePsuIdentification;
		return this;
	}

	/**
	  * Get updatePsuAuthentication
	  * @return updatePsuAuthentication
	 **/
	@JsonProperty("updatePsuAuthentication")
	public HrefType getUpdatePsuAuthentication() {
		return updatePsuAuthentication;
	}

	public void setUpdatePsuAuthentication(HrefType updatePsuAuthentication) {
		this.updatePsuAuthentication = updatePsuAuthentication;
	}

	public LinksSelectPsuAuthenticationMethod updatePsuAuthentication(HrefType updatePsuAuthentication) {
		this.updatePsuAuthentication = updatePsuAuthentication;
		return this;
	}

	/**
	  * Get updateAdditionalPsuAuthentication
	  * @return updateAdditionalPsuAuthentication
	 **/
	@JsonProperty("updateAdditionalPsuAuthentication")
	public HrefType getUpdateAdditionalPsuAuthentication() {
		return updateAdditionalPsuAuthentication;
	}

	public void setUpdateAdditionalPsuAuthentication(HrefType updateAdditionalPsuAuthentication) {
		this.updateAdditionalPsuAuthentication = updateAdditionalPsuAuthentication;
	}

	public LinksSelectPsuAuthenticationMethod updateAdditionalPsuAuthentication(HrefType updateAdditionalPsuAuthentication) {
		this.updateAdditionalPsuAuthentication = updateAdditionalPsuAuthentication;
		return this;
	}

	/**
	  * Get updateAdditionalEncryptedPsuAuthentication
	  * @return updateAdditionalEncryptedPsuAuthentication
	 **/
	@JsonProperty("updateAdditionalEncryptedPsuAuthentication")
	public HrefType getUpdateAdditionalEncryptedPsuAuthentication() {
		return updateAdditionalEncryptedPsuAuthentication;
	}

	public void setUpdateAdditionalEncryptedPsuAuthentication(HrefType updateAdditionalEncryptedPsuAuthentication) {
		this.updateAdditionalEncryptedPsuAuthentication = updateAdditionalEncryptedPsuAuthentication;
	}

	public LinksSelectPsuAuthenticationMethod updateAdditionalEncryptedPsuAuthentication(HrefType updateAdditionalEncryptedPsuAuthentication) {
		this.updateAdditionalEncryptedPsuAuthentication = updateAdditionalEncryptedPsuAuthentication;
		return this;
	}

	/**
	  * Get authoriseTransaction
	  * @return authoriseTransaction
	 **/
	@JsonProperty("authoriseTransaction")
	public HrefType getAuthoriseTransaction() {
		return authoriseTransaction;
	}

	public void setAuthoriseTransaction(HrefType authoriseTransaction) {
		this.authoriseTransaction = authoriseTransaction;
	}

	public LinksSelectPsuAuthenticationMethod authoriseTransaction(HrefType authoriseTransaction) {
		this.authoriseTransaction = authoriseTransaction;
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

	public LinksSelectPsuAuthenticationMethod scaStatus(HrefType scaStatus) {
		this.scaStatus = scaStatus;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LinksSelectPsuAuthenticationMethod {\n");
		sb.append("    ").append(ObjectUtil.toIndentedString(super.toString())).append("\n");
		sb.append("    scaRedirect: ").append(ObjectUtil.toIndentedString(scaRedirect)).append("\n");
		sb.append("    scaOAuth: ").append(ObjectUtil.toIndentedString(scaOAuth)).append("\n");
		sb.append("    confirmation: ").append(ObjectUtil.toIndentedString(confirmation)).append("\n");
		sb.append("    updatePsuIdentification: ").append(ObjectUtil.toIndentedString(updatePsuIdentification)).append("\n");
		sb.append("    updatePsuAuthentication: ").append(ObjectUtil.toIndentedString(updatePsuAuthentication)).append("\n");
		sb.append("    updateAdditionalPsuAuthentication: ").append(ObjectUtil.toIndentedString(updateAdditionalPsuAuthentication)).append("\n");
		sb.append("    updateAdditionalEncryptedPsuAuthentication: ").append(ObjectUtil.toIndentedString(updateAdditionalEncryptedPsuAuthentication)).append("\n");
		sb.append("    authoriseTransaction: ").append(ObjectUtil.toIndentedString(authoriseTransaction)).append("\n");
		sb.append("    scaStatus: ").append(ObjectUtil.toIndentedString(scaStatus)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
