package io.swagger.model;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.util.ObjectUtil;

/**
  * Body of the JSON response for a successfull get consent request.
 **/
@Schema(description = "Body of the JSON response for a successfull get consent request.")
public class ConsentInformationResponse200Json {

	@Schema(required = true, description = "")
	private AccountAccess access = null;

	@Schema(required = true, description = "")
	private Boolean recurringIndicator = null;

	@Schema(required = true, description = "")
	private LocalDate validUntil = null;

	@Schema(required = true, description = "")
	private Integer frequencyPerDay = null;

	@Schema(required = true, description = "")
	private LocalDate lastActionDate = null;

	@Schema(required = true, description = "")
	private ConsentStatus consentStatus = null;

	@Schema(description = "")
	private LinksGetConsent _links = null;

	/**
	  * Get access
	  * @return access
	 **/
	@JsonProperty("access")
	@NotNull
	public AccountAccess getAccess() {
		return access;
	}

	public void setAccess(AccountAccess access) {
		this.access = access;
	}

	public ConsentInformationResponse200Json access(AccountAccess access) {
		this.access = access;
		return this;
	}

	/**
	  * Get recurringIndicator
	  * @return recurringIndicator
	 **/
	@JsonProperty("recurringIndicator")
	@NotNull
	public Boolean getRecurringIndicator() {
		return recurringIndicator;
	}

	public void setRecurringIndicator(Boolean recurringIndicator) {
		this.recurringIndicator = recurringIndicator;
	}

	public ConsentInformationResponse200Json recurringIndicator(Boolean recurringIndicator) {
		this.recurringIndicator = recurringIndicator;
		return this;
	}

	/**
	  * Get validUntil
	  * @return validUntil
	 **/
	@JsonProperty("validUntil")
	@NotNull
	public LocalDate getValidUntil() {
		return validUntil;
	}

	public void setValidUntil(LocalDate validUntil) {
		this.validUntil = validUntil;
	}

	public ConsentInformationResponse200Json validUntil(LocalDate validUntil) {
		this.validUntil = validUntil;
		return this;
	}

	/**
	  * Get frequencyPerDay
	  * @return frequencyPerDay
	 **/
	@JsonProperty("frequencyPerDay")
	@NotNull
	public Integer getFrequencyPerDay() {
		return frequencyPerDay;
	}

	public void setFrequencyPerDay(Integer frequencyPerDay) {
		this.frequencyPerDay = frequencyPerDay;
	}

	public ConsentInformationResponse200Json frequencyPerDay(Integer frequencyPerDay) {
		this.frequencyPerDay = frequencyPerDay;
		return this;
	}

	/**
	  * Get lastActionDate
	  * @return lastActionDate
	 **/
	@JsonProperty("lastActionDate")
	@NotNull
	public LocalDate getLastActionDate() {
		return lastActionDate;
	}

	public void setLastActionDate(LocalDate lastActionDate) {
		this.lastActionDate = lastActionDate;
	}

	public ConsentInformationResponse200Json lastActionDate(LocalDate lastActionDate) {
		this.lastActionDate = lastActionDate;
		return this;
	}

	/**
	  * Get consentStatus
	  * @return consentStatus
	 **/
	@JsonProperty("consentStatus")
	@NotNull
	public ConsentStatus getConsentStatus() {
		return consentStatus;
	}

	public void setConsentStatus(ConsentStatus consentStatus) {
		this.consentStatus = consentStatus;
	}

	public ConsentInformationResponse200Json consentStatus(ConsentStatus consentStatus) {
		this.consentStatus = consentStatus;
		return this;
	}

	/**
	  * Get _links
	  * @return _links
	 **/
	@JsonProperty("_links")
	public LinksGetConsent getLinks() {
		return _links;
	}

	public void setLinks(LinksGetConsent _links) {
		this._links = _links;
	}

	public ConsentInformationResponse200Json _links(LinksGetConsent _links) {
		this._links = _links;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConsentInformationResponse200Json {\n");

		sb.append("    access: ").append(ObjectUtil.toIndentedString(access)).append("\n");
		sb.append("    recurringIndicator: ").append(ObjectUtil.toIndentedString(recurringIndicator)).append("\n");
		sb.append("    validUntil: ").append(ObjectUtil.toIndentedString(validUntil)).append("\n");
		sb.append("    frequencyPerDay: ").append(ObjectUtil.toIndentedString(frequencyPerDay)).append("\n");
		sb.append("    lastActionDate: ").append(ObjectUtil.toIndentedString(lastActionDate)).append("\n");
		sb.append("    consentStatus: ").append(ObjectUtil.toIndentedString(consentStatus)).append("\n");
		sb.append("    _links: ").append(ObjectUtil.toIndentedString(_links)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
