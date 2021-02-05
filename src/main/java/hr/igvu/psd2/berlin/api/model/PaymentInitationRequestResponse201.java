package hr.igvu.psd2.berlin.api.model;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import hr.igvu.psd2.berlin.api.model.msg.TppMessage2XX;
import hr.igvu.psd2.util.ObjectUtil;

/**
  * Body of the response for a successful payment initiation request.
 **/
@Schema(description = "Body of the response for a successful payment initiation request.")
public class PaymentInitationRequestResponse201 {

	@Schema(required = true, description = "")
	private TransactionStatus transactionStatus = null;

	@Schema(required = true, description = "")
	private String paymentId = null;

	@Schema(description = "")
	private Amount transactionFees = null;

	@Schema(description = "")
	private Amount currencyConversionFee = null;

	@Schema(description = "")
	private Amount estimatedTotalAmount = null;

	@Schema(description = "")
	private Amount estimatedInterbankSettlementAmount = null;

	@Schema(description = "")
	private Boolean transactionFeeIndicator = null;

	@Schema(description = "")
	private ScaMethods scaMethods = null;

	@Schema(description = "")
	private ChosenScaMethod chosenScaMethod = null;

	@Schema(description = "")
	private ChallengeData challengeData = null;

	@Schema(required = true, description = "")
	private LinksPaymentInitiation _links = null;

	@Schema(description = "")
	private String psuMessage = null;

	@Schema(description = "")
	private List<TppMessage2XX> tppMessages = null;

