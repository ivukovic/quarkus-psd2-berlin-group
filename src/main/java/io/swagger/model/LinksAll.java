package io.swagger.model;

import java.util.HashMap;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * A _link object with all availabel link types. 
 **/
@Schema(description = "A _link object with all availabel link types. ")
public class LinksAll extends HashMap<String, HrefType> {

	@Schema(description = "")
	private HrefType scaRedirect = null;

	@Schema(description = "")
	private HrefType scaOAuth = null;

	@Schema(description = "")
	private HrefType confirmation = null;

	@Schema(description = "")
	private HrefType startAuthorisation = null;

	@Schema(description = "")
	private HrefType startAuthorisationWithPsuIdentification = null;

	@Schema(description = "")
	private HrefType updatePsuIdentification = null;

	@Schema(description = "")
	private HrefType startAuthorisationWithProprietaryData = null;

	@Schema(description = "")
	private HrefType updateProprietaryData = null;

	@Schema(description = "")
	private HrefType startAuthorisationWithPsuAuthentication = null;

	@Schema(description = "")
	private HrefType updatePsuAuthentication = null;

	@Schema(description = "")
	private HrefType startAuthorisationWithEncryptedPsuAuthentication = null;

	@Schema(description = "")
	private HrefType updateEncryptedPsuAuthentication = null;

	@Schema(description = "")
	private HrefType updateAdditionalPsuAuthentication = null;

	@Schema(description = "")
	private HrefType updateAdditionalEncryptedPsuAuthentication = null;

	@Schema(description = "")
	private HrefType startAuthorisationWithAuthenticationMethodSelection = null;

	@Schema(description = "")
	private HrefType selectAuthenticationMethod = null;

	@Schema(description = "")
	private HrefType startAuthorisationWithTransactionAuthorisation = null;

	@Schema(description = "")
	private HrefType authoriseTransaction = null;

	@Schema(description = "")
	private HrefType self = null;

	@Schema(description = "")
	private HrefType status = null;

	@Schema(description = "")
	private HrefType scaStatus = null;

	@Schema(description = "")
	private HrefType account = null;

	@Schema(description = "")
	private HrefType balances = null;

	@Schema(description = "")
	private HrefType transactions = null;

	@Schema(description = "")
	private HrefType transactionDetails = null;

	@Schema(description = "")
	private HrefType cardAccount = null;

	@Schema(description = "")
	private HrefType cardTransactions = null;

	@Schema(description = "")
	private HrefType first = null;

	@Schema(description = "")
	private HrefType next = null;

	@Schema(description = "")
	private HrefType previous = null;

	@Schema(description = "")
	private HrefType last = null;

	@Schema(description = "")
	private HrefType download = null;

	/**
	  * Get scaRedirect
	  * @return scaRedirect
	 **/
	@JsonProperty("scaRedirect")
	public HrefType getScaRedirect() {
		return scaRedirect;
	}

	public void setScaRedirect(HrefType scaRedirect) {
		this.scaRedirect = scaRedirect;
	}

	public LinksAll scaRedirect(HrefType scaRedirect) {
		this.scaRedirect = scaRedirect;
		return this;
	}

	/**
	  * Get scaOAuth
	  * @return scaOAuth
	 **/
	@JsonProperty("scaOAuth")
	public HrefType getScaOAuth() {
		return scaOAuth;
	}

	public void setScaOAuth(HrefType scaOAuth) {
		this.scaOAuth = scaOAuth;
	}

	public LinksAll scaOAuth(HrefType scaOAuth) {
		this.scaOAuth = scaOAuth;
		return this;
	}

	/**
	  * Get confirmation
	  * @return confirmation
	 **/
	@JsonProperty("confirmation")
	public HrefType getConfirmation() {
		return confirmation;
	}

	public void setConfirmation(HrefType confirmation) {
		this.confirmation = confirmation;
	}

	public LinksAll confirmation(HrefType confirmation) {
		this.confirmation = confirmation;
		return this;
	}

	/**
	  * Get startAuthorisation
	  * @return startAuthorisation
	 **/
	@JsonProperty("startAuthorisation")
	public HrefType getStartAuthorisation() {
		return startAuthorisation;
	}

	public void setStartAuthorisation(HrefType startAuthorisation) {
		this.startAuthorisation = startAuthorisation;
	}

	public LinksAll startAuthorisation(HrefType startAuthorisation) {
		this.startAuthorisation = startAuthorisation;
		return this;
	}

