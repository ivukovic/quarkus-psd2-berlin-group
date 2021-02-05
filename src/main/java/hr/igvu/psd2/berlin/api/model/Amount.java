package hr.igvu.psd2.berlin.api.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import hr.igvu.psd2.util.ObjectUtil;

public class Amount {

	@Schema(required = true, description = "")
	private String currency = null;

	@Schema(required = true, description = "")
	private String amount = null;

	/**
	  * Get currency
	  * @return currency
	 **/
	@JsonProperty("currency")
	@NotNull
	@Pattern(regexp = "[A-Z]{3}")
	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Amount currency(String currency) {
		this.currency = currency;
		return this;
	}

	/**
	  * Get amount
	  * @return amount
	 **/
	@JsonProperty("amount")
	@NotNull
	// @Pattern(regexp="-?[0-9]{1,14}(\.[0-9]{1,3})?")  
	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Amount amount(String amount) {
		this.amount = amount;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Amount {\n");

		sb.append("    currency: ").append(ObjectUtil.toIndentedString(currency)).append("\n");
		sb.append("    amount: ").append(ObjectUtil.toIndentedString(amount)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
