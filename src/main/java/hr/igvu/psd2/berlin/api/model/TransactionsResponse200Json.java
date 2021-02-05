package hr.igvu.psd2.berlin.api.model;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import hr.igvu.psd2.util.ObjectUtil;

/**
  * Body of the JSON response for a successful read transaction list request. This account report contains transactions resulting from the query parameters. 
 **/
@Schema(description = "Body of the JSON response for a successful read transaction list request. This account report contains transactions resulting from the query parameters. ")
public class TransactionsResponse200Json {

	@Schema(description = "")
	private AccountReference account = null;

	@Schema(description = "")
	private AccountReport transactions = null;

	@Schema(description = "")
	private BalanceList balances = null;

	@Schema(description = "")
	private LinksDownload _links = null;

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

	public TransactionsResponse200Json account(AccountReference account) {
		this.account = account;
		return this;
	}

	/**
	  * Get transactions
	  * @return transactions
	 **/
	@JsonProperty("transactions")
	public AccountReport getTransactions() {
		return transactions;
	}

	public void setTransactions(AccountReport transactions) {
		this.transactions = transactions;
	}

	public TransactionsResponse200Json transactions(AccountReport transactions) {
		this.transactions = transactions;
		return this;
	}

	/**
	  * Get balances
	  * @return balances
	 **/
	@JsonProperty("balances")
	public BalanceList getBalances() {
		return balances;
	}

	public void setBalances(BalanceList balances) {
		this.balances = balances;
	}

	public TransactionsResponse200Json balances(BalanceList balances) {
		this.balances = balances;
		return this;
	}

	/**
	  * Get _links
	  * @return _links
	 **/
	@JsonProperty("_links")
	public LinksDownload getLinks() {
		return _links;
	}

	public void setLinks(LinksDownload _links) {
		this._links = _links;
	}

	public TransactionsResponse200Json _links(LinksDownload _links) {
		this._links = _links;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TransactionsResponse200Json {\n");

		sb.append("    account: ").append(ObjectUtil.toIndentedString(account)).append("\n");
		sb.append("    transactions: ").append(ObjectUtil.toIndentedString(transactions)).append("\n");
		sb.append("    balances: ").append(ObjectUtil.toIndentedString(balances)).append("\n");
		sb.append("    _links: ").append(ObjectUtil.toIndentedString(_links)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
