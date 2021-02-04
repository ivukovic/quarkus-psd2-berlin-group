package io.swagger.model;

import io.swagger.model.Error405PISCANCAdditionalErrors;
import io.swagger.model.LinksAll;
import io.swagger.model.MessageCode405PISCANC;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Standardised definition of reporting error information according to [RFC7807]  in case of a HTTP error code 405 for a pament cancelation (PIS). 
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "Standardised definition of reporting error information according to [RFC7807]  in case of a HTTP error code 405 for a pament cancelation (PIS). ")

public class Error405PISCANC   {
  private @Valid String type = null;
  private @Valid String title = null;
  private @Valid String detail = null;
  private @Valid MessageCode405PISCANC code = null;
  private @Valid List<Error405PISCANCAdditionalErrors> additionalErrors = new ArrayList<Error405PISCANCAdditionalErrors>();
  private @Valid LinksAll _links = null;

  /**
   * A URI reference [RFC3986] that identifies the problem type.  Remark For Future: These URI will be provided by NextGenPSD2 in future. 
   **/
  public Error405PISCANC type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A URI reference [RFC3986] that identifies the problem type.  Remark For Future: These URI will be provided by NextGenPSD2 in future. ")
  @JsonProperty("type")
  @NotNull
 @Size(max=70)
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Short human readable description of error type.  Could be in local language.  To be provided by ASPSPs. 
   **/
  public Error405PISCANC title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(value = "Short human readable description of error type.  Could be in local language.  To be provided by ASPSPs. ")
  @JsonProperty("title")
 @Size(max=70)
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Detailed human readable text specific to this instance of the error.  XPath might be used to point to the issue generating the error in addition. Remark for Future: In future, a dedicated field might be introduced for the XPath. 
   **/
  public Error405PISCANC detail(String detail) {
    this.detail = detail;
    return this;
  }

  
  @ApiModelProperty(value = "Detailed human readable text specific to this instance of the error.  XPath might be used to point to the issue generating the error in addition. Remark for Future: In future, a dedicated field might be introduced for the XPath. ")
  @JsonProperty("detail")
 @Size(max=500)
  public String getDetail() {
    return detail;
  }
  public void setDetail(String detail) {
    this.detail = detail;
  }

  /**
   **/
  public Error405PISCANC code(MessageCode405PISCANC code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("code")
  @NotNull

  public MessageCode405PISCANC getCode() {
    return code;
  }
  public void setCode(MessageCode405PISCANC code) {
    this.code = code;
  }

  /**
   * Array of Error Information Blocks.  Might be used if more than one error is to be communicated 
   **/
  public Error405PISCANC additionalErrors(List<Error405PISCANCAdditionalErrors> additionalErrors) {
    this.additionalErrors = additionalErrors;
    return this;
  }

  
  @ApiModelProperty(value = "Array of Error Information Blocks.  Might be used if more than one error is to be communicated ")
  @JsonProperty("additionalErrors")

  public List<Error405PISCANCAdditionalErrors> getAdditionalErrors() {
    return additionalErrors;
  }
  public void setAdditionalErrors(List<Error405PISCANCAdditionalErrors> additionalErrors) {
    this.additionalErrors = additionalErrors;
  }

  /**
   **/
  public Error405PISCANC _links(LinksAll _links) {
    this._links = _links;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("_links")

  public LinksAll getLinks() {
    return _links;
  }
  public void setLinks(LinksAll _links) {
    this._links = _links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error405PISCANC error405PISCANC = (Error405PISCANC) o;
    return Objects.equals(type, error405PISCANC.type) &&
        Objects.equals(title, error405PISCANC.title) &&
        Objects.equals(detail, error405PISCANC.detail) &&
        Objects.equals(code, error405PISCANC.code) &&
        Objects.equals(additionalErrors, error405PISCANC.additionalErrors) &&
        Objects.equals(_links, error405PISCANC._links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, title, detail, code, additionalErrors, _links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error405PISCANC {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    additionalErrors: ").append(toIndentedString(additionalErrors)).append("\n");
    sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
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