	/**
	  * Get startAuthorisationWithPsuIdentification
	  * @return startAuthorisationWithPsuIdentification
	 **/
	@JsonProperty("startAuthorisationWithPsuIdentification")
	public HrefType getStartAuthorisationWithPsuIdentification() {
		return startAuthorisationWithPsuIdentification;
	}

	public void setStartAuthorisationWithPsuIdentification(HrefType startAuthorisationWithPsuIdentification) {
		this.startAuthorisationWithPsuIdentification = startAuthorisationWithPsuIdentification;
	}

	public LinksAll startAuthorisationWithPsuIdentification(HrefType startAuthorisationWithPsuIdentification) {
		this.startAuthorisationWithPsuIdentification = startAuthorisationWithPsuIdentification;
		return this;
	}

	/**
	  * Get updatePsuIdentification
	  * @return updatePsuIdentification
	 **/
	@JsonProperty("updatePsuIdentification")
	public HrefType getUpdatePsuIdentification() {
		return updatePsuIdentification;
	}

	public void setUpdatePsuIdentification(HrefType updatePsuIdentification) {
		this.updatePsuIdentification = updatePsuIdentification;
	}

	public LinksAll updatePsuIdentification(HrefType updatePsuIdentification) {
		this.updatePsuIdentification = updatePsuIdentification;
		return this;
	}

	/**
	  * Get startAuthorisationWithProprietaryData
	  * @return startAuthorisationWithProprietaryData
	 **/
	@JsonProperty("startAuthorisationWithProprietaryData")
	public HrefType getStartAuthorisationWithProprietaryData() {
		return startAuthorisationWithProprietaryData;
	}

	public void setStartAuthorisationWithProprietaryData(HrefType startAuthorisationWithProprietaryData) {
		this.startAuthorisationWithProprietaryData = startAuthorisationWithProprietaryData;
	}

	public LinksAll startAuthorisationWithProprietaryData(HrefType startAuthorisationWithProprietaryData) {
		this.startAuthorisationWithProprietaryData = startAuthorisationWithProprietaryData;
		return this;
	}

	/**
	  * Get updateProprietaryData
	  * @return updateProprietaryData
	 **/
	@JsonProperty("updateProprietaryData")
	public HrefType getUpdateProprietaryData() {
		return updateProprietaryData;
	}

	public void setUpdateProprietaryData(HrefType updateProprietaryData) {
		this.updateProprietaryData = updateProprietaryData;
	}

	public LinksAll updateProprietaryData(HrefType updateProprietaryData) {
		this.updateProprietaryData = updateProprietaryData;
		return this;
	}

	/**
	  * Get startAuthorisationWithPsuAuthentication
	  * @return startAuthorisationWithPsuAuthentication
	 **/
	@JsonProperty("startAuthorisationWithPsuAuthentication")
	public HrefType getStartAuthorisationWithPsuAuthentication() {
		return startAuthorisationWithPsuAuthentication;
	}

	public void setStartAuthorisationWithPsuAuthentication(HrefType startAuthorisationWithPsuAuthentication) {
		this.startAuthorisationWithPsuAuthentication = startAuthorisationWithPsuAuthentication;
	}

	public LinksAll startAuthorisationWithPsuAuthentication(HrefType startAuthorisationWithPsuAuthentication) {
		this.startAuthorisationWithPsuAuthentication = startAuthorisationWithPsuAuthentication;
		return this;
	}

	/**
	  * Get updatePsuAuthentication
	  * @return updatePsuAuthentication
	 **/
	@JsonProperty("updatePsuAuthentication")
	public HrefType getUpdatePsuAuthentication() {
		return updatePsuAuthentication;
	}

	public void setUpdatePsuAuthentication(HrefType updatePsuAuthentication) {
		this.updatePsuAuthentication = updatePsuAuthentication;
	}

	public LinksAll updatePsuAuthentication(HrefType updatePsuAuthentication) {
		this.updatePsuAuthentication = updatePsuAuthentication;
		return this;
	}

	/**
	  * Get startAuthorisationWithEncryptedPsuAuthentication
	  * @return startAuthorisationWithEncryptedPsuAuthentication
	 **/
	@JsonProperty("startAuthorisationWithEncryptedPsuAuthentication")
	public HrefType getStartAuthorisationWithEncryptedPsuAuthentication() {
		return startAuthorisationWithEncryptedPsuAuthentication;
	}

