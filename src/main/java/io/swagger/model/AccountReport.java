package io.swagger.model;

import io.swagger.model.LinksAccountReport;
import io.swagger.model.TransactionList;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * JSON based account report. This account report contains transactions resulting from the query parameters.  &#x27;booked&#x27; shall be contained if bookingStatus parameter is set to \&quot;booked\&quot; or \&quot;both\&quot;.  &#x27;pending&#x27; is not contained if the bookingStatus parameter is set to \&quot;booked\&quot; or \&quot;information\&quot;.  &#x27;information&#x27; Only contained if the bookingStatus is set to \&quot;information\&quot; and if supported by ASPSP. 
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "JSON based account report. This account report contains transactions resulting from the query parameters.  'booked' shall be contained if bookingStatus parameter is set to \"booked\" or \"both\".  'pending' is not contained if the bookingStatus parameter is set to \"booked\" or \"information\".  'information' Only contained if the bookingStatus is set to \"information\" and if supported by ASPSP. ")

public class AccountReport   {
  private @Valid TransactionList booked = null;
  private @Valid TransactionList pending = null;
  private @Valid TransactionList information = null;
  private @Valid LinksAccountReport _links = null;

  /**
   **/
  public AccountReport booked(TransactionList booked) {
    this.booked = booked;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("booked")

  public TransactionList getBooked() {
    return booked;
  }
  public void setBooked(TransactionList booked) {
    this.booked = booked;
  }

  /**
   **/
  public AccountReport pending(TransactionList pending) {
    this.pending = pending;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pending")

  public TransactionList getPending() {
    return pending;
  }
  public void setPending(TransactionList pending) {
    this.pending = pending;
  }

  /**
   **/
  public AccountReport information(TransactionList information) {
    this.information = information;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("information")

  public TransactionList getInformation() {
    return information;
  }
  public void setInformation(TransactionList information) {
    this.information = information;
  }

  /**
   **/
  public AccountReport _links(LinksAccountReport _links) {
    this._links = _links;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("_links")
  @NotNull

  public LinksAccountReport getLinks() {
    return _links;
  }
  public void setLinks(LinksAccountReport _links) {
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
    AccountReport accountReport = (AccountReport) o;
    return Objects.equals(booked, accountReport.booked) &&
        Objects.equals(pending, accountReport.pending) &&
        Objects.equals(information, accountReport.information) &&
        Objects.equals(_links, accountReport._links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(booked, pending, information, _links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountReport {\n");
    
    sb.append("    booked: ").append(toIndentedString(booked)).append("\n");
    sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
    sb.append("    information: ").append(toIndentedString(information)).append("\n");
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
