package io.swagger.model;

import io.swagger.model.MessageCode405SBS;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * This is a data element to support the declaration of additional errors in the context of [RFC7807].
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "This is a data element to support the declaration of additional errors in the context of [RFC7807].")

public class Error405SBSAdditionalErrors   {
  private @Valid String title = null;
  private @Valid String detail = null;
  private @Valid MessageCode405SBS code = null;

  /**
   **/
  public Error405SBSAdditionalErrors title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("title")
 @Size(max=70)
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  public Error405SBSAdditionalErrors detail(String detail) {
    this.detail = detail;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
  public Error405SBSAdditionalErrors code(MessageCode405SBS code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("code")
  @NotNull

  public MessageCode405SBS getCode() {
    return code;
  }
  public void setCode(MessageCode405SBS code) {
    this.code = code;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error405SBSAdditionalErrors error405SBSAdditionalErrors = (Error405SBSAdditionalErrors) o;
    return Objects.equals(title, error405SBSAdditionalErrors.title) &&
        Objects.equals(detail, error405SBSAdditionalErrors.detail) &&
        Objects.equals(code, error405SBSAdditionalErrors.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, detail, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error405SBSAdditionalErrors {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
