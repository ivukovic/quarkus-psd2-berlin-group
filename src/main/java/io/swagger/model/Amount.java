package io.swagger.model;

import javax.validation.constraints.*;

import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;

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

		sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
		sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
