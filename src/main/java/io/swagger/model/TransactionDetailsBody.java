package io.swagger.model;

import io.swagger.model.Transactions;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Transaction details.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "Transaction details.")

public class TransactionDetailsBody   {
  private @Valid Transactions transactionDetails = null;

  /**
   **/
  public TransactionDetailsBody transactionDetails(Transactions transactionDetails) {
    this.transactionDetails = transactionDetails;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("transactionDetails")
  @NotNull

  public Transactions getTransactionDetails() {
    return transactionDetails;
  }
  public void setTransactionDetails(Transactions transactionDetails) {
    this.transactionDetails = transactionDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionDetailsBody transactionDetailsBody = (TransactionDetailsBody) o;
    return Objects.equals(transactionDetails, transactionDetailsBody.transactionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionDetailsBody {\n");
    
    sb.append("    transactionDetails: ").append(toIndentedString(transactionDetails)).append("\n");
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
