package io.swagger.model;

import java.util.HashMap;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * A list of hyperlinks to be recognised by the TPP. Might be contained, if several authentication methods  are available for the PSU. Type of links admitted in this response:   * 'updateAdditionalPsuAuthentication':     The link to the payment initiation or account information resource,      which needs to be updated by an additional PSU password.      This link is only contained in rare cases,      where such additional passwords are needed for PSU authentications.   * 'updateAdditionalEncryptedPsuAuthentication':      The link to the payment initiation or account information resource,      which needs to be updated by an additional encrypted PSU password.      This link is only contained in rare cases, where such additional passwords are needed for PSU authentications.   * 'selectAuthenticationMethod':      This is a link to a resource, where the TPP can select the applicable second factor authentication      methods for the PSU, if there were several available authentication methods.      This link is only contained, if the PSU is already identified or authenticated with the first relevant      factor or alternatively an access token, if SCA is required and if the PSU has a choice between different      authentication methods.      If this link is contained, then there is also the data element 'scaMethods' contained in the response body.   * 'authoriseTransaction':      The link to the resource, where the \"Transaction authorisation request\" is sent to.      This is the link to the resource which will authorise the transaction by checking the SCA authentication      data within the Embedded SCA approach.   * 'scaStatus':      The link to retrieve the scaStatus of the corresponding authorisation sub-resource. 
 **/
@Schema(description = "A list of hyperlinks to be recognised by the TPP. Might be contained, if several authentication methods  are available for the PSU. Type of links admitted in this response:   * 'updateAdditionalPsuAuthentication':     The link to the payment initiation or account information resource,      which needs to be updated by an additional PSU password.      This link is only contained in rare cases,      where such additional passwords are needed for PSU authentications.   * 'updateAdditionalEncryptedPsuAuthentication':      The link to the payment initiation or account information resource,      which needs to be updated by an additional encrypted PSU password.      This link is only contained in rare cases, where such additional passwords are needed for PSU authentications.   * 'selectAuthenticationMethod':      This is a link to a resource, where the TPP can select the applicable second factor authentication      methods for the PSU, if there were several available authentication methods.      This link is only contained, if the PSU is already identified or authenticated with the first relevant      factor or alternatively an access token, if SCA is required and if the PSU has a choice between different      authentication methods.      If this link is contained, then there is also the data element 'scaMethods' contained in the response body.   * 'authoriseTransaction':      The link to the resource, where the \"Transaction authorisation request\" is sent to.      This is the link to the resource which will authorise the transaction by checking the SCA authentication      data within the Embedded SCA approach.   * 'scaStatus':      The link to retrieve the scaStatus of the corresponding authorisation sub-resource. ")
public class LinksUpdatePsuAuthentication extends HashMap<String, HrefType> {

	@Schema(description = "")
	private HrefType updateAdditionalPsuAuthentication = null;

	@Schema(description = "")
	private HrefType updateAdditionalEncryptedPsuAuthentication = null;

	@Schema(description = "")
	private HrefType selectAuthenticationMethod = null;

	@Schema(description = "")
	private HrefType authoriseTransaction = null;

	@Schema(description = "")
	private HrefType scaStatus = null;

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

	public LinksUpdatePsuAuthentication updateAdditionalPsuAuthentication(HrefType updateAdditionalPsuAuthentication) {
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

	public LinksUpdatePsuAuthentication updateAdditionalEncryptedPsuAuthentication(HrefType updateAdditionalEncryptedPsuAuthentication) {
		this.updateAdditionalEncryptedPsuAuthentication = updateAdditionalEncryptedPsuAuthentication;
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

	public LinksUpdatePsuAuthentication selectAuthenticationMethod(HrefType selectAuthenticationMethod) {
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

	public LinksUpdatePsuAuthentication authoriseTransaction(HrefType authoriseTransaction) {
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

	public LinksUpdatePsuAuthentication scaStatus(HrefType scaStatus) {
		this.scaStatus = scaStatus;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LinksUpdatePsuAuthentication {\n");
		sb.append("    ").append(toIndentedString(super.toString())).append("\n");
		sb.append("    updateAdditionalPsuAuthentication: ").append(toIndentedString(updateAdditionalPsuAuthentication)).append("\n");
		sb.append("    updateAdditionalEncryptedPsuAuthentication: ").append(toIndentedString(updateAdditionalEncryptedPsuAuthentication)).append("\n");
		sb.append("    selectAuthenticationMethod: ").append(toIndentedString(selectAuthenticationMethod)).append("\n");
		sb.append("    authoriseTransaction: ").append(toIndentedString(authoriseTransaction)).append("\n");
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
