package io.swagger.model;

import javax.validation.constraints.NotNull;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Equals \"true\" if sufficient funds are available at the time of the request,  \"false\" otherwise. 
 **/
@Schema(description = "Equals \"true\" if sufficient funds are available at the time of the request,  \"false\" otherwise. ")
public class InlineResponse2008 {

	@Schema(required = true, description = "")
	private Boolean fundsAvailable = null;

	/**
	  * Get fundsAvailable
	  * @return fundsAvailable
	 **/
	@JsonProperty("fundsAvailable")
	@NotNull
	public Boolean getFundsAvailable() {
		return fundsAvailable;
	}

	public void setFundsAvailable(Boolean fundsAvailable) {
		this.fundsAvailable = fundsAvailable;
	}

	public InlineResponse2008 fundsAvailable(Boolean fundsAvailable) {
		this.fundsAvailable = fundsAvailable;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InlineResponse2008 {\n");

		sb.append("    fundsAvailable: ").append(toIndentedString(fundsAvailable)).append("\n");
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
