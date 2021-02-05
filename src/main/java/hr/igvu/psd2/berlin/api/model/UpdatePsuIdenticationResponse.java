package hr.igvu.psd2.berlin.api.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import hr.igvu.psd2.util.ObjectUtil;

/**
  * Body of the JSON response for a successful update PSU identification request.
 **/
@Schema(description = "Body of the JSON response for a successful update PSU identification request.")
public class UpdatePsuIdenticationResponse implements OneOfinlineResponse2002 {

	@Schema(description = "")
	private Amount transactionFees = null;

	@Schema(description = "")
	private Amount currencyConversionFees = null;

	@Schema(description = "")
	private Amount estimatedTotalAmount = null;

	@Schema(description = "")
	private Amount estimatedInterbankSettlementAmount = null;

	@Schema(description = "")
	private ScaMethods scaMethods = null;

	@Schema(required = true, description = "")
	private LinksUpdatePsuIdentification _links = null;

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

	public UpdatePsuIdenticationResponse transactionFees(Amount transactionFees) {
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

	public UpdatePsuIdenticationResponse currencyConversionFees(Amount currencyConversionFees) {
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

	public UpdatePsuIdenticationResponse estimatedTotalAmount(Amount estimatedTotalAmount) {
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

	public UpdatePsuIdenticationResponse estimatedInterbankSettlementAmount(Amount estimatedInterbankSettlementAmount) {
		this.estimatedInterbankSettlementAmount = estimatedInterbankSettlementAmount;
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

	public UpdatePsuIdenticationResponse scaMethods(ScaMethods scaMethods) {
		this.scaMethods = scaMethods;
		return this;
	}

	/**
	  * Get _links
	  * @return _links
	 **/
	@JsonProperty("_links")
	@NotNull
	public LinksUpdatePsuIdentification getLinks() {
		return _links;
	}

	public void setLinks(LinksUpdatePsuIdentification _links) {
		this._links = _links;
	}

	public UpdatePsuIdenticationResponse _links(LinksUpdatePsuIdentification _links) {
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

	public UpdatePsuIdenticationResponse scaStatus(ScaStatus scaStatus) {
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

	public UpdatePsuIdenticationResponse psuMessage(String psuMessage) {
		this.psuMessage = psuMessage;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class UpdatePsuIdenticationResponse {\n");

		sb.append("    transactionFees: ").append(ObjectUtil.toIndentedString(transactionFees)).append("\n");
		sb.append("    currencyConversionFees: ").append(ObjectUtil.toIndentedString(currencyConversionFees)).append("\n");
		sb.append("    estimatedTotalAmount: ").append(ObjectUtil.toIndentedString(estimatedTotalAmount)).append("\n");
		sb.append("    estimatedInterbankSettlementAmount: ").append(ObjectUtil.toIndentedString(estimatedInterbankSettlementAmount)).append("\n");
		sb.append("    scaMethods: ").append(ObjectUtil.toIndentedString(scaMethods)).append("\n");
		sb.append("    _links: ").append(ObjectUtil.toIndentedString(_links)).append("\n");
		sb.append("    scaStatus: ").append(ObjectUtil.toIndentedString(scaStatus)).append("\n");
		sb.append("    psuMessage: ").append(ObjectUtil.toIndentedString(psuMessage)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