	public void setStartAuthorisationWithEncryptedPsuAuthentication(HrefType startAuthorisationWithEncryptedPsuAuthentication) {
		this.startAuthorisationWithEncryptedPsuAuthentication = startAuthorisationWithEncryptedPsuAuthentication;
	}

	public LinksAll startAuthorisationWithEncryptedPsuAuthentication(HrefType startAuthorisationWithEncryptedPsuAuthentication) {
		this.startAuthorisationWithEncryptedPsuAuthentication = startAuthorisationWithEncryptedPsuAuthentication;
		return this;
	}

	/**
	  * Get updateEncryptedPsuAuthentication
	  * @return updateEncryptedPsuAuthentication
	 **/
	@JsonProperty("updateEncryptedPsuAuthentication")
	public HrefType getUpdateEncryptedPsuAuthentication() {
		return updateEncryptedPsuAuthentication;
	}

	public void setUpdateEncryptedPsuAuthentication(HrefType updateEncryptedPsuAuthentication) {
		this.updateEncryptedPsuAuthentication = updateEncryptedPsuAuthentication;
	}

	public LinksAll updateEncryptedPsuAuthentication(HrefType updateEncryptedPsuAuthentication) {
		this.updateEncryptedPsuAuthentication = updateEncryptedPsuAuthentication;
		return this;
	}

	/**
	  * Get updateAdditionalPsuAuthentication
	  * @return updateAdditionalPsuAuthentication
	 **/
	@JsonProperty("updateAdditionalPsuAuthentication")
	public HrefType getUpdateAdditionalPsuAuthentication() {
		return updateAdditionalPsuAuthentication;
	}

	public void setUpdateAdditionalPsuAuthentication(HrefType updateAdditionalPsuAuthentication) {
		this.updateAdditionalPsuAuthentication = updateAdditionalPsuAuthentication;
	}

	public LinksAll updateAdditionalPsuAuthentication(HrefType updateAdditionalPsuAuthentication) {
		this.updateAdditionalPsuAuthentication = updateAdditionalPsuAuthentication;
		return this;
	}

	/**
	  * Get updateAdditionalEncryptedPsuAuthentication
	  * @return updateAdditionalEncryptedPsuAuthentication
	 **/
	@JsonProperty("updateAdditionalEncryptedPsuAuthentication")
	public HrefType getUpdateAdditionalEncryptedPsuAuthentication() {
		return updateAdditionalEncryptedPsuAuthentication;
	}

	public void setUpdateAdditionalEncryptedPsuAuthentication(HrefType updateAdditionalEncryptedPsuAuthentication) {
		this.updateAdditionalEncryptedPsuAuthentication = updateAdditionalEncryptedPsuAuthentication;
	}

	public LinksAll updateAdditionalEncryptedPsuAuthentication(HrefType updateAdditionalEncryptedPsuAuthentication) {
		this.updateAdditionalEncryptedPsuAuthentication = updateAdditionalEncryptedPsuAuthentication;
		return this;
	}

	/**
	  * Get startAuthorisationWithAuthenticationMethodSelection
	  * @return startAuthorisationWithAuthenticationMethodSelection
	 **/
	@JsonProperty("startAuthorisationWithAuthenticationMethodSelection")
	public HrefType getStartAuthorisationWithAuthenticationMethodSelection() {
		return startAuthorisationWithAuthenticationMethodSelection;
	}

	public void setStartAuthorisationWithAuthenticationMethodSelection(HrefType startAuthorisationWithAuthenticationMethodSelection) {
		this.startAuthorisationWithAuthenticationMethodSelection = startAuthorisationWithAuthenticationMethodSelection;
	}

	public LinksAll startAuthorisationWithAuthenticationMethodSelection(HrefType startAuthorisationWithAuthenticationMethodSelection) {
		this.startAuthorisationWithAuthenticationMethodSelection = startAuthorisationWithAuthenticationMethodSelection;
		return this;
	}

	/**
	  * Get selectAuthenticationMethod
	  * @return selectAuthenticationMethod
	 **/
	@JsonProperty("selectAuthenticationMethod")
	public HrefType getSelectAuthenticationMethod() {
		return selectAuthenticationMethod;
	}

	public void setSelectAuthenticationMethod(HrefType selectAuthenticationMethod) {
		this.selectAuthenticationMethod = selectAuthenticationMethod;
	}

	public LinksAll selectAuthenticationMethod(HrefType selectAuthenticationMethod) {
		this.selectAuthenticationMethod = selectAuthenticationMethod;
		return this;
	}

