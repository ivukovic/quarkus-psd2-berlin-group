package io.swagger.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Body of the JSON response for a successful consent request.
 **/
@Schema(description = "Body of the JSON response for a successful consent request.")
public class ConsentsResponse201 {

	@Schema(required = true, description = "")
	private ConsentStatus consentStatus = null;

	@Schema(required = true, description = "")
	private String consentId = null;

	@Schema(description = "")
	private ScaMethods scaMethods = null;

	@Schema(description = "")
	private ChosenScaMethod chosenScaMethod = null;

	@Schema(description = "")
	private ChallengeData challengeData = null;

	@Schema(required = true, description = "")
	private LinksConsents _links = null;

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

	public ConsentsResponse201 consentStatus(ConsentStatus consentStatus) {
		this.consentStatus = consentStatus;
		return this;
	}

	/**
	  * Get consentId
	  * @return consentId
	 **/
	@JsonProperty("consentId")
	@NotNull
	public String getConsentId() {
		return consentId;
	}

	public void setConsentId(String consentId) {
		this.consentId = consentId;
	}

	public ConsentsResponse201 consentId(String consentId) {
		this.consentId = consentId;
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

	public ConsentsResponse201 scaMethods(ScaMethods scaMethods) {
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

	public ConsentsResponse201 chosenScaMethod(ChosenScaMethod chosenScaMethod) {
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

	public ConsentsResponse201 challengeData(ChallengeData challengeData) {
		this.challengeData = challengeData;
		return this;
	}

	/**
	  * Get _links
	  * @return _links
	 **/
	@JsonProperty("_links")
	@NotNull
	public LinksConsents getLinks() {
		return _links;
	}

	public void setLinks(LinksConsents _links) {
		this._links = _links;
	}

	public ConsentsResponse201 _links(LinksConsents _links) {
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

	public ConsentsResponse201 psuMessage(String psuMessage) {
		this.psuMessage = psuMessage;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConsentsResponse201 {\n");

		sb.append("    consentStatus: ").append(toIndentedString(consentStatus)).append("\n");
		sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
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
