package io.swagger.model;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The body part 2 of a periodic payment initation request containes the execution related informations  of the periodic payment. 
 **/
@Schema(description = "The body part 2 of a periodic payment initation request containes the execution related informations  of the periodic payment. ")
public class PeriodicPaymentInitiationXmlPart2StandingorderTypeJson {

	@Schema(required = true, description = "")
	private LocalDate startDate = null;

	@Schema(description = "")
	private LocalDate endDate = null;

	@Schema(description = "")
	private ExecutionRule executionRule = null;

	@Schema(required = true, description = "")
	private FrequencyCode frequency = null;

	@Schema(description = "")
	private DayOfExecution dayOfExecution = null;

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

	public PeriodicPaymentInitiationXmlPart2StandingorderTypeJson startDate(LocalDate startDate) {
		this.startDate = startDate;
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

	public PeriodicPaymentInitiationXmlPart2StandingorderTypeJson endDate(LocalDate endDate) {
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

	public PeriodicPaymentInitiationXmlPart2StandingorderTypeJson executionRule(ExecutionRule executionRule) {
		this.executionRule = executionRule;
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

	public PeriodicPaymentInitiationXmlPart2StandingorderTypeJson frequency(FrequencyCode frequency) {
		this.frequency = frequency;
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

	public PeriodicPaymentInitiationXmlPart2StandingorderTypeJson dayOfExecution(DayOfExecution dayOfExecution) {
		this.dayOfExecution = dayOfExecution;
		return this;
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
	private static String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
