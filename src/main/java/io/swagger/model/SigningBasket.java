package io.swagger.model;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * JSON Body of a establish signing basket request. The body shall contain at least one entry. 
 **/
@Schema(description = "JSON Body of a establish signing basket request. The body shall contain at least one entry. ")
public class SigningBasket {

	@Schema(description = "")
	private PaymentIdList paymentIds = null;

	@Schema(description = "")
	private ConsentIdList consentIds = null;

	/**
	  * Get paymentIds
	  * @return paymentIds
	 **/
	@JsonProperty("paymentIds")
	public PaymentIdList getPaymentIds() {
		return paymentIds;
	}

	public void setPaymentIds(PaymentIdList paymentIds) {
		this.paymentIds = paymentIds;
	}

	public SigningBasket paymentIds(PaymentIdList paymentIds) {
		this.paymentIds = paymentIds;
		return this;
	}

	/**
	  * Get consentIds
	  * @return consentIds
	 **/
	@JsonProperty("consentIds")
	public ConsentIdList getConsentIds() {
		return consentIds;
	}

	public void setConsentIds(ConsentIdList consentIds) {
		this.consentIds = consentIds;
	}

	public SigningBasket consentIds(ConsentIdList consentIds) {
		this.consentIds = consentIds;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SigningBasket {\n");

		sb.append("    paymentIds: ").append(toIndentedString(paymentIds)).append("\n");
		sb.append("    consentIds: ").append(toIndentedString(consentIds)).append("\n");
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
