package io.swagger.model;

import io.swagger.model.HrefType;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * A list of hyperlinks to be recognised by the TPP. The actual hyperlinks used in the response depend on the dynamical decisions of the ASPSP when processing the request.  **Remark:** All links can be relative or full links, to be decided by the ASPSP.  Type of links admitted in this response, (further links might be added for ASPSP  defined extensions):  - &#x27;scaStatus&#x27;: The link to retrieve the scaStatus of the corresponding authorisation sub-resource. - &#x27;selectAuthenticationMethod&#x27;: This is a link to a resource, where the TPP can select the applicable second factor authentication methods for the PSU, if there are several available authentication methods and if the PSU is already sufficiently authenticated.. If this link is contained, then there is also the data element \&quot;scaMethods\&quot; contained in the response body. 
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "A list of hyperlinks to be recognised by the TPP. The actual hyperlinks used in the response depend on the dynamical decisions of the ASPSP when processing the request.  **Remark:** All links can be relative or full links, to be decided by the ASPSP.  Type of links admitted in this response, (further links might be added for ASPSP  defined extensions):  - 'scaStatus': The link to retrieve the scaStatus of the corresponding authorisation sub-resource. - 'selectAuthenticationMethod': This is a link to a resource, where the TPP can select the applicable second factor authentication methods for the PSU, if there are several available authentication methods and if the PSU is already sufficiently authenticated.. If this link is contained, then there is also the data element \"scaMethods\" contained in the response body. ")

public class LinksUpdatePsuIdentification extends HashMap<String, HrefType>  {
  private @Valid HrefType scaStatus = null;
  private @Valid HrefType selectAuthenticationMethod = null;

  /**
   **/
  public LinksUpdatePsuIdentification scaStatus(HrefType scaStatus) {
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

  /**
   **/
  public LinksUpdatePsuIdentification selectAuthenticationMethod(HrefType selectAuthenticationMethod) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinksUpdatePsuIdentification _linksUpdatePsuIdentification = (LinksUpdatePsuIdentification) o;
    return Objects.equals(scaStatus, _linksUpdatePsuIdentification.scaStatus) &&
        Objects.equals(selectAuthenticationMethod, _linksUpdatePsuIdentification.selectAuthenticationMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scaStatus, selectAuthenticationMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinksUpdatePsuIdentification {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    scaStatus: ").append(toIndentedString(scaStatus)).append("\n");
    sb.append("    selectAuthenticationMethod: ").append(toIndentedString(selectAuthenticationMethod)).append("\n");
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
