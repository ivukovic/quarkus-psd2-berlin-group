package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The transaction status is filled with codes of the ISO 20022 data table. Only the codes RCVD, PATC, ACTC, ACWC and RJCT are used: - &#x27;ACSP&#x27;: &#x27;AcceptedSettlementInProcess&#x27; -    All preceding checks such as technical validation and customer profile were successful and therefore the payment initiation has been accepted for execution. - &#x27;ACTC&#x27;: &#x27;AcceptedTechnicalValidation&#x27; -    Authentication and syntactical and semantical validation are successful. - &#x27;ACWC&#x27;: &#x27;AcceptedWithChange&#x27; -    Instruction is accepted but a change will be made, such as date or remittance not sent. - &#x27;RCVD&#x27;: &#x27;Received&#x27; -    Payment initiation has been received by the receiving agent. - &#x27;RJCT&#x27;: &#x27;Rejected&#x27; -    Payment initiation or individual transaction included in the payment initiation has been rejected. 
 */
public enum TransactionStatusSBS {
	ACSC("ACSC"),

	ACTC("ACTC"),

	PATC("PATC"),

	RCVD("RCVD"),

	RJCT("RJCT"),

	CANC("CANC");

	private String value;

	TransactionStatusSBS(String value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static TransactionStatusSBS fromValue(String text) {
		for (TransactionStatusSBS b : TransactionStatusSBS.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}

}
