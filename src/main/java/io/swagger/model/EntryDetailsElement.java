package io.swagger.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.util.ObjectUtil;

public class EntryDetailsElement {

	@Schema(description = "Unique end to end identity.")
	/**
	  * Unique end to end identity.  
	 **/
	private String endToEndId = null;

	@Schema(description = "Identification of Mandates, e.g. a SEPA Mandate ID.")
	/**
	  * Identification of Mandates, e.g. a SEPA Mandate ID.  
	 **/
	private String mandateId = null;

	@Schema(description = "Identification of a Cheque.")
	/**
	  * Identification of a Cheque.  
	 **/
	private String checkId = null;

	@Schema(description = "")
	private String creditorId = null;

	@Schema(required = true, description = "")
	private Amount transactionAmount = null;

	@Schema(description = "")
	private ReportExchangeRateList currencyExchange = null;

	@Schema(description = "")
	private String creditorName = null;

	@Schema(description = "")
	private AccountReference creditorAccount = null;

	@Schema(description = "")
	private String creditorAgent = null;

	@Schema(description = "")
	private String ultimateCreditor = null;

	@Schema(description = "")
	private String debtorName = null;

	@Schema(description = "")
	private AccountReference debtorAccount = null;

	@Schema(description = "")
	private String debtorAgent = null;

	@Schema(description = "")
	private String ultimateDebtor = null;

	@Schema(description = "")
	private String remittanceInformationUnstructured = null;

	@Schema(description = "")
	private RemittanceInformationUnstructuredArray remittanceInformationUnstructuredArray = null;

	@Schema(description = "")
	private RemittanceInformationStructured remittanceInformationStructured = null;

	@Schema(description = "")
	private RemittanceInformationStructuredArray remittanceInformationStructuredArray = null;

	@Schema(description = "")
	private PurposeCode purposeCode = null;

	/**
	  * Unique end to end identity.
	  * @return endToEndId
	 **/
	@JsonProperty("endToEndId")
	@Size(max = 35)
	public String getEndToEndId() {
		return endToEndId;
	}

	public void setEndToEndId(String endToEndId) {
		this.endToEndId = endToEndId;
	}

	public EntryDetailsElement endToEndId(String endToEndId) {
		this.endToEndId = endToEndId;
		return this;
	}

	/**
	  * Identification of Mandates, e.g. a SEPA Mandate ID.
	  * @return mandateId
	 **/
	@JsonProperty("mandateId")
	@Size(max = 35)
	public String getMandateId() {
		return mandateId;
	}

	public void setMandateId(String mandateId) {
		this.mandateId = mandateId;
	}

	public EntryDetailsElement mandateId(String mandateId) {
		this.mandateId = mandateId;
		return this;
	}

	/**
	  * Identification of a Cheque.
	  * @return checkId
	 **/
	@JsonProperty("checkId")
	@Size(max = 35)
	public String getCheckId() {
		return checkId;
	}

	public void setCheckId(String checkId) {
		this.checkId = checkId;
	}

	public EntryDetailsElement checkId(String checkId) {
		this.checkId = checkId;
		return this;
	}

	/**
	  * Get creditorId
	  * @return creditorId
	 **/
	@JsonProperty("creditorId")
	@Size(max = 35)
	public String getCreditorId() {
		return creditorId;
	}

	public void setCreditorId(String creditorId) {
		this.creditorId = creditorId;
	}

	public EntryDetailsElement creditorId(String creditorId) {
		this.creditorId = creditorId;
		return this;
	}

