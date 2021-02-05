package hr.igvu.psd2.berlin.api.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import hr.igvu.psd2.util.ObjectUtil;

/**
  * Body of the JSON response for a successful get status request for a consent.
 **/
@Schema(description = "Body of the JSON response for a successful get status request for a consent.")
public class ConsentStatusResponse200 {

	@Schema(required = true, description = "")
	private ConsentStatus consentStatus = null;

	@Schema(description = "")
	private String psuMessage = null;

	/**
	  * Get consentStatus
	  * @return consentStatus
	 **/
	@JsonProperty("consentStatus")
	@NotNull
	public ConsentStatus getConsentStatus() {
		return consentStatus;
	}

	public void setConsentStatus(ConsentStatus consentStatus) {
		this.consentStatus = consentStatus;
	}

	public ConsentStatusResponse200 consentStatus(ConsentStatus consentStatus) {
		this.consentStatus = consentStatus;
		return this;
	}

	/**
	  * Get psuMessage
	  * @return psuMessage
	 **/
	@JsonProperty("psuMessage")
	@Size(max = 500)
	public String getPsuMessage() {
		return psuMessage;
	}

	public void setPsuMessage(String psuMessage) {
		this.psuMessage = psuMessage;
	}

	public ConsentStatusResponse200 psuMessage(String psuMessage) {
		this.psuMessage = psuMessage;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConsentStatusResponse200 {\n");

		sb.append("    consentStatus: ").append(ObjectUtil.toIndentedString(consentStatus)).append("\n");
		sb.append("    psuMessage: ").append(ObjectUtil.toIndentedString(psuMessage)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
