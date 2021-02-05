package hr.igvu.psd2.berlin.api.model;

import java.util.List;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import hr.igvu.psd2.util.ObjectUtil;

/**
  * Requested access services for a consent. 
 **/
@Schema(description = "Requested access services for a consent. ")
public class AccountAccess {

	@Schema(description = "Is asking for detailed account information.   If the array is empty in a request, the TPP is asking for an accessible account list.  This may be restricted in a PSU/ASPSP authorization dialogue.  If the array is empty, also the arrays for balances, additionalInformation sub attributes or transactions shall be empty, if used. ")
	/**
	  * Is asking for detailed account information.   If the array is empty in a request, the TPP is asking for an accessible account list.  This may be restricted in a PSU/ASPSP authorization dialogue.  If the array is empty, also the arrays for balances, additionalInformation sub attributes or transactions shall be empty, if used.   
	 **/
	private List<AccountReference> accounts = null;

	@Schema(description = "Is asking for balances of the addressed accounts.  If the array is empty in the request, the TPP is asking for the balances of all accessible account lists.  This may be restricted in a PSU/ASPSP authorization dialogue.  If the array is empty, also the arrays for accounts, additionalInformation sub attributes or transactions shall be empty, if used. ")
	/**
	  * Is asking for balances of the addressed accounts.  If the array is empty in the request, the TPP is asking for the balances of all accessible account lists.  This may be restricted in a PSU/ASPSP authorization dialogue.  If the array is empty, also the arrays for accounts, additionalInformation sub attributes or transactions shall be empty, if used.   
	 **/
	private List<AccountReference> balances = null;

	@Schema(description = "Is asking for transactions of the addressed accounts.   If the array is empty in the request, the TPP is asking for the transactions of all accessible account lists.  This may be restricted in a PSU/ASPSP authorization dialogue.  If the array is empty, also the arrays for accounts, additionalInformation sub attributes or balances shall be empty, if used. ")
	/**
	  * Is asking for transactions of the addressed accounts.   If the array is empty in the request, the TPP is asking for the transactions of all accessible account lists.  This may be restricted in a PSU/ASPSP authorization dialogue.  If the array is empty, also the arrays for accounts, additionalInformation sub attributes or balances shall be empty, if used.   
	 **/
	private List<AccountReference> transactions = null;

	@Schema(description = "")
	private AdditionalInformationAccess additionalInformation = null;

	public enum AvailableAccountsEnum {
		ALLACCOUNTS("allAccounts"), ALLACCOUNTSWITHOWNERNAME("allAccountsWithOwnerName");

		private String value;

