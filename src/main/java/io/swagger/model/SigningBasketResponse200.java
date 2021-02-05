package io.swagger.model;

import javax.validation.constraints.NotNull;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.util.ObjectUtil;

/**
  * Body of the JSON response for a successful get signing basket request.    * 'payments': payment initiations which shall be authorised through this signing basket.   * 'consents': consent objects which shall be authorised through this signing basket.   * 'transactionStatus': Only the codes RCVD, ACTC, RJCT are used.   * '_links': The ASPSP might integrate hyperlinks to indicate next (authorisation) steps to be taken. 
 **/
@Schema(description = "Body of the JSON response for a successful get signing basket request.    * 'payments': payment initiations which shall be authorised through this signing basket.   * 'consents': consent objects which shall be authorised through this signing basket.   * 'transactionStatus': Only the codes RCVD, ACTC, RJCT are used.   * '_links': The ASPSP might integrate hyperlinks to indicate next (authorisation) steps to be taken. ")
public class SigningBasketResponse200 {

	@Schema(description = "")
	private PaymentIdList payments = null;

	@Schema(description = "")
	private ConsentIdList consents = null;

	@Schema(required = true, description = "")
	private TransactionStatusSBS transactionStatus = null;

	@Schema(description = "")
	private LinksSigningBasket _links = null;

	/**
	  * Get payments
	  * @return payments
	 **/
	@JsonProperty("payments")
	public PaymentIdList getPayments() {
		return payments;
	}

	public void setPayments(PaymentIdList payments) {
		this.payments = payments;
	}

	public SigningBasketResponse200 payments(PaymentIdList payments) {
		this.payments = payments;
		return this;
	}

	/**
	  * Get consents
	  * @return consents
	 **/
	@JsonProperty("consents")
	public ConsentIdList getConsents() {
		return consents;
	}

	public void setConsents(ConsentIdList consents) {
		this.consents = consents;
	}

	public SigningBasketResponse200 consents(ConsentIdList consents) {
		this.consents = consents;
		return this;
	}

	/**
	  * Get transactionStatus
	  * @return transactionStatus
	 **/
	@JsonProperty("transactionStatus")
	@NotNull
	public TransactionStatusSBS getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(TransactionStatusSBS transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public SigningBasketResponse200 transactionStatus(TransactionStatusSBS transactionStatus) {
		this.transactionStatus = transactionStatus;
		return this;
	}

	/**
	  * Get _links
	  * @return _links
	 **/
	@JsonProperty("_links")
	public LinksSigningBasket getLinks() {
		return _links;
	}

	public void setLinks(LinksSigningBasket _links) {
		this._links = _links;
	}

	public SigningBasketResponse200 _links(LinksSigningBasket _links) {
		this._links = _links;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SigningBasketResponse200 {\n");

		sb.append("    payments: ").append(ObjectUtil.toIndentedString(payments)).append("\n");
		sb.append("    consents: ").append(ObjectUtil.toIndentedString(consents)).append("\n");
		sb.append("    transactionStatus: ").append(ObjectUtil.toIndentedString(transactionStatus)).append("\n");
		sb.append("    _links: ").append(ObjectUtil.toIndentedString(_links)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
