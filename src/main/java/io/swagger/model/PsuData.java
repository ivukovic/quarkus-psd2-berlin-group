package io.swagger.model;

import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * PSU Data for Update PSU authentication.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "PSU Data for Update PSU authentication.")

public class PsuData   {
  private @Valid String password = null;
  private @Valid String encryptedPassword = null;
  private @Valid String additionalPassword = null;
  private @Valid String additionalEncryptedPassword = null;

  /**
   * Password.
   **/
  public PsuData password(String password) {
    this.password = password;
    return this;
  }

  
  @ApiModelProperty(value = "Password.")
  @JsonProperty("password")

  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * Encrypted password.
   **/
  public PsuData encryptedPassword(String encryptedPassword) {
    this.encryptedPassword = encryptedPassword;
    return this;
  }

  
  @ApiModelProperty(value = "Encrypted password.")
  @JsonProperty("encryptedPassword")

  public String getEncryptedPassword() {
    return encryptedPassword;
  }
  public void setEncryptedPassword(String encryptedPassword) {
    this.encryptedPassword = encryptedPassword;
  }

  /**
   * Additional password in plaintext.
   **/
  public PsuData additionalPassword(String additionalPassword) {
    this.additionalPassword = additionalPassword;
    return this;
  }

  
  @ApiModelProperty(value = "Additional password in plaintext.")
  @JsonProperty("additionalPassword")

  public String getAdditionalPassword() {
    return additionalPassword;
  }
  public void setAdditionalPassword(String additionalPassword) {
    this.additionalPassword = additionalPassword;
  }

  /**
   * Additional encrypted password.
   **/
  public PsuData additionalEncryptedPassword(String additionalEncryptedPassword) {
    this.additionalEncryptedPassword = additionalEncryptedPassword;
    return this;
  }

  
  @ApiModelProperty(value = "Additional encrypted password.")
  @JsonProperty("additionalEncryptedPassword")

  public String getAdditionalEncryptedPassword() {
    return additionalEncryptedPassword;
  }
  public void setAdditionalEncryptedPassword(String additionalEncryptedPassword) {
    this.additionalEncryptedPassword = additionalEncryptedPassword;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PsuData psuData = (PsuData) o;
    return Objects.equals(password, psuData.password) &&
        Objects.equals(encryptedPassword, psuData.encryptedPassword) &&
        Objects.equals(additionalPassword, psuData.additionalPassword) &&
        Objects.equals(additionalEncryptedPassword, psuData.additionalEncryptedPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, encryptedPassword, additionalPassword, additionalEncryptedPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PsuData {\n");
    
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    encryptedPassword: ").append(toIndentedString(encryptedPassword)).append("\n");
    sb.append("    additionalPassword: ").append(toIndentedString(additionalPassword)).append("\n");
    sb.append("    additionalEncryptedPassword: ").append(toIndentedString(additionalEncryptedPassword)).append("\n");
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
