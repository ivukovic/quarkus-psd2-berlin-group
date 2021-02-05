package io.swagger.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.util.ObjectUtil;

/**
  * Body of the response for a successful payment initiation status request in case of an JSON based endpoint.
 **/
@Schema(description = "Body of the response for a successful payment initiation status request in case of an JSON based endpoint.")
public class PaymentInitiationStatusResponse200Json {

	@Schema(required = true, description = "")
	private TransactionStatus transactionStatus = null;

	@Schema(description = "")
	private Boolean fundsAvailable = null;

	@Schema(description = "")
	private String psuMessage = null;

	/**
	  * Get transactionStatus
	  * @return transactionStatus
	 **/
	@JsonProperty("transactionStatus")
	@NotNull
	public TransactionStatus getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(TransactionStatus transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public PaymentInitiationStatusResponse200Json transactionStatus(TransactionStatus transactionStatus) {
		this.transactionStatus = transactionStatus;
		return this;
	}

	/**
	  * Get fundsAvailable
	  * @return fundsAvailable
	 **/
	@JsonProperty("fundsAvailable")
	public Boolean getFundsAvailable() {
		return fundsAvailable;
	}

	public void setFundsAvailable(Boolean fundsAvailable) {
		this.fundsAvailable = fundsAvailable;
	}

	public PaymentInitiationStatusResponse200Json fundsAvailable(Boolean fundsAvailable) {
		this.fundsAvailable = fundsAvailable;
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

	public PaymentInitiationStatusResponse200Json psuMessage(String psuMessage) {
		this.psuMessage = psuMessage;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PaymentInitiationStatusResponse200Json {\n");

		sb.append("    transactionStatus: ").append(ObjectUtil.toIndentedString(transactionStatus)).append("\n");
		sb.append("    fundsAvailable: ").append(ObjectUtil.toIndentedString(fundsAvailable)).append("\n");
		sb.append("    psuMessage: ").append(ObjectUtil.toIndentedString(psuMessage)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
