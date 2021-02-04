package io.swagger.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Requested access services for a consent. 
 **/
import io.swagger.annotations.*;

@Schema(description = "Requested access services for a consent. ")

public class AccountAccess {
	private @Valid List<AccountReference> accounts = new ArrayList<AccountReference>();
	private @Valid List<AccountReference> balances = new ArrayList<AccountReference>();
	private @Valid List<AccountReference> transactions = new ArrayList<AccountReference>();
	private @Valid AdditionalInformationAccess additionalInformation = null;

	public enum AvailableAccountsEnum {

		ALLACCOUNTS(String.valueOf("allAccounts")), ALLACCOUNTSWITHOWNERNAME(String.valueOf("allAccountsWithOwnerName"));

		private String value;

		AvailableAccountsEnum(String v) {
			value = v;
		}

		public String value() {
			return value;
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static AvailableAccountsEnum fromValue(String v) {
			for (AvailableAccountsEnum b : AvailableAccountsEnum.values()) {
				if (String.valueOf(b.value).equals(v)) {
					return b;
				}
			}
			return null;
		}
	}

	private @Valid AvailableAccountsEnum availableAccounts = null;

	public enum AvailableAccountsWithBalanceEnum {

		ALLACCOUNTS(String.valueOf("allAccounts")), ALLACCOUNTSWITHOWNERNAME(String.valueOf("allAccountsWithOwnerName"));

		private String value;

		AvailableAccountsWithBalanceEnum(String v) {
			value = v;
		}

		public String value() {
			return value;
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static AvailableAccountsWithBalanceEnum fromValue(String v) {
			for (AvailableAccountsWithBalanceEnum b : AvailableAccountsWithBalanceEnum.values()) {
				if (String.valueOf(b.value).equals(v)) {
					return b;
				}
			}
			return null;
		}
	}

	private @Valid AvailableAccountsWithBalanceEnum availableAccountsWithBalance = null;

	public enum AllPsd2Enum {

		ALLACCOUNTS(String.valueOf("allAccounts")), ALLACCOUNTSWITHOWNERNAME(String.valueOf("allAccountsWithOwnerName"));

		private String value;

		AllPsd2Enum(String v) {
			value = v;
		}

		public String value() {
			return value;
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static AllPsd2Enum fromValue(String v) {
			for (AllPsd2Enum b : AllPsd2Enum.values()) {
				if (String.valueOf(b.value).equals(v)) {
					return b;
				}
			}
			return null;
		}
	}

	private @Valid AllPsd2Enum allPsd2 = null;
	private @Valid List<String> restrictedTo = new ArrayList<String>();

	/**
	 * Is asking for detailed account information.   If the array is empty in a request, the TPP is asking for an accessible account list.  This may be restricted in a PSU/ASPSP authorization dialogue.  If the array is empty, also the arrays for balances, additionalInformation sub attributes or transactions shall be empty, if used. 
	 **/
	public AccountAccess accounts(List<AccountReference> accounts) {
		this.accounts = accounts;
		return this;
	}

	@ApiModelProperty(value = "Is asking for detailed account information.   If the array is empty in a request, the TPP is asking for an accessible account list.  This may be restricted in a PSU/ASPSP authorization dialogue.  If the array is empty, also the arrays for balances, additionalInformation sub attributes or transactions shall be empty, if used. ")
	@JsonProperty("accounts")

	public List<AccountReference> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<AccountReference> accounts) {
		this.accounts = accounts;
	}

	/**
	 * Is asking for balances of the addressed accounts.  If the array is empty in the request, the TPP is asking for the balances of all accessible account lists.  This may be restricted in a PSU/ASPSP authorization dialogue.  If the array is empty, also the arrays for accounts, additionalInformation sub attributes or transactions shall be empty, if used. 
	 **/
	public AccountAccess balances(List<AccountReference> balances) {
		this.balances = balances;
		return this;
	}

	@ApiModelProperty(value = "Is asking for balances of the addressed accounts.  If the array is empty in the request, the TPP is asking for the balances of all accessible account lists.  This may be restricted in a PSU/ASPSP authorization dialogue.  If the array is empty, also the arrays for accounts, additionalInformation sub attributes or transactions shall be empty, if used. ")
	@JsonProperty("balances")

	public List<AccountReference> getBalances() {
		return balances;
	}

	public void setBalances(List<AccountReference> balances) {
		this.balances = balances;
	}

	/**
	 * Is asking for transactions of the addressed accounts.   If the array is empty in the request, the TPP is asking for the transactions of all accessible account lists.  This may be restricted in a PSU/ASPSP authorization dialogue.  If the array is empty, also the arrays for accounts, additionalInformation sub attributes or balances shall be empty, if used. 
	 **/
	public AccountAccess transactions(List<AccountReference> transactions) {
		this.transactions = transactions;
		return this;
	}

	@ApiModelProperty(value = "Is asking for transactions of the addressed accounts.   If the array is empty in the request, the TPP is asking for the transactions of all accessible account lists.  This may be restricted in a PSU/ASPSP authorization dialogue.  If the array is empty, also the arrays for accounts, additionalInformation sub attributes or balances shall be empty, if used. ")
	@JsonProperty("transactions")

	public List<AccountReference> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<AccountReference> transactions) {
		this.transactions = transactions;
	}

	/**
	 **/
	public AccountAccess additionalInformation(AdditionalInformationAccess additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}

	@ApiModelProperty(value = "")
	@JsonProperty("additionalInformation")

