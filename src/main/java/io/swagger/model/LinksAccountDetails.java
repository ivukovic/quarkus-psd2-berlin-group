package io.swagger.model;

import io.swagger.model.HrefType;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Links to the account, which can be directly used for retrieving account information from this dedicated account.  Links to \&quot;balances\&quot; and/or \&quot;transactions\&quot;  These links are only supported, when the corresponding consent has been already granted. 
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "Links to the account, which can be directly used for retrieving account information from this dedicated account.  Links to \"balances\" and/or \"transactions\"  These links are only supported, when the corresponding consent has been already granted. ")

public class LinksAccountDetails extends HashMap<String, HrefType>  {
  private @Valid HrefType balances = null;
  private @Valid HrefType transactions = null;

  /**
   **/
  public LinksAccountDetails balances(HrefType balances) {
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
  public LinksAccountDetails transactions(HrefType transactions) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinksAccountDetails _linksAccountDetails = (LinksAccountDetails) o;
    return Objects.equals(balances, _linksAccountDetails.balances) &&
        Objects.equals(transactions, _linksAccountDetails.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balances, transactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinksAccountDetails {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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
