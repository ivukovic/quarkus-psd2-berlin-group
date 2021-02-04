package io.swagger.model;

import io.swagger.model.HrefType;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * A _link object with all availabel link types. 
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "A _link object with all availabel link types. ")

public class LinksAll extends HashMap<String, HrefType>  {
  private @Valid HrefType scaRedirect = null;
  private @Valid HrefType scaOAuth = null;
  private @Valid HrefType confirmation = null;
  private @Valid HrefType startAuthorisation = null;
  private @Valid HrefType startAuthorisationWithPsuIdentification = null;
  private @Valid HrefType updatePsuIdentification = null;
  private @Valid HrefType startAuthorisationWithProprietaryData = null;
  private @Valid HrefType updateProprietaryData = null;
  private @Valid HrefType startAuthorisationWithPsuAuthentication = null;
  private @Valid HrefType updatePsuAuthentication = null;
  private @Valid HrefType startAuthorisationWithEncryptedPsuAuthentication = null;
  private @Valid HrefType updateEncryptedPsuAuthentication = null;
  private @Valid HrefType updateAdditionalPsuAuthentication = null;
  private @Valid HrefType updateAdditionalEncryptedPsuAuthentication = null;
  private @Valid HrefType startAuthorisationWithAuthenticationMethodSelection = null;
  private @Valid HrefType selectAuthenticationMethod = null;
  private @Valid HrefType startAuthorisationWithTransactionAuthorisation = null;
  private @Valid HrefType authoriseTransaction = null;
  private @Valid HrefType self = null;
  private @Valid HrefType status = null;
  private @Valid HrefType scaStatus = null;
  private @Valid HrefType account = null;
  private @Valid HrefType balances = null;
  private @Valid HrefType transactions = null;
  private @Valid HrefType transactionDetails = null;
  private @Valid HrefType cardAccount = null;
  private @Valid HrefType cardTransactions = null;
  private @Valid HrefType first = null;
  private @Valid HrefType next = null;
  private @Valid HrefType previous = null;
  private @Valid HrefType last = null;
  private @Valid HrefType download = null;

