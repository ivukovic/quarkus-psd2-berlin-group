package io.swagger.model;

import javax.validation.constraints.NotNull;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InlineResponse2006 {

	@Schema(required = true, description = "")
	private TransactionDetailsBody transactionsDetails = null;

	/**
	  * Get transactionsDetails
	  * @return transactionsDetails
	 **/
	@JsonProperty("transactionsDetails")
	@NotNull
	public TransactionDetailsBody getTransactionsDetails() {
		return transactionsDetails;
	}

	public void setTransactionsDetails(TransactionDetailsBody transactionsDetails) {
		this.transactionsDetails = transactionsDetails;
	}

	public InlineResponse2006 transactionsDetails(TransactionDetailsBody transactionsDetails) {
		this.transactionsDetails = transactionsDetails;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InlineResponse2006 {\n");

		sb.append("    transactionsDetails: ").append(toIndentedString(transactionsDetails)).append("\n");
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
