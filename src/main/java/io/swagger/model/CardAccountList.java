package io.swagger.model;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * List of card accounts with details. 
 **/
@Schema(description = "List of card accounts with details. ")
public class CardAccountList {

	@Schema(required = true, description = "")
	private List<CardAccountDetails> cardAccounts = new ArrayList<CardAccountDetails>();

	/**
	  * Get cardAccounts
	  * @return cardAccounts
	 **/
	@JsonProperty("cardAccounts")
	@NotNull
	public List<CardAccountDetails> getCardAccounts() {
		return cardAccounts;
	}

	public void setCardAccounts(List<CardAccountDetails> cardAccounts) {
		this.cardAccounts = cardAccounts;
	}

	public CardAccountList cardAccounts(List<CardAccountDetails> cardAccounts) {
		this.cardAccounts = cardAccounts;
		return this;
	}

	public CardAccountList addCardAccountsItem(CardAccountDetails cardAccountsItem) {
		this.cardAccounts.add(cardAccountsItem);
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CardAccountList {\n");

		sb.append("    cardAccounts: ").append(toIndentedString(cardAccounts)).append("\n");
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