  /**
   **/
  public LinksAll scaRedirect(HrefType scaRedirect) {
    this.scaRedirect = scaRedirect;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("scaRedirect")

  public HrefType getScaRedirect() {
    return scaRedirect;
  }
  public void setScaRedirect(HrefType scaRedirect) {
    this.scaRedirect = scaRedirect;
  }

  /**
   **/
  public LinksAll scaOAuth(HrefType scaOAuth) {
    this.scaOAuth = scaOAuth;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("scaOAuth")

  public HrefType getScaOAuth() {
    return scaOAuth;
  }
  public void setScaOAuth(HrefType scaOAuth) {
    this.scaOAuth = scaOAuth;
  }

  /**
   **/
  public LinksAll confirmation(HrefType confirmation) {
    this.confirmation = confirmation;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("confirmation")

  public HrefType getConfirmation() {
    return confirmation;
  }
  public void setConfirmation(HrefType confirmation) {
    this.confirmation = confirmation;
  }

  /**
   **/
  public LinksAll startAuthorisation(HrefType startAuthorisation) {
    this.startAuthorisation = startAuthorisation;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("startAuthorisation")

  public HrefType getStartAuthorisation() {
    return startAuthorisation;
  }
  public void setStartAuthorisation(HrefType startAuthorisation) {
    this.startAuthorisation = startAuthorisation;
  }

  /**
   **/
  public LinksAll startAuthorisationWithPsuIdentification(HrefType startAuthorisationWithPsuIdentification) {
    this.startAuthorisationWithPsuIdentification = startAuthorisationWithPsuIdentification;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("startAuthorisationWithPsuIdentification")

  public HrefType getStartAuthorisationWithPsuIdentification() {
    return startAuthorisationWithPsuIdentification;
  }
  public void setStartAuthorisationWithPsuIdentification(HrefType startAuthorisationWithPsuIdentification) {
    this.startAuthorisationWithPsuIdentification = startAuthorisationWithPsuIdentification;
  }

  /**
   **/
  public LinksAll updatePsuIdentification(HrefType updatePsuIdentification) {
    this.updatePsuIdentification = updatePsuIdentification;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("updatePsuIdentification")

  public HrefType getUpdatePsuIdentification() {
    return updatePsuIdentification;
  }
  public void setUpdatePsuIdentification(HrefType updatePsuIdentification) {
    this.updatePsuIdentification = updatePsuIdentification;
  }

  /**
   **/
  public LinksAll startAuthorisationWithProprietaryData(HrefType startAuthorisationWithProprietaryData) {
    this.startAuthorisationWithProprietaryData = startAuthorisationWithProprietaryData;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("startAuthorisationWithProprietaryData")

  public HrefType getStartAuthorisationWithProprietaryData() {
    return startAuthorisationWithProprietaryData;
  }
  public void setStartAuthorisationWithProprietaryData(HrefType startAuthorisationWithProprietaryData) {
    this.startAuthorisationWithProprietaryData = startAuthorisationWithProprietaryData;
  }

  /**
   **/
  public LinksAll updateProprietaryData(HrefType updateProprietaryData) {
    this.updateProprietaryData = updateProprietaryData;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("updateProprietaryData")

  public HrefType getUpdateProprietaryData() {
    return updateProprietaryData;
  }
  public void setUpdateProprietaryData(HrefType updateProprietaryData) {
    this.updateProprietaryData = updateProprietaryData;
  }

  /**
   **/
  public LinksAll startAuthorisationWithPsuAuthentication(HrefType startAuthorisationWithPsuAuthentication) {
    this.startAuthorisationWithPsuAuthentication = startAuthorisationWithPsuAuthentication;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("startAuthorisationWithPsuAuthentication")

  public HrefType getStartAuthorisationWithPsuAuthentication() {
    return startAuthorisationWithPsuAuthentication;
  }
  public void setStartAuthorisationWithPsuAuthentication(HrefType startAuthorisationWithPsuAuthentication) {
    this.startAuthorisationWithPsuAuthentication = startAuthorisationWithPsuAuthentication;
  }

  /**
   **/
  public LinksAll updatePsuAuthentication(HrefType updatePsuAuthentication) {
    this.updatePsuAuthentication = updatePsuAuthentication;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("updatePsuAuthentication")

  public HrefType getUpdatePsuAuthentication() {
    return updatePsuAuthentication;
  }
  public void setUpdatePsuAuthentication(HrefType updatePsuAuthentication) {
    this.updatePsuAuthentication = updatePsuAuthentication;
  }

  /**
   **/
  public LinksAll startAuthorisationWithEncryptedPsuAuthentication(HrefType startAuthorisationWithEncryptedPsuAuthentication) {
    this.startAuthorisationWithEncryptedPsuAuthentication = startAuthorisationWithEncryptedPsuAuthentication;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("startAuthorisationWithEncryptedPsuAuthentication")

  public HrefType getStartAuthorisationWithEncryptedPsuAuthentication() {
    return startAuthorisationWithEncryptedPsuAuthentication;
  }
  public void setStartAuthorisationWithEncryptedPsuAuthentication(HrefType startAuthorisationWithEncryptedPsuAuthentication) {
    this.startAuthorisationWithEncryptedPsuAuthentication = startAuthorisationWithEncryptedPsuAuthentication;
  }

  /**
   **/
  public LinksAll updateEncryptedPsuAuthentication(HrefType updateEncryptedPsuAuthentication) {
    this.updateEncryptedPsuAuthentication = updateEncryptedPsuAuthentication;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("updateEncryptedPsuAuthentication")

  public HrefType getUpdateEncryptedPsuAuthentication() {
    return updateEncryptedPsuAuthentication;
  }
  public void setUpdateEncryptedPsuAuthentication(HrefType updateEncryptedPsuAuthentication) {
    this.updateEncryptedPsuAuthentication = updateEncryptedPsuAuthentication;
  }

  /**
   **/
  public LinksAll updateAdditionalPsuAuthentication(HrefType updateAdditionalPsuAuthentication) {
    this.updateAdditionalPsuAuthentication = updateAdditionalPsuAuthentication;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("updateAdditionalPsuAuthentication")

  public HrefType getUpdateAdditionalPsuAuthentication() {
    return updateAdditionalPsuAuthentication;
  }
  public void setUpdateAdditionalPsuAuthentication(HrefType updateAdditionalPsuAuthentication) {
    this.updateAdditionalPsuAuthentication = updateAdditionalPsuAuthentication;
  }

  /**
   **/
  public LinksAll updateAdditionalEncryptedPsuAuthentication(HrefType updateAdditionalEncryptedPsuAuthentication) {
    this.updateAdditionalEncryptedPsuAuthentication = updateAdditionalEncryptedPsuAuthentication;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("updateAdditionalEncryptedPsuAuthentication")

  public HrefType getUpdateAdditionalEncryptedPsuAuthentication() {
    return updateAdditionalEncryptedPsuAuthentication;
  }
  public void setUpdateAdditionalEncryptedPsuAuthentication(HrefType updateAdditionalEncryptedPsuAuthentication) {
    this.updateAdditionalEncryptedPsuAuthentication = updateAdditionalEncryptedPsuAuthentication;
  }

  /**
   **/
  public LinksAll startAuthorisationWithAuthenticationMethodSelection(HrefType startAuthorisationWithAuthenticationMethodSelection) {
    this.startAuthorisationWithAuthenticationMethodSelection = startAuthorisationWithAuthenticationMethodSelection;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("startAuthorisationWithAuthenticationMethodSelection")

  public HrefType getStartAuthorisationWithAuthenticationMethodSelection() {
    return startAuthorisationWithAuthenticationMethodSelection;
  }
  public void setStartAuthorisationWithAuthenticationMethodSelection(HrefType startAuthorisationWithAuthenticationMethodSelection) {
    this.startAuthorisationWithAuthenticationMethodSelection = startAuthorisationWithAuthenticationMethodSelection;
  }

  /**
   **/
  public LinksAll selectAuthenticationMethod(HrefType selectAuthenticationMethod) {
    this.selectAuthenticationMethod = selectAuthenticationMethod;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("selectAuthenticationMethod")

  public HrefType getSelectAuthenticationMethod() {
    return selectAuthenticationMethod;
  }
  public void setSelectAuthenticationMethod(HrefType selectAuthenticationMethod) {
    this.selectAuthenticationMethod = selectAuthenticationMethod;
  }

  /**
   **/
  public LinksAll startAuthorisationWithTransactionAuthorisation(HrefType startAuthorisationWithTransactionAuthorisation) {
    this.startAuthorisationWithTransactionAuthorisation = startAuthorisationWithTransactionAuthorisation;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("startAuthorisationWithTransactionAuthorisation")

  public HrefType getStartAuthorisationWithTransactionAuthorisation() {
    return startAuthorisationWithTransactionAuthorisation;
  }
  public void setStartAuthorisationWithTransactionAuthorisation(HrefType startAuthorisationWithTransactionAuthorisation) {
    this.startAuthorisationWithTransactionAuthorisation = startAuthorisationWithTransactionAuthorisation;
  }

  /**
   **/
  public LinksAll authoriseTransaction(HrefType authoriseTransaction) {
    this.authoriseTransaction = authoriseTransaction;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("authoriseTransaction")

  public HrefType getAuthoriseTransaction() {
    return authoriseTransaction;
  }
  public void setAuthoriseTransaction(HrefType authoriseTransaction) {
    this.authoriseTransaction = authoriseTransaction;
  }

  /**
   **/
  public LinksAll self(HrefType self) {
    this.self = self;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("self")

  public HrefType getSelf() {
    return self;
  }
  public void setSelf(HrefType self) {
    this.self = self;
  }

  /**
   **/
  public LinksAll status(HrefType status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")

  public HrefType getStatus() {
    return status;
  }
  public void setStatus(HrefType status) {
    this.status = status;
  }

  /**
   **/
  public LinksAll scaStatus(HrefType scaStatus) {
    this.scaStatus = scaStatus;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("scaStatus")

  public HrefType getScaStatus() {
    return scaStatus;
  }
  public void setScaStatus(HrefType scaStatus) {
    this.scaStatus = scaStatus;
  }

  /**
   **/
  public LinksAll account(HrefType account) {
    this.account = account;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("account")

  public HrefType getAccount() {
    return account;
  }
  public void setAccount(HrefType account) {
    this.account = account;
  }

  /**
   **/
  public LinksAll balances(HrefType balances) {
    this.balances = balances;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("balances")

  public HrefType getBalances() {
    return balances;
  }
  public void setBalances(HrefType balances) {
    this.balances = balances;
  }

  /**
   **/
  public LinksAll transactions(HrefType transactions) {
    this.transactions = transactions;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("transactions")

  public HrefType getTransactions() {
    return transactions;
  }
  public void setTransactions(HrefType transactions) {
    this.transactions = transactions;
  }

  /**
   **/
  public LinksAll transactionDetails(HrefType transactionDetails) {
    this.transactionDetails = transactionDetails;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("transactionDetails")

  public HrefType getTransactionDetails() {
    return transactionDetails;
  }
  public void setTransactionDetails(HrefType transactionDetails) {
    this.transactionDetails = transactionDetails;
  }

  /**
   **/
  public LinksAll cardAccount(HrefType cardAccount) {
    this.cardAccount = cardAccount;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cardAccount")

  public HrefType getCardAccount() {
    return cardAccount;
  }
  public void setCardAccount(HrefType cardAccount) {
    this.cardAccount = cardAccount;
  }

  /**
   **/
  public LinksAll cardTransactions(HrefType cardTransactions) {
    this.cardTransactions = cardTransactions;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cardTransactions")

  public HrefType getCardTransactions() {
    return cardTransactions;
  }
  public void setCardTransactions(HrefType cardTransactions) {
    this.cardTransactions = cardTransactions;
  }

  /**
   **/
  public LinksAll first(HrefType first) {
    this.first = first;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("first")

  public HrefType getFirst() {
    return first;
  }
  public void setFirst(HrefType first) {
    this.first = first;
  }

  /**
   **/
  public LinksAll next(HrefType next) {
    this.next = next;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("next")

  public HrefType getNext() {
    return next;
  }
  public void setNext(HrefType next) {
    this.next = next;
  }

  /**
   **/
  public LinksAll previous(HrefType previous) {
    this.previous = previous;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("previous")

  public HrefType getPrevious() {
    return previous;
  }
  public void setPrevious(HrefType previous) {
    this.previous = previous;
  }

  /**
   **/
  public LinksAll last(HrefType last) {
    this.last = last;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("last")

  public HrefType getLast() {
    return last;
  }
  public void setLast(HrefType last) {
    this.last = last;
  }

  /**
   **/
  public LinksAll download(HrefType download) {
    this.download = download;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("download")

  public HrefType getDownload() {
    return download;
  }
  public void setDownload(HrefType download) {
    this.download = download;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinksAll _linksAll = (LinksAll) o;
    return Objects.equals(scaRedirect, _linksAll.scaRedirect) &&
        Objects.equals(scaOAuth, _linksAll.scaOAuth) &&
        Objects.equals(confirmation, _linksAll.confirmation) &&
        Objects.equals(startAuthorisation, _linksAll.startAuthorisation) &&
        Objects.equals(startAuthorisationWithPsuIdentification, _linksAll.startAuthorisationWithPsuIdentification) &&
        Objects.equals(updatePsuIdentification, _linksAll.updatePsuIdentification) &&
        Objects.equals(startAuthorisationWithProprietaryData, _linksAll.startAuthorisationWithProprietaryData) &&
        Objects.equals(updateProprietaryData, _linksAll.updateProprietaryData) &&
        Objects.equals(startAuthorisationWithPsuAuthentication, _linksAll.startAuthorisationWithPsuAuthentication) &&
        Objects.equals(updatePsuAuthentication, _linksAll.updatePsuAuthentication) &&
        Objects.equals(startAuthorisationWithEncryptedPsuAuthentication, _linksAll.startAuthorisationWithEncryptedPsuAuthentication) &&
        Objects.equals(updateEncryptedPsuAuthentication, _linksAll.updateEncryptedPsuAuthentication) &&
        Objects.equals(updateAdditionalPsuAuthentication, _linksAll.updateAdditionalPsuAuthentication) &&
        Objects.equals(updateAdditionalEncryptedPsuAuthentication, _linksAll.updateAdditionalEncryptedPsuAuthentication) &&
        Objects.equals(startAuthorisationWithAuthenticationMethodSelection, _linksAll.startAuthorisationWithAuthenticationMethodSelection) &&
        Objects.equals(selectAuthenticationMethod, _linksAll.selectAuthenticationMethod) &&
        Objects.equals(startAuthorisationWithTransactionAuthorisation, _linksAll.startAuthorisationWithTransactionAuthorisation) &&
        Objects.equals(authoriseTransaction, _linksAll.authoriseTransaction) &&
        Objects.equals(self, _linksAll.self) &&
        Objects.equals(status, _linksAll.status) &&
        Objects.equals(scaStatus, _linksAll.scaStatus) &&
        Objects.equals(account, _linksAll.account) &&
        Objects.equals(balances, _linksAll.balances) &&
        Objects.equals(transactions, _linksAll.transactions) &&
        Objects.equals(transactionDetails, _linksAll.transactionDetails) &&
        Objects.equals(cardAccount, _linksAll.cardAccount) &&
        Objects.equals(cardTransactions, _linksAll.cardTransactions) &&
        Objects.equals(first, _linksAll.first) &&
        Objects.equals(next, _linksAll.next) &&
        Objects.equals(previous, _linksAll.previous) &&
        Objects.equals(last, _linksAll.last) &&
        Objects.equals(download, _linksAll.download);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scaRedirect, scaOAuth, confirmation, startAuthorisation, startAuthorisationWithPsuIdentification, updatePsuIdentification, startAuthorisationWithProprietaryData, updateProprietaryData, startAuthorisationWithPsuAuthentication, updatePsuAuthentication, startAuthorisationWithEncryptedPsuAuthentication, updateEncryptedPsuAuthentication, updateAdditionalPsuAuthentication, updateAdditionalEncryptedPsuAuthentication, startAuthorisationWithAuthenticationMethodSelection, selectAuthenticationMethod, startAuthorisationWithTransactionAuthorisation, authoriseTransaction, self, status, scaStatus, account, balances, transactions, transactionDetails, cardAccount, cardTransactions, first, next, previous, last, download);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
