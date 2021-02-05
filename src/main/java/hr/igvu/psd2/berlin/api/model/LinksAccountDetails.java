package hr.igvu.psd2.berlin.api.model;

import java.util.HashMap;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import hr.igvu.psd2.util.ObjectUtil;

/**
  * Links to the account, which can be directly used for retrieving account information from this dedicated account.  Links to \"balances\" and/or \"transactions\"  These links are only supported, when the corresponding consent has been already granted. 
 **/
@Schema(description = "Links to the account, which can be directly used for retrieving account information from this dedicated account.  Links to \"balances\" and/or \"transactions\"  These links are only supported, when the corresponding consent has been already granted. ")
public class LinksAccountDetails extends HashMap<String, HrefType> {

	@Schema(description = "")
	private HrefType balances = null;

	@Schema(description = "")
	private HrefType transactions = null;

	/**
	  * Get balances
	  * @return balances
	 **/
	@JsonProperty("balances")
	public HrefType getBalances() {
		return balances;
	}

	public void setBalances(HrefType balances) {
		this.balances = balances;
	}

	public LinksAccountDetails balances(HrefType balances) {
		this.balances = balances;
		return this;
	}

	/**
	  * Get transactions
	  * @return transactions
	 **/
	@JsonProperty("transactions")
	public HrefType getTransactions() {
		return transactions;
	}

	public void setTransactions(HrefType transactions) {
		this.transactions = transactions;
	}

	public LinksAccountDetails transactions(HrefType transactions) {
		this.transactions = transactions;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LinksAccountDetails {\n");
		sb.append("    ").append(ObjectUtil.toIndentedString(super.toString())).append("\n");
		sb.append("    balances: ").append(ObjectUtil.toIndentedString(balances)).append("\n");
		sb.append("    transactions: ").append(ObjectUtil.toIndentedString(transactions)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
