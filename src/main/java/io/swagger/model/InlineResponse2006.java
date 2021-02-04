package io.swagger.model;

import io.swagger.model.TransactionDetailsBody;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class InlineResponse2006   {
  private @Valid TransactionDetailsBody transactionsDetails = null;

  /**
   **/
  public InlineResponse2006 transactionsDetails(TransactionDetailsBody transactionsDetails) {
    this.transactionsDetails = transactionsDetails;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("transactionsDetails")
  @NotNull

  public TransactionDetailsBody getTransactionsDetails() {
    return transactionsDetails;
  }
  public void setTransactionsDetails(TransactionDetailsBody transactionsDetails) {
    this.transactionsDetails = transactionsDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2006 inlineResponse2006 = (InlineResponse2006) o;
    return Objects.equals(transactionsDetails, inlineResponse2006.transactionsDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionsDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2006 {\n");
    
    sb.append("    transactionsDetails: ").append(toIndentedString(transactionsDetails)).append("\n");
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
