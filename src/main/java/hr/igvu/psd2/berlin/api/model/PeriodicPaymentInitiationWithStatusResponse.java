package hr.igvu.psd2.berlin.api.model;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import hr.igvu.psd2.util.ObjectUtil;

/**
  * Generic JSON response body consistion of the corresponding periodic payment initation JSON body together with an optional transaction status field. 
 **/
@Schema(description = "Generic JSON response body consistion of the corresponding periodic payment initation JSON body together with an optional transaction status field. ")
public class PeriodicPaymentInitiationWithStatusResponse implements OneOfinlineResponse200 {

	@Schema(description = "")
	private String endToEndIdentification = null;

	@Schema(required = true, description = "")
	private AccountReference debtorAccount = null;

	@Schema(required = true, description = "")
	private Amount instructedAmount = null;

	@Schema(required = true, description = "")
	private AccountReference creditorAccount = null;

	@Schema(description = "")
	private String creditorAgent = null;

	@Schema(required = true, description = "")
	private String creditorName = null;

	@Schema(description = "")
	private Address creditorAddress = null;

	@Schema(description = "")
	private String remittanceInformationUnstructured = null;

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

	@Schema(description = "")
	private TransactionStatus transactionStatus = null;

	/**
	  * Get endToEndIdentification
	  * @return endToEndIdentification
	 **/
	@JsonProperty("endToEndIdentification")
	@Size(max = 35)
	public String getEndToEndIdentification() {
		return endToEndIdentification;
	}

	public void setEndToEndIdentification(String endToEndIdentification) {
		this.endToEndIdentification = endToEndIdentification;
	}

	public PeriodicPaymentInitiationWithStatusResponse endToEndIdentification(String endToEndIdentification) {
		this.endToEndIdentification = endToEndIdentification;
		return this;
	}

	/**
	  * Get debtorAccount
	  * @return debtorAccount
	 **/
	@JsonProperty("debtorAccount")
	@NotNull
	public AccountReference getDebtorAccount() {
		return debtorAccount;
	}

	public void setDebtorAccount(AccountReference debtorAccount) {
		this.debtorAccount = debtorAccount;
	}

	public PeriodicPaymentInitiationWithStatusResponse debtorAccount(AccountReference debtorAccount) {
		this.debtorAccount = debtorAccount;
		return this;
	}

	/**
	  * Get instructedAmount
	  * @return instructedAmount
	 **/
	@JsonProperty("instructedAmount")
	@NotNull
	public Amount getInstructedAmount() {
		return instructedAmount;
	}

	public void setInstructedAmount(Amount instructedAmount) {
		this.instructedAmount = instructedAmount;
	}

	public PeriodicPaymentInitiationWithStatusResponse instructedAmount(Amount instructedAmount) {
		this.instructedAmount = instructedAmount;
		return this;
	}

	/**
	  * Get creditorAccount
	  * @return creditorAccount
	 **/
	@JsonProperty("creditorAccount")
	@NotNull
	public AccountReference getCreditorAccount() {
		return creditorAccount;
	}

	public void setCreditorAccount(AccountReference creditorAccount) {
		this.creditorAccount = creditorAccount;
	}

	public PeriodicPaymentInitiationWithStatusResponse creditorAccount(AccountReference creditorAccount) {
		this.creditorAccount = creditorAccount;
		return this;
	}

	/**
	  * Get creditorAgent
	  * @return creditorAgent
	 **/
	@JsonProperty("creditorAgent")
	@Pattern(regexp = "[A-Z]{6,6}[A-Z2-9][A-NP-Z0-9]([A-Z0-9]{3,3}){0,1}")
	public String getCreditorAgent() {
		return creditorAgent;
	}

	public void setCreditorAgent(String creditorAgent) {
		this.creditorAgent = creditorAgent;
	}

	public PeriodicPaymentInitiationWithStatusResponse creditorAgent(String creditorAgent) {
		this.creditorAgent = creditorAgent;
		return this;
	}

	/**
	  * Get creditorName
	  * @return creditorName
	 **/
	@JsonProperty("creditorName")
	@NotNull
	@Size(max = 70)
	public String getCreditorName() {
		return creditorName;
	}