		AvailableAccountsEnum(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static AvailableAccountsEnum fromValue(String text) {
			for (AvailableAccountsEnum b : AvailableAccountsEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	@Schema(description = "Optional if supported by API provider.  The values \"allAccounts\" and \"allAccountsWithOwnerName\" are admitted.  The support of the \"allAccountsWithOwnerName\" value by the ASPSP is optional. ")
	/**
	  * Optional if supported by API provider.  The values \"allAccounts\" and \"allAccountsWithOwnerName\" are admitted.  The support of the \"allAccountsWithOwnerName\" value by the ASPSP is optional.   
	 **/
	private AvailableAccountsEnum availableAccounts = null;

	public enum AvailableAccountsWithBalanceEnum {
		ALLACCOUNTS("allAccounts"), ALLACCOUNTSWITHOWNERNAME("allAccountsWithOwnerName");

		private String value;

		AvailableAccountsWithBalanceEnum(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static AvailableAccountsWithBalanceEnum fromValue(String text) {
			for (AvailableAccountsWithBalanceEnum b : AvailableAccountsWithBalanceEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	@Schema(description = "Optional if supported by API provider.  The values \"allAccounts\" and \"allAccountsWithOwnerName\" are admitted.  The support of the \"allAccountsWithOwnerName\" value by the ASPSP is optional. ")
	/**
	  * Optional if supported by API provider.  The values \"allAccounts\" and \"allAccountsWithOwnerName\" are admitted.  The support of the \"allAccountsWithOwnerName\" value by the ASPSP is optional.   
	 **/
	private AvailableAccountsWithBalanceEnum availableAccountsWithBalance = null;

	public enum AllPsd2Enum {
		ALLACCOUNTS("allAccounts"), ALLACCOUNTSWITHOWNERNAME("allAccountsWithOwnerName");

		private String value;

		AllPsd2Enum(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static AllPsd2Enum fromValue(String text) {
			for (AllPsd2Enum b : AllPsd2Enum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	@Schema(description = "Optional if supported by API provider.  The values \"allAccounts\" and \"allAccountsWithOwnerName\" are admitted.  The support of the \"allAccountsWithOwnerName\" value by the ASPSP is optional. ")
	/**
	  * Optional if supported by API provider.  The values \"allAccounts\" and \"allAccountsWithOwnerName\" are admitted.  The support of the \"allAccountsWithOwnerName\" value by the ASPSP is optional.   
	 **/
	private AllPsd2Enum allPsd2 = null;

	@Schema(description = "If the TPP requests access to accounts via availableAccounts (List of available accounts), global  or bank driven consents, the TPP may include this element to restrict access to the referred  account types. Absence of the element is interpreted as \"no restriction\" (therefore access to  accounts of all types is requested). The element may only occur, if each of the elements    - accounts    - balances    - transactions  is either not present or contains an empty array.  ")
	/**
	  * If the TPP requests access to accounts via availableAccounts (List of available accounts), global  or bank driven consents, the TPP may include this element to restrict access to the referred  account types. Absence of the element is interpreted as \"no restriction\" (therefore access to  accounts of all types is requested). The element may only occur, if each of the elements    - accounts    - balances    - transactions  is either not present or contains an empty array.    
	 **/
	private List<String> restrictedTo = null;

	/**
	  * Is asking for detailed account information.   If the array is empty in a request, the TPP is asking for an accessible account list.  This may be restricted in a PSU/ASPSP authorization dialogue.  If the array is empty, also the arrays for balances, additionalInformation sub attributes or transactions shall be empty, if used. 
	  * @return accounts
	 **/
	@JsonProperty("accounts")
	public List<AccountReference> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<AccountReference> accounts) {
		this.accounts = accounts;
	}

	public AccountAccess accounts(List<AccountReference> accounts) {
		this.accounts = accounts;
		return this;
	}

	public AccountAccess addAccountsItem(AccountReference accountsItem) {
		this.accounts.add(accountsItem);
		return this;
	}

	/**
	  * Is asking for balances of the addressed accounts.  If the array is empty in the request, the TPP is asking for the balances of all accessible account lists.  This may be restricted in a PSU/ASPSP authorization dialogue.  If the array is empty, also the arrays for accounts, additionalInformation sub attributes or transactions shall be empty, if used. 
	  * @return balances
	 **/
	@JsonProperty("balances")
	public List<AccountReference> getBalances() {
		return balances;
	}

	public void setBalances(List<AccountReference> balances) {
		this.balances = balances;
	}

	public AccountAccess balances(List<AccountReference> balances) {
		this.balances = balances;
		return this;
	}

	public AccountAccess addBalancesItem(AccountReference balancesItem) {
		this.balances.add(balancesItem);
		return this;
	}

	/**
	  * Is asking for transactions of the addressed accounts.   If the array is empty in the request, the TPP is asking for the transactions of all accessible account lists.  This may be restricted in a PSU/ASPSP authorization dialogue.  If the array is empty, also the arrays for accounts, additionalInformation sub attributes or balances shall be empty, if used. 
	  * @return transactions
	 **/
	@JsonProperty("transactions")
	public List<AccountReference> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<AccountReference> transactions) {
		this.transactions = transactions;
	}

	public AccountAccess transactions(List<AccountReference> transactions) {
		this.transactions = transactions;
		return this;
	}

	public AccountAccess addTransactionsItem(AccountReference transactionsItem) {
		this.transactions.add(transactionsItem);
		return this;
	}

	/**
	  * Get additionalInformation
	  * @return additionalInformation
	 **/
	@JsonProperty("additionalInformation")
	public AdditionalInformationAccess getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(AdditionalInformationAccess additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	public AccountAccess additionalInformation(AdditionalInformationAccess additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}

	/**
	  * Optional if supported by API provider.  The values \&quot;allAccounts\&quot; and \&quot;allAccountsWithOwnerName\&quot; are admitted.  The support of the \&quot;allAccountsWithOwnerName\&quot; value by the ASPSP is optional. 
	  * @return availableAccounts
	 **/
	@JsonProperty("availableAccounts")
	public String getAvailableAccounts() {
		if (availableAccounts == null) {
			return null;
		}
		return availableAccounts.getValue();
	}

	public void setAvailableAccounts(AvailableAccountsEnum availableAccounts) {
		this.availableAccounts = availableAccounts;
	}

	public AccountAccess availableAccounts(AvailableAccountsEnum availableAccounts) {
		this.availableAccounts = availableAccounts;
		return this;
	}

	/**
	  * Optional if supported by API provider.  The values \&quot;allAccounts\&quot; and \&quot;allAccountsWithOwnerName\&quot; are admitted.  The support of the \&quot;allAccountsWithOwnerName\&quot; value by the ASPSP is optional. 
	  * @return availableAccountsWithBalance
	 **/
	@JsonProperty("availableAccountsWithBalance")
	public String getAvailableAccountsWithBalance() {
		if (availableAccountsWithBalance == null) {
			return null;
		}
		return availableAccountsWithBalance.getValue();
	}

	public void setAvailableAccountsWithBalance(AvailableAccountsWithBalanceEnum availableAccountsWithBalance) {
		this.availableAccountsWithBalance = availableAccountsWithBalance;
	}

	public AccountAccess availableAccountsWithBalance(AvailableAccountsWithBalanceEnum availableAccountsWithBalance) {
		this.availableAccountsWithBalance = availableAccountsWithBalance;
		return this;
	}

	/**
	  * Optional if supported by API provider.  The values \&quot;allAccounts\&quot; and \&quot;allAccountsWithOwnerName\&quot; are admitted.  The support of the \&quot;allAccountsWithOwnerName\&quot; value by the ASPSP is optional. 
	  * @return allPsd2
	 **/
	@JsonProperty("allPsd2")
	public String getAllPsd2() {
		if (allPsd2 == null) {
			return null;
		}
		return allPsd2.getValue();
	}

	public void setAllPsd2(AllPsd2Enum allPsd2) {
		this.allPsd2 = allPsd2;
	}

	public AccountAccess allPsd2(AllPsd2Enum allPsd2) {
		this.allPsd2 = allPsd2;
		return this;
	}

	/**
	  * If the TPP requests access to accounts via availableAccounts (List of available accounts), global  or bank driven consents, the TPP may include this element to restrict access to the referred  account types. Absence of the element is interpreted as \&quot;no restriction\&quot; (therefore access to  accounts of all types is requested). The element may only occur, if each of the elements    - accounts    - balances    - transactions  is either not present or contains an empty array.  
	  * @return restrictedTo
	 **/
	@JsonProperty("restrictedTo")
	public List<String> getRestrictedTo() {
		return restrictedTo;
	}

	public void setRestrictedTo(List<String> restrictedTo) {
		this.restrictedTo = restrictedTo;
	}

	public AccountAccess restrictedTo(List<String> restrictedTo) {
		this.restrictedTo = restrictedTo;
		return this;
	}

	public AccountAccess addRestrictedToItem(String restrictedToItem) {
		this.restrictedTo.add(restrictedToItem);
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AccountAccess {\n");

		sb.append("    accounts: ").append(ObjectUtil.toIndentedString(accounts)).append("\n");
		sb.append("    balances: ").append(ObjectUtil.toIndentedString(balances)).append("\n");
		sb.append("    transactions: ").append(ObjectUtil.toIndentedString(transactions)).append("\n");
		sb.append("    additionalInformation: ").append(ObjectUtil.toIndentedString(additionalInformation)).append("\n");
		sb.append("    availableAccounts: ").append(ObjectUtil.toIndentedString(availableAccounts)).append("\n");
		sb.append("    availableAccountsWithBalance: ").append(ObjectUtil.toIndentedString(availableAccountsWithBalance)).append("\n");
		sb.append("    allPsd2: ").append(ObjectUtil.toIndentedString(allPsd2)).append("\n");
		sb.append("    restrictedTo: ").append(ObjectUtil.toIndentedString(restrictedTo)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
