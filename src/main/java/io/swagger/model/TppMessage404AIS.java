package io.swagger.model;

import io.swagger.model.MessageCode404AIS;
import io.swagger.model.TppMessageCategory;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TppMessage404AIS   {
  private @Valid TppMessageCategory category = null;
  private @Valid MessageCode404AIS code = null;
  private @Valid String path = null;
  private @Valid String text = null;

  /**
   **/
  public TppMessage404AIS category(TppMessageCategory category) {
    this.category = category;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("category")
  @NotNull

  public TppMessageCategory getCategory() {
    return category;
  }
  public void setCategory(TppMessageCategory category) {
    this.category = category;
  }

  /**
   **/
  public TppMessage404AIS code(MessageCode404AIS code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("code")
  @NotNull

  public MessageCode404AIS getCode() {
    return code;
  }
  public void setCode(MessageCode404AIS code) {
    this.code = code;
  }

  /**
   **/
  public TppMessage404AIS path(String path) {
    this.path = path;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("path")

  public String getPath() {
    return path;
  }
  public void setPath(String path) {
    this.path = path;
  }

  /**
   **/
  public TppMessage404AIS text(String text) {
    this.text = text;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("text")
 @Size(max=500)
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TppMessage404AIS tppMessage404AIS = (TppMessage404AIS) o;
    return Objects.equals(category, tppMessage404AIS.category) &&
        Objects.equals(code, tppMessage404AIS.code) &&
        Objects.equals(path, tppMessage404AIS.path) &&
        Objects.equals(text, tppMessage404AIS.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, code, path, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TppMessage404AIS {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
