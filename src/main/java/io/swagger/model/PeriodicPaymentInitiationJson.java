package io.swagger.model;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Generic Body for a periodic payment initation via JSON.  This generic JSON body can be used to represent valid periodic payment initiations for the following JSON based payment product,  which where defined in the Implementation Guidelines:    * sepa-credit-transfers   * instant-sepa-credit-transfers   * target-2-payments   * cross-border-credit-transfers  For the convenience of the implementer additional which are already predefinded in the Implementation Guidelines  are included (but commented in source code), such that an ASPSP may add them easily.  Take care: Since the format is intended to fit for all payment products  there are additional conditions which are NOT covered by this specification. Please check the Implementation Guidelines for detailes.   The following data element are depending on the actual payment product available (in source code):             <table style=\"width:100%\">  <tr><th>Data Element</th><th>SCT EU Core</th><th>SCT INST EU Core</th><th>Target2 Paym. Core</th><th>Cross Border CT Core</th></tr>  <tr><td>endToEndIdentification</td><td> optional</td> <td>optional</td> <td>optional</td> <td>n.a.</td> </tr>  <tr><td>instructionIdentification</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>debtorName</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>debtorAccount</td> <td>mandatory</td> <td>mandatory</td> <td>mandatory</td> <td>mandatory</td> </tr>  <tr><td>debtorId</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>ultimateDebtor</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>instructedAmount</td> <td>mandatory</td> <td>mandatory</td> <td>mandatory</td> <td>mandatory</td> </tr>  <tr><td>transactionCurrency</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>exchangeRateInformation</td> <td>n.a.</td> <td>n.a.</td><td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>creditorAccount</td> <td>mandatory</td> <td>mandatory</td> <td>mandatory</td> <td>mandatory</td> </tr>  <tr><td>creditorAgent</td> <td>optional</td> <td>optional</td> <td>optional</td> <td>conditional </td> </tr>  <tr><td>creditorAgentName</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>creditorName</td> <td>mandatory</td> <td>mandatory</td> <td>mandatory</td> <td>mandatory</td> </tr>  <tr><td>creditorId</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>creditorAddress</td>optional</td> <td>optional</td> <td>optional</td> <td>conditional </td> </tr>  <tr><td>creditorNameAndAddress</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>ultimateCreditor</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>purposeCode</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>chargeBearer</td> <td>n.a.</td> <td>n.a.</td> <td>optional</td> <td>conditional </td> </tr>  <tr><td>remittanceInformationUnstructured</td> <td>optional</td> <td>optional</td> <td> optional</td> <td>optional</td> </tr>  <tr><td>remittanceInformationUnstructuredArray</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>remittanceInformationStructured</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>remittanceInformationStructuredArray</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>requestedExecutionDate</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>requestedExecutionTime</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>startDate</td> <td>mandatory</td> <td>mandatory</td> <td>mandatory</td> <td>mandatory</td> </tr>  <tr><td>executionRule</td> <td>optional</td> <td>optional</td> <td>optional</td> <td>optional</td> </tr>  <tr><td>endDate</td> <td>optional</td> <td>optional</td> <td>optional</td> <td>optional</td> </tr>  <tr><td>frequency</td> <td>mandatory</td> <td>mandatory</td> <td>mandatory</td> <td>mandatory</td> </tr>  <tr><td>dayOfExecution</td> <td>conditional</td> <td>conditional</td> <td>conditional</td> <td>conditional</td> </tr>     </td></tr>   </table>    IMPORTANT: In this API definition the following holds:   *  All data elements mentioned above are defined, but some of them are commented,      i.e. they are only visible in the source code and can be used by uncommenting them.   * Data elements which are mandatory in the table above for all payment products      are set to be mandatory in this specification.   * Data elements which are indicated in the table above as n.a. for all payment products are commented in the source code.   * Data elements which are indicated to be option, conditional or mandatory for at least one payment product      in the table above are set to be optional in the s specification except the case where all are definde to be mandatory.    * Data element which are inticated to be n.a. can be used by the ASPS if needed.      In this case uncomment tthe the relatetd lines in the source code.   * If one uses this data types for some payment products he has to ensure that the used data type is      valid according to the underlying payment product, e.g. by some appropriate validations. 
 **/
