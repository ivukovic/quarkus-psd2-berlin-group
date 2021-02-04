package io.swagger.model;

import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Content of the body of a Select PSU authentication method request 
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "Content of the body of a Select PSU authentication method request ")

public class SelectPsuAuthenticationMethod  implements OneOfbody, OneOfbody1, OneOfbody2, OneOfbody3, OneOfbody4, OneOfbody5, OneOfbody6, OneOfbody7  {
  private @Valid String authenticationMethodId = null;

  /**
   **/
  public SelectPsuAuthenticationMethod authenticationMethodId(String authenticationMethodId) {
    this.authenticationMethodId = authenticationMethodId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("authenticationMethodId")
  @NotNull
 @Size(max=35)
  public String getAuthenticationMethodId() {
    return authenticationMethodId;
  }
  public void setAuthenticationMethodId(String authenticationMethodId) {
    this.authenticationMethodId = authenticationMethodId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelectPsuAuthenticationMethod selectPsuAuthenticationMethod = (SelectPsuAuthenticationMethod) o;
    return Objects.equals(authenticationMethodId, selectPsuAuthenticationMethod.authenticationMethodId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationMethodId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelectPsuAuthenticationMethod {\n");
    
    sb.append("    authenticationMethodId: ").append(toIndentedString(authenticationMethodId)).append("\n");
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
