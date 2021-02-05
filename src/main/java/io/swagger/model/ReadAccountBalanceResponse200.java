package io.swagger.model;

import javax.validation.constraints.NotNull;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.util.ObjectUtil;

/**
  * Body of the response for a successful read balance for an account request.
 **/
@Schema(description = "Body of the response for a successful read balance for an account request.")
public class ReadAccountBalanceResponse200 {

	@Schema(description = "")
	private AccountReference account = null;

	@Schema(required = true, description = "")
	private BalanceList balances = null;

	/**
	  * Get account
	  * @return account
	 **/
	@JsonProperty("account")
	public AccountReference getAccount() {
		return account;
	}

	public void setAccount(AccountReference account) {
		this.account = account;
	}

	public ReadAccountBalanceResponse200 account(AccountReference account) {
		this.account = account;
		return this;
	}

	/**
	  * Get balances
	  * @return balances
	 **/
	@JsonProperty("balances")
	@NotNull
	public BalanceList getBalances() {
		return balances;
	}

	public void setBalances(BalanceList balances) {
		this.balances = balances;
	}

	public ReadAccountBalanceResponse200 balances(BalanceList balances) {
		this.balances = balances;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ReadAccountBalanceResponse200 {\n");

		sb.append("    account: ").append(ObjectUtil.toIndentedString(account)).append("\n");
		sb.append("    balances: ").append(ObjectUtil.toIndentedString(balances)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
