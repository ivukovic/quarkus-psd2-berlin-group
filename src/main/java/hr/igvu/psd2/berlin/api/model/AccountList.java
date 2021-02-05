package hr.igvu.psd2.berlin.api.model;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import hr.igvu.psd2.util.ObjectUtil;

/**
  * List of accounts with details. 
 **/
@Schema(description = "List of accounts with details. ")
public class AccountList {

	@Schema(required = true, description = "")
	private List<AccountDetails> accounts = new ArrayList<AccountDetails>();

	/**
	  * Get accounts
	  * @return accounts
	 **/
	@JsonProperty("accounts")
	@NotNull
	public List<AccountDetails> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<AccountDetails> accounts) {
		this.accounts = accounts;
	}

	public AccountList accounts(List<AccountDetails> accounts) {
		this.accounts = accounts;
		return this;
	}

	public AccountList addAccountsItem(AccountDetails accountsItem) {
		this.accounts.add(accountsItem);
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AccountList {\n");

		sb.append("    accounts: ").append(ObjectUtil.toIndentedString(accounts)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
