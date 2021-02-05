package io.swagger.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * JSON Request body for the \"Confirmation of funds service\".  <table>  <tr>    <td>cardNumber</td>    <td>String </td>   <td>Optional</td>   <td>Card Number of the card issued by the PIISP. Should be delivered if available.</td> </tr>  <tr>   <td>account</td>   <td> Account Reference</td>   <td>Mandatory</td>   <td>PSU's account number.</td> </tr>  <tr>    <td>payee</td>   <td>Max70Text</td>   <td>Optional</td>   <td>The merchant where the card is accepted as an information to the PSU.</td> </tr>  <tr>   <td>instructedAmount</td>   <td>Amount</td>   <td>Mandatory</td>   <td>Transaction amount to be checked within the funds check mechanism.</td> </tr>  </table> 
 **/
@Schema(description = "JSON Request body for the \"Confirmation of funds service\".  <table>  <tr>    <td>cardNumber</td>    <td>String </td>   <td>Optional</td>   <td>Card Number of the card issued by the PIISP. Should be delivered if available.</td> </tr>  <tr>   <td>account</td>   <td> Account Reference</td>   <td>Mandatory</td>   <td>PSU's account number.</td> </tr>  <tr>    <td>payee</td>   <td>Max70Text</td>   <td>Optional</td>   <td>The merchant where the card is accepted as an information to the PSU.</td> </tr>  <tr>   <td>instructedAmount</td>   <td>Amount</td>   <td>Mandatory</td>   <td>Transaction amount to be checked within the funds check mechanism.</td> </tr>  </table> ")
public class ConfirmationOfFunds {

	@Schema(description = "Card Number of the card issued by the PIISP.  Should be delivered if available. ")
	/**
	  * Card Number of the card issued by the PIISP.  Should be delivered if available.   
	 **/
	private String cardNumber = null;

	@Schema(required = true, description = "")
	private AccountReference account = null;

	@Schema(description = "Name payee.")
	/**
	  * Name payee.  
	 **/
	private String payee = null;

	@Schema(required = true, description = "")
	private Amount instructedAmount = null;

	/**
	  * Card Number of the card issued by the PIISP.  Should be delivered if available. 
	  * @return cardNumber
	 **/
	@JsonProperty("cardNumber")
	@Size(max = 35)
	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public ConfirmationOfFunds cardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
		return this;
	}

	/**
	  * Get account
	  * @return account
	 **/
	@JsonProperty("account")
	@NotNull
	public AccountReference getAccount() {
		return account;
	}

	public void setAccount(AccountReference account) {
		this.account = account;
	}

	public ConfirmationOfFunds account(AccountReference account) {
		this.account = account;
		return this;
	}

	/**
	  * Name payee.
	  * @return payee
	 **/
	@JsonProperty("payee")
	@Size(max = 70)
	public String getPayee() {
		return payee;
	}

	public void setPayee(String payee) {
		this.payee = payee;
	}

	public ConfirmationOfFunds payee(String payee) {
		this.payee = payee;
		return this;
	}

	/**
	  * Get instructedAmount
	  * @return instructedAmount
	 **/
	@JsonProperty("instructedAmount")
	@NotNull
	public Amount getInstructedAmount() {
		return instructedAmount;
	}

	public void setInstructedAmount(Amount instructedAmount) {
		this.instructedAmount = instructedAmount;
	}

	public ConfirmationOfFunds instructedAmount(Amount instructedAmount) {
		this.instructedAmount = instructedAmount;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConfirmationOfFunds {\n");

		sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
		sb.append("    account: ").append(toIndentedString(account)).append("\n");
		sb.append("    payee: ").append(toIndentedString(payee)).append("\n");
		sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
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
