package io.swagger.model;

import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Content of the body of an authorisation confirmation request 
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "Content of the body of an authorisation confirmation request ")

public class AuthorisationConfirmation  implements OneOfbody1, OneOfbody3, OneOfbody5, OneOfbody7  {
  private @Valid String confirmationCode = null;

  /**
   * Confirmation Code as retrieved by the TPP from the redirect based SCA process.
   **/
  public AuthorisationConfirmation confirmationCode(String confirmationCode) {
    this.confirmationCode = confirmationCode;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Confirmation Code as retrieved by the TPP from the redirect based SCA process.")
  @JsonProperty("confirmationCode")
  @NotNull

  public String getConfirmationCode() {
    return confirmationCode;
  }
  public void setConfirmationCode(String confirmationCode) {
    this.confirmationCode = confirmationCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorisationConfirmation authorisationConfirmation = (AuthorisationConfirmation) o;
    return Objects.equals(confirmationCode, authorisationConfirmation.confirmationCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confirmationCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorisationConfirmation {\n");
    
    sb.append("    confirmationCode: ").append(toIndentedString(confirmationCode)).append("\n");
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
