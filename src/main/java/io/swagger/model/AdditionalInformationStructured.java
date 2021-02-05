package io.swagger.model;

import javax.validation.constraints.NotNull;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.util.ObjectUtil;

/**
  * Is used if and only if the bookingStatus entry equals \"information\".  Every active standing order related to the dedicated payment account result into one entry. 
 **/
@Schema(description = "Is used if and only if the bookingStatus entry equals \"information\".  Every active standing order related to the dedicated payment account result into one entry. ")
public class AdditionalInformationStructured {

	@Schema(required = true, description = "")
	private StandingOrderDetails standingOrderDetails = null;

	/**
	  * Get standingOrderDetails
	  * @return standingOrderDetails
	 **/
	@JsonProperty("standingOrderDetails")
	@NotNull
	public StandingOrderDetails getStandingOrderDetails() {
		return standingOrderDetails;
	}

	public void setStandingOrderDetails(StandingOrderDetails standingOrderDetails) {
		this.standingOrderDetails = standingOrderDetails;
	}

	public AdditionalInformationStructured standingOrderDetails(StandingOrderDetails standingOrderDetails) {
		this.standingOrderDetails = standingOrderDetails;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AdditionalInformationStructured {\n");

		sb.append("    standingOrderDetails: ").append(ObjectUtil.toIndentedString(standingOrderDetails)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
