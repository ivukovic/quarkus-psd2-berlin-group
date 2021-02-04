package io.swagger.model;

import io.swagger.model.DayOfExecution;
import io.swagger.model.ExecutionRule;
import io.swagger.model.FrequencyCode;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.joda.time.LocalDate;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The body part 2 of a periodic payment initation request containes the execution related informations  of the periodic payment. 
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "The body part 2 of a periodic payment initation request containes the execution related informations  of the periodic payment. ")

public class PeriodicPaymentInitiationXmlPart2StandingorderTypeJson   {
  private @Valid LocalDate startDate = null;
  private @Valid LocalDate endDate = null;
  private @Valid ExecutionRule executionRule = null;
  private @Valid FrequencyCode frequency = null;
  private @Valid DayOfExecution dayOfExecution = null;

  /**
   **/
  public PeriodicPaymentInitiationXmlPart2StandingorderTypeJson startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("startDate")
  @NotNull

  public LocalDate getStartDate() {
    return startDate;
  }
  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  /**
   **/
  public PeriodicPaymentInitiationXmlPart2StandingorderTypeJson endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("endDate")

  public LocalDate getEndDate() {
    return endDate;
  }
  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  /**
   **/
  public PeriodicPaymentInitiationXmlPart2StandingorderTypeJson executionRule(ExecutionRule executionRule) {
    this.executionRule = executionRule;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("executionRule")

  public ExecutionRule getExecutionRule() {
    return executionRule;
  }
  public void setExecutionRule(ExecutionRule executionRule) {
    this.executionRule = executionRule;
  }

  /**
   **/
  public PeriodicPaymentInitiationXmlPart2StandingorderTypeJson frequency(FrequencyCode frequency) {
    this.frequency = frequency;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("frequency")
  @NotNull

  public FrequencyCode getFrequency() {
    return frequency;
  }
  public void setFrequency(FrequencyCode frequency) {
    this.frequency = frequency;
  }

  /**
   **/
  public PeriodicPaymentInitiationXmlPart2StandingorderTypeJson dayOfExecution(DayOfExecution dayOfExecution) {
    this.dayOfExecution = dayOfExecution;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dayOfExecution")
 @Size(max=2)
  public DayOfExecution getDayOfExecution() {
    return dayOfExecution;
  }
  public void setDayOfExecution(DayOfExecution dayOfExecution) {
    this.dayOfExecution = dayOfExecution;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PeriodicPaymentInitiationXmlPart2StandingorderTypeJson periodicPaymentInitiationXmlPart2StandingorderTypeJson = (PeriodicPaymentInitiationXmlPart2StandingorderTypeJson) o;
    return Objects.equals(startDate, periodicPaymentInitiationXmlPart2StandingorderTypeJson.startDate) &&
        Objects.equals(endDate, periodicPaymentInitiationXmlPart2StandingorderTypeJson.endDate) &&
        Objects.equals(executionRule, periodicPaymentInitiationXmlPart2StandingorderTypeJson.executionRule) &&
        Objects.equals(frequency, periodicPaymentInitiationXmlPart2StandingorderTypeJson.frequency) &&
        Objects.equals(dayOfExecution, periodicPaymentInitiationXmlPart2StandingorderTypeJson.dayOfExecution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, executionRule, frequency, dayOfExecution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeriodicPaymentInitiationXmlPart2StandingorderTypeJson {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    executionRule: ").append(toIndentedString(executionRule)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    dayOfExecution: ").append(toIndentedString(dayOfExecution)).append("\n");
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
