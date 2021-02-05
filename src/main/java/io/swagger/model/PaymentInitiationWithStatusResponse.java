package io.swagger.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Generic JSON response body consistion of the corresponding payment initation JSON body together with an optional transaction status field. 
 **/
@Schema(description = "Generic JSON response body consistion of the corresponding payment initation JSON body together with an optional transaction status field. ")
public class PaymentInitiationWithStatusResponse implements OneOfinlineResponse200 {

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

	public PaymentInitiationWithStatusResponse endToEndIdentification(String endToEndIdentification) {
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

	public PaymentInitiationWithStatusResponse debtorAccount(AccountReference debtorAccount) {
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

	public PaymentInitiationWithStatusResponse instructedAmount(Amount instructedAmount) {
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

	public PaymentInitiationWithStatusResponse creditorAccount(AccountReference creditorAccount) {
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

	public PaymentInitiationWithStatusResponse creditorAgent(String creditorAgent) {
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

	public PaymentInitiationWithStatusResponse creditorName(String creditorName) {
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

	public PaymentInitiationWithStatusResponse creditorAddress(Address creditorAddress) {
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

	public PaymentInitiationWithStatusResponse remittanceInformationUnstructured(String remittanceInformationUnstructured) {
		this.remittanceInformationUnstructured = remittanceInformationUnstructured;
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

	public PaymentInitiationWithStatusResponse transactionStatus(TransactionStatus transactionStatus) {
		this.transactionStatus = transactionStatus;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PaymentInitiationWithStatusResponse {\n");

		sb.append("    endToEndIdentification: ").append(toIndentedString(endToEndIdentification)).append("\n");
		sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
		sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
		sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
		sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
		sb.append("    creditorName: ").append(toIndentedString(creditorName)).append("\n");
		sb.append("    creditorAddress: ").append(toIndentedString(creditorAddress)).append("\n");
		sb.append("    remittanceInformationUnstructured: ").append(toIndentedString(remittanceInformationUnstructured)).append("\n");
		sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
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
