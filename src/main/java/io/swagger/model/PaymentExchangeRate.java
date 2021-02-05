package io.swagger.model;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.util.ObjectUtil;

/**
  * Exchange Rate.
 **/
@Schema(description = "Exchange Rate.")
public class PaymentExchangeRate {

	@Schema(description = "")
	private String unitCurrency = null;

	@Schema(description = "")
	private String exchangeRate = null;

	@Schema(description = "")
	private String contractIdentification = null;

	public enum RateTypeEnum {
		SPOT("SPOT"), SALE("SALE"), AGRD("AGRD");

		private String value;

		RateTypeEnum(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static RateTypeEnum fromValue(String text) {
			for (RateTypeEnum b : RateTypeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	@Schema(description = "")
	private RateTypeEnum rateType = null;

	/**
	  * Get unitCurrency
	  * @return unitCurrency
	 **/
	@JsonProperty("unitCurrency")
	public String getUnitCurrency() {
		return unitCurrency;
	}

	public void setUnitCurrency(String unitCurrency) {
		this.unitCurrency = unitCurrency;
	}

	public PaymentExchangeRate unitCurrency(String unitCurrency) {
		this.unitCurrency = unitCurrency;
		return this;
	}

	/**
	  * Get exchangeRate
	  * @return exchangeRate
	 **/
	@JsonProperty("exchangeRate")
	public String getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(String exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public PaymentExchangeRate exchangeRate(String exchangeRate) {
		this.exchangeRate = exchangeRate;
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

	public PaymentExchangeRate contractIdentification(String contractIdentification) {
		this.contractIdentification = contractIdentification;
		return this;
	}

	/**
	  * Get rateType
	  * @return rateType
	 **/
	@JsonProperty("rateType")
	public String getRateType() {
		if (rateType == null) {
			return null;
		}
		return rateType.getValue();
	}

	public void setRateType(RateTypeEnum rateType) {
		this.rateType = rateType;
	}

	public PaymentExchangeRate rateType(RateTypeEnum rateType) {
		this.rateType = rateType;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PaymentExchangeRate {\n");

		sb.append("    unitCurrency: ").append(ObjectUtil.toIndentedString(unitCurrency)).append("\n");
		sb.append("    exchangeRate: ").append(ObjectUtil.toIndentedString(exchangeRate)).append("\n");
		sb.append("    contractIdentification: ").append(ObjectUtil.toIndentedString(contractIdentification)).append("\n");
		sb.append("    rateType: ").append(ObjectUtil.toIndentedString(rateType)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
