package io.swagger.model;

import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Content of the body of a transaction authorisation request 
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "Content of the body of a transaction authorisation request ")

public class TransactionAuthorisation  implements OneOfbody, OneOfbody1, OneOfbody2, OneOfbody3, OneOfbody4, OneOfbody5, OneOfbody6, OneOfbody7  {
  private @Valid String scaAuthenticationData = null;

  /**
   **/
  public TransactionAuthorisation scaAuthenticationData(String scaAuthenticationData) {
    this.scaAuthenticationData = scaAuthenticationData;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("scaAuthenticationData")
  @NotNull

  public String getScaAuthenticationData() {
    return scaAuthenticationData;
  }
  public void setScaAuthenticationData(String scaAuthenticationData) {
    this.scaAuthenticationData = scaAuthenticationData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionAuthorisation transactionAuthorisation = (TransactionAuthorisation) o;
    return Objects.equals(scaAuthenticationData, transactionAuthorisation.scaAuthenticationData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scaAuthenticationData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionAuthorisation {\n");
    
    sb.append("    scaAuthenticationData: ").append(toIndentedString(scaAuthenticationData)).append("\n");
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
