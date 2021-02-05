package hr.igvu.psd2.berlin.api.model;

import java.util.HashMap;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import hr.igvu.psd2.util.ObjectUtil;

/**
  * A list of hyperlinks to be recognised by the TPP. The actual hyperlinks used in the response depend on the  dynamical decisions of the ASPSP when processing the request.  Remark: All links can be relative or full links, to be decided by the ASPSP.  Type of links admitted in this response, (further links might be added for ASPSP defined extensions):    * 'startAuthorisation':      In case, where just the authorisation process of the cancellation needs to be started,      but no additional data needs to be updated for time being (no authentication method to be selected,      no PSU identification nor PSU authentication data to be uploaded).   * 'startAuthorisationWithPsuIdentification':      In case where a PSU identification needs to be updated when starting the cancellation authorisation:     The link to the cancellation-authorisations end-point, where the cancellation sub-resource has to be      generated while uploading the PSU identification data.   * 'startAuthorisationWithPsuAuthentication':      In case of a yet to be created authorisation sub-resource: The link to the cancalation authorisation end-point,      where the authorisation sub-resource has to be generated while uploading the PSU authentication data.   * 'startAuthorisationWithEncryptedPsuAuthentication':     Same as startAuthorisactionWithPsuAuthentication where the authentication data need to be encrypted on      application layer in uploading.   * 'startAuthorisationWithAuthenticationMethodSelection':     The link to the authorisation end-point, where the cancellation-authorisation sub-resource has to be      generated while selecting the authentication method. This link is contained under exactly the same      conditions as the data element 'scaMethods' 
 **/
@Schema(description = "A list of hyperlinks to be recognised by the TPP. The actual hyperlinks used in the response depend on the  dynamical decisions of the ASPSP when processing the request.  Remark: All links can be relative or full links, to be decided by the ASPSP.  Type of links admitted in this response, (further links might be added for ASPSP defined extensions):    * 'startAuthorisation':      In case, where just the authorisation process of the cancellation needs to be started,      but no additional data needs to be updated for time being (no authentication method to be selected,      no PSU identification nor PSU authentication data to be uploaded).   * 'startAuthorisationWithPsuIdentification':      In case where a PSU identification needs to be updated when starting the cancellation authorisation:     The link to the cancellation-authorisations end-point, where the cancellation sub-resource has to be      generated while uploading the PSU identification data.   * 'startAuthorisationWithPsuAuthentication':      In case of a yet to be created authorisation sub-resource: The link to the cancalation authorisation end-point,      where the authorisation sub-resource has to be generated while uploading the PSU authentication data.   * 'startAuthorisationWithEncryptedPsuAuthentication':     Same as startAuthorisactionWithPsuAuthentication where the authentication data need to be encrypted on      application layer in uploading.   * 'startAuthorisationWithAuthenticationMethodSelection':     The link to the authorisation end-point, where the cancellation-authorisation sub-resource has to be      generated while selecting the authentication method. This link is contained under exactly the same      conditions as the data element 'scaMethods' ")
public class LinksPaymentInitiationCancel extends HashMap<String, HrefType> {

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

	public LinksPaymentInitiationCancel startAuthorisation(HrefType startAuthorisation) {
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

	public LinksPaymentInitiationCancel startAuthorisationWithPsuIdentification(HrefType startAuthorisationWithPsuIdentification) {
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

	public LinksPaymentInitiationCancel startAuthorisationWithPsuAuthentication(HrefType startAuthorisationWithPsuAuthentication) {
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

	public LinksPaymentInitiationCancel startAuthorisationWithEncryptedPsuAuthentication(HrefType startAuthorisationWithEncryptedPsuAuthentication) {
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

	public LinksPaymentInitiationCancel startAuthorisationWithAuthenticationMethodSelection(HrefType startAuthorisationWithAuthenticationMethodSelection) {
		this.startAuthorisationWithAuthenticationMethodSelection = startAuthorisationWithAuthenticationMethodSelection;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LinksPaymentInitiationCancel {\n");
		sb.append("    ").append(ObjectUtil.toIndentedString(super.toString())).append("\n");
		sb.append("    startAuthorisation: ").append(ObjectUtil.toIndentedString(startAuthorisation)).append("\n");
		sb.append("    startAuthorisationWithPsuIdentification: ").append(ObjectUtil.toIndentedString(startAuthorisationWithPsuIdentification)).append("\n");
		sb.append("    startAuthorisationWithPsuAuthentication: ").append(ObjectUtil.toIndentedString(startAuthorisationWithPsuAuthentication)).append("\n");
		sb.append("    startAuthorisationWithEncryptedPsuAuthentication: ").append(ObjectUtil.toIndentedString(startAuthorisationWithEncryptedPsuAuthentication)).append("\n");
		sb.append("    startAuthorisationWithAuthenticationMethodSelection: ").append(ObjectUtil.toIndentedString(startAuthorisationWithAuthenticationMethodSelection)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
