package io.swagger.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.util.ObjectUtil;

/**
  * Body of the JSON response for a successful select PSU authentication method request.
 **/
@Schema(description = "Body of the JSON response for a successful select PSU authentication method request.")
public class SelectPsuAuthenticationMethodResponse implements OneOfinlineResponse2002 {

	@Schema(description = "")
	private Amount transactionFees = null;

	@Schema(description = "")
	private Amount currencyConversionFees = null;

	@Schema(description = "")
	private Amount estimatedTotalAmount = null;

	@Schema(description = "")
	private Amount estimatedInterbankSettlementAmount = null;

	@Schema(description = "")
	private ChosenScaMethod chosenScaMethod = null;

	@Schema(description = "")
	private ChallengeData challengeData = null;

	@Schema(description = "")
	private LinksSelectPsuAuthenticationMethod _links = null;

	@Schema(required = true, description = "")
	private ScaStatus scaStatus = null;

	@Schema(description = "")
	private String psuMessage = null;

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

	public SelectPsuAuthenticationMethodResponse transactionFees(Amount transactionFees) {
		this.transactionFees = transactionFees;
		return this;
	}

	/**
	  * Get currencyConversionFees
	  * @return currencyConversionFees
	 **/
	@JsonProperty("currencyConversionFees")
	public Amount getCurrencyConversionFees() {
		return currencyConversionFees;
	}

	public void setCurrencyConversionFees(Amount currencyConversionFees) {
		this.currencyConversionFees = currencyConversionFees;
	}

	public SelectPsuAuthenticationMethodResponse currencyConversionFees(Amount currencyConversionFees) {
		this.currencyConversionFees = currencyConversionFees;
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

	public SelectPsuAuthenticationMethodResponse estimatedTotalAmount(Amount estimatedTotalAmount) {
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

	public SelectPsuAuthenticationMethodResponse estimatedInterbankSettlementAmount(Amount estimatedInterbankSettlementAmount) {
		this.estimatedInterbankSettlementAmount = estimatedInterbankSettlementAmount;
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

	public SelectPsuAuthenticationMethodResponse chosenScaMethod(ChosenScaMethod chosenScaMethod) {
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

	public SelectPsuAuthenticationMethodResponse challengeData(ChallengeData challengeData) {
		this.challengeData = challengeData;
		return this;
	}

	/**
	  * Get _links
	  * @return _links
	 **/
	@JsonProperty("_links")
	public LinksSelectPsuAuthenticationMethod getLinks() {
		return _links;
	}

	public void setLinks(LinksSelectPsuAuthenticationMethod _links) {
		this._links = _links;
	}

	public SelectPsuAuthenticationMethodResponse _links(LinksSelectPsuAuthenticationMethod _links) {
		this._links = _links;
		return this;
	}

	/**
	  * Get scaStatus
	  * @return scaStatus
	 **/
	@JsonProperty("scaStatus")
	@NotNull
	public ScaStatus getScaStatus() {
		return scaStatus;
	}

	public void setScaStatus(ScaStatus scaStatus) {
		this.scaStatus = scaStatus;
	}

	public SelectPsuAuthenticationMethodResponse scaStatus(ScaStatus scaStatus) {
		this.scaStatus = scaStatus;
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

	public SelectPsuAuthenticationMethodResponse psuMessage(String psuMessage) {
		this.psuMessage = psuMessage;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SelectPsuAuthenticationMethodResponse {\n");

		sb.append("    transactionFees: ").append(ObjectUtil.toIndentedString(transactionFees)).append("\n");
		sb.append("    currencyConversionFees: ").append(ObjectUtil.toIndentedString(currencyConversionFees)).append("\n");
		sb.append("    estimatedTotalAmount: ").append(ObjectUtil.toIndentedString(estimatedTotalAmount)).append("\n");
		sb.append("    estimatedInterbankSettlementAmount: ").append(ObjectUtil.toIndentedString(estimatedInterbankSettlementAmount)).append("\n");
		sb.append("    chosenScaMethod: ").append(ObjectUtil.toIndentedString(chosenScaMethod)).append("\n");
		sb.append("    challengeData: ").append(ObjectUtil.toIndentedString(challengeData)).append("\n");
		sb.append("    _links: ").append(ObjectUtil.toIndentedString(_links)).append("\n");
		sb.append("    scaStatus: ").append(ObjectUtil.toIndentedString(scaStatus)).append("\n");
		sb.append("    psuMessage: ").append(ObjectUtil.toIndentedString(psuMessage)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
