package io.swagger.model;

import io.swagger.model.AccountReference;
import io.swagger.model.BalanceList;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Body of the response for a successful read balance for an account request.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "Body of the response for a successful read balance for an account request.")

public class ReadAccountBalanceResponse200   {
  private @Valid AccountReference account = null;
  private @Valid BalanceList balances = null;

  /**
   **/
  public ReadAccountBalanceResponse200 account(AccountReference account) {
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
  public ReadAccountBalanceResponse200 balances(BalanceList balances) {
    this.balances = balances;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("balances")
  @NotNull

  public BalanceList getBalances() {
    return balances;
  }
  public void setBalances(BalanceList balances) {
    this.balances = balances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReadAccountBalanceResponse200 readAccountBalanceResponse200 = (ReadAccountBalanceResponse200) o;
    return Objects.equals(account, readAccountBalanceResponse200.account) &&
        Objects.equals(balances, readAccountBalanceResponse200.balances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, balances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadAccountBalanceResponse200 {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
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
