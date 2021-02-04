package io.swagger.model;

import io.swagger.model.HrefType;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * A list of hyperlinks to be recognised by the TPP. Might be contained, if several authentication methods  are available for the PSU. Type of links admitted in this response:   * &#x27;updateAdditionalPsuAuthentication&#x27;:     The link to the payment initiation or account information resource,      which needs to be updated by an additional PSU password.      This link is only contained in rare cases,      where such additional passwords are needed for PSU authentications.   * &#x27;updateAdditionalEncryptedPsuAuthentication&#x27;:      The link to the payment initiation or account information resource,      which needs to be updated by an additional encrypted PSU password.      This link is only contained in rare cases, where such additional passwords are needed for PSU authentications.   * &#x27;selectAuthenticationMethod&#x27;:      This is a link to a resource, where the TPP can select the applicable second factor authentication      methods for the PSU, if there were several available authentication methods.      This link is only contained, if the PSU is already identified or authenticated with the first relevant      factor or alternatively an access token, if SCA is required and if the PSU has a choice between different      authentication methods.      If this link is contained, then there is also the data element &#x27;scaMethods&#x27; contained in the response body.   * &#x27;authoriseTransaction&#x27;:      The link to the resource, where the \&quot;Transaction authorisation request\&quot; is sent to.      This is the link to the resource which will authorise the transaction by checking the SCA authentication      data within the Embedded SCA approach.   * &#x27;scaStatus&#x27;:      The link to retrieve the scaStatus of the corresponding authorisation sub-resource. 
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "A list of hyperlinks to be recognised by the TPP. Might be contained, if several authentication methods  are available for the PSU. Type of links admitted in this response:   * 'updateAdditionalPsuAuthentication':     The link to the payment initiation or account information resource,      which needs to be updated by an additional PSU password.      This link is only contained in rare cases,      where such additional passwords are needed for PSU authentications.   * 'updateAdditionalEncryptedPsuAuthentication':      The link to the payment initiation or account information resource,      which needs to be updated by an additional encrypted PSU password.      This link is only contained in rare cases, where such additional passwords are needed for PSU authentications.   * 'selectAuthenticationMethod':      This is a link to a resource, where the TPP can select the applicable second factor authentication      methods for the PSU, if there were several available authentication methods.      This link is only contained, if the PSU is already identified or authenticated with the first relevant      factor or alternatively an access token, if SCA is required and if the PSU has a choice between different      authentication methods.      If this link is contained, then there is also the data element 'scaMethods' contained in the response body.   * 'authoriseTransaction':      The link to the resource, where the \"Transaction authorisation request\" is sent to.      This is the link to the resource which will authorise the transaction by checking the SCA authentication      data within the Embedded SCA approach.   * 'scaStatus':      The link to retrieve the scaStatus of the corresponding authorisation sub-resource. ")

public class LinksUpdatePsuAuthentication extends HashMap<String, HrefType>  {
  private @Valid HrefType updateAdditionalPsuAuthentication = null;
  private @Valid HrefType updateAdditionalEncryptedPsuAuthentication = null;
  private @Valid HrefType selectAuthenticationMethod = null;
  private @Valid HrefType authoriseTransaction = null;
  private @Valid HrefType scaStatus = null;

  /**
   **/
  public LinksUpdatePsuAuthentication updateAdditionalPsuAuthentication(HrefType updateAdditionalPsuAuthentication) {
    this.updateAdditionalPsuAuthentication = updateAdditionalPsuAuthentication;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("updateAdditionalPsuAuthentication")

  public HrefType getUpdateAdditionalPsuAuthentication() {
    return updateAdditionalPsuAuthentication;
  }
  public void setUpdateAdditionalPsuAuthentication(HrefType updateAdditionalPsuAuthentication) {
    this.updateAdditionalPsuAuthentication = updateAdditionalPsuAuthentication;
  }

  /**
   **/
  public LinksUpdatePsuAuthentication updateAdditionalEncryptedPsuAuthentication(HrefType updateAdditionalEncryptedPsuAuthentication) {
    this.updateAdditionalEncryptedPsuAuthentication = updateAdditionalEncryptedPsuAuthentication;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("updateAdditionalEncryptedPsuAuthentication")

  public HrefType getUpdateAdditionalEncryptedPsuAuthentication() {
    return updateAdditionalEncryptedPsuAuthentication;
  }
  public void setUpdateAdditionalEncryptedPsuAuthentication(HrefType updateAdditionalEncryptedPsuAuthentication) {
    this.updateAdditionalEncryptedPsuAuthentication = updateAdditionalEncryptedPsuAuthentication;
  }

  /**
   **/
  public LinksUpdatePsuAuthentication selectAuthenticationMethod(HrefType selectAuthenticationMethod) {
    this.selectAuthenticationMethod = selectAuthenticationMethod;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("selectAuthenticationMethod")

  public HrefType getSelectAuthenticationMethod() {
    return selectAuthenticationMethod;
  }
  public void setSelectAuthenticationMethod(HrefType selectAuthenticationMethod) {
    this.selectAuthenticationMethod = selectAuthenticationMethod;
  }

  /**
   **/
  public LinksUpdatePsuAuthentication authoriseTransaction(HrefType authoriseTransaction) {
    this.authoriseTransaction = authoriseTransaction;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("authoriseTransaction")

  public HrefType getAuthoriseTransaction() {
    return authoriseTransaction;
  }
  public void setAuthoriseTransaction(HrefType authoriseTransaction) {
    this.authoriseTransaction = authoriseTransaction;
  }

  /**
   **/
  public LinksUpdatePsuAuthentication scaStatus(HrefType scaStatus) {
    this.scaStatus = scaStatus;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("scaStatus")

  public HrefType getScaStatus() {
    return scaStatus;
  }
  public void setScaStatus(HrefType scaStatus) {
    this.scaStatus = scaStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinksUpdatePsuAuthentication _linksUpdatePsuAuthentication = (LinksUpdatePsuAuthentication) o;
    return Objects.equals(updateAdditionalPsuAuthentication, _linksUpdatePsuAuthentication.updateAdditionalPsuAuthentication) &&
        Objects.equals(updateAdditionalEncryptedPsuAuthentication, _linksUpdatePsuAuthentication.updateAdditionalEncryptedPsuAuthentication) &&
        Objects.equals(selectAuthenticationMethod, _linksUpdatePsuAuthentication.selectAuthenticationMethod) &&
        Objects.equals(authoriseTransaction, _linksUpdatePsuAuthentication.authoriseTransaction) &&
        Objects.equals(scaStatus, _linksUpdatePsuAuthentication.scaStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updateAdditionalPsuAuthentication, updateAdditionalEncryptedPsuAuthentication, selectAuthenticationMethod, authoriseTransaction, scaStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinksUpdatePsuAuthentication {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    updateAdditionalPsuAuthentication: ").append(toIndentedString(updateAdditionalPsuAuthentication)).append("\n");
    sb.append("    updateAdditionalEncryptedPsuAuthentication: ").append(toIndentedString(updateAdditionalEncryptedPsuAuthentication)).append("\n");
    sb.append("    selectAuthenticationMethod: ").append(toIndentedString(selectAuthenticationMethod)).append("\n");
    sb.append("    authoriseTransaction: ").append(toIndentedString(authoriseTransaction)).append("\n");
    sb.append("    scaStatus: ").append(toIndentedString(scaStatus)).append("\n");
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
