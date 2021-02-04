package io.swagger.model;

import io.swagger.model.CardTransactionList;
import io.swagger.model.LinksCardAccountReport;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * JSON based card account report.  This card account report contains transactions resulting from the query parameters. 
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "JSON based card account report.  This card account report contains transactions resulting from the query parameters. ")

public class CardAccountReport   {
  private @Valid CardTransactionList booked = null;
  private @Valid CardTransactionList pending = null;
  private @Valid LinksCardAccountReport _links = null;

  /**
   **/
  public CardAccountReport booked(CardTransactionList booked) {
    this.booked = booked;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("booked")
  @NotNull

  public CardTransactionList getBooked() {
    return booked;
  }
  public void setBooked(CardTransactionList booked) {
    this.booked = booked;
  }

  /**
   **/
  public CardAccountReport pending(CardTransactionList pending) {
    this.pending = pending;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pending")

  public CardTransactionList getPending() {
    return pending;
  }
  public void setPending(CardTransactionList pending) {
    this.pending = pending;
  }

  /**
   **/
  public CardAccountReport _links(LinksCardAccountReport _links) {
    this._links = _links;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("_links")
  @NotNull

  public LinksCardAccountReport getLinks() {
    return _links;
  }
  public void setLinks(LinksCardAccountReport _links) {
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
    CardAccountReport cardAccountReport = (CardAccountReport) o;
    return Objects.equals(booked, cardAccountReport.booked) &&
        Objects.equals(pending, cardAccountReport.pending) &&
        Objects.equals(_links, cardAccountReport._links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(booked, pending, _links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardAccountReport {\n");
    
    sb.append("    booked: ").append(toIndentedString(booked)).append("\n");
    sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
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
