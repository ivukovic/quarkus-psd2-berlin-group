package io.swagger.model;

import javax.validation.constraints.NotNull;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.util.ObjectUtil;

/**
  * Body of the response for a successful read balance for a card account request.
 **/
@Schema(description = "Body of the response for a successful read balance for a card account request.")
public class ReadCardAccountBalanceResponse200 {

	@Schema(description = "")
	private AccountReference cardAccount = null;

	@Schema(description = "")
	private Boolean debitAccounting = null;

	@Schema(required = true, description = "")
	private BalanceList balances = null;

	/**
	  * Get cardAccount
	  * @return cardAccount
	 **/
	@JsonProperty("cardAccount")
	public AccountReference getCardAccount() {
		return cardAccount;
	}

	public void setCardAccount(AccountReference cardAccount) {
		this.cardAccount = cardAccount;
	}

	public ReadCardAccountBalanceResponse200 cardAccount(AccountReference cardAccount) {
		this.cardAccount = cardAccount;
		return this;
	}

	/**
	  * Get debitAccounting
	  * @return debitAccounting
	 **/
	@JsonProperty("debitAccounting")
	public Boolean getDebitAccounting() {
		return debitAccounting;
	}

	public void setDebitAccounting(Boolean debitAccounting) {
		this.debitAccounting = debitAccounting;
	}

	public ReadCardAccountBalanceResponse200 debitAccounting(Boolean debitAccounting) {
		this.debitAccounting = debitAccounting;
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

	public ReadCardAccountBalanceResponse200 balances(BalanceList balances) {
		this.balances = balances;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ReadCardAccountBalanceResponse200 {\n");

		sb.append("    cardAccount: ").append(ObjectUtil.toIndentedString(cardAccount)).append("\n");
		sb.append("    debitAccounting: ").append(ObjectUtil.toIndentedString(debitAccounting)).append("\n");
		sb.append("    balances: ").append(ObjectUtil.toIndentedString(balances)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