	/**
	  * Get transactionStatus
	  * @return transactionStatus
	 **/
	@JsonProperty("transactionStatus")
	@NotNull
	public TransactionStatus getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(TransactionStatus transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public PaymentInitationRequestResponse201 transactionStatus(TransactionStatus transactionStatus) {
		this.transactionStatus = transactionStatus;
		return this;
	}

	/**
	  * Get paymentId
	  * @return paymentId
	 **/
	@JsonProperty("paymentId")
	@NotNull
	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public PaymentInitationRequestResponse201 paymentId(String paymentId) {
		this.paymentId = paymentId;
		return this;
	}

	/**
	  * Get transactionFees
	  * @return transactionFees
	 **/
	@JsonProperty("transactionFees")
	public Amount getTransactionFees() {
		return transactionFees;
	}

	public void setTransactionFees(Amount transactionFees) {
		this.transactionFees = transactionFees;
	}

	public PaymentInitationRequestResponse201 transactionFees(Amount transactionFees) {
		this.transactionFees = transactionFees;
		return this;
	}

	/**
	  * Get currencyConversionFee
	  * @return currencyConversionFee
	 **/
	@JsonProperty("currencyConversionFee")
	public Amount getCurrencyConversionFee() {
		return currencyConversionFee;
	}

	public void setCurrencyConversionFee(Amount currencyConversionFee) {
		this.currencyConversionFee = currencyConversionFee;
	}

	public PaymentInitationRequestResponse201 currencyConversionFee(Amount currencyConversionFee) {
		this.currencyConversionFee = currencyConversionFee;
		return this;
	}

	/**
	  * Get estimatedTotalAmount
	  * @return estimatedTotalAmount
	 **/
	@JsonProperty("estimatedTotalAmount")
	public Amount getEstimatedTotalAmount() {
		return estimatedTotalAmount;
	}

	public void setEstimatedTotalAmount(Amount estimatedTotalAmount) {
		this.estimatedTotalAmount = estimatedTotalAmount;
	}

	public PaymentInitationRequestResponse201 estimatedTotalAmount(Amount estimatedTotalAmount) {
		this.estimatedTotalAmount = estimatedTotalAmount;
		return this;
	}

	/**
	  * Get estimatedInterbankSettlementAmount
	  * @return estimatedInterbankSettlementAmount
	 **/
	@JsonProperty("estimatedInterbankSettlementAmount")
	public Amount getEstimatedInterbankSettlementAmount() {
		return estimatedInterbankSettlementAmount;
	}

	public void setEstimatedInterbankSettlementAmount(Amount estimatedInterbankSettlementAmount) {
		this.estimatedInterbankSettlementAmount = estimatedInterbankSettlementAmount;
	}

	public PaymentInitationRequestResponse201 estimatedInterbankSettlementAmount(Amount estimatedInterbankSettlementAmount) {
		this.estimatedInterbankSettlementAmount = estimatedInterbankSettlementAmount;
		return this;
	}

	/**
	  * Get transactionFeeIndicator
	  * @return transactionFeeIndicator
	 **/
	@JsonProperty("transactionFeeIndicator")
	public Boolean getTransactionFeeIndicator() {
		return transactionFeeIndicator;
	}

	public void setTransactionFeeIndicator(Boolean transactionFeeIndicator) {
		this.transactionFeeIndicator = transactionFeeIndicator;
	}

	public PaymentInitationRequestResponse201 transactionFeeIndicator(Boolean transactionFeeIndicator) {
		this.transactionFeeIndicator = transactionFeeIndicator;
		return this;
	}

	/**
	  * Get scaMethods
	  * @return scaMethods
	 **/
	@JsonProperty("scaMethods")
	public ScaMethods getScaMethods() {
		return scaMethods;
	}

	public void setScaMethods(ScaMethods scaMethods) {
		this.scaMethods = scaMethods;
	}

	public PaymentInitationRequestResponse201 scaMethods(ScaMethods scaMethods) {
		this.scaMethods = scaMethods;
		return this;
	}

	/**
	  * Get chosenScaMethod
	  * @return chosenScaMethod
	 **/
	@JsonProperty("chosenScaMethod")
	public ChosenScaMethod getChosenScaMethod() {
		return chosenScaMethod;
	}

	public void setChosenScaMethod(ChosenScaMethod chosenScaMethod) {
		this.chosenScaMethod = chosenScaMethod;
	}

	public PaymentInitationRequestResponse201 chosenScaMethod(ChosenScaMethod chosenScaMethod) {
		this.chosenScaMethod = chosenScaMethod;
		return this;
	}

	/**
	  * Get challengeData
	  * @return challengeData
	 **/
	@JsonProperty("challengeData")
	public ChallengeData getChallengeData() {
		return challengeData;
	}

	public void setChallengeData(ChallengeData challengeData) {
		this.challengeData = challengeData;
	}

	public PaymentInitationRequestResponse201 challengeData(ChallengeData challengeData) {
		this.challengeData = challengeData;
		return this;
	}

	/**
	  * Get _links
	  * @return _links
	 **/
	@JsonProperty("_links")
	@NotNull
	public LinksPaymentInitiation getLinks() {
		return _links;
	}

	public void setLinks(LinksPaymentInitiation _links) {
		this._links = _links;
	}

	public PaymentInitationRequestResponse201 _links(LinksPaymentInitiation _links) {
		this._links = _links;
		return this;
	}

	/**
	  * Get psuMessage
	  * @return psuMessage
	 **/
	@JsonProperty("psuMessage")
	@Size(max = 500)
	public String getPsuMessage() {
		return psuMessage;
	}

	public void setPsuMessage(String psuMessage) {
		this.psuMessage = psuMessage;
	}

	public PaymentInitationRequestResponse201 psuMessage(String psuMessage) {
		this.psuMessage = psuMessage;
		return this;
	}

	/**
	  * Get tppMessages
	  * @return tppMessages
	 **/
	@JsonProperty("tppMessages")
	public List<TppMessage2XX> getTppMessages() {
		return tppMessages;
	}

	public void setTppMessages(List<TppMessage2XX> tppMessages) {
		this.tppMessages = tppMessages;
	}

	public PaymentInitationRequestResponse201 tppMessages(List<TppMessage2XX> tppMessages) {
		this.tppMessages = tppMessages;
		return this;
	}

	public PaymentInitationRequestResponse201 addTppMessagesItem(TppMessage2XX tppMessagesItem) {
		this.tppMessages.add(tppMessagesItem);
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PaymentInitationRequestResponse201 {\n");

		sb.append("    transactionStatus: ").append(ObjectUtil.toIndentedString(transactionStatus)).append("\n");
		sb.append("    paymentId: ").append(ObjectUtil.toIndentedString(paymentId)).append("\n");
		sb.append("    transactionFees: ").append(ObjectUtil.toIndentedString(transactionFees)).append("\n");
		sb.append("    currencyConversionFee: ").append(ObjectUtil.toIndentedString(currencyConversionFee)).append("\n");
		sb.append("    estimatedTotalAmount: ").append(ObjectUtil.toIndentedString(estimatedTotalAmount)).append("\n");
		sb.append("    estimatedInterbankSettlementAmount: ").append(ObjectUtil.toIndentedString(estimatedInterbankSettlementAmount)).append("\n");
		sb.append("    transactionFeeIndicator: ").append(ObjectUtil.toIndentedString(transactionFeeIndicator)).append("\n");
		sb.append("    scaMethods: ").append(ObjectUtil.toIndentedString(scaMethods)).append("\n");
		sb.append("    chosenScaMethod: ").append(ObjectUtil.toIndentedString(chosenScaMethod)).append("\n");
		sb.append("    challengeData: ").append(ObjectUtil.toIndentedString(challengeData)).append("\n");
		sb.append("    _links: ").append(ObjectUtil.toIndentedString(_links)).append("\n");
		sb.append("    psuMessage: ").append(ObjectUtil.toIndentedString(psuMessage)).append("\n");
		sb.append("    tppMessages: ").append(ObjectUtil.toIndentedString(tppMessages)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
