package io.swagger.model;

import io.swagger.model.Amount;
import io.swagger.model.DayOfExecution;
import io.swagger.model.ExecutionRule;
import io.swagger.model.FrequencyCode;
import io.swagger.model.MonthsOfExecution;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.joda.time.LocalDate;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Details of underlying standing orders. 
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "Details of underlying standing orders. ")

public class StandingOrderDetails   {
  private @Valid LocalDate startDate = null;
  private @Valid FrequencyCode frequency = null;
  private @Valid LocalDate endDate = null;
  private @Valid ExecutionRule executionRule = null;
  private @Valid Boolean withinAMonthFlag = null;
  private @Valid MonthsOfExecution monthsOfExecution = null;
  private @Valid Integer multiplicator = null;
  private @Valid DayOfExecution dayOfExecution = null;
  private @Valid Amount limitAmount = null;

  /**
   **/
  public StandingOrderDetails startDate(LocalDate startDate) {
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
  public StandingOrderDetails frequency(FrequencyCode frequency) {
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
  public StandingOrderDetails endDate(LocalDate endDate) {
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
  public StandingOrderDetails executionRule(ExecutionRule executionRule) {
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
   * This element is only used in case of frequency equals \&quot;Monthly\&quot;.  If this element equals false it has no effect. If this element equals true, then the execution rule is overruled if the day of execution would fall into a different month using the execution rule.  Example: executionRule equals \&quot;preceding\&quot;, dayOfExecution equals \&quot;02\&quot; and the second of a month is a Sunday.  In this case, the transaction date would be on the last day of the month before.  This would be overruled if withinAMonthFlag equals true and the payment is processed on Monday the third of the Month. Remark: This attribute is rarely supported in the market. 
   **/
  public StandingOrderDetails withinAMonthFlag(Boolean withinAMonthFlag) {
    this.withinAMonthFlag = withinAMonthFlag;
    return this;
  }

  
  @ApiModelProperty(value = "This element is only used in case of frequency equals \"Monthly\".  If this element equals false it has no effect. If this element equals true, then the execution rule is overruled if the day of execution would fall into a different month using the execution rule.  Example: executionRule equals \"preceding\", dayOfExecution equals \"02\" and the second of a month is a Sunday.  In this case, the transaction date would be on the last day of the month before.  This would be overruled if withinAMonthFlag equals true and the payment is processed on Monday the third of the Month. Remark: This attribute is rarely supported in the market. ")
  @JsonProperty("withinAMonthFlag")

  public Boolean isWithinAMonthFlag() {
    return withinAMonthFlag;
  }
  public void setWithinAMonthFlag(Boolean withinAMonthFlag) {
    this.withinAMonthFlag = withinAMonthFlag;
  }

  /**
   **/
  public StandingOrderDetails monthsOfExecution(MonthsOfExecution monthsOfExecution) {
    this.monthsOfExecution = monthsOfExecution;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("monthsOfExecution")

  public MonthsOfExecution getMonthsOfExecution() {
    return monthsOfExecution;
  }
  public void setMonthsOfExecution(MonthsOfExecution monthsOfExecution) {
    this.monthsOfExecution = monthsOfExecution;
  }

  /**
   * This is multiplying the given frequency resulting the exact frequency, e.g. Frequency&#x3D;weekly and multiplicator&#x3D;3 means every 3 weeks. Remark: This attribute is rarely supported in the market. 
   **/
  public StandingOrderDetails multiplicator(Integer multiplicator) {
    this.multiplicator = multiplicator;
    return this;
  }

  
  @ApiModelProperty(value = "This is multiplying the given frequency resulting the exact frequency, e.g. Frequency=weekly and multiplicator=3 means every 3 weeks. Remark: This attribute is rarely supported in the market. ")
  @JsonProperty("multiplicator")

  public Integer getMultiplicator() {
    return multiplicator;
  }
  public void setMultiplicator(Integer multiplicator) {
    this.multiplicator = multiplicator;
  }

  /**
   **/
  public StandingOrderDetails dayOfExecution(DayOfExecution dayOfExecution) {
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

  /**
   **/
  public StandingOrderDetails limitAmount(Amount limitAmount) {
    this.limitAmount = limitAmount;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("limitAmount")

  public Amount getLimitAmount() {
    return limitAmount;
  }
  public void setLimitAmount(Amount limitAmount) {
    this.limitAmount = limitAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandingOrderDetails standingOrderDetails = (StandingOrderDetails) o;
    return Objects.equals(startDate, standingOrderDetails.startDate) &&
        Objects.equals(frequency, standingOrderDetails.frequency) &&
        Objects.equals(endDate, standingOrderDetails.endDate) &&
        Objects.equals(executionRule, standingOrderDetails.executionRule) &&
        Objects.equals(withinAMonthFlag, standingOrderDetails.withinAMonthFlag) &&
        Objects.equals(monthsOfExecution, standingOrderDetails.monthsOfExecution) &&
        Objects.equals(multiplicator, standingOrderDetails.multiplicator) &&
        Objects.equals(dayOfExecution, standingOrderDetails.dayOfExecution) &&
        Objects.equals(limitAmount, standingOrderDetails.limitAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, frequency, endDate, executionRule, withinAMonthFlag, monthsOfExecution, multiplicator, dayOfExecution, limitAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandingOrderDetails {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    executionRule: ").append(toIndentedString(executionRule)).append("\n");
    sb.append("    withinAMonthFlag: ").append(toIndentedString(withinAMonthFlag)).append("\n");
    sb.append("    monthsOfExecution: ").append(toIndentedString(monthsOfExecution)).append("\n");
    sb.append("    multiplicator: ").append(toIndentedString(multiplicator)).append("\n");
    sb.append("    dayOfExecution: ").append(toIndentedString(dayOfExecution)).append("\n");
    sb.append("    limitAmount: ").append(toIndentedString(limitAmount)).append("\n");
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
