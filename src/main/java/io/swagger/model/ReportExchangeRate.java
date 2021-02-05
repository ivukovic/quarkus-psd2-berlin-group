package io.swagger.model;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.util.ObjectUtil;

/**
  * Exchange Rate.
 **/
@Schema(description = "Exchange Rate.")
public class ReportExchangeRate {

	@Schema(required = true, description = "")
	private String sourceCurrency = null;

	@Schema(required = true, description = "")
	private String exchangeRate = null;

	@Schema(required = true, description = "")
	private String unitCurrency = null;

	@Schema(required = true, description = "")
	private String targetCurrency = null;

	@Schema(required = true, description = "")
	private LocalDate quotationDate = null;

	@Schema(description = "")
	private String contractIdentification = null;

	/**
	  * Get sourceCurrency
	  * @return sourceCurrency
	 **/
	@JsonProperty("sourceCurrency")
	@NotNull
	@Pattern(regexp = "[A-Z]{3}")
	public String getSourceCurrency() {
		return sourceCurrency;
	}

	public void setSourceCurrency(String sourceCurrency) {
		this.sourceCurrency = sourceCurrency;
	}

	public ReportExchangeRate sourceCurrency(String sourceCurrency) {
		this.sourceCurrency = sourceCurrency;
		return this;
	}

	/**
	  * Get exchangeRate
	  * @return exchangeRate
	 **/
	@JsonProperty("exchangeRate")
	@NotNull
	public String getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(String exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public ReportExchangeRate exchangeRate(String exchangeRate) {
		this.exchangeRate = exchangeRate;
		return this;
	}

	/**
	  * Get unitCurrency
	  * @return unitCurrency
	 **/
	@JsonProperty("unitCurrency")
	@NotNull
	public String getUnitCurrency() {
		return unitCurrency;
	}

	public void setUnitCurrency(String unitCurrency) {
		this.unitCurrency = unitCurrency;
	}

	public ReportExchangeRate unitCurrency(String unitCurrency) {
		this.unitCurrency = unitCurrency;
		return this;
	}

	/**
	  * Get targetCurrency
	  * @return targetCurrency
	 **/
	@JsonProperty("targetCurrency")
	@NotNull
	@Pattern(regexp = "[A-Z]{3}")
	public String getTargetCurrency() {
		return targetCurrency;
	}

	public void setTargetCurrency(String targetCurrency) {
		this.targetCurrency = targetCurrency;
	}

	public ReportExchangeRate targetCurrency(String targetCurrency) {
		this.targetCurrency = targetCurrency;
		return this;
	}

	/**
	  * Get quotationDate
	  * @return quotationDate
	 **/
	@JsonProperty("quotationDate")
	@NotNull
	public LocalDate getQuotationDate() {
		return quotationDate;
	}

	public void setQuotationDate(LocalDate quotationDate) {
		this.quotationDate = quotationDate;
	}

	public ReportExchangeRate quotationDate(LocalDate quotationDate) {
		this.quotationDate = quotationDate;
		return this;
	}

	/**
	  * Get contractIdentification
	  * @return contractIdentification
	 **/
	@JsonProperty("contractIdentification")
	public String getContractIdentification() {
		return contractIdentification;
	}

	public void setContractIdentification(String contractIdentification) {
		this.contractIdentification = contractIdentification;
	}

	public ReportExchangeRate contractIdentification(String contractIdentification) {
		this.contractIdentification = contractIdentification;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ReportExchangeRate {\n");

		sb.append("    sourceCurrency: ").append(ObjectUtil.toIndentedString(sourceCurrency)).append("\n");
		sb.append("    exchangeRate: ").append(ObjectUtil.toIndentedString(exchangeRate)).append("\n");
		sb.append("    unitCurrency: ").append(ObjectUtil.toIndentedString(unitCurrency)).append("\n");
		sb.append("    targetCurrency: ").append(ObjectUtil.toIndentedString(targetCurrency)).append("\n");
		sb.append("    quotationDate: ").append(ObjectUtil.toIndentedString(quotationDate)).append("\n");
		sb.append("    contractIdentification: ").append(ObjectUtil.toIndentedString(contractIdentification)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
