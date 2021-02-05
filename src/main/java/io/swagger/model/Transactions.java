package io.swagger.model;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Transaction details.
 **/
@Schema(description = "Transaction details.")
public class Transactions {

	@Schema(description = "")
	private String transactionId = null;

	@Schema(description = "")
	private String entryReference = null;

	@Schema(description = "Unique end to end identity.")
	/**
	  * Unique end to end identity.  
	 **/
	private String endToEndId = null;

	@Schema(description = "If this indicator equals true, then the related entry is a batch entry. ")
	/**
	  * If this indicator equals true, then the related entry is a batch entry.   
	 **/
	private Boolean batchIndicator = null;

	@Schema(description = "Shall be used if and only if the batchIndicator is contained and equals true. ")
	/**
	  * Shall be used if and only if the batchIndicator is contained and equals true.   
	 **/
	private Integer batchNumberOfTransactions = null;

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

	@Schema(description = "")
	private LocalDate bookingDate = null;

	@Schema(description = "The Date at which assets become available to the account owner in case of a credit.")
	/**
	  * The Date at which assets become available to the account owner in case of a credit.  
	 **/
	private LocalDate valueDate = null;

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
	private String remittanceInformationStructured = null;

	@Schema(description = "")
	private RemittanceInformationStructuredArray remittanceInformationStructuredArray = null;

	@Schema(description = "")
	private EntryDetails entryDetails = null;

	@Schema(description = "")
	private String additionalInformation = null;

	@Schema(description = "")
	private AdditionalInformationStructured additionalInformationStructured = null;

	@Schema(description = "")
	private PurposeCode purposeCode = null;

	@Schema(description = "")
	private String bankTransactionCode = null;

	@Schema(description = "")
	private String proprietaryBankTransactionCode = null;

	@Schema(description = "")
	private Balance balanceAfterTransaction = null;

	@Schema(description = "")
	private LinksTransactionDetails _links = null;

	/**
	  * Get transactionId
	  * @return transactionId
	 **/
	@JsonProperty("transactionId")
	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public Transactions transactionId(String transactionId) {
		this.transactionId = transactionId;
		return this;
	}

	/**
	  * Get entryReference
	  * @return entryReference
	 **/
	@JsonProperty("entryReference")
	@Size(max = 35)
	public String getEntryReference() {
		return entryReference;
	}

	public void setEntryReference(String entryReference) {
		this.entryReference = entryReference;
	}

	public Transactions entryReference(String entryReference) {
		this.entryReference = entryReference;
		return this;
	}

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

	public Transactions endToEndId(String endToEndId) {
		this.endToEndId = endToEndId;
		return this;
	}

	/**
	  * If this indicator equals true, then the related entry is a batch entry. 
	  * @return batchIndicator
	 **/
	@JsonProperty("batchIndicator")
	public Boolean isBatchIndicator() {
		return batchIndicator;
	}

	public void setBatchIndicator(Boolean batchIndicator) {
		this.batchIndicator = batchIndicator;
	}

	public Transactions batchIndicator(Boolean batchIndicator) {
		this.batchIndicator = batchIndicator;
		return this;
	}

	/**
	  * Shall be used if and only if the batchIndicator is contained and equals true. 
	  * @return batchNumberOfTransactions
	 **/
	@JsonProperty("batchNumberOfTransactions")
	public Integer getBatchNumberOfTransactions() {
		return batchNumberOfTransactions;
	}

	public void setBatchNumberOfTransactions(Integer batchNumberOfTransactions) {
		this.batchNumberOfTransactions = batchNumberOfTransactions;
	}