	/**
	  * Get startAuthorisationWithTransactionAuthorisation
	  * @return startAuthorisationWithTransactionAuthorisation
	 **/
	@JsonProperty("startAuthorisationWithTransactionAuthorisation")
	public HrefType getStartAuthorisationWithTransactionAuthorisation() {
		return startAuthorisationWithTransactionAuthorisation;
	}

	public void setStartAuthorisationWithTransactionAuthorisation(HrefType startAuthorisationWithTransactionAuthorisation) {
		this.startAuthorisationWithTransactionAuthorisation = startAuthorisationWithTransactionAuthorisation;
	}

	public LinksAll startAuthorisationWithTransactionAuthorisation(HrefType startAuthorisationWithTransactionAuthorisation) {
		this.startAuthorisationWithTransactionAuthorisation = startAuthorisationWithTransactionAuthorisation;
		return this;
	}

	/**
	  * Get authoriseTransaction
	  * @return authoriseTransaction
	 **/
	@JsonProperty("authoriseTransaction")
	public HrefType getAuthoriseTransaction() {
		return authoriseTransaction;
	}

	public void setAuthoriseTransaction(HrefType authoriseTransaction) {
		this.authoriseTransaction = authoriseTransaction;
	}

	public LinksAll authoriseTransaction(HrefType authoriseTransaction) {
		this.authoriseTransaction = authoriseTransaction;
		return this;
	}

	/**
	  * Get self
	  * @return self
	 **/
	@JsonProperty("self")
	public HrefType getSelf() {
		return self;
	}

	public void setSelf(HrefType self) {
		this.self = self;
	}

	public LinksAll self(HrefType self) {
		this.self = self;
		return this;
	}

	/**
	  * Get status
	  * @return status
	 **/
	@JsonProperty("status")
	public HrefType getStatus() {
		return status;
	}

	public void setStatus(HrefType status) {
		this.status = status;
	}

	public LinksAll status(HrefType status) {
		this.status = status;
		return this;
	}

	/**
	  * Get scaStatus
	  * @return scaStatus
	 **/
	@JsonProperty("scaStatus")
	public HrefType getScaStatus() {
		return scaStatus;
	}

	public void setScaStatus(HrefType scaStatus) {
		this.scaStatus = scaStatus;
	}

	public LinksAll scaStatus(HrefType scaStatus) {
		this.scaStatus = scaStatus;
		return this;
	}

	/**
	  * Get account
	  * @return account
	 **/
	@JsonProperty("account")
	public HrefType getAccount() {
		return account;
	}

	public void setAccount(HrefType account) {
		this.account = account;
	}

	public LinksAll account(HrefType account) {
		this.account = account;
		return this;
	}

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

