package io.swagger.model;

import io.swagger.model.MessageCode409AIS;
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

public class Error409AISAdditionalErrors   {
  private @Valid String title = null;
  private @Valid String detail = null;
  private @Valid MessageCode409AIS code = null;

  /**
   **/
  public Error409AISAdditionalErrors title(String title) {
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
  public Error409AISAdditionalErrors detail(String detail) {
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
  public Error409AISAdditionalErrors code(MessageCode409AIS code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("code")
  @NotNull

  public MessageCode409AIS getCode() {
    return code;
  }
  public void setCode(MessageCode409AIS code) {
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
    Error409AISAdditionalErrors error409AISAdditionalErrors = (Error409AISAdditionalErrors) o;
    return Objects.equals(title, error409AISAdditionalErrors.title) &&
        Objects.equals(detail, error409AISAdditionalErrors.detail) &&
        Objects.equals(code, error409AISAdditionalErrors.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, detail, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error409AISAdditionalErrors {\n");
    
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
