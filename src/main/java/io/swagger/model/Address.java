package io.swagger.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.util.ObjectUtil;

public class Address {

	@Schema(description = "")
	private String streetName = null;

	@Schema(description = "")
	private String buildingNumber = null;

	@Schema(description = "")
	private String townName = null;

	@Schema(description = "")
	private String postCode = null;

	@Schema(required = true, description = "")
	private String country = null;

	/**
	  * Get streetName
	  * @return streetName
	 **/
	@JsonProperty("streetName")
	@Size(max = 70)
	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public Address streetName(String streetName) {
		this.streetName = streetName;
		return this;
	}

	/**
	  * Get buildingNumber
	  * @return buildingNumber
	 **/
	@JsonProperty("buildingNumber")
	public String getBuildingNumber() {
		return buildingNumber;
	}

	public void setBuildingNumber(String buildingNumber) {
		this.buildingNumber = buildingNumber;
	}

	public Address buildingNumber(String buildingNumber) {
		this.buildingNumber = buildingNumber;
		return this;
	}

	/**
	  * Get townName
	  * @return townName
	 **/
	@JsonProperty("townName")
	public String getTownName() {
		return townName;
	}

	public void setTownName(String townName) {
		this.townName = townName;
	}

	public Address townName(String townName) {
		this.townName = townName;
		return this;
	}

	/**
	  * Get postCode
	  * @return postCode
	 **/
	@JsonProperty("postCode")
	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public Address postCode(String postCode) {
		this.postCode = postCode;
		return this;
	}

	/**
	  * Get country
	  * @return country
	 **/
	@JsonProperty("country")
	@NotNull
	@Pattern(regexp = "[A-Z]{2}")
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Address country(String country) {
		this.country = country;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Address {\n");

		sb.append("    streetName: ").append(ObjectUtil.toIndentedString(streetName)).append("\n");
		sb.append("    buildingNumber: ").append(ObjectUtil.toIndentedString(buildingNumber)).append("\n");
		sb.append("    townName: ").append(ObjectUtil.toIndentedString(townName)).append("\n");
		sb.append("    postCode: ").append(ObjectUtil.toIndentedString(postCode)).append("\n");
		sb.append("    country: ").append(ObjectUtil.toIndentedString(country)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
