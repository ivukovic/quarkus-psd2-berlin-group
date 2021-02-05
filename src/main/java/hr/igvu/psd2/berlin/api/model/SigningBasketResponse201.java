package hr.igvu.psd2.berlin.api.model;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import hr.igvu.psd2.berlin.api.model.msg.TppMessage2XX;
import hr.igvu.psd2.util.ObjectUtil;

/**
  * Body of the JSON response for a successful create signing basket request.
 **/
@Schema(description = "Body of the JSON response for a successful create signing basket request.")
public class SigningBasketResponse201 {

	@Schema(required = true, description = "")
	private TransactionStatusSBS transactionStatus = null;

	@Schema(required = true, description = "")
	private String basketId = null;

	@Schema(description = "")
	private ScaMethods scaMethods = null;

	@Schema(description = "")
	private ChosenScaMethod chosenScaMethod = null;

	@Schema(description = "")
	private ChallengeData challengeData = null;

	@Schema(required = true, description = "")
	private LinksSigningBasket _links = null;

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
	public TransactionStatusSBS getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(TransactionStatusSBS transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public SigningBasketResponse201 transactionStatus(TransactionStatusSBS transactionStatus) {
		this.transactionStatus = transactionStatus;
		return this;
	}

	/**
	  * Get basketId
	  * @return basketId
	 **/
	@JsonProperty("basketId")
	@NotNull
	public String getBasketId() {
		return basketId;
	}

	public void setBasketId(String basketId) {
		this.basketId = basketId;
	}

	public SigningBasketResponse201 basketId(String basketId) {
		this.basketId = basketId;
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

	public SigningBasketResponse201 scaMethods(ScaMethods scaMethods) {
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

	public SigningBasketResponse201 chosenScaMethod(ChosenScaMethod chosenScaMethod) {
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

	public SigningBasketResponse201 challengeData(ChallengeData challengeData) {
		this.challengeData = challengeData;
		return this;
	}

	/**
	  * Get _links
	  * @return _links
	 **/
	@JsonProperty("_links")
	@NotNull
	public LinksSigningBasket getLinks() {
		return _links;
	}

	public void setLinks(LinksSigningBasket _links) {
		this._links = _links;
	}

	public SigningBasketResponse201 _links(LinksSigningBasket _links) {
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

	public SigningBasketResponse201 psuMessage(String psuMessage) {
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

	public SigningBasketResponse201 tppMessages(List<TppMessage2XX> tppMessages) {
		this.tppMessages = tppMessages;
		return this;
	}

	public SigningBasketResponse201 addTppMessagesItem(TppMessage2XX tppMessagesItem) {
		this.tppMessages.add(tppMessagesItem);
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SigningBasketResponse201 {\n");

		sb.append("    transactionStatus: ").append(ObjectUtil.toIndentedString(transactionStatus)).append("\n");
		sb.append("    basketId: ").append(ObjectUtil.toIndentedString(basketId)).append("\n");
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
