package io.swagger.model;

import java.util.HashMap;

import javax.validation.constraints.NotNull;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LinksTransactionDetails extends HashMap<String, HrefType> {

	@Schema(required = true, description = "")
	private HrefType transactionDetails = null;

	/**
	  * Get transactionDetails
	  * @return transactionDetails
	 **/
	@JsonProperty("transactionDetails")
	@NotNull
	public HrefType getTransactionDetails() {
		return transactionDetails;
	}

	public void setTransactionDetails(HrefType transactionDetails) {
		this.transactionDetails = transactionDetails;
	}

	public LinksTransactionDetails transactionDetails(HrefType transactionDetails) {
		this.transactionDetails = transactionDetails;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LinksTransactionDetails {\n");
		sb.append("    ").append(toIndentedString(super.toString())).append("\n");
		sb.append("    transactionDetails: ").append(toIndentedString(transactionDetails)).append("\n");
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
