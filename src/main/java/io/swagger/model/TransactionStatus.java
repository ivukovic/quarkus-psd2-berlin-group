package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The transaction status is filled with codes of the ISO 20022 data table: - &#x27;ACCC&#x27;: &#x27;AcceptedSettlementCompleted&#x27; -   Settlement on the creditor&#x27;s account has been completed. - &#x27;ACCP&#x27;: &#x27;AcceptedCustomerProfile&#x27; -    Preceding check of technical validation was successful.    Customer profile check was also successful. - &#x27;ACSC&#x27;: &#x27;AcceptedSettlementCompleted&#x27; -    Settlement on the debtor�s account has been completed.      **Usage:** this can be used by the first agent to report to the debtor that the transaction has been completed.       **Warning:** this status is provided for transaction status reasons, not for financial information.    It can only be used after bilateral agreement. - &#x27;ACSP&#x27;: &#x27;AcceptedSettlementInProcess&#x27; -    All preceding checks such as technical validation and customer profile were successful and therefore the payment initiation has been accepted for execution. - &#x27;ACTC&#x27;: &#x27;AcceptedTechnicalValidation&#x27; -    Authentication and syntactical and semantical validation are successful. - &#x27;ACWC&#x27;: &#x27;AcceptedWithChange&#x27; -    Instruction is accepted but a change will be made, such as date or remittance not sent. - &#x27;ACWP&#x27;: &#x27;AcceptedWithoutPosting&#x27; -    Payment instruction included in the credit transfer is accepted without being posted to the creditor customer�s account. - &#x27;RCVD&#x27;: &#x27;Received&#x27; -    Payment initiation has been received by the receiving agent. - &#x27;PDNG&#x27;: &#x27;Pending&#x27; -    Payment initiation or individual transaction included in the payment initiation is pending.    Further checks and status update will be performed. - &#x27;RJCT&#x27;: &#x27;Rejected&#x27; -    Payment initiation or individual transaction included in the payment initiation has been rejected. - &#x27;CANC&#x27;: &#x27;Cancelled&#x27;   Payment initiation has been cancelled before execution   Remark: This codeis accepted as new code by ISO20022. - &#x27;ACFC&#x27;: &#x27;AcceptedFundsChecked&#x27; -   Preceding check of technical validation and customer profile was successful and an automatic funds check was positive .   Remark: This code is accepted as new code by ISO20022. - &#x27;PATC&#x27;: &#x27;PartiallyAcceptedTechnical&#x27;   Correct The payment initiation needs multiple authentications, where some but not yet all have been performed. Syntactical and semantical validations are successful.   Remark: This code is accepted as new code by ISO20022. - &#x27;PART&#x27;: &#x27;PartiallyAccepted&#x27; -   A number of transactions have been accepted, whereas another number of transactions have not yet achieved &#x27;accepted&#x27; status.   Remark: This code may be used only in case of bulk payments. It is only used in a situation where all mandated authorisations have been applied, but some payments have been rejected.    
 */
public enum TransactionStatus {
	ACCC("ACCC"),

	ACCP("ACCP"),

	ACSC("ACSC"),

	ACSP("ACSP"),

	ACTC("ACTC"),

	ACWC("ACWC"),

	ACWP("ACWP"),

	RCVD("RCVD"),

	PDNG("PDNG"),

	RJCT("RJCT"),

	CANC("CANC"),

	ACFC("ACFC"),

	PATC("PATC"),

	PART("PART");

	private String value;

	TransactionStatus(String value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static TransactionStatus fromValue(String text) {
		for (TransactionStatus b : TransactionStatus.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}

}
