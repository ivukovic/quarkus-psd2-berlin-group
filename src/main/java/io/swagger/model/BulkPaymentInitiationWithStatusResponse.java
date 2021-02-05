package io.swagger.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Generic JSON response body consistion of the corresponding bulk payment initation JSON body together with an optional transaction status field. 
 **/
@Schema(description = "Generic JSON response body consistion of the corresponding bulk payment initation JSON body together with an optional transaction status field. ")
public class BulkPaymentInitiationWithStatusResponse implements OneOfinlineResponse200 {

	@Schema(description = "")
	private Boolean batchBookingPreferred = null;

	@Schema(description = "")
	private LocalDate requestedExecutionDate = null;

	@Schema(description = "")
	private Date acceptorTransactionDateTime = null;

	@Schema(required = true, description = "")
	private AccountReference debtorAccount = null;

	@Schema(description = "")
	private String paymentInformationId = null;

	@Schema(required = true, description = "A list of generic JSON bodies payment initations for bulk payments via JSON.  Note: Some fields from single payments do not occcur in a bulk payment element ")
	/**
	  * A list of generic JSON bodies payment initations for bulk payments via JSON.  Note: Some fields from single payments do not occcur in a bulk payment element   
	 **/
	private List<PaymentInitiationBulkElementJson> payments = new ArrayList<PaymentInitiationBulkElementJson>();

	@Schema(description = "")
	private TransactionStatus transactionStatus = null;

	/**
	  * Get batchBookingPreferred
	  * @return batchBookingPreferred
	 **/
	@JsonProperty("batchBookingPreferred")
	public Boolean getBatchBookingPreferred() {
		return batchBookingPreferred;
	}

	public void setBatchBookingPreferred(Boolean batchBookingPreferred) {
		this.batchBookingPreferred = batchBookingPreferred;
	}

	public BulkPaymentInitiationWithStatusResponse batchBookingPreferred(Boolean batchBookingPreferred) {
		this.batchBookingPreferred = batchBookingPreferred;
		return this;
	}

	/**
	  * Get requestedExecutionDate
	  * @return requestedExecutionDate
	 **/
	@JsonProperty("requestedExecutionDate")
	public LocalDate getRequestedExecutionDate() {
		return requestedExecutionDate;
	}

	public void setRequestedExecutionDate(LocalDate requestedExecutionDate) {
		this.requestedExecutionDate = requestedExecutionDate;
	}

	public BulkPaymentInitiationWithStatusResponse requestedExecutionDate(LocalDate requestedExecutionDate) {
		this.requestedExecutionDate = requestedExecutionDate;
		return this;
	}

	/**
	  * Get acceptorTransactionDateTime
	  * @return acceptorTransactionDateTime
	 **/
	@JsonProperty("acceptorTransactionDateTime")
	public Date getAcceptorTransactionDateTime() {
		return acceptorTransactionDateTime;
	}

	public void setAcceptorTransactionDateTime(Date acceptorTransactionDateTime) {
		this.acceptorTransactionDateTime = acceptorTransactionDateTime;
	}

	public BulkPaymentInitiationWithStatusResponse acceptorTransactionDateTime(Date acceptorTransactionDateTime) {
		this.acceptorTransactionDateTime = acceptorTransactionDateTime;
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

	public BulkPaymentInitiationWithStatusResponse debtorAccount(AccountReference debtorAccount) {
		this.debtorAccount = debtorAccount;
		return this;
	}

	/**
	  * Get paymentInformationId
	  * @return paymentInformationId
	 **/
	@JsonProperty("paymentInformationId")
	@Size(max = 35)
	public String getPaymentInformationId() {
		return paymentInformationId;
	}

	public void setPaymentInformationId(String paymentInformationId) {
		this.paymentInformationId = paymentInformationId;
	}

	public BulkPaymentInitiationWithStatusResponse paymentInformationId(String paymentInformationId) {
		this.paymentInformationId = paymentInformationId;
		return this;
	}

	/**
	  * A list of generic JSON bodies payment initations for bulk payments via JSON.  Note: Some fields from single payments do not occcur in a bulk payment element 
	  * @return payments
	 **/
	@JsonProperty("payments")
	@NotNull
	public List<PaymentInitiationBulkElementJson> getPayments() {
		return payments;
	}

	public void setPayments(List<PaymentInitiationBulkElementJson> payments) {
		this.payments = payments;
	}

	public BulkPaymentInitiationWithStatusResponse payments(List<PaymentInitiationBulkElementJson> payments) {
		this.payments = payments;
		return this;
	}

	public BulkPaymentInitiationWithStatusResponse addPaymentsItem(PaymentInitiationBulkElementJson paymentsItem) {
		this.payments.add(paymentsItem);
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

	public BulkPaymentInitiationWithStatusResponse transactionStatus(TransactionStatus transactionStatus) {
		this.transactionStatus = transactionStatus;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BulkPaymentInitiationWithStatusResponse {\n");

		sb.append("    batchBookingPreferred: ").append(toIndentedString(batchBookingPreferred)).append("\n");
		sb.append("    requestedExecutionDate: ").append(toIndentedString(requestedExecutionDate)).append("\n");
		sb.append("    acceptorTransactionDateTime: ").append(toIndentedString(acceptorTransactionDateTime)).append("\n");
		sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
		sb.append("    paymentInformationId: ").append(toIndentedString(paymentInformationId)).append("\n");
		sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
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
