package io.swagger.model;

import io.swagger.model.MessageCode403PIIS;
import io.swagger.model.TppMessageCategory;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TppMessage403PIIS   {
  private @Valid TppMessageCategory category = null;
  private @Valid MessageCode403PIIS code = null;
  private @Valid String path = null;
  private @Valid String text = null;

  /**
   **/
  public TppMessage403PIIS category(TppMessageCategory category) {
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
  public TppMessage403PIIS code(MessageCode403PIIS code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("code")
  @NotNull

  public MessageCode403PIIS getCode() {
    return code;
  }
  public void setCode(MessageCode403PIIS code) {
    this.code = code;
  }

  /**
   **/
  public TppMessage403PIIS path(String path) {
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
  public TppMessage403PIIS text(String text) {
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
    TppMessage403PIIS tppMessage403PIIS = (TppMessage403PIIS) o;
    return Objects.equals(category, tppMessage403PIIS.category) &&
        Objects.equals(code, tppMessage403PIIS.code) &&
        Objects.equals(path, tppMessage403PIIS.path) &&
        Objects.equals(text, tppMessage403PIIS.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, code, path, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TppMessage403PIIS {\n");
    
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
