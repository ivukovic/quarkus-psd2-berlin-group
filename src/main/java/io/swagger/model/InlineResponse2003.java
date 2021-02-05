package io.swagger.model;

import javax.validation.constraints.NotNull;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.util.ObjectUtil;

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

		sb.append("    account: ").append(ObjectUtil.toIndentedString(account)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
