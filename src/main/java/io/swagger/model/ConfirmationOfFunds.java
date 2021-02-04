package io.swagger.model;

import io.swagger.model.AccountReference;
import io.swagger.model.Amount;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * JSON Request body for the \&quot;Confirmation of funds service\&quot;.  &lt;table&gt;  &lt;tr&gt;    &lt;td&gt;cardNumber&lt;/td&gt;    &lt;td&gt;String &lt;/td&gt;   &lt;td&gt;Optional&lt;/td&gt;   &lt;td&gt;Card Number of the card issued by the PIISP. Should be delivered if available.&lt;/td&gt; &lt;/tr&gt;  &lt;tr&gt;   &lt;td&gt;account&lt;/td&gt;   &lt;td&gt; Account Reference&lt;/td&gt;   &lt;td&gt;Mandatory&lt;/td&gt;   &lt;td&gt;PSU&#x27;s account number.&lt;/td&gt; &lt;/tr&gt;  &lt;tr&gt;    &lt;td&gt;payee&lt;/td&gt;   &lt;td&gt;Max70Text&lt;/td&gt;   &lt;td&gt;Optional&lt;/td&gt;   &lt;td&gt;The merchant where the card is accepted as an information to the PSU.&lt;/td&gt; &lt;/tr&gt;  &lt;tr&gt;   &lt;td&gt;instructedAmount&lt;/td&gt;   &lt;td&gt;Amount&lt;/td&gt;   &lt;td&gt;Mandatory&lt;/td&gt;   &lt;td&gt;Transaction amount to be checked within the funds check mechanism.&lt;/td&gt; &lt;/tr&gt;  &lt;/table&gt; 
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "JSON Request body for the \"Confirmation of funds service\".  <table>  <tr>    <td>cardNumber</td>    <td>String </td>   <td>Optional</td>   <td>Card Number of the card issued by the PIISP. Should be delivered if available.</td> </tr>  <tr>   <td>account</td>   <td> Account Reference</td>   <td>Mandatory</td>   <td>PSU's account number.</td> </tr>  <tr>    <td>payee</td>   <td>Max70Text</td>   <td>Optional</td>   <td>The merchant where the card is accepted as an information to the PSU.</td> </tr>  <tr>   <td>instructedAmount</td>   <td>Amount</td>   <td>Mandatory</td>   <td>Transaction amount to be checked within the funds check mechanism.</td> </tr>  </table> ")

public class ConfirmationOfFunds   {
  private @Valid String cardNumber = null;
  private @Valid AccountReference account = null;
  private @Valid String payee = null;
  private @Valid Amount instructedAmount = null;

  /**
   * Card Number of the card issued by the PIISP.  Should be delivered if available. 
   **/
  public ConfirmationOfFunds cardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

  
  @ApiModelProperty(value = "Card Number of the card issued by the PIISP.  Should be delivered if available. ")
  @JsonProperty("cardNumber")
 @Size(max=35)
  public String getCardNumber() {
    return cardNumber;
  }
  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  /**
   **/
  public ConfirmationOfFunds account(AccountReference account) {
    this.account = account;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("account")
  @NotNull

  public AccountReference getAccount() {
    return account;
  }
  public void setAccount(AccountReference account) {
    this.account = account;
  }

  /**
   * Name payee.
   **/
  public ConfirmationOfFunds payee(String payee) {
    this.payee = payee;
    return this;
  }

  
  @ApiModelProperty(value = "Name payee.")
  @JsonProperty("payee")
 @Size(max=70)
  public String getPayee() {
    return payee;
  }
  public void setPayee(String payee) {
    this.payee = payee;
  }

  /**
   **/
  public ConfirmationOfFunds instructedAmount(Amount instructedAmount) {
    this.instructedAmount = instructedAmount;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("instructedAmount")
  @NotNull

  public Amount getInstructedAmount() {
    return instructedAmount;
  }
  public void setInstructedAmount(Amount instructedAmount) {
    this.instructedAmount = instructedAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfirmationOfFunds confirmationOfFunds = (ConfirmationOfFunds) o;
    return Objects.equals(cardNumber, confirmationOfFunds.cardNumber) &&
        Objects.equals(account, confirmationOfFunds.account) &&
        Objects.equals(payee, confirmationOfFunds.payee) &&
        Objects.equals(instructedAmount, confirmationOfFunds.instructedAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardNumber, account, payee, instructedAmount);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
