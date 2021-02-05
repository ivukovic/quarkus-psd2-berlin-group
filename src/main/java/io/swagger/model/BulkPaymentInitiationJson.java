package io.swagger.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.util.ObjectUtil;

/**
  * Generic Body for a bulk payment initation via JSON.  paymentInformationId is contained in code but commented since it is n.a.  and not all ASPSP are able to support this field now. In a later version the field will be mandatory. 
 **/
@Schema(description = "Generic Body for a bulk payment initation via JSON.  paymentInformationId is contained in code but commented since it is n.a.  and not all ASPSP are able to support this field now. In a later version the field will be mandatory. ")
public class BulkPaymentInitiationJson {

	@Schema(description = "")
	private Boolean batchBookingPreferred = null;

	@Schema(required = true, description = "")
	private AccountReference debtorAccount = null;

	@Schema(description = "")
	private LocalDate requestedExecutionDate = null;

	@Schema(description = "")
	private Date requestedExecutionTime = null;

	@Schema(required = true, description = "A list of generic JSON bodies payment initations for bulk payments via JSON.  Note: Some fields from single payments do not occcur in a bulk payment element ")
	/**
	  * A list of generic JSON bodies payment initations for bulk payments via JSON.  Note: Some fields from single payments do not occcur in a bulk payment element   
	 **/
	private List<PaymentInitiationBulkElementJson> payments = new ArrayList<PaymentInitiationBulkElementJson>();

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

	public BulkPaymentInitiationJson batchBookingPreferred(Boolean batchBookingPreferred) {
		this.batchBookingPreferred = batchBookingPreferred;
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

	public BulkPaymentInitiationJson debtorAccount(AccountReference debtorAccount) {
		this.debtorAccount = debtorAccount;
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

	public BulkPaymentInitiationJson requestedExecutionDate(LocalDate requestedExecutionDate) {
		this.requestedExecutionDate = requestedExecutionDate;
		return this;
	}

	/**
	  * Get requestedExecutionTime
	  * @return requestedExecutionTime
	 **/
	@JsonProperty("requestedExecutionTime")
	public Date getRequestedExecutionTime() {
		return requestedExecutionTime;
	}

	public void setRequestedExecutionTime(Date requestedExecutionTime) {
		this.requestedExecutionTime = requestedExecutionTime;
	}

	public BulkPaymentInitiationJson requestedExecutionTime(Date requestedExecutionTime) {
		this.requestedExecutionTime = requestedExecutionTime;
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

	public BulkPaymentInitiationJson payments(List<PaymentInitiationBulkElementJson> payments) {
		this.payments = payments;
		return this;
	}

	public BulkPaymentInitiationJson addPaymentsItem(PaymentInitiationBulkElementJson paymentsItem) {
		this.payments.add(paymentsItem);
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BulkPaymentInitiationJson {\n");

		sb.append("    batchBookingPreferred: ").append(ObjectUtil.toIndentedString(batchBookingPreferred)).append("\n");
		sb.append("    debtorAccount: ").append(ObjectUtil.toIndentedString(debtorAccount)).append("\n");
		sb.append("    requestedExecutionDate: ").append(ObjectUtil.toIndentedString(requestedExecutionDate)).append("\n");
		sb.append("    requestedExecutionTime: ").append(ObjectUtil.toIndentedString(requestedExecutionTime)).append("\n");
		sb.append("    payments: ").append(ObjectUtil.toIndentedString(payments)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
