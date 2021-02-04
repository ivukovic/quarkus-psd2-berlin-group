package io.swagger.model;

import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Exchange Rate.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "Exchange Rate.")

public class PaymentExchangeRate   {
  private @Valid String unitCurrency = null;
  private @Valid String exchangeRate = null;
  private @Valid String contractIdentification = null;
public enum RateTypeEnum {

    SPOT(String.valueOf("SPOT")), SALE(String.valueOf("SALE")), AGRD(String.valueOf("AGRD"));


    private String value;

    RateTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static RateTypeEnum fromValue(String v) {
        for (RateTypeEnum b : RateTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}
  private @Valid RateTypeEnum rateType = null;

  /**
   **/
  public PaymentExchangeRate unitCurrency(String unitCurrency) {
    this.unitCurrency = unitCurrency;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("unitCurrency")

  public String getUnitCurrency() {
    return unitCurrency;
  }
  public void setUnitCurrency(String unitCurrency) {
    this.unitCurrency = unitCurrency;
  }

  /**
   **/
  public PaymentExchangeRate exchangeRate(String exchangeRate) {
    this.exchangeRate = exchangeRate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("exchangeRate")

  public String getExchangeRate() {
    return exchangeRate;
  }
  public void setExchangeRate(String exchangeRate) {
    this.exchangeRate = exchangeRate;
  }

  /**
   **/
  public PaymentExchangeRate contractIdentification(String contractIdentification) {
    this.contractIdentification = contractIdentification;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("contractIdentification")

  public String getContractIdentification() {
    return contractIdentification;
  }
  public void setContractIdentification(String contractIdentification) {
    this.contractIdentification = contractIdentification;
  }

  /**
   **/
  public PaymentExchangeRate rateType(RateTypeEnum rateType) {
    this.rateType = rateType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("rateType")

  public RateTypeEnum getRateType() {
    return rateType;
  }
  public void setRateType(RateTypeEnum rateType) {
    this.rateType = rateType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentExchangeRate paymentExchangeRate = (PaymentExchangeRate) o;
    return Objects.equals(unitCurrency, paymentExchangeRate.unitCurrency) &&
        Objects.equals(exchangeRate, paymentExchangeRate.exchangeRate) &&
        Objects.equals(contractIdentification, paymentExchangeRate.contractIdentification) &&
        Objects.equals(rateType, paymentExchangeRate.rateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unitCurrency, exchangeRate, contractIdentification, rateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentExchangeRate {\n");
    
    sb.append("    unitCurrency: ").append(toIndentedString(unitCurrency)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
    sb.append("    contractIdentification: ").append(toIndentedString(contractIdentification)).append("\n");
    sb.append("    rateType: ").append(toIndentedString(rateType)).append("\n");
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
