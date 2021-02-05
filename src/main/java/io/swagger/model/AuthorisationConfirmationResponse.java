package io.swagger.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Body of the JSON response for an authorisation confirmation request.
 **/
@Schema(description = "Body of the JSON response for an authorisation confirmation request.")
public class AuthorisationConfirmationResponse implements OneOfinlineResponse2002 {

	@Schema(required = true, description = "")
	private ScaStatusAuthorisationConfirmation scaStatus = null;

	@Schema(required = true, description = "")
	private LinksAuthorisationConfirmation _links = null;

	@Schema(description = "")
	private String psuMessage = null;

	/**
	  * Get scaStatus
	  * @return scaStatus
	 **/
	@JsonProperty("scaStatus")
	@NotNull
	public ScaStatusAuthorisationConfirmation getScaStatus() {
		return scaStatus;
	}

	public void setScaStatus(ScaStatusAuthorisationConfirmation scaStatus) {
		this.scaStatus = scaStatus;
	}

	public AuthorisationConfirmationResponse scaStatus(ScaStatusAuthorisationConfirmation scaStatus) {
		this.scaStatus = scaStatus;
		return this;
	}

	/**
	  * Get _links
	  * @return _links
	 **/
	@JsonProperty("_links")
	@NotNull
	public LinksAuthorisationConfirmation getLinks() {
		return _links;
	}

	public void setLinks(LinksAuthorisationConfirmation _links) {
		this._links = _links;
	}

	public AuthorisationConfirmationResponse _links(LinksAuthorisationConfirmation _links) {
		this._links = _links;
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

	public AuthorisationConfirmationResponse psuMessage(String psuMessage) {
		this.psuMessage = psuMessage;
		return this;
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
	private static String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
