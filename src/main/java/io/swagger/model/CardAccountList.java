package io.swagger.model;

import io.swagger.model.CardAccountDetails;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * List of card accounts with details. 
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "List of card accounts with details. ")

public class CardAccountList   {
  private @Valid List<CardAccountDetails> cardAccounts = new ArrayList<CardAccountDetails>();

  /**
   **/
  public CardAccountList cardAccounts(List<CardAccountDetails> cardAccounts) {
    this.cardAccounts = cardAccounts;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("cardAccounts")
  @NotNull

  public List<CardAccountDetails> getCardAccounts() {
    return cardAccounts;
  }
  public void setCardAccounts(List<CardAccountDetails> cardAccounts) {
    this.cardAccounts = cardAccounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardAccountList cardAccountList = (CardAccountList) o;
    return Objects.equals(cardAccounts, cardAccountList.cardAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardAccounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardAccountList {\n");
    
    sb.append("    cardAccounts: ").append(toIndentedString(cardAccounts)).append("\n");
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
