package io.swagger.model;

import javax.validation.constraints.NotNull;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.util.ObjectUtil;

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

		sb.append("    transactionsDetails: ").append(ObjectUtil.toIndentedString(transactionsDetails)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
