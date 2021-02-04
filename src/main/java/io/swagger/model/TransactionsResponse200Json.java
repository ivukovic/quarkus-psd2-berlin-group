package io.swagger.model;

import io.swagger.model.AccountReference;
import io.swagger.model.AccountReport;
import io.swagger.model.BalanceList;
import io.swagger.model.LinksDownload;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Body of the JSON response for a successful read transaction list request. This account report contains transactions resulting from the query parameters. 
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "Body of the JSON response for a successful read transaction list request. This account report contains transactions resulting from the query parameters. ")

public class TransactionsResponse200Json   {
  private @Valid AccountReference account = null;
  private @Valid AccountReport transactions = null;
  private @Valid BalanceList balances = null;
  private @Valid LinksDownload _links = null;

  /**
   **/
  public TransactionsResponse200Json account(AccountReference account) {
    this.account = account;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("account")

  public AccountReference getAccount() {
    return account;
  }
  public void setAccount(AccountReference account) {
    this.account = account;
  }

  /**
   **/
  public TransactionsResponse200Json transactions(AccountReport transactions) {
    this.transactions = transactions;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("transactions")

  public AccountReport getTransactions() {
    return transactions;
  }
  public void setTransactions(AccountReport transactions) {
    this.transactions = transactions;
  }

  /**
   **/
  public TransactionsResponse200Json balances(BalanceList balances) {
    this.balances = balances;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("balances")

  public BalanceList getBalances() {
    return balances;
  }
  public void setBalances(BalanceList balances) {
    this.balances = balances;
  }

  /**
   **/
  public TransactionsResponse200Json _links(LinksDownload _links) {
    this._links = _links;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("_links")

  public LinksDownload getLinks() {
    return _links;
  }
  public void setLinks(LinksDownload _links) {
    this._links = _links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionsResponse200Json transactionsResponse200Json = (TransactionsResponse200Json) o;
    return Objects.equals(account, transactionsResponse200Json.account) &&
        Objects.equals(transactions, transactionsResponse200Json.transactions) &&
        Objects.equals(balances, transactionsResponse200Json.balances) &&
        Objects.equals(_links, transactionsResponse200Json._links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, transactions, balances, _links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionsResponse200Json {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
    sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
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
