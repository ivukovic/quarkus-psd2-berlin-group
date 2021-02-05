package io.swagger.model;

import java.util.HashMap;

import javax.validation.constraints.NotNull;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.util.ObjectUtil;

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
		sb.append("    ").append(ObjectUtil.toIndentedString(super.toString())).append("\n");
		sb.append("    transactionDetails: ").append(ObjectUtil.toIndentedString(transactionDetails)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
