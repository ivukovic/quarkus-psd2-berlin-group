package io.swagger.model;

import io.swagger.model.HrefType;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LinksTransactionDetails extends HashMap<String, HrefType>  {
  private @Valid HrefType transactionDetails = null;

  /**
   **/
  public LinksTransactionDetails transactionDetails(HrefType transactionDetails) {
    this.transactionDetails = transactionDetails;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("transactionDetails")
  @NotNull

  public HrefType getTransactionDetails() {
    return transactionDetails;
  }
  public void setTransactionDetails(HrefType transactionDetails) {
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
    LinksTransactionDetails _linksTransactionDetails = (LinksTransactionDetails) o;
    return Objects.equals(transactionDetails, _linksTransactionDetails.transactionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinksTransactionDetails {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
