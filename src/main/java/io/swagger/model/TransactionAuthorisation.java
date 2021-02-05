package io.swagger.model;

import javax.validation.constraints.NotNull;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Content of the body of a transaction authorisation request 
 **/
@Schema(description = "Content of the body of a transaction authorisation request ")
public class TransactionAuthorisation implements OneOfbody{

	@Schema(required = true, description = "")
	private String scaAuthenticationData = null;

	/**
	  * Get scaAuthenticationData
	  * @return scaAuthenticationData
	 **/
	@JsonProperty("scaAuthenticationData")
	@NotNull
	public String getScaAuthenticationData() {
		return scaAuthenticationData;
	}

	public void setScaAuthenticationData(String scaAuthenticationData) {
		this.scaAuthenticationData = scaAuthenticationData;
	}

	public TransactionAuthorisation scaAuthenticationData(String scaAuthenticationData) {
		this.scaAuthenticationData = scaAuthenticationData;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TransactionAuthorisation {\n");

		sb.append("    scaAuthenticationData: ").append(toIndentedString(scaAuthenticationData)).append("\n");
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
