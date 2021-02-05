package io.swagger.model;

import java.util.HashMap;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.util.ObjectUtil;

/**
  * A list of hyperlinks to be recognised by the TPP. The actual hyperlinks used in the  response depend on the dynamical decisions of the ASPSP when processing the request.  **Remark:** All links can be relative or full links, to be decided by the ASPSP.  Type of links admitted in this response, (further links might be added for ASPSP defined  extensions):  - 'scaRedirect':    In case of an SCA Redirect Approach, the ASPSP is transmitting the link to which to    redirect the PSU browser. - 'scaOAuth':    In case of a SCA OAuth2 Approach, the ASPSP is transmitting the URI where the configuration of the Authorisation Server can be retrieved. The configuration follows the OAuth 2.0 Authorisation Server Metadata specification. * 'confirmation':    Might be added by the ASPSP if either the \"scaRedirect\" or \"scaOAuth\" hyperlink is returned    in the same response message.    This hyperlink defines the URL to the resource which needs to be updated with      * a confirmation code as retrieved after the plain redirect authentication process with the ASPSP authentication server or     * an access token as retrieved by submitting an authorization code after the integrated OAuth based authentication process with the ASPSP authentication server. - 'updatePsuIdentification':    The link to the authorisation or cancellation authorisation sub-resource,    where PSU identification data needs to be uploaded. - 'startAuthorisationWithPsuAuthentication':   The link to the authorisation or cancellation authorisation sub-resource,    where PSU authentication data needs to be uploaded. - 'startAuthorisationWithEncryptedPsuAuthentication':     Same as startAuthorisactionWithPsuAuthentication where the authentication data need to be encrypted on      application layer in uploading. - 'selectAuthenticationMethod':   The link to the authorisation or cancellation authorisation sub-resource,    where the selected authentication method needs to be uploaded.    This link is contained under exactly the same conditions as the data element 'scaMethods'. - 'authoriseTransaction':   The link to the authorisation or cancellation authorisation sub-resource,    where the authorisation data has to be uploaded, e.g. the TOP received by SMS.  - 'scaStatus':    The link to retrieve the scaStatus of the corresponding authorisation sub-resource.  
 **/
@Schema(description = "A list of hyperlinks to be recognised by the TPP. The actual hyperlinks used in the  response depend on the dynamical decisions of the ASPSP when processing the request.  **Remark:** All links can be relative or full links, to be decided by the ASPSP.  Type of links admitted in this response, (further links might be added for ASPSP defined  extensions):  - 'scaRedirect':    In case of an SCA Redirect Approach, the ASPSP is transmitting the link to which to    redirect the PSU browser. - 'scaOAuth':    In case of a SCA OAuth2 Approach, the ASPSP is transmitting the URI where the configuration of the Authorisation Server can be retrieved. The configuration follows the OAuth 2.0 Authorisation Server Metadata specification. * 'confirmation':    Might be added by the ASPSP if either the \"scaRedirect\" or \"scaOAuth\" hyperlink is returned    in the same response message.    This hyperlink defines the URL to the resource which needs to be updated with      * a confirmation code as retrieved after the plain redirect authentication process with the ASPSP authentication server or     * an access token as retrieved by submitting an authorization code after the integrated OAuth based authentication process with the ASPSP authentication server. - 'updatePsuIdentification':    The link to the authorisation or cancellation authorisation sub-resource,    where PSU identification data needs to be uploaded. - 'startAuthorisationWithPsuAuthentication':   The link to the authorisation or cancellation authorisation sub-resource,    where PSU authentication data needs to be uploaded. - 'startAuthorisationWithEncryptedPsuAuthentication':     Same as startAuthorisactionWithPsuAuthentication where the authentication data need to be encrypted on      application layer in uploading. - 'selectAuthenticationMethod':   The link to the authorisation or cancellation authorisation sub-resource,    where the selected authentication method needs to be uploaded.    This link is contained under exactly the same conditions as the data element 'scaMethods'. - 'authoriseTransaction':   The link to the authorisation or cancellation authorisation sub-resource,    where the authorisation data has to be uploaded, e.g. the TOP received by SMS.  - 'scaStatus':    The link to retrieve the scaStatus of the corresponding authorisation sub-resource.  ")
public class LinksStartScaProcess extends HashMap<String, HrefType> {

