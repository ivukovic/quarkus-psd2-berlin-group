package io.swagger.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Body of the JSON response with SCA Status.
 **/
@Schema(description = "Body of the JSON response with SCA Status.")
public class ScaStatusResponse implements OneOfinlineResponse2002 {

	@Schema(required = true, description = "")
	private ScaStatus scaStatus = null;

	@Schema(description = "")
	private String psuMessage = null;

	@Schema(description = "")
	private Boolean trustedBeneficiaryFlag = null;

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

	public ScaStatusResponse scaStatus(ScaStatus scaStatus) {
		this.scaStatus = scaStatus;
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

	public ScaStatusResponse psuMessage(String psuMessage) {
		this.psuMessage = psuMessage;
		return this;
	}

	/**
	  * Get trustedBeneficiaryFlag
	  * @return trustedBeneficiaryFlag
	 **/
	@JsonProperty("trustedBeneficiaryFlag")
	public Boolean getTrustedBeneficiaryFlag() {
		return trustedBeneficiaryFlag;
	}

	public void setTrustedBeneficiaryFlag(Boolean trustedBeneficiaryFlag) {
		this.trustedBeneficiaryFlag = trustedBeneficiaryFlag;
	}

	public ScaStatusResponse trustedBeneficiaryFlag(Boolean trustedBeneficiaryFlag) {
		this.trustedBeneficiaryFlag = trustedBeneficiaryFlag;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ScaStatusResponse {\n");

		sb.append("    scaStatus: ").append(toIndentedString(scaStatus)).append("\n");
		sb.append("    psuMessage: ").append(toIndentedString(psuMessage)).append("\n");
		sb.append("    trustedBeneficiaryFlag: ").append(toIndentedString(trustedBeneficiaryFlag)).append("\n");
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
