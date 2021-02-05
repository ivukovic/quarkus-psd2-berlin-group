package io.swagger.model;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.util.ObjectUtil;

/**
  * The multipart message definition for the initiation of a periodic payment initiation  where the information of the payment is contained in a pain.001 message (Part 1) and  the additional informations related to the periodic payment is an additional JSON message (Part 2). 
 **/
@Schema(description = "The multipart message definition for the initiation of a periodic payment initiation  where the information of the payment is contained in a pain.001 message (Part 1) and  the additional informations related to the periodic payment is an additional JSON message (Part 2). ")
public class PeriodicPaymentInitiationMultipartBody {

	@Schema(description = "")
	private OneOfperiodicPaymentInitiationMultipartBodyXmlSct xmlSct = null;

	@Schema(description = "")
	private PeriodicPaymentInitiationXmlPart2StandingorderTypeJson jsonStandingorderType = null;

	/**
	  * Get xmlSct
	  * @return xmlSct
	 **/
	@JsonProperty("xml_sct")
	public OneOfperiodicPaymentInitiationMultipartBodyXmlSct getXmlSct() {
		return xmlSct;
	}

	public void setXmlSct(OneOfperiodicPaymentInitiationMultipartBodyXmlSct xmlSct) {
		this.xmlSct = xmlSct;
	}

	public PeriodicPaymentInitiationMultipartBody xmlSct(OneOfperiodicPaymentInitiationMultipartBodyXmlSct xmlSct) {
		this.xmlSct = xmlSct;
		return this;
	}

	/**
	  * Get jsonStandingorderType
	  * @return jsonStandingorderType
	 **/
	@JsonProperty("json_standingorderType")
	public PeriodicPaymentInitiationXmlPart2StandingorderTypeJson getJsonStandingorderType() {
		return jsonStandingorderType;
	}

	public void setJsonStandingorderType(PeriodicPaymentInitiationXmlPart2StandingorderTypeJson jsonStandingorderType) {
		this.jsonStandingorderType = jsonStandingorderType;
	}

	public PeriodicPaymentInitiationMultipartBody jsonStandingorderType(PeriodicPaymentInitiationXmlPart2StandingorderTypeJson jsonStandingorderType) {
		this.jsonStandingorderType = jsonStandingorderType;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PeriodicPaymentInitiationMultipartBody {\n");

		sb.append("    xmlSct: ").append(ObjectUtil.toIndentedString(xmlSct)).append("\n");
		sb.append("    jsonStandingorderType: ").append(ObjectUtil.toIndentedString(jsonStandingorderType)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
