package io.swagger.model;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Details of underlying standing orders. 
 **/
@Schema(description = "Details of underlying standing orders. ")
public class StandingOrderDetails {

	@Schema(required = true, description = "")
	private LocalDate startDate = null;

	@Schema(required = true, description = "")
	private FrequencyCode frequency = null;

	@Schema(description = "")
	private LocalDate endDate = null;

	@Schema(description = "")
	private ExecutionRule executionRule = null;

	@Schema(description = "This element is only used in case of frequency equals \"Monthly\".  If this element equals false it has no effect. If this element equals true, then the execution rule is overruled if the day of execution would fall into a different month using the execution rule.  Example: executionRule equals \"preceding\", dayOfExecution equals \"02\" and the second of a month is a Sunday.  In this case, the transaction date would be on the last day of the month before.  This would be overruled if withinAMonthFlag equals true and the payment is processed on Monday the third of the Month. Remark: This attribute is rarely supported in the market. ")
	/**
	  * This element is only used in case of frequency equals \"Monthly\".  If this element equals false it has no effect. If this element equals true, then the execution rule is overruled if the day of execution would fall into a different month using the execution rule.  Example: executionRule equals \"preceding\", dayOfExecution equals \"02\" and the second of a month is a Sunday.  In this case, the transaction date would be on the last day of the month before.  This would be overruled if withinAMonthFlag equals true and the payment is processed on Monday the third of the Month. Remark: This attribute is rarely supported in the market.   
	 **/
	private Boolean withinAMonthFlag = null;

	@Schema(description = "")
	private MonthsOfExecution monthsOfExecution = null;

	@Schema(description = "This is multiplying the given frequency resulting the exact frequency, e.g. Frequency=weekly and multiplicator=3 means every 3 weeks. Remark: This attribute is rarely supported in the market. ")
	/**
	  * This is multiplying the given frequency resulting the exact frequency, e.g. Frequency=weekly and multiplicator=3 means every 3 weeks. Remark: This attribute is rarely supported in the market.   
	 **/
	private Integer multiplicator = null;

	@Schema(description = "")
	private DayOfExecution dayOfExecution = null;

	@Schema(description = "")
	private Amount limitAmount = null;

	/**
	  * Get startDate
	  * @return startDate
	 **/
	@JsonProperty("startDate")
	@NotNull
	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public StandingOrderDetails startDate(LocalDate startDate) {
		this.startDate = startDate;
		return this;
	}

	/**
	  * Get frequency
	  * @return frequency
	 **/
	@JsonProperty("frequency")
	@NotNull
	public FrequencyCode getFrequency() {
		return frequency;
	}

	public void setFrequency(FrequencyCode frequency) {
		this.frequency = frequency;
	}

	public StandingOrderDetails frequency(FrequencyCode frequency) {
		this.frequency = frequency;
		return this;
	}

	/**
	  * Get endDate
	  * @return endDate
	 **/
	@JsonProperty("endDate")
	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public StandingOrderDetails endDate(LocalDate endDate) {
		this.endDate = endDate;
		return this;
	}

	/**
	  * Get executionRule
	  * @return executionRule
	 **/
	@JsonProperty("executionRule")
	public ExecutionRule getExecutionRule() {
		return executionRule;
	}

	public void setExecutionRule(ExecutionRule executionRule) {
		this.executionRule = executionRule;
	}

	public StandingOrderDetails executionRule(ExecutionRule executionRule) {
		this.executionRule = executionRule;
		return this;
	}

	/**
	  * This element is only used in case of frequency equals \&quot;Monthly\&quot;.  If this element equals false it has no effect. If this element equals true, then the execution rule is overruled if the day of execution would fall into a different month using the execution rule.  Example: executionRule equals \&quot;preceding\&quot;, dayOfExecution equals \&quot;02\&quot; and the second of a month is a Sunday.  In this case, the transaction date would be on the last day of the month before.  This would be overruled if withinAMonthFlag equals true and the payment is processed on Monday the third of the Month. Remark: This attribute is rarely supported in the market. 
	  * @return withinAMonthFlag
	 **/
	@JsonProperty("withinAMonthFlag")
	public Boolean isWithinAMonthFlag() {
		return withinAMonthFlag;
	}

	public void setWithinAMonthFlag(Boolean withinAMonthFlag) {
		this.withinAMonthFlag = withinAMonthFlag;
	}

	public StandingOrderDetails withinAMonthFlag(Boolean withinAMonthFlag) {
		this.withinAMonthFlag = withinAMonthFlag;
		return this;
	}

	/**
	  * Get monthsOfExecution
	  * @return monthsOfExecution
	 **/
	@JsonProperty("monthsOfExecution")
	public MonthsOfExecution getMonthsOfExecution() {
		return monthsOfExecution;
	}

	public void setMonthsOfExecution(MonthsOfExecution monthsOfExecution) {
		this.monthsOfExecution = monthsOfExecution;
	}

	public StandingOrderDetails monthsOfExecution(MonthsOfExecution monthsOfExecution) {
		this.monthsOfExecution = monthsOfExecution;
		return this;
	}

	/**
	  * This is multiplying the given frequency resulting the exact frequency, e.g. Frequency&#x3D;weekly and multiplicator&#x3D;3 means every 3 weeks. Remark: This attribute is rarely supported in the market. 
	  * @return multiplicator
	 **/
	@JsonProperty("multiplicator")
	public Integer getMultiplicator() {
		return multiplicator;
	}

	public void setMultiplicator(Integer multiplicator) {
		this.multiplicator = multiplicator;
	}

	public StandingOrderDetails multiplicator(Integer multiplicator) {
		this.multiplicator = multiplicator;
		return this;
	}

	/**
	  * Get dayOfExecution
	  * @return dayOfExecution
	 **/
	@JsonProperty("dayOfExecution")
	@Size(max = 2)
	public DayOfExecution getDayOfExecution() {
		return dayOfExecution;
	}

	public void setDayOfExecution(DayOfExecution dayOfExecution) {
		this.dayOfExecution = dayOfExecution;
	}

	public StandingOrderDetails dayOfExecution(DayOfExecution dayOfExecution) {
		this.dayOfExecution = dayOfExecution;
		return this;
	}

	/**
	  * Get limitAmount
	  * @return limitAmount
	 **/
	@JsonProperty("limitAmount")
	public Amount getLimitAmount() {
		return limitAmount;
	}

	public void setLimitAmount(Amount limitAmount) {
		this.limitAmount = limitAmount;
	}

	public StandingOrderDetails limitAmount(Amount limitAmount) {
		this.limitAmount = limitAmount;
		return this;
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
	private static String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
