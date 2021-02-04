package io.swagger.model;

import io.swagger.model.LinksAll;
import io.swagger.model.TppMessage404PIIS;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * NextGenPSD2 specific definition of reporting error information in case of a HTTP error code 404. 
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "NextGenPSD2 specific definition of reporting error information in case of a HTTP error code 404. ")

public class Error404NGPIIS   {
  private @Valid List<TppMessage404PIIS> tppMessages = new ArrayList<TppMessage404PIIS>();
  private @Valid LinksAll _links = null;

  /**
   **/
  public Error404NGPIIS tppMessages(List<TppMessage404PIIS> tppMessages) {
    this.tppMessages = tppMessages;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tppMessages")

  public List<TppMessage404PIIS> getTppMessages() {
    return tppMessages;
  }
  public void setTppMessages(List<TppMessage404PIIS> tppMessages) {
    this.tppMessages = tppMessages;
  }

  /**
   **/
  public Error404NGPIIS _links(LinksAll _links) {
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
    Error404NGPIIS error404NGPIIS = (Error404NGPIIS) o;
    return Objects.equals(tppMessages, error404NGPIIS.tppMessages) &&
        Objects.equals(_links, error404NGPIIS._links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tppMessages, _links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error404NGPIIS {\n");
    
    sb.append("    tppMessages: ").append(toIndentedString(tppMessages)).append("\n");
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
