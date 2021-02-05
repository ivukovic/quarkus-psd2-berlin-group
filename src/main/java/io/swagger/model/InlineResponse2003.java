package io.swagger.model;

import javax.validation.constraints.NotNull;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InlineResponse2003 {

	@Schema(required = true, description = "")
	private AccountDetails account = null;

	/**
	  * Get account
	  * @return account
	 **/
	@JsonProperty("account")
	@NotNull
	public AccountDetails getAccount() {
		return account;
	}

	public void setAccount(AccountDetails account) {
		this.account = account;
	}

	public InlineResponse2003 account(AccountDetails account) {
		this.account = account;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InlineResponse2003 {\n");

		sb.append("    account: ").append(toIndentedString(account)).append("\n");
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
