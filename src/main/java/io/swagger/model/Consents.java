package io.swagger.model;

import io.swagger.model.AccountAccess;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.joda.time.LocalDate;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Content of the body of a consent request. 
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "Content of the body of a consent request. ")

public class Consents   {
  private @Valid AccountAccess access = null;
  private @Valid Boolean recurringIndicator = null;
  private @Valid LocalDate validUntil = null;
  private @Valid Integer frequencyPerDay = null;
  private @Valid Boolean combinedServiceIndicator = null;

  /**
   **/
  public Consents access(AccountAccess access) {
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
  public Consents recurringIndicator(Boolean recurringIndicator) {
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
  public Consents validUntil(LocalDate validUntil) {
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
  public Consents frequencyPerDay(Integer frequencyPerDay) {
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
   * If \&quot;true\&quot; indicates that a payment initiation service will be addressed in the same \&quot;session\&quot;. 
   **/
  public Consents combinedServiceIndicator(Boolean combinedServiceIndicator) {
    this.combinedServiceIndicator = combinedServiceIndicator;
    return this;
  }

  
  @ApiModelProperty(example = "false", required = true, value = "If \"true\" indicates that a payment initiation service will be addressed in the same \"session\". ")
  @JsonProperty("combinedServiceIndicator")
  @NotNull

  public Boolean isCombinedServiceIndicator() {
    return combinedServiceIndicator;
  }
  public void setCombinedServiceIndicator(Boolean combinedServiceIndicator) {
    this.combinedServiceIndicator = combinedServiceIndicator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Consents consents = (Consents) o;
    return Objects.equals(access, consents.access) &&
        Objects.equals(recurringIndicator, consents.recurringIndicator) &&
        Objects.equals(validUntil, consents.validUntil) &&
        Objects.equals(frequencyPerDay, consents.frequencyPerDay) &&
        Objects.equals(combinedServiceIndicator, consents.combinedServiceIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(access, recurringIndicator, validUntil, frequencyPerDay, combinedServiceIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Consents {\n");
    
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    recurringIndicator: ").append(toIndentedString(recurringIndicator)).append("\n");
    sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
    sb.append("    frequencyPerDay: ").append(toIndentedString(frequencyPerDay)).append("\n");
    sb.append("    combinedServiceIndicator: ").append(toIndentedString(combinedServiceIndicator)).append("\n");
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