	@Schema(description = "")
	private HrefType scaRedirect = null;

	@Schema(description = "")
	private HrefType scaOAuth = null;

	@Schema(description = "")
	private HrefType confirmation = null;

	@Schema(description = "")
	private HrefType updatePsuIdentification = null;

	@Schema(description = "")
	private HrefType startAuthorisationWithPsuAuthentication = null;

	@Schema(description = "")
	private HrefType startAuthorisationWithEncryptedPsuAuthentication = null;

	@Schema(description = "")
	private HrefType selectAuthenticationMethod = null;

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

	public LinksStartScaProcess scaRedirect(HrefType scaRedirect) {
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

	public LinksStartScaProcess scaOAuth(HrefType scaOAuth) {
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

	public LinksStartScaProcess confirmation(HrefType confirmation) {
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

	public LinksStartScaProcess updatePsuIdentification(HrefType updatePsuIdentification) {
		this.updatePsuIdentification = updatePsuIdentification;
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

	public LinksStartScaProcess startAuthorisationWithPsuAuthentication(HrefType startAuthorisationWithPsuAuthentication) {
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

	public LinksStartScaProcess startAuthorisationWithEncryptedPsuAuthentication(HrefType startAuthorisationWithEncryptedPsuAuthentication) {
		this.startAuthorisationWithEncryptedPsuAuthentication = startAuthorisationWithEncryptedPsuAuthentication;
		return this;
	}

	/**
	  * Get selectAuthenticationMethod
	  * @return selectAuthenticationMethod
	 **/
	@JsonProperty("selectAuthenticationMethod")
	public HrefType getSelectAuthenticationMethod() {
		return selectAuthenticationMethod;
	}

	public void setSelectAuthenticationMethod(HrefType selectAuthenticationMethod) {
		this.selectAuthenticationMethod = selectAuthenticationMethod;
	}

	public LinksStartScaProcess selectAuthenticationMethod(HrefType selectAuthenticationMethod) {
		this.selectAuthenticationMethod = selectAuthenticationMethod;
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

	public LinksStartScaProcess authoriseTransaction(HrefType authoriseTransaction) {
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

	public LinksStartScaProcess scaStatus(HrefType scaStatus) {
		this.scaStatus = scaStatus;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LinksStartScaProcess {\n");
		sb.append("    ").append(ObjectUtil.toIndentedString(super.toString())).append("\n");
		sb.append("    scaRedirect: ").append(ObjectUtil.toIndentedString(scaRedirect)).append("\n");
		sb.append("    scaOAuth: ").append(ObjectUtil.toIndentedString(scaOAuth)).append("\n");
		sb.append("    confirmation: ").append(ObjectUtil.toIndentedString(confirmation)).append("\n");
		sb.append("    updatePsuIdentification: ").append(ObjectUtil.toIndentedString(updatePsuIdentification)).append("\n");
		sb.append("    startAuthorisationWithPsuAuthentication: ").append(ObjectUtil.toIndentedString(startAuthorisationWithPsuAuthentication)).append("\n");
		sb.append("    startAuthorisationWithEncryptedPsuAuthentication: ").append(ObjectUtil.toIndentedString(startAuthorisationWithEncryptedPsuAuthentication)).append("\n");
		sb.append("    selectAuthenticationMethod: ").append(ObjectUtil.toIndentedString(selectAuthenticationMethod)).append("\n");
		sb.append("    authoriseTransaction: ").append(ObjectUtil.toIndentedString(authoriseTransaction)).append("\n");
		sb.append("    scaStatus: ").append(ObjectUtil.toIndentedString(scaStatus)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
