package io.swagger.model;

import io.swagger.model.ConsentIdList;
import io.swagger.model.LinksSigningBasket;
import io.swagger.model.PaymentIdList;
import io.swagger.model.TransactionStatusSBS;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Body of the JSON response for a successful get signing basket request.    * &#x27;payments&#x27;: payment initiations which shall be authorised through this signing basket.   * &#x27;consents&#x27;: consent objects which shall be authorised through this signing basket.   * &#x27;transactionStatus&#x27;: Only the codes RCVD, ACTC, RJCT are used.   * &#x27;_links&#x27;: The ASPSP might integrate hyperlinks to indicate next (authorisation) steps to be taken. 
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "Body of the JSON response for a successful get signing basket request.    * 'payments': payment initiations which shall be authorised through this signing basket.   * 'consents': consent objects which shall be authorised through this signing basket.   * 'transactionStatus': Only the codes RCVD, ACTC, RJCT are used.   * '_links': The ASPSP might integrate hyperlinks to indicate next (authorisation) steps to be taken. ")

public class SigningBasketResponse200   {
  private @Valid PaymentIdList payments = null;
  private @Valid ConsentIdList consents = null;
  private @Valid TransactionStatusSBS transactionStatus = null;
  private @Valid LinksSigningBasket _links = null;

  /**
   **/
  public SigningBasketResponse200 payments(PaymentIdList payments) {
    this.payments = payments;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("payments")

  public PaymentIdList getPayments() {
    return payments;
  }
  public void setPayments(PaymentIdList payments) {
    this.payments = payments;
  }

  /**
   **/
  public SigningBasketResponse200 consents(ConsentIdList consents) {
    this.consents = consents;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("consents")

  public ConsentIdList getConsents() {
    return consents;
  }
  public void setConsents(ConsentIdList consents) {
    this.consents = consents;
  }

  /**
   **/
  public SigningBasketResponse200 transactionStatus(TransactionStatusSBS transactionStatus) {
    this.transactionStatus = transactionStatus;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("transactionStatus")
  @NotNull

  public TransactionStatusSBS getTransactionStatus() {
    return transactionStatus;
  }
  public void setTransactionStatus(TransactionStatusSBS transactionStatus) {
    this.transactionStatus = transactionStatus;
  }

  /**
   **/
  public SigningBasketResponse200 _links(LinksSigningBasket _links) {
    this._links = _links;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("_links")

  public LinksSigningBasket getLinks() {
    return _links;
  }
  public void setLinks(LinksSigningBasket _links) {
    this._links = _links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SigningBasketResponse200 signingBasketResponse200 = (SigningBasketResponse200) o;
    return Objects.equals(payments, signingBasketResponse200.payments) &&
        Objects.equals(consents, signingBasketResponse200.consents) &&
        Objects.equals(transactionStatus, signingBasketResponse200.transactionStatus) &&
        Objects.equals(_links, signingBasketResponse200._links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payments, consents, transactionStatus, _links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SigningBasketResponse200 {\n");
    
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
    sb.append("    consents: ").append(toIndentedString(consents)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
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