	public void setCreditorName(String creditorName) {
		this.creditorName = creditorName;
	}

	public PeriodicPaymentInitiationWithStatusResponse creditorName(String creditorName) {
		this.creditorName = creditorName;
		return this;
	}

	/**
	  * Get creditorAddress
	  * @return creditorAddress
	 **/
	@JsonProperty("creditorAddress")
	public Address getCreditorAddress() {
		return creditorAddress;
	}

	public void setCreditorAddress(Address creditorAddress) {
		this.creditorAddress = creditorAddress;
	}

	public PeriodicPaymentInitiationWithStatusResponse creditorAddress(Address creditorAddress) {
		this.creditorAddress = creditorAddress;
		return this;
	}

	/**
	  * Get remittanceInformationUnstructured
	  * @return remittanceInformationUnstructured
	 **/
	@JsonProperty("remittanceInformationUnstructured")
	@Size(max = 140)
	public String getRemittanceInformationUnstructured() {
		return remittanceInformationUnstructured;
	}

	public void setRemittanceInformationUnstructured(String remittanceInformationUnstructured) {
		this.remittanceInformationUnstructured = remittanceInformationUnstructured;
	}

	public PeriodicPaymentInitiationWithStatusResponse remittanceInformationUnstructured(String remittanceInformationUnstructured) {
		this.remittanceInformationUnstructured = remittanceInformationUnstructured;
		return this;
	}

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

	public PeriodicPaymentInitiationWithStatusResponse startDate(LocalDate startDate) {
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

	public PeriodicPaymentInitiationWithStatusResponse endDate(LocalDate endDate) {
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

	public PeriodicPaymentInitiationWithStatusResponse executionRule(ExecutionRule executionRule) {
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

	public PeriodicPaymentInitiationWithStatusResponse frequency(FrequencyCode frequency) {
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

	public PeriodicPaymentInitiationWithStatusResponse dayOfExecution(DayOfExecution dayOfExecution) {
		this.dayOfExecution = dayOfExecution;
		return this;
	}

	/**
	  * Get transactionStatus
	  * @return transactionStatus
	 **/
	@JsonProperty("transactionStatus")
	public TransactionStatus getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(TransactionStatus transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public PeriodicPaymentInitiationWithStatusResponse transactionStatus(TransactionStatus transactionStatus) {
		this.transactionStatus = transactionStatus;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PeriodicPaymentInitiationWithStatusResponse {\n");

		sb.append("    endToEndIdentification: ").append(ObjectUtil.toIndentedString(endToEndIdentification)).append("\n");
		sb.append("    debtorAccount: ").append(ObjectUtil.toIndentedString(debtorAccount)).append("\n");
		sb.append("    instructedAmount: ").append(ObjectUtil.toIndentedString(instructedAmount)).append("\n");
		sb.append("    creditorAccount: ").append(ObjectUtil.toIndentedString(creditorAccount)).append("\n");
		sb.append("    creditorAgent: ").append(ObjectUtil.toIndentedString(creditorAgent)).append("\n");
		sb.append("    creditorName: ").append(ObjectUtil.toIndentedString(creditorName)).append("\n");
		sb.append("    creditorAddress: ").append(ObjectUtil.toIndentedString(creditorAddress)).append("\n");
		sb.append("    remittanceInformationUnstructured: ").append(ObjectUtil.toIndentedString(remittanceInformationUnstructured)).append("\n");
		sb.append("    startDate: ").append(ObjectUtil.toIndentedString(startDate)).append("\n");
		sb.append("    endDate: ").append(ObjectUtil.toIndentedString(endDate)).append("\n");
		sb.append("    executionRule: ").append(ObjectUtil.toIndentedString(executionRule)).append("\n");
		sb.append("    frequency: ").append(ObjectUtil.toIndentedString(frequency)).append("\n");
		sb.append("    dayOfExecution: ").append(ObjectUtil.toIndentedString(dayOfExecution)).append("\n");
		sb.append("    transactionStatus: ").append(ObjectUtil.toIndentedString(transactionStatus)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
