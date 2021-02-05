package io.swagger.model;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Content of the body of a consent request. 
 **/
@Schema(description = "Content of the body of a consent request. ")
public class Consents {

	@Schema(required = true, description = "")
	private AccountAccess access = null;

	@Schema(required = true, description = "")
	private Boolean recurringIndicator = null;

	@Schema(required = true, description = "")
	private LocalDate validUntil = null;

	@Schema(required = true, description = "")
	private Integer frequencyPerDay = null;

	@Schema(example = "false", required = true, description = "If \"true\" indicates that a payment initiation service will be addressed in the same \"session\". ")
	/**
	  * If \"true\" indicates that a payment initiation service will be addressed in the same \"session\".   
	 **/
	private Boolean combinedServiceIndicator = null;

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

	public Consents access(AccountAccess access) {
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

	public Consents recurringIndicator(Boolean recurringIndicator) {
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

	public Consents validUntil(LocalDate validUntil) {
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

	public Consents frequencyPerDay(Integer frequencyPerDay) {
		this.frequencyPerDay = frequencyPerDay;
		return this;
	}

	/**
	  * If \&quot;true\&quot; indicates that a payment initiation service will be addressed in the same \&quot;session\&quot;. 
	  * @return combinedServiceIndicator
	 **/
	@JsonProperty("combinedServiceIndicator")
	@NotNull
	public Boolean isCombinedServiceIndicator() {
		return combinedServiceIndicator;
	}

	public void setCombinedServiceIndicator(Boolean combinedServiceIndicator) {
		this.combinedServiceIndicator = combinedServiceIndicator;
	}

	public Consents combinedServiceIndicator(Boolean combinedServiceIndicator) {
		this.combinedServiceIndicator = combinedServiceIndicator;
		return this;
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
	private static String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
