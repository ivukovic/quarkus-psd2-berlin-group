package io.swagger.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Body of the JSON response for a Start SCA authorisation request.
 **/
@Schema(description = "Body of the JSON response for a Start SCA authorisation request.")
public class StartScaprocessResponse {

	@Schema(required = true, description = "")
	private ScaStatus scaStatus = null;

	@Schema(required = true, description = "")
	private String authorisationId = null;

	@Schema(description = "")
	private ScaMethods scaMethods = null;

	@Schema(description = "")
	private ChosenScaMethod chosenScaMethod = null;

	@Schema(description = "")
	private ChallengeData challengeData = null;

	@Schema(required = true, description = "")
	private LinksStartScaProcess _links = null;

	@Schema(description = "")
	private String psuMessage = null;

	/**
	  * Get scaStatus
	  * @return scaStatus
	 **/
	@JsonProperty("scaStatus")
	@NotNull
	public ScaStatus getScaStatus() {
		return scaStatus;
	}

	public void setScaStatus(ScaStatus scaStatus) {
		this.scaStatus = scaStatus;
	}

	public StartScaprocessResponse scaStatus(ScaStatus scaStatus) {
		this.scaStatus = scaStatus;
		return this;
	}

	/**
	  * Get authorisationId
	  * @return authorisationId
	 **/
	@JsonProperty("authorisationId")
	@NotNull
	public String getAuthorisationId() {
		return authorisationId;
	}

	public void setAuthorisationId(String authorisationId) {
		this.authorisationId = authorisationId;
	}

	public StartScaprocessResponse authorisationId(String authorisationId) {
		this.authorisationId = authorisationId;
		return this;
	}

	/**
	  * Get scaMethods
	  * @return scaMethods
	 **/
	@JsonProperty("scaMethods")
	public ScaMethods getScaMethods() {
		return scaMethods;
	}

	public void setScaMethods(ScaMethods scaMethods) {
		this.scaMethods = scaMethods;
	}

	public StartScaprocessResponse scaMethods(ScaMethods scaMethods) {
		this.scaMethods = scaMethods;
		return this;
	}

	/**
	  * Get chosenScaMethod
	  * @return chosenScaMethod
	 **/
	@JsonProperty("chosenScaMethod")
	public ChosenScaMethod getChosenScaMethod() {
		return chosenScaMethod;
	}

	public void setChosenScaMethod(ChosenScaMethod chosenScaMethod) {
		this.chosenScaMethod = chosenScaMethod;
	}

	public StartScaprocessResponse chosenScaMethod(ChosenScaMethod chosenScaMethod) {
		this.chosenScaMethod = chosenScaMethod;
		return this;
	}

	/**
	  * Get challengeData
	  * @return challengeData
	 **/
	@JsonProperty("challengeData")
	public ChallengeData getChallengeData() {
		return challengeData;
	}

	public void setChallengeData(ChallengeData challengeData) {
		this.challengeData = challengeData;
	}

	public StartScaprocessResponse challengeData(ChallengeData challengeData) {
		this.challengeData = challengeData;
		return this;
	}

	/**
	  * Get _links
	  * @return _links
	 **/
	@JsonProperty("_links")
	@NotNull
	public LinksStartScaProcess getLinks() {
		return _links;
	}

	public void setLinks(LinksStartScaProcess _links) {
		this._links = _links;
	}

	public StartScaprocessResponse _links(LinksStartScaProcess _links) {
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

	public StartScaprocessResponse psuMessage(String psuMessage) {
		this.psuMessage = psuMessage;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class StartScaprocessResponse {\n");

		sb.append("    scaStatus: ").append(toIndentedString(scaStatus)).append("\n");
		sb.append("    authorisationId: ").append(toIndentedString(authorisationId)).append("\n");
		sb.append("    scaMethods: ").append(toIndentedString(scaMethods)).append("\n");
		sb.append("    chosenScaMethod: ").append(toIndentedString(chosenScaMethod)).append("\n");
		sb.append("    challengeData: ").append(toIndentedString(challengeData)).append("\n");
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
