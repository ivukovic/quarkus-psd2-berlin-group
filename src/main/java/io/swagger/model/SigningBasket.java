package io.swagger.model;

import io.swagger.model.ConsentIdList;
import io.swagger.model.PaymentIdList;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * JSON Body of a establish signing basket request. The body shall contain at least one entry. 
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "JSON Body of a establish signing basket request. The body shall contain at least one entry. ")

public class SigningBasket   {
  private @Valid PaymentIdList paymentIds = null;
  private @Valid ConsentIdList consentIds = null;

  /**
   **/
  public SigningBasket paymentIds(PaymentIdList paymentIds) {
    this.paymentIds = paymentIds;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("paymentIds")

  public PaymentIdList getPaymentIds() {
    return paymentIds;
  }
  public void setPaymentIds(PaymentIdList paymentIds) {
    this.paymentIds = paymentIds;
  }

  /**
   **/
  public SigningBasket consentIds(ConsentIdList consentIds) {
    this.consentIds = consentIds;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("consentIds")

  public ConsentIdList getConsentIds() {
    return consentIds;
  }
  public void setConsentIds(ConsentIdList consentIds) {
    this.consentIds = consentIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SigningBasket signingBasket = (SigningBasket) o;
    return Objects.equals(paymentIds, signingBasket.paymentIds) &&
        Objects.equals(consentIds, signingBasket.consentIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentIds, consentIds);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
