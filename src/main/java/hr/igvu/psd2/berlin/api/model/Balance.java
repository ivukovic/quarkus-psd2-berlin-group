package hr.igvu.psd2.berlin.api.model;

import java.time.LocalDate;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import hr.igvu.psd2.util.ObjectUtil;

/**
  * A single balance element. 
 **/
@Schema(description = "A single balance element. ")
public class Balance {

	@Schema(required = true, description = "")
	private Amount balanceAmount = null;

	@Schema(required = true, description = "")
	private BalanceType balanceType = null;

	@Schema(example = "false", description = "A flag indicating if the credit limit of the corresponding account  is included in the calculation of the balance, where applicable. ")
	/**
	  * A flag indicating if the credit limit of the corresponding account  is included in the calculation of the balance, where applicable.   
	 **/
	private Boolean creditLimitIncluded = null;

	@Schema(description = "This data element might be used to indicate e.g. with the expected or booked balance that no action is known  on the account, which is not yet booked. ")
	/**
	  * This data element might be used to indicate e.g. with the expected or booked balance that no action is known  on the account, which is not yet booked.   
	 **/
	private Date lastChangeDateTime = null;

	@Schema(description = "Indicates the date of the balance.")
	/**
	  * Indicates the date of the balance.  
	 **/
	private LocalDate referenceDate = null;

	@Schema(description = "\"entryReference\" of the last commited transaction to support the TPP in identifying whether all  PSU transactions are already known. ")
	/**
	  * \"entryReference\" of the last commited transaction to support the TPP in identifying whether all  PSU transactions are already known.   
	 **/
	private String lastCommittedTransaction = null;

	/**
	  * Get balanceAmount
	  * @return balanceAmount
	 **/
	@JsonProperty("balanceAmount")
	@NotNull
	public Amount getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(Amount balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	public Balance balanceAmount(Amount balanceAmount) {
		this.balanceAmount = balanceAmount;
		return this;
	}

	/**
	  * Get balanceType
	  * @return balanceType
	 **/
	@JsonProperty("balanceType")
	@NotNull
	public BalanceType getBalanceType() {
		return balanceType;
	}

	public void setBalanceType(BalanceType balanceType) {
		this.balanceType = balanceType;
	}

	public Balance balanceType(BalanceType balanceType) {
		this.balanceType = balanceType;
		return this;
	}

	/**
	  * A flag indicating if the credit limit of the corresponding account  is included in the calculation of the balance, where applicable. 
	  * @return creditLimitIncluded
	 **/
	@JsonProperty("creditLimitIncluded")
	public Boolean isCreditLimitIncluded() {
		return creditLimitIncluded;
	}

	public void setCreditLimitIncluded(Boolean creditLimitIncluded) {
		this.creditLimitIncluded = creditLimitIncluded;
	}

	public Balance creditLimitIncluded(Boolean creditLimitIncluded) {
		this.creditLimitIncluded = creditLimitIncluded;
		return this;
	}

	/**
	  * This data element might be used to indicate e.g. with the expected or booked balance that no action is known  on the account, which is not yet booked. 
	  * @return lastChangeDateTime
	 **/
	@JsonProperty("lastChangeDateTime")
	public Date getLastChangeDateTime() {
		return lastChangeDateTime;
	}

	public void setLastChangeDateTime(Date lastChangeDateTime) {
		this.lastChangeDateTime = lastChangeDateTime;
	}

	public Balance lastChangeDateTime(Date lastChangeDateTime) {
		this.lastChangeDateTime = lastChangeDateTime;
		return this;
	}

	/**
	  * Indicates the date of the balance.
	  * @return referenceDate
	 **/
	@JsonProperty("referenceDate")
	public LocalDate getReferenceDate() {
		return referenceDate;
	}

	public void setReferenceDate(LocalDate referenceDate) {
		this.referenceDate = referenceDate;
	}

	public Balance referenceDate(LocalDate referenceDate) {
		this.referenceDate = referenceDate;
		return this;
	}

	/**
	  * \&quot;entryReference\&quot; of the last commited transaction to support the TPP in identifying whether all  PSU transactions are already known. 
	  * @return lastCommittedTransaction
	 **/
	@JsonProperty("lastCommittedTransaction")
	@Size(max = 35)
	public String getLastCommittedTransaction() {
		return lastCommittedTransaction;
	}

	public void setLastCommittedTransaction(String lastCommittedTransaction) {
		this.lastCommittedTransaction = lastCommittedTransaction;
	}

	public Balance lastCommittedTransaction(String lastCommittedTransaction) {
		this.lastCommittedTransaction = lastCommittedTransaction;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Balance {\n");

		sb.append("    balanceAmount: ").append(ObjectUtil.toIndentedString(balanceAmount)).append("\n");
		sb.append("    balanceType: ").append(ObjectUtil.toIndentedString(balanceType)).append("\n");
		sb.append("    creditLimitIncluded: ").append(ObjectUtil.toIndentedString(creditLimitIncluded)).append("\n");
		sb.append("    lastChangeDateTime: ").append(ObjectUtil.toIndentedString(lastChangeDateTime)).append("\n");
		sb.append("    referenceDate: ").append(ObjectUtil.toIndentedString(referenceDate)).append("\n");
		sb.append("    lastCommittedTransaction: ").append(ObjectUtil.toIndentedString(lastCommittedTransaction)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
