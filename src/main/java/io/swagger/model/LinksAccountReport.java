package io.swagger.model;

import io.swagger.model.HrefType;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LinksAccountReport extends HashMap<String, HrefType>  {
  private @Valid HrefType account = null;
  private @Valid HrefType first = null;
  private @Valid HrefType next = null;
  private @Valid HrefType previous = null;
  private @Valid HrefType last = null;

  /**
   **/
  public LinksAccountReport account(HrefType account) {
    this.account = account;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("account")
  @NotNull

  public HrefType getAccount() {
    return account;
  }
  public void setAccount(HrefType account) {
    this.account = account;
  }

  /**
   **/
  public LinksAccountReport first(HrefType first) {
    this.first = first;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("first")

  public HrefType getFirst() {
    return first;
  }
  public void setFirst(HrefType first) {
    this.first = first;
  }

  /**
   **/
  public LinksAccountReport next(HrefType next) {
    this.next = next;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("next")

  public HrefType getNext() {
    return next;
  }
  public void setNext(HrefType next) {
    this.next = next;
  }

  /**
   **/
  public LinksAccountReport previous(HrefType previous) {
    this.previous = previous;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("previous")

  public HrefType getPrevious() {
    return previous;
  }
  public void setPrevious(HrefType previous) {
    this.previous = previous;
  }

  /**
   **/
  public LinksAccountReport last(HrefType last) {
    this.last = last;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("last")

  public HrefType getLast() {
    return last;
  }
  public void setLast(HrefType last) {
    this.last = last;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinksAccountReport _linksAccountReport = (LinksAccountReport) o;
    return Objects.equals(account, _linksAccountReport.account) &&
        Objects.equals(first, _linksAccountReport.first) &&
        Objects.equals(next, _linksAccountReport.next) &&
        Objects.equals(previous, _linksAccountReport.previous) &&
        Objects.equals(last, _linksAccountReport.last);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, first, next, previous, last);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinksAccountReport {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
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
