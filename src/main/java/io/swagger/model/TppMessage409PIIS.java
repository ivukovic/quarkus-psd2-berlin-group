package io.swagger.model;

import io.swagger.model.MessageCode409PIIS;
import io.swagger.model.TppMessageCategory;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TppMessage409PIIS   {
  private @Valid TppMessageCategory category = null;
  private @Valid MessageCode409PIIS code = null;
  private @Valid String path = null;
  private @Valid String text = null;

  /**
   **/
  public TppMessage409PIIS category(TppMessageCategory category) {
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
  public TppMessage409PIIS code(MessageCode409PIIS code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("code")
  @NotNull

  public MessageCode409PIIS getCode() {
    return code;
  }
  public void setCode(MessageCode409PIIS code) {
    this.code = code;
  }

  /**
   **/
  public TppMessage409PIIS path(String path) {
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
  public TppMessage409PIIS text(String text) {
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
    TppMessage409PIIS tppMessage409PIIS = (TppMessage409PIIS) o;
    return Objects.equals(category, tppMessage409PIIS.category) &&
        Objects.equals(code, tppMessage409PIIS.code) &&
        Objects.equals(path, tppMessage409PIIS.path) &&
        Objects.equals(text, tppMessage409PIIS.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, code, path, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TppMessage409PIIS {\n");
    
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
