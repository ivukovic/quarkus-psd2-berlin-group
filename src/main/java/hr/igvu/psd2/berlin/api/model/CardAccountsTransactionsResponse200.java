package hr.igvu.psd2.berlin.api.model;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import hr.igvu.psd2.util.ObjectUtil;

/**
  * Body of the JSON response for a successful read card account transaction list request. This card account report contains transactions resulting from the query parameters. 
 **/
@Schema(description = "Body of the JSON response for a successful read card account transaction list request. This card account report contains transactions resulting from the query parameters. ")
public class CardAccountsTransactionsResponse200 {

	@Schema(description = "")
	private AccountReference cardAccount = null;

	@Schema(description = "")
	private Boolean debitAccounting = null;

	@Schema(description = "")
	private CardAccountReport cardTransactions = null;

	@Schema(description = "")
	private BalanceList balances = null;

	@Schema(description = "")
	private LinksDownload _links = null;

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

	public CardAccountsTransactionsResponse200 cardAccount(AccountReference cardAccount) {
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

	public CardAccountsTransactionsResponse200 debitAccounting(Boolean debitAccounting) {
		this.debitAccounting = debitAccounting;
		return this;
	}

	/**
	  * Get cardTransactions
	  * @return cardTransactions
	 **/
	@JsonProperty("cardTransactions")
	public CardAccountReport getCardTransactions() {
		return cardTransactions;
	}

	public void setCardTransactions(CardAccountReport cardTransactions) {
		this.cardTransactions = cardTransactions;
	}

	public CardAccountsTransactionsResponse200 cardTransactions(CardAccountReport cardTransactions) {
		this.cardTransactions = cardTransactions;
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

	public CardAccountsTransactionsResponse200 balances(BalanceList balances) {
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

	public CardAccountsTransactionsResponse200 _links(LinksDownload _links) {
		this._links = _links;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CardAccountsTransactionsResponse200 {\n");

		sb.append("    cardAccount: ").append(ObjectUtil.toIndentedString(cardAccount)).append("\n");
		sb.append("    debitAccounting: ").append(ObjectUtil.toIndentedString(debitAccounting)).append("\n");
		sb.append("    cardTransactions: ").append(ObjectUtil.toIndentedString(cardTransactions)).append("\n");
		sb.append("    balances: ").append(ObjectUtil.toIndentedString(balances)).append("\n");
		sb.append("    _links: ").append(ObjectUtil.toIndentedString(_links)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
