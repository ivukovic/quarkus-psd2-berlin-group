package hr.igvu.psd2.berlin.api.model;

import javax.validation.constraints.NotNull;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import hr.igvu.psd2.util.ObjectUtil;

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

		sb.append("    cardAccount: ").append(ObjectUtil.toIndentedString(cardAccount)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