	/**
	  * Get transactionAmount
	  * @return transactionAmount
	 **/
	@JsonProperty("transactionAmount")
	@NotNull
	public Amount getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(Amount transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public EntryDetailsElement transactionAmount(Amount transactionAmount) {
		this.transactionAmount = transactionAmount;
		return this;
	}

	/**
	  * Get currencyExchange
	  * @return currencyExchange
	 **/
	@JsonProperty("currencyExchange")
	public ReportExchangeRateList getCurrencyExchange() {
		return currencyExchange;
	}

	public void setCurrencyExchange(ReportExchangeRateList currencyExchange) {
		this.currencyExchange = currencyExchange;
	}

	public EntryDetailsElement currencyExchange(ReportExchangeRateList currencyExchange) {
		this.currencyExchange = currencyExchange;
		return this;
	}

	/**
	  * Get creditorName
	  * @return creditorName
	 **/
	@JsonProperty("creditorName")
	@Size(max = 70)
	public String getCreditorName() {
		return creditorName;
	}

	public void setCreditorName(String creditorName) {
		this.creditorName = creditorName;
	}

	public EntryDetailsElement creditorName(String creditorName) {
		this.creditorName = creditorName;
		return this;
	}

	/**
	  * Get creditorAccount
	  * @return creditorAccount
	 **/
	@JsonProperty("creditorAccount")
	public AccountReference getCreditorAccount() {
		return creditorAccount;
	}

	public void setCreditorAccount(AccountReference creditorAccount) {
		this.creditorAccount = creditorAccount;
	}

	public EntryDetailsElement creditorAccount(AccountReference creditorAccount) {
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

	public EntryDetailsElement creditorAgent(String creditorAgent) {
		this.creditorAgent = creditorAgent;
		return this;
	}

	/**
	  * Get ultimateCreditor
	  * @return ultimateCreditor
	 **/
	@JsonProperty("ultimateCreditor")
	@Size(max = 70)
	public String getUltimateCreditor() {
		return ultimateCreditor;
	}

	public void setUltimateCreditor(String ultimateCreditor) {
		this.ultimateCreditor = ultimateCreditor;
	}

	public EntryDetailsElement ultimateCreditor(String ultimateCreditor) {
		this.ultimateCreditor = ultimateCreditor;
		return this;
	}

	/**
	  * Get debtorName
	  * @return debtorName
	 **/
	@JsonProperty("debtorName")
	@Size(max = 70)
	public String getDebtorName() {
		return debtorName;
	}

	public void setDebtorName(String debtorName) {
		this.debtorName = debtorName;
	}

	public EntryDetailsElement debtorName(String debtorName) {
		this.debtorName = debtorName;
		return this;
	}

	/**
	  * Get debtorAccount
	  * @return debtorAccount
	 **/
	@JsonProperty("debtorAccount")
	public AccountReference getDebtorAccount() {
		return debtorAccount;
	}

	public void setDebtorAccount(AccountReference debtorAccount) {
		this.debtorAccount = debtorAccount;
	}

	public EntryDetailsElement debtorAccount(AccountReference debtorAccount) {
		this.debtorAccount = debtorAccount;
		return this;
	}

	/**
	  * Get debtorAgent
	  * @return debtorAgent
	 **/
	@JsonProperty("debtorAgent")
	@Pattern(regexp = "[A-Z]{6,6}[A-Z2-9][A-NP-Z0-9]([A-Z0-9]{3,3}){0,1}")
	public String getDebtorAgent() {
		return debtorAgent;
	}

	public void setDebtorAgent(String debtorAgent) {
		this.debtorAgent = debtorAgent;
	}

	public EntryDetailsElement debtorAgent(String debtorAgent) {
		this.debtorAgent = debtorAgent;
		return this;
	}

	/**
	  * Get ultimateDebtor
	  * @return ultimateDebtor
	 **/
	@JsonProperty("ultimateDebtor")
	@Size(max = 70)
	public String getUltimateDebtor() {
		return ultimateDebtor;
	}

	public void setUltimateDebtor(String ultimateDebtor) {
		this.ultimateDebtor = ultimateDebtor;
	}

	public EntryDetailsElement ultimateDebtor(String ultimateDebtor) {
		this.ultimateDebtor = ultimateDebtor;
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

	public EntryDetailsElement remittanceInformationUnstructured(String remittanceInformationUnstructured) {
		this.remittanceInformationUnstructured = remittanceInformationUnstructured;
		return this;
	}

	/**
	  * Get remittanceInformationUnstructuredArray
	  * @return remittanceInformationUnstructuredArray
	 **/
	@JsonProperty("remittanceInformationUnstructuredArray")
	public RemittanceInformationUnstructuredArray getRemittanceInformationUnstructuredArray() {
		return remittanceInformationUnstructuredArray;
	}

	public void setRemittanceInformationUnstructuredArray(RemittanceInformationUnstructuredArray remittanceInformationUnstructuredArray) {
		this.remittanceInformationUnstructuredArray = remittanceInformationUnstructuredArray;
	}

	public EntryDetailsElement remittanceInformationUnstructuredArray(RemittanceInformationUnstructuredArray remittanceInformationUnstructuredArray) {
		this.remittanceInformationUnstructuredArray = remittanceInformationUnstructuredArray;
		return this;
	}

	/**
	  * Get remittanceInformationStructured
	  * @return remittanceInformationStructured
	 **/
	@JsonProperty("remittanceInformationStructured")
	public RemittanceInformationStructured getRemittanceInformationStructured() {
		return remittanceInformationStructured;
	}

	public void setRemittanceInformationStructured(RemittanceInformationStructured remittanceInformationStructured) {
		this.remittanceInformationStructured = remittanceInformationStructured;
	}

	public EntryDetailsElement remittanceInformationStructured(RemittanceInformationStructured remittanceInformationStructured) {
		this.remittanceInformationStructured = remittanceInformationStructured;
		return this;
	}

	/**
	  * Get remittanceInformationStructuredArray
	  * @return remittanceInformationStructuredArray
	 **/
	@JsonProperty("remittanceInformationStructuredArray")
	public RemittanceInformationStructuredArray getRemittanceInformationStructuredArray() {
		return remittanceInformationStructuredArray;
	}

	public void setRemittanceInformationStructuredArray(RemittanceInformationStructuredArray remittanceInformationStructuredArray) {
		this.remittanceInformationStructuredArray = remittanceInformationStructuredArray;
	}

	public EntryDetailsElement remittanceInformationStructuredArray(RemittanceInformationStructuredArray remittanceInformationStructuredArray) {
		this.remittanceInformationStructuredArray = remittanceInformationStructuredArray;
		return this;
	}

	/**
	  * Get purposeCode
	  * @return purposeCode
	 **/
	@JsonProperty("purposeCode")
	public PurposeCode getPurposeCode() {
		return purposeCode;
	}

	public void setPurposeCode(PurposeCode purposeCode) {
		this.purposeCode = purposeCode;
	}

	public EntryDetailsElement purposeCode(PurposeCode purposeCode) {
		this.purposeCode = purposeCode;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class EntryDetailsElement {\n");

		sb.append("    endToEndId: ").append(ObjectUtil.toIndentedString(endToEndId)).append("\n");
		sb.append("    mandateId: ").append(ObjectUtil.toIndentedString(mandateId)).append("\n");
		sb.append("    checkId: ").append(ObjectUtil.toIndentedString(checkId)).append("\n");
		sb.append("    creditorId: ").append(ObjectUtil.toIndentedString(creditorId)).append("\n");
		sb.append("    transactionAmount: ").append(ObjectUtil.toIndentedString(transactionAmount)).append("\n");
		sb.append("    currencyExchange: ").append(ObjectUtil.toIndentedString(currencyExchange)).append("\n");
		sb.append("    creditorName: ").append(ObjectUtil.toIndentedString(creditorName)).append("\n");
		sb.append("    creditorAccount: ").append(ObjectUtil.toIndentedString(creditorAccount)).append("\n");
		sb.append("    creditorAgent: ").append(ObjectUtil.toIndentedString(creditorAgent)).append("\n");
		sb.append("    ultimateCreditor: ").append(ObjectUtil.toIndentedString(ultimateCreditor)).append("\n");
		sb.append("    debtorName: ").append(ObjectUtil.toIndentedString(debtorName)).append("\n");
		sb.append("    debtorAccount: ").append(ObjectUtil.toIndentedString(debtorAccount)).append("\n");
		sb.append("    debtorAgent: ").append(ObjectUtil.toIndentedString(debtorAgent)).append("\n");
		sb.append("    ultimateDebtor: ").append(ObjectUtil.toIndentedString(ultimateDebtor)).append("\n");
		sb.append("    remittanceInformationUnstructured: ").append(ObjectUtil.toIndentedString(remittanceInformationUnstructured)).append("\n");
		sb.append("    remittanceInformationUnstructuredArray: ").append(ObjectUtil.toIndentedString(remittanceInformationUnstructuredArray)).append("\n");
		sb.append("    remittanceInformationStructured: ").append(ObjectUtil.toIndentedString(remittanceInformationStructured)).append("\n");
		sb.append("    remittanceInformationStructuredArray: ").append(ObjectUtil.toIndentedString(remittanceInformationStructuredArray)).append("\n");
		sb.append("    purposeCode: ").append(ObjectUtil.toIndentedString(purposeCode)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
