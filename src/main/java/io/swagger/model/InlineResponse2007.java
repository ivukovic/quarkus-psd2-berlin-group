package io.swagger.model;

import io.swagger.model.CardAccountDetails;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class InlineResponse2007   {
  private @Valid CardAccountDetails cardAccount = null;

  /**
   **/
  public InlineResponse2007 cardAccount(CardAccountDetails cardAccount) {
    this.cardAccount = cardAccount;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("cardAccount")
  @NotNull

  public CardAccountDetails getCardAccount() {
    return cardAccount;
  }
  public void setCardAccount(CardAccountDetails cardAccount) {
    this.cardAccount = cardAccount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2007 inlineResponse2007 = (InlineResponse2007) o;
    return Objects.equals(cardAccount, inlineResponse2007.cardAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2007 {\n");
    
    sb.append("    cardAccount: ").append(toIndentedString(cardAccount)).append("\n");
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
