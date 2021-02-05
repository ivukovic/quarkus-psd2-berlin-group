package io.swagger.model;

import javax.validation.constraints.NotNull;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.util.ObjectUtil;

public class SigningBasketStatusResponse200 {

	@Schema(required = true, description = "")
	private TransactionStatusSBS transactionStatus = null;

	/**
	  * Get transactionStatus
	  * @return transactionStatus
	 **/
	@JsonProperty("transactionStatus")
	@NotNull
	public TransactionStatusSBS getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(TransactionStatusSBS transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public SigningBasketStatusResponse200 transactionStatus(TransactionStatusSBS transactionStatus) {
		this.transactionStatus = transactionStatus;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SigningBasketStatusResponse200 {\n");

		sb.append("    transactionStatus: ").append(ObjectUtil.toIndentedString(transactionStatus)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
