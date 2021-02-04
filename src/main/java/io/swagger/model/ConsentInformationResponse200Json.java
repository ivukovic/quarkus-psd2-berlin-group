package io.swagger.model;

import io.swagger.model.AccountAccess;
import io.swagger.model.ConsentStatus;
import io.swagger.model.LinksGetConsent;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.joda.time.LocalDate;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Body of the JSON response for a successfull get consent request.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "Body of the JSON response for a successfull get consent request.")

public class ConsentInformationResponse200Json   {
  private @Valid AccountAccess access = null;
  private @Valid Boolean recurringIndicator = null;
  private @Valid LocalDate validUntil = null;
  private @Valid Integer frequencyPerDay = null;
  private @Valid LocalDate lastActionDate = null;
  private @Valid ConsentStatus consentStatus = null;
  private @Valid LinksGetConsent _links = null;

  /**
   **/
  public ConsentInformationResponse200Json access(AccountAccess access) {
    this.access = access;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("access")
  @NotNull

  public AccountAccess getAccess() {
    return access;
  }
  public void setAccess(AccountAccess access) {
    this.access = access;
  }

  /**
   **/
  public ConsentInformationResponse200Json recurringIndicator(Boolean recurringIndicator) {
    this.recurringIndicator = recurringIndicator;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("recurringIndicator")
  @NotNull

  public Boolean getRecurringIndicator() {
    return recurringIndicator;
  }
  public void setRecurringIndicator(Boolean recurringIndicator) {
    this.recurringIndicator = recurringIndicator;
  }

  /**
   **/
  public ConsentInformationResponse200Json validUntil(LocalDate validUntil) {
    this.validUntil = validUntil;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("validUntil")
  @NotNull

  public LocalDate getValidUntil() {
    return validUntil;
  }
  public void setValidUntil(LocalDate validUntil) {
    this.validUntil = validUntil;
  }

  /**
   **/
  public ConsentInformationResponse200Json frequencyPerDay(Integer frequencyPerDay) {
    this.frequencyPerDay = frequencyPerDay;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("frequencyPerDay")
  @NotNull

  public Integer getFrequencyPerDay() {
    return frequencyPerDay;
  }
  public void setFrequencyPerDay(Integer frequencyPerDay) {
    this.frequencyPerDay = frequencyPerDay;
  }

  /**
   **/
  public ConsentInformationResponse200Json lastActionDate(LocalDate lastActionDate) {
    this.lastActionDate = lastActionDate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("lastActionDate")
  @NotNull

  public LocalDate getLastActionDate() {
    return lastActionDate;
  }
  public void setLastActionDate(LocalDate lastActionDate) {
    this.lastActionDate = lastActionDate;
  }

  /**
   **/
  public ConsentInformationResponse200Json consentStatus(ConsentStatus consentStatus) {
    this.consentStatus = consentStatus;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("consentStatus")
  @NotNull

  public ConsentStatus getConsentStatus() {
    return consentStatus;
  }
  public void setConsentStatus(ConsentStatus consentStatus) {
    this.consentStatus = consentStatus;
  }

  /**
   **/
  public ConsentInformationResponse200Json _links(LinksGetConsent _links) {
    this._links = _links;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("_links")

  public LinksGetConsent getLinks() {
    return _links;
  }
  public void setLinks(LinksGetConsent _links) {
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
    ConsentInformationResponse200Json consentInformationResponse200Json = (ConsentInformationResponse200Json) o;
    return Objects.equals(access, consentInformationResponse200Json.access) &&
        Objects.equals(recurringIndicator, consentInformationResponse200Json.recurringIndicator) &&
        Objects.equals(validUntil, consentInformationResponse200Json.validUntil) &&
        Objects.equals(frequencyPerDay, consentInformationResponse200Json.frequencyPerDay) &&
        Objects.equals(lastActionDate, consentInformationResponse200Json.lastActionDate) &&
        Objects.equals(consentStatus, consentInformationResponse200Json.consentStatus) &&
        Objects.equals(_links, consentInformationResponse200Json._links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(access, recurringIndicator, validUntil, frequencyPerDay, lastActionDate, consentStatus, _links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsentInformationResponse200Json {\n");
    
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    recurringIndicator: ").append(toIndentedString(recurringIndicator)).append("\n");
    sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
    sb.append("    frequencyPerDay: ").append(toIndentedString(frequencyPerDay)).append("\n");
    sb.append("    lastActionDate: ").append(toIndentedString(lastActionDate)).append("\n");
    sb.append("    consentStatus: ").append(toIndentedString(consentStatus)).append("\n");
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
