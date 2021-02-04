package io.swagger.model;

import io.swagger.model.AuthenticationType;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Authentication object. 
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "Authentication object. ")

public class AuthenticationObject   {
  private @Valid AuthenticationType authenticationType = null;
  private @Valid String authenticationVersion = null;
  private @Valid String authenticationMethodId = null;
  private @Valid String name = null;
  private @Valid String explanation = null;

  /**
   **/
  public AuthenticationObject authenticationType(AuthenticationType authenticationType) {
    this.authenticationType = authenticationType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("authenticationType")
  @NotNull

  public AuthenticationType getAuthenticationType() {
    return authenticationType;
  }
  public void setAuthenticationType(AuthenticationType authenticationType) {
    this.authenticationType = authenticationType;
  }

  /**
   * Depending on the \&quot;authenticationType\&quot;. This version can be used by differentiating authentication tools used within performing OTP generation in the same authentication type. This version can be referred to in the ASPSP?s documentation. 
   **/
  public AuthenticationObject authenticationVersion(String authenticationVersion) {
    this.authenticationVersion = authenticationVersion;
    return this;
  }

  
  @ApiModelProperty(value = "Depending on the \"authenticationType\". This version can be used by differentiating authentication tools used within performing OTP generation in the same authentication type. This version can be referred to in the ASPSP?s documentation. ")
  @JsonProperty("authenticationVersion")

  public String getAuthenticationVersion() {
    return authenticationVersion;
  }
  public void setAuthenticationVersion(String authenticationVersion) {
    this.authenticationVersion = authenticationVersion;
  }

  /**
   **/
  public AuthenticationObject authenticationMethodId(String authenticationMethodId) {
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

  /**
   * This is the name of the authentication method defined by the PSU in the Online Banking frontend of the ASPSP. Alternatively this could be a description provided by the ASPSP like \&quot;SMS OTP on phone +49160 xxxxx 28\&quot;. This name shall be used by the TPP when presenting a list of authentication methods to the PSU, if available. 
   **/
  public AuthenticationObject name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "SMS OTP on phone +49160 xxxxx 28", value = "This is the name of the authentication method defined by the PSU in the Online Banking frontend of the ASPSP. Alternatively this could be a description provided by the ASPSP like \"SMS OTP on phone +49160 xxxxx 28\". This name shall be used by the TPP when presenting a list of authentication methods to the PSU, if available. ")
  @JsonProperty("name")

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Detailed information about the SCA method for the PSU. 
   **/
  public AuthenticationObject explanation(String explanation) {
    this.explanation = explanation;
    return this;
  }

  
  @ApiModelProperty(example = "Detailed information about the SCA method for the PSU.", value = "Detailed information about the SCA method for the PSU. ")
  @JsonProperty("explanation")

  public String getExplanation() {
    return explanation;
  }
  public void setExplanation(String explanation) {
    this.explanation = explanation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationObject authenticationObject = (AuthenticationObject) o;
    return Objects.equals(authenticationType, authenticationObject.authenticationType) &&
        Objects.equals(authenticationVersion, authenticationObject.authenticationVersion) &&
        Objects.equals(authenticationMethodId, authenticationObject.authenticationMethodId) &&
        Objects.equals(name, authenticationObject.name) &&
        Objects.equals(explanation, authenticationObject.explanation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationType, authenticationVersion, authenticationMethodId, name, explanation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationObject {\n");
    
    sb.append("    authenticationType: ").append(toIndentedString(authenticationType)).append("\n");
    sb.append("    authenticationVersion: ").append(toIndentedString(authenticationVersion)).append("\n");
    sb.append("    authenticationMethodId: ").append(toIndentedString(authenticationMethodId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
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
