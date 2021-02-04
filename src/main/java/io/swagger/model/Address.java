package io.swagger.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Address   {
  private @Valid String streetName = null;
  private @Valid String buildingNumber = null;
  private @Valid String townName = null;
  private @Valid String postCode = null;
  private @Valid String country = null;

  /**
   **/
  public Address streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("streetName")
 @Size(max=70)
  public String getStreetName() {
    return streetName;
  }
  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  /**
   **/
  public Address buildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("buildingNumber")

  public String getBuildingNumber() {
    return buildingNumber;
  }
  public void setBuildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
  }

  /**
   **/
  public Address townName(String townName) {
    this.townName = townName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("townName")

  public String getTownName() {
    return townName;
  }
  public void setTownName(String townName) {
    this.townName = townName;
  }

  /**
   **/
  public Address postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("postCode")

  public String getPostCode() {
    return postCode;
  }
  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  /**
   **/
  public Address country(String country) {
    this.country = country;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("country")
  @NotNull
 @Pattern(regexp="[A-Z]{2}")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(streetName, address.streetName) &&
        Objects.equals(buildingNumber, address.buildingNumber) &&
        Objects.equals(townName, address.townName) &&
        Objects.equals(postCode, address.postCode) &&
        Objects.equals(country, address.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streetName, buildingNumber, townName, postCode, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    buildingNumber: ").append(toIndentedString(buildingNumber)).append("\n");
    sb.append("    townName: ").append(toIndentedString(townName)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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
