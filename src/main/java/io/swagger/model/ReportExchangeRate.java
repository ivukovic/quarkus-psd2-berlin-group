package io.swagger.model;

import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.joda.time.LocalDate;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Exchange Rate.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "Exchange Rate.")

public class ReportExchangeRate   {
  private @Valid String sourceCurrency = null;
  private @Valid String exchangeRate = null;
  private @Valid String unitCurrency = null;
  private @Valid String targetCurrency = null;
  private @Valid LocalDate quotationDate = null;
  private @Valid String contractIdentification = null;

  /**
   **/
  public ReportExchangeRate sourceCurrency(String sourceCurrency) {
    this.sourceCurrency = sourceCurrency;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("sourceCurrency")
  @NotNull
 @Pattern(regexp="[A-Z]{3}")
  public String getSourceCurrency() {
    return sourceCurrency;
  }
  public void setSourceCurrency(String sourceCurrency) {
    this.sourceCurrency = sourceCurrency;
  }

  /**
   **/
  public ReportExchangeRate exchangeRate(String exchangeRate) {
    this.exchangeRate = exchangeRate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("exchangeRate")
  @NotNull

  public String getExchangeRate() {
    return exchangeRate;
  }
  public void setExchangeRate(String exchangeRate) {
    this.exchangeRate = exchangeRate;
  }

  /**
   **/
  public ReportExchangeRate unitCurrency(String unitCurrency) {
    this.unitCurrency = unitCurrency;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("unitCurrency")
  @NotNull

  public String getUnitCurrency() {
    return unitCurrency;
  }
  public void setUnitCurrency(String unitCurrency) {
    this.unitCurrency = unitCurrency;
  }

  /**
   **/
  public ReportExchangeRate targetCurrency(String targetCurrency) {
    this.targetCurrency = targetCurrency;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("targetCurrency")
  @NotNull
 @Pattern(regexp="[A-Z]{3}")
  public String getTargetCurrency() {
    return targetCurrency;
  }
  public void setTargetCurrency(String targetCurrency) {
    this.targetCurrency = targetCurrency;
  }

  /**
   **/
  public ReportExchangeRate quotationDate(LocalDate quotationDate) {
    this.quotationDate = quotationDate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("quotationDate")
  @NotNull

  public LocalDate getQuotationDate() {
    return quotationDate;
  }
  public void setQuotationDate(LocalDate quotationDate) {
    this.quotationDate = quotationDate;
  }

  /**
   **/
  public ReportExchangeRate contractIdentification(String contractIdentification) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportExchangeRate reportExchangeRate = (ReportExchangeRate) o;
    return Objects.equals(sourceCurrency, reportExchangeRate.sourceCurrency) &&
        Objects.equals(exchangeRate, reportExchangeRate.exchangeRate) &&
        Objects.equals(unitCurrency, reportExchangeRate.unitCurrency) &&
        Objects.equals(targetCurrency, reportExchangeRate.targetCurrency) &&
        Objects.equals(quotationDate, reportExchangeRate.quotationDate) &&
        Objects.equals(contractIdentification, reportExchangeRate.contractIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceCurrency, exchangeRate, unitCurrency, targetCurrency, quotationDate, contractIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportExchangeRate {\n");
    
    sb.append("    sourceCurrency: ").append(toIndentedString(sourceCurrency)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
    sb.append("    unitCurrency: ").append(toIndentedString(unitCurrency)).append("\n");
    sb.append("    targetCurrency: ").append(toIndentedString(targetCurrency)).append("\n");
    sb.append("    quotationDate: ").append(toIndentedString(quotationDate)).append("\n");
    sb.append("    contractIdentification: ").append(toIndentedString(contractIdentification)).append("\n");
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
