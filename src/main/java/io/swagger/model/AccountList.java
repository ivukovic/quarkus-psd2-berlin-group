package io.swagger.model;

import io.swagger.model.AccountDetails;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * List of accounts with details. 
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "List of accounts with details. ")

public class AccountList   {
  private @Valid List<AccountDetails> accounts = new ArrayList<AccountDetails>();

  /**
   **/
  public AccountList accounts(List<AccountDetails> accounts) {
    this.accounts = accounts;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("accounts")
  @NotNull

  public List<AccountDetails> getAccounts() {
    return accounts;
  }
  public void setAccounts(List<AccountDetails> accounts) {
    this.accounts = accounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountList accountList = (AccountList) o;
    return Objects.equals(accounts, accountList.accounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountList {\n");
    
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
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