	public AdditionalInformationAccess getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(AdditionalInformationAccess additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	/**
	 * Optional if supported by API provider.  The values \&quot;allAccounts\&quot; and \&quot;allAccountsWithOwnerName\&quot; are admitted.  The support of the \&quot;allAccountsWithOwnerName\&quot; value by the ASPSP is optional. 
	 **/
	public AccountAccess availableAccounts(AvailableAccountsEnum availableAccounts) {
		this.availableAccounts = availableAccounts;
		return this;
	}

	@ApiModelProperty(value = "Optional if supported by API provider.  The values \"allAccounts\" and \"allAccountsWithOwnerName\" are admitted.  The support of the \"allAccountsWithOwnerName\" value by the ASPSP is optional. ")
	@JsonProperty("availableAccounts")

	public AvailableAccountsEnum getAvailableAccounts() {
		return availableAccounts;
	}

	public void setAvailableAccounts(AvailableAccountsEnum availableAccounts) {
		this.availableAccounts = availableAccounts;
	}

	/**
	 * Optional if supported by API provider.  The values \&quot;allAccounts\&quot; and \&quot;allAccountsWithOwnerName\&quot; are admitted.  The support of the \&quot;allAccountsWithOwnerName\&quot; value by the ASPSP is optional. 
	 **/
	public AccountAccess availableAccountsWithBalance(AvailableAccountsWithBalanceEnum availableAccountsWithBalance) {
		this.availableAccountsWithBalance = availableAccountsWithBalance;
		return this;
	}

	@ApiModelProperty(value = "Optional if supported by API provider.  The values \"allAccounts\" and \"allAccountsWithOwnerName\" are admitted.  The support of the \"allAccountsWithOwnerName\" value by the ASPSP is optional. ")
	@JsonProperty("availableAccountsWithBalance")

	public AvailableAccountsWithBalanceEnum getAvailableAccountsWithBalance() {
		return availableAccountsWithBalance;
	}

	public void setAvailableAccountsWithBalance(AvailableAccountsWithBalanceEnum availableAccountsWithBalance) {
		this.availableAccountsWithBalance = availableAccountsWithBalance;
	}

	/**
	 * Optional if supported by API provider.  The values \&quot;allAccounts\&quot; and \&quot;allAccountsWithOwnerName\&quot; are admitted.  The support of the \&quot;allAccountsWithOwnerName\&quot; value by the ASPSP is optional. 
	 **/
	public AccountAccess allPsd2(AllPsd2Enum allPsd2) {
		this.allPsd2 = allPsd2;
		return this;
	}

	@ApiModelProperty(value = "Optional if supported by API provider.  The values \"allAccounts\" and \"allAccountsWithOwnerName\" are admitted.  The support of the \"allAccountsWithOwnerName\" value by the ASPSP is optional. ")
	@JsonProperty("allPsd2")

	public AllPsd2Enum getAllPsd2() {
		return allPsd2;
	}

	public void setAllPsd2(AllPsd2Enum allPsd2) {
		this.allPsd2 = allPsd2;
	}

	/**
	 * If the TPP requests access to accounts via availableAccounts (List of available accounts), global  or bank driven consents, the TPP may include this element to restrict access to the referred  account types. Absence of the element is interpreted as \&quot;no restriction\&quot; (therefore access to  accounts of all types is requested). The element may only occur, if each of the elements    - accounts    - balances    - transactions  is either not present or contains an empty array.  
	 **/
	public AccountAccess restrictedTo(List<String> restrictedTo) {
		this.restrictedTo = restrictedTo;
		return this;
	}

	@ApiModelProperty(value = "If the TPP requests access to accounts via availableAccounts (List of available accounts), global  or bank driven consents, the TPP may include this element to restrict access to the referred  account types. Absence of the element is interpreted as \"no restriction\" (therefore access to  accounts of all types is requested). The element may only occur, if each of the elements    - accounts    - balances    - transactions  is either not present or contains an empty array.  ")
	@JsonProperty("restrictedTo")

	public List<String> getRestrictedTo() {
		return restrictedTo;
	}

	public void setRestrictedTo(List<String> restrictedTo) {
		this.restrictedTo = restrictedTo;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AccountAccess accountAccess = (AccountAccess) o;
		return Objects.equals(accounts, accountAccess.accounts) &&
				Objects.equals(balances, accountAccess.balances) &&
				Objects.equals(transactions, accountAccess.transactions) &&
				Objects.equals(additionalInformation, accountAccess.additionalInformation) &&
				Objects.equals(availableAccounts, accountAccess.availableAccounts) &&
				Objects.equals(availableAccountsWithBalance, accountAccess.availableAccountsWithBalance) &&
				Objects.equals(allPsd2, accountAccess.allPsd2) &&
				Objects.equals(restrictedTo, accountAccess.restrictedTo);
	}

	@Override
	public int hashCode() {
		return Objects.hash(accounts, balances, transactions, additionalInformation, availableAccounts, availableAccountsWithBalance, allPsd2, restrictedTo);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AccountAccess {\n");

		sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
		sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
		sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
		sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
		sb.append("    availableAccounts: ").append(toIndentedString(availableAccounts)).append("\n");
		sb.append("    availableAccountsWithBalance: ").append(toIndentedString(availableAccountsWithBalance)).append("\n");
		sb.append("    allPsd2: ").append(toIndentedString(allPsd2)).append("\n");
		sb.append("    restrictedTo: ").append(toIndentedString(restrictedTo)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