	public Transactions batchNumberOfTransactions(Integer batchNumberOfTransactions) {
		this.batchNumberOfTransactions = batchNumberOfTransactions;
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

	public Transactions mandateId(String mandateId) {
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

	public Transactions checkId(String checkId) {
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

	public Transactions creditorId(String creditorId) {
		this.creditorId = creditorId;
		return this;
	}

	/**
	  * Get bookingDate
	  * @return bookingDate
	 **/
	@JsonProperty("bookingDate")
	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Transactions bookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
		return this;
	}

	/**
	  * The Date at which assets become available to the account owner in case of a credit.
	  * @return valueDate
	 **/
	@JsonProperty("valueDate")
	public LocalDate getValueDate() {
		return valueDate;
	}

	public void setValueDate(LocalDate valueDate) {
		this.valueDate = valueDate;
	}

	public Transactions valueDate(LocalDate valueDate) {
		this.valueDate = valueDate;
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

	public Transactions transactionAmount(Amount transactionAmount) {
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

	public Transactions currencyExchange(ReportExchangeRateList currencyExchange) {
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

	public Transactions creditorName(String creditorName) {
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

	public Transactions creditorAccount(AccountReference creditorAccount) {
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

	public Transactions creditorAgent(String creditorAgent) {
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

	public Transactions ultimateCreditor(String ultimateCreditor) {
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

	public Transactions debtorName(String debtorName) {
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

	public Transactions debtorAccount(AccountReference debtorAccount) {
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

	public Transactions debtorAgent(String debtorAgent) {
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

	public Transactions ultimateDebtor(String ultimateDebtor) {
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

	public Transactions remittanceInformationUnstructured(String remittanceInformationUnstructured) {
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

	public Transactions remittanceInformationUnstructuredArray(RemittanceInformationUnstructuredArray remittanceInformationUnstructuredArray) {
		this.remittanceInformationUnstructuredArray = remittanceInformationUnstructuredArray;
		return this;
	}

	/**
	  * Get remittanceInformationStructured
	  * @return remittanceInformationStructured
	 **/
	@JsonProperty("remittanceInformationStructured")
	@Size(max = 140)
	public String getRemittanceInformationStructured() {
		return remittanceInformationStructured;
	}

	public void setRemittanceInformationStructured(String remittanceInformationStructured) {
		this.remittanceInformationStructured = remittanceInformationStructured;
	}

	public Transactions remittanceInformationStructured(String remittanceInformationStructured) {
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

	public Transactions remittanceInformationStructuredArray(RemittanceInformationStructuredArray remittanceInformationStructuredArray) {
		this.remittanceInformationStructuredArray = remittanceInformationStructuredArray;
		return this;
	}

	/**
	  * Get entryDetails
	  * @return entryDetails
	 **/
	@JsonProperty("entryDetails")
	public EntryDetails getEntryDetails() {
		return entryDetails;
	}

	public void setEntryDetails(EntryDetails entryDetails) {
		this.entryDetails = entryDetails;
	}

	public Transactions entryDetails(EntryDetails entryDetails) {
		this.entryDetails = entryDetails;
		return this;
	}

	/**
	  * Get additionalInformation
	  * @return additionalInformation
	 **/
	@JsonProperty("additionalInformation")
	@Size(max = 500)
	public String getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(String additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	public Transactions additionalInformation(String additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}

	/**
	  * Get additionalInformationStructured
	  * @return additionalInformationStructured
	 **/
	@JsonProperty("additionalInformationStructured")
	public AdditionalInformationStructured getAdditionalInformationStructured() {
		return additionalInformationStructured;
	}

	public void setAdditionalInformationStructured(AdditionalInformationStructured additionalInformationStructured) {
		this.additionalInformationStructured = additionalInformationStructured;
	}

	public Transactions additionalInformationStructured(AdditionalInformationStructured additionalInformationStructured) {
		this.additionalInformationStructured = additionalInformationStructured;
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

	public Transactions purposeCode(PurposeCode purposeCode) {
		this.purposeCode = purposeCode;
		return this;
	}

	/**
	  * Get bankTransactionCode
	  * @return bankTransactionCode
	 **/
	@JsonProperty("bankTransactionCode")
	public String getBankTransactionCode() {
		return bankTransactionCode;
	}

	public void setBankTransactionCode(String bankTransactionCode) {
		this.bankTransactionCode = bankTransactionCode;
	}

	public Transactions bankTransactionCode(String bankTransactionCode) {
		this.bankTransactionCode = bankTransactionCode;
		return this;
	}

	/**
	  * Get proprietaryBankTransactionCode
	  * @return proprietaryBankTransactionCode
	 **/
	@JsonProperty("proprietaryBankTransactionCode")
	@Size(max = 35)
	public String getProprietaryBankTransactionCode() {
		return proprietaryBankTransactionCode;
	}

	public void setProprietaryBankTransactionCode(String proprietaryBankTransactionCode) {
		this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
	}

	public Transactions proprietaryBankTransactionCode(String proprietaryBankTransactionCode) {
		this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
		return this;
	}

	/**
	  * Get balanceAfterTransaction
	  * @return balanceAfterTransaction
	 **/
	@JsonProperty("balanceAfterTransaction")
	public Balance getBalanceAfterTransaction() {
		return balanceAfterTransaction;
	}

	public void setBalanceAfterTransaction(Balance balanceAfterTransaction) {
		this.balanceAfterTransaction = balanceAfterTransaction;
	}

	public Transactions balanceAfterTransaction(Balance balanceAfterTransaction) {
		this.balanceAfterTransaction = balanceAfterTransaction;
		return this;
	}

	/**
	  * Get _links
	  * @return _links
	 **/
	@JsonProperty("_links")
	public LinksTransactionDetails getLinks() {
		return _links;
	}

	public void setLinks(LinksTransactionDetails _links) {
		this._links = _links;
	}

	public Transactions _links(LinksTransactionDetails _links) {
		this._links = _links;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Transactions {\n");

		sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
		sb.append("    entryReference: ").append(toIndentedString(entryReference)).append("\n");
		sb.append("    endToEndId: ").append(toIndentedString(endToEndId)).append("\n");
		sb.append("    batchIndicator: ").append(toIndentedString(batchIndicator)).append("\n");
		sb.append("    batchNumberOfTransactions: ").append(toIndentedString(batchNumberOfTransactions)).append("\n");
		sb.append("    mandateId: ").append(toIndentedString(mandateId)).append("\n");
		sb.append("    checkId: ").append(toIndentedString(checkId)).append("\n");
		sb.append("    creditorId: ").append(toIndentedString(creditorId)).append("\n");
		sb.append("    bookingDate: ").append(toIndentedString(bookingDate)).append("\n");
		sb.append("    valueDate: ").append(toIndentedString(valueDate)).append("\n");
		sb.append("    transactionAmount: ").append(toIndentedString(transactionAmount)).append("\n");
		sb.append("    currencyExchange: ").append(toIndentedString(currencyExchange)).append("\n");
		sb.append("    creditorName: ").append(toIndentedString(creditorName)).append("\n");
		sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
		sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
		sb.append("    ultimateCreditor: ").append(toIndentedString(ultimateCreditor)).append("\n");
		sb.append("    debtorName: ").append(toIndentedString(debtorName)).append("\n");
		sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
		sb.append("    debtorAgent: ").append(toIndentedString(debtorAgent)).append("\n");
		sb.append("    ultimateDebtor: ").append(toIndentedString(ultimateDebtor)).append("\n");
		sb.append("    remittanceInformationUnstructured: ").append(toIndentedString(remittanceInformationUnstructured)).append("\n");
		sb.append("    remittanceInformationUnstructuredArray: ").append(toIndentedString(remittanceInformationUnstructuredArray)).append("\n");
		sb.append("    remittanceInformationStructured: ").append(toIndentedString(remittanceInformationStructured)).append("\n");
		sb.append("    remittanceInformationStructuredArray: ").append(toIndentedString(remittanceInformationStructuredArray)).append("\n");
		sb.append("    entryDetails: ").append(toIndentedString(entryDetails)).append("\n");
		sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
		sb.append("    additionalInformationStructured: ").append(toIndentedString(additionalInformationStructured)).append("\n");
		sb.append("    purposeCode: ").append(toIndentedString(purposeCode)).append("\n");
		sb.append("    bankTransactionCode: ").append(toIndentedString(bankTransactionCode)).append("\n");
		sb.append("    proprietaryBankTransactionCode: ").append(toIndentedString(proprietaryBankTransactionCode)).append("\n");
		sb.append("    balanceAfterTransaction: ").append(toIndentedString(balanceAfterTransaction)).append("\n");
		sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
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
