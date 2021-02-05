package io.swagger.model;

import javax.validation.constraints.NotNull;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Transaction details.
 **/
@Schema(description = "Transaction details.")
public class TransactionDetailsBody {

	@Schema(required = true, description = "")
	private Transactions transactionDetails = null;

	/**
	  * Get transactionDetails
	  * @return transactionDetails
	 **/
	@JsonProperty("transactionDetails")
	@NotNull
	public Transactions getTransactionDetails() {
		return transactionDetails;
	}

	public void setTransactionDetails(Transactions transactionDetails) {
		this.transactionDetails = transactionDetails;
	}

	public TransactionDetailsBody transactionDetails(Transactions transactionDetails) {
		this.transactionDetails = transactionDetails;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TransactionDetailsBody {\n");

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
