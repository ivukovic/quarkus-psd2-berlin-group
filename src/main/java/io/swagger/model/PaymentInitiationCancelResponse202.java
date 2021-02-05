package io.swagger.model;

import javax.validation.constraints.NotNull;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Body of the response for a successful cancel payment request.
 **/
@Schema(description = "Body of the response for a successful cancel payment request.")
public class PaymentInitiationCancelResponse202 {

	@Schema(required = true, description = "")
	private TransactionStatus transactionStatus = null;

	@Schema(description = "")
	private ScaMethods scaMethods = null;

	@Schema(description = "")
	private ChosenScaMethod chosenScaMethod = null;

	@Schema(description = "")
	private ChallengeData challengeData = null;

	@Schema(description = "")
	private LinksPaymentInitiationCancel _links = null;

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

	public PaymentInitiationCancelResponse202 transactionStatus(TransactionStatus transactionStatus) {
		this.transactionStatus = transactionStatus;
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

	public PaymentInitiationCancelResponse202 scaMethods(ScaMethods scaMethods) {
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

	public PaymentInitiationCancelResponse202 chosenScaMethod(ChosenScaMethod chosenScaMethod) {
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

	public PaymentInitiationCancelResponse202 challengeData(ChallengeData challengeData) {
		this.challengeData = challengeData;
		return this;
	}

	/**
	  * Get _links
	  * @return _links
	 **/
	@JsonProperty("_links")
	public LinksPaymentInitiationCancel getLinks() {
		return _links;
	}

	public void setLinks(LinksPaymentInitiationCancel _links) {
		this._links = _links;
	}

	public PaymentInitiationCancelResponse202 _links(LinksPaymentInitiationCancel _links) {
		this._links = _links;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PaymentInitiationCancelResponse202 {\n");

		sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
		sb.append("    scaMethods: ").append(toIndentedString(scaMethods)).append("\n");
		sb.append("    chosenScaMethod: ").append(toIndentedString(chosenScaMethod)).append("\n");
		sb.append("    challengeData: ").append(toIndentedString(challengeData)).append("\n");
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