	public LinksAll balances(HrefType balances) {
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

	public LinksAll transactions(HrefType transactions) {
		this.transactions = transactions;
		return this;
	}

	/**
	  * Get transactionDetails
	  * @return transactionDetails
	 **/
	@JsonProperty("transactionDetails")
	public HrefType getTransactionDetails() {
		return transactionDetails;
	}

	public void setTransactionDetails(HrefType transactionDetails) {
		this.transactionDetails = transactionDetails;
	}

	public LinksAll transactionDetails(HrefType transactionDetails) {
		this.transactionDetails = transactionDetails;
		return this;
	}

	/**
	  * Get cardAccount
	  * @return cardAccount
	 **/
	@JsonProperty("cardAccount")
	public HrefType getCardAccount() {
		return cardAccount;
	}

	public void setCardAccount(HrefType cardAccount) {
		this.cardAccount = cardAccount;
	}

	public LinksAll cardAccount(HrefType cardAccount) {
		this.cardAccount = cardAccount;
		return this;
	}

	/**
	  * Get cardTransactions
	  * @return cardTransactions
	 **/
	@JsonProperty("cardTransactions")
	public HrefType getCardTransactions() {
		return cardTransactions;
	}

	public void setCardTransactions(HrefType cardTransactions) {
		this.cardTransactions = cardTransactions;
	}

	public LinksAll cardTransactions(HrefType cardTransactions) {
		this.cardTransactions = cardTransactions;
		return this;
	}

	/**
	  * Get first
	  * @return first
	 **/
	@JsonProperty("first")
	public HrefType getFirst() {
		return first;
	}

	public void setFirst(HrefType first) {
		this.first = first;
	}

	public LinksAll first(HrefType first) {
		this.first = first;
		return this;
	}

	/**
	  * Get next
	  * @return next
	 **/
	@JsonProperty("next")
	public HrefType getNext() {
		return next;
	}

	public void setNext(HrefType next) {
		this.next = next;
	}

	public LinksAll next(HrefType next) {
		this.next = next;
		return this;
	}

	/**
	  * Get previous
	  * @return previous
	 **/
	@JsonProperty("previous")
	public HrefType getPrevious() {
		return previous;
	}

	public void setPrevious(HrefType previous) {
		this.previous = previous;
	}

	public LinksAll previous(HrefType previous) {
		this.previous = previous;
		return this;
	}

	/**
	  * Get last
	  * @return last
	 **/
	@JsonProperty("last")
	public HrefType getLast() {
		return last;
	}

	public void setLast(HrefType last) {
		this.last = last;
	}

	public LinksAll last(HrefType last) {
		this.last = last;
		return this;
	}

	/**
	  * Get download
	  * @return download
	 **/
	@JsonProperty("download")
	public HrefType getDownload() {
		return download;
	}

	public void setDownload(HrefType download) {
		this.download = download;
	}

	public LinksAll download(HrefType download) {
		this.download = download;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LinksAll {\n");
		sb.append("    ").append(toIndentedString(super.toString())).append("\n");
		sb.append("    scaRedirect: ").append(toIndentedString(scaRedirect)).append("\n");
		sb.append("    scaOAuth: ").append(toIndentedString(scaOAuth)).append("\n");
		sb.append("    confirmation: ").append(toIndentedString(confirmation)).append("\n");
		sb.append("    startAuthorisation: ").append(toIndentedString(startAuthorisation)).append("\n");
		sb.append("    startAuthorisationWithPsuIdentification: ").append(toIndentedString(startAuthorisationWithPsuIdentification)).append("\n");
		sb.append("    updatePsuIdentification: ").append(toIndentedString(updatePsuIdentification)).append("\n");
		sb.append("    startAuthorisationWithProprietaryData: ").append(toIndentedString(startAuthorisationWithProprietaryData)).append("\n");
		sb.append("    updateProprietaryData: ").append(toIndentedString(updateProprietaryData)).append("\n");
		sb.append("    startAuthorisationWithPsuAuthentication: ").append(toIndentedString(startAuthorisationWithPsuAuthentication)).append("\n");
		sb.append("    updatePsuAuthentication: ").append(toIndentedString(updatePsuAuthentication)).append("\n");
		sb.append("    startAuthorisationWithEncryptedPsuAuthentication: ").append(toIndentedString(startAuthorisationWithEncryptedPsuAuthentication)).append("\n");
		sb.append("    updateEncryptedPsuAuthentication: ").append(toIndentedString(updateEncryptedPsuAuthentication)).append("\n");
		sb.append("    updateAdditionalPsuAuthentication: ").append(toIndentedString(updateAdditionalPsuAuthentication)).append("\n");
		sb.append("    updateAdditionalEncryptedPsuAuthentication: ").append(toIndentedString(updateAdditionalEncryptedPsuAuthentication)).append("\n");
		sb.append("    startAuthorisationWithAuthenticationMethodSelection: ").append(toIndentedString(startAuthorisationWithAuthenticationMethodSelection)).append("\n");
		sb.append("    selectAuthenticationMethod: ").append(toIndentedString(selectAuthenticationMethod)).append("\n");
		sb.append("    startAuthorisationWithTransactionAuthorisation: ").append(toIndentedString(startAuthorisationWithTransactionAuthorisation)).append("\n");
		sb.append("    authoriseTransaction: ").append(toIndentedString(authoriseTransaction)).append("\n");
		sb.append("    self: ").append(toIndentedString(self)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    scaStatus: ").append(toIndentedString(scaStatus)).append("\n");
		sb.append("    account: ").append(toIndentedString(account)).append("\n");
		sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
		sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
		sb.append("    transactionDetails: ").append(toIndentedString(transactionDetails)).append("\n");
		sb.append("    cardAccount: ").append(toIndentedString(cardAccount)).append("\n");
		sb.append("    cardTransactions: ").append(toIndentedString(cardTransactions)).append("\n");
		sb.append("    first: ").append(toIndentedString(first)).append("\n");
		sb.append("    next: ").append(toIndentedString(next)).append("\n");
		sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
		sb.append("    last: ").append(toIndentedString(last)).append("\n");
		sb.append("    download: ").append(toIndentedString(download)).append("\n");
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