@Schema(description = "Generic Body for a periodic payment initation via JSON.  This generic JSON body can be used to represent valid periodic payment initiations for the following JSON based payment product,  which where defined in the Implementation Guidelines:    * sepa-credit-transfers   * instant-sepa-credit-transfers   * target-2-payments   * cross-border-credit-transfers  For the convenience of the implementer additional which are already predefinded in the Implementation Guidelines  are included (but commented in source code), such that an ASPSP may add them easily.  Take care: Since the format is intended to fit for all payment products  there are additional conditions which are NOT covered by this specification. Please check the Implementation Guidelines for detailes.   The following data element are depending on the actual payment product available (in source code):             <table style=\"width:100%\">  <tr><th>Data Element</th><th>SCT EU Core</th><th>SCT INST EU Core</th><th>Target2 Paym. Core</th><th>Cross Border CT Core</th></tr>  <tr><td>endToEndIdentification</td><td> optional</td> <td>optional</td> <td>optional</td> <td>n.a.</td> </tr>  <tr><td>instructionIdentification</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>debtorName</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>debtorAccount</td> <td>mandatory</td> <td>mandatory</td> <td>mandatory</td> <td>mandatory</td> </tr>  <tr><td>debtorId</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>ultimateDebtor</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>instructedAmount</td> <td>mandatory</td> <td>mandatory</td> <td>mandatory</td> <td>mandatory</td> </tr>  <tr><td>transactionCurrency</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>exchangeRateInformation</td> <td>n.a.</td> <td>n.a.</td><td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>creditorAccount</td> <td>mandatory</td> <td>mandatory</td> <td>mandatory</td> <td>mandatory</td> </tr>  <tr><td>creditorAgent</td> <td>optional</td> <td>optional</td> <td>optional</td> <td>conditional </td> </tr>  <tr><td>creditorAgentName</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>creditorName</td> <td>mandatory</td> <td>mandatory</td> <td>mandatory</td> <td>mandatory</td> </tr>  <tr><td>creditorId</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>creditorAddress</td>optional</td> <td>optional</td> <td>optional</td> <td>conditional </td> </tr>  <tr><td>creditorNameAndAddress</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>ultimateCreditor</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>purposeCode</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>chargeBearer</td> <td>n.a.</td> <td>n.a.</td> <td>optional</td> <td>conditional </td> </tr>  <tr><td>remittanceInformationUnstructured</td> <td>optional</td> <td>optional</td> <td> optional</td> <td>optional</td> </tr>  <tr><td>remittanceInformationUnstructuredArray</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>remittanceInformationStructured</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>remittanceInformationStructuredArray</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>requestedExecutionDate</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>requestedExecutionTime</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>startDate</td> <td>mandatory</td> <td>mandatory</td> <td>mandatory</td> <td>mandatory</td> </tr>  <tr><td>executionRule</td> <td>optional</td> <td>optional</td> <td>optional</td> <td>optional</td> </tr>  <tr><td>endDate</td> <td>optional</td> <td>optional</td> <td>optional</td> <td>optional</td> </tr>  <tr><td>frequency</td> <td>mandatory</td> <td>mandatory</td> <td>mandatory</td> <td>mandatory</td> </tr>  <tr><td>dayOfExecution</td> <td>conditional</td> <td>conditional</td> <td>conditional</td> <td>conditional</td> </tr>     </td></tr>   </table>    IMPORTANT: In this API definition the following holds:   *  All data elements mentioned above are defined, but some of them are commented,      i.e. they are only visible in the source code and can be used by uncommenting them.   * Data elements which are mandatory in the table above for all payment products      are set to be mandatory in this specification.   * Data elements which are indicated in the table above as n.a. for all payment products are commented in the source code.   * Data elements which are indicated to be option, conditional or mandatory for at least one payment product      in the table above are set to be optional in the s specification except the case where all are definde to be mandatory.    * Data element which are inticated to be n.a. can be used by the ASPS if needed.      In this case uncomment tthe the relatetd lines in the source code.   * If one uses this data types for some payment products he has to ensure that the used data type is      valid according to the underlying payment product, e.g. by some appropriate validations. ")
public class PeriodicPaymentInitiationJson {

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

	public PeriodicPaymentInitiationJson endToEndIdentification(String endToEndIdentification) {
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

	public PeriodicPaymentInitiationJson debtorAccount(AccountReference debtorAccount) {
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

	public PeriodicPaymentInitiationJson instructedAmount(Amount instructedAmount) {
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

	public PeriodicPaymentInitiationJson creditorAccount(AccountReference creditorAccount) {
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

	public PeriodicPaymentInitiationJson creditorAgent(String creditorAgent) {
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

	public PeriodicPaymentInitiationJson creditorName(String creditorName) {
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

	public PeriodicPaymentInitiationJson creditorAddress(Address creditorAddress) {
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

	public PeriodicPaymentInitiationJson remittanceInformationUnstructured(String remittanceInformationUnstructured) {
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

	public PeriodicPaymentInitiationJson startDate(LocalDate startDate) {
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

	public PeriodicPaymentInitiationJson endDate(LocalDate endDate) {
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

	public PeriodicPaymentInitiationJson executionRule(ExecutionRule executionRule) {
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

	public PeriodicPaymentInitiationJson frequency(FrequencyCode frequency) {
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

	public PeriodicPaymentInitiationJson dayOfExecution(DayOfExecution dayOfExecution) {
		this.dayOfExecution = dayOfExecution;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PeriodicPaymentInitiationJson {\n");

		sb.append("    endToEndIdentification: ").append(toIndentedString(endToEndIdentification)).append("\n");
		sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
		sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
		sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
		sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
		sb.append("    creditorName: ").append(toIndentedString(creditorName)).append("\n");
		sb.append("    creditorAddress: ").append(toIndentedString(creditorAddress)).append("\n");
		sb.append("    remittanceInformationUnstructured: ").append(toIndentedString(remittanceInformationUnstructured)).append("\n");
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
