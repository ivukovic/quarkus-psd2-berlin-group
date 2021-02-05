package io.swagger.model;

import javax.validation.constraints.NotNull;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InlineResponse2007 {

	@Schema(required = true, description = "")
	private CardAccountDetails cardAccount = null;

	/**
	  * Get cardAccount
	  * @return cardAccount
	 **/
	@JsonProperty("cardAccount")
	@NotNull
	public CardAccountDetails getCardAccount() {
		return cardAccount;
	}

	public void setCardAccount(CardAccountDetails cardAccount) {
		this.cardAccount = cardAccount;
	}

	public InlineResponse2007 cardAccount(CardAccountDetails cardAccount) {
		this.cardAccount = cardAccount;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InlineResponse2007 {\n");

		sb.append("    cardAccount: ").append(toIndentedString(cardAccount)).append("\n");
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
