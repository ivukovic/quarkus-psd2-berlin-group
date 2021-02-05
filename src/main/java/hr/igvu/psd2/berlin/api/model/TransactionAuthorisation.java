package hr.igvu.psd2.berlin.api.model;

import javax.validation.constraints.NotNull;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import hr.igvu.psd2.util.ObjectUtil;

/**
  * Content of the body of a transaction authorisation request 
 **/
@Schema(description = "Content of the body of a transaction authorisation request ")
public class TransactionAuthorisation implements OneOfbody {

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

		sb.append("    scaAuthenticationData: ").append(ObjectUtil.toIndentedString(scaAuthenticationData)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
