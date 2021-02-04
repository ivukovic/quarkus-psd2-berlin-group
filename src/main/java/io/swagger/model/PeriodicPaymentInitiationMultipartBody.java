package io.swagger.model;

import io.swagger.model.PeriodicPaymentInitiationXmlPart2StandingorderTypeJson;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The multipart message definition for the initiation of a periodic payment initiation  where the information of the payment is contained in a pain.001 message (Part 1) and  the additional informations related to the periodic payment is an additional JSON message (Part 2). 
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "The multipart message definition for the initiation of a periodic payment initiation  where the information of the payment is contained in a pain.001 message (Part 1) and  the additional informations related to the periodic payment is an additional JSON message (Part 2). ")

public class PeriodicPaymentInitiationMultipartBody   {
  private @Valid OneOfperiodicPaymentInitiationMultipartBodyXmlSct xmlSct = null;
  private @Valid PeriodicPaymentInitiationXmlPart2StandingorderTypeJson jsonStandingorderType = null;

  /**
   **/
  public PeriodicPaymentInitiationMultipartBody xmlSct(OneOfperiodicPaymentInitiationMultipartBodyXmlSct xmlSct) {
    this.xmlSct = xmlSct;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("xml_sct")

  public OneOfperiodicPaymentInitiationMultipartBodyXmlSct getXmlSct() {
    return xmlSct;
  }
  public void setXmlSct(OneOfperiodicPaymentInitiationMultipartBodyXmlSct xmlSct) {
    this.xmlSct = xmlSct;
  }

  /**
   **/
  public PeriodicPaymentInitiationMultipartBody jsonStandingorderType(PeriodicPaymentInitiationXmlPart2StandingorderTypeJson jsonStandingorderType) {
    this.jsonStandingorderType = jsonStandingorderType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("json_standingorderType")

  public PeriodicPaymentInitiationXmlPart2StandingorderTypeJson getJsonStandingorderType() {
    return jsonStandingorderType;
  }
  public void setJsonStandingorderType(PeriodicPaymentInitiationXmlPart2StandingorderTypeJson jsonStandingorderType) {
    this.jsonStandingorderType = jsonStandingorderType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PeriodicPaymentInitiationMultipartBody periodicPaymentInitiationMultipartBody = (PeriodicPaymentInitiationMultipartBody) o;
    return Objects.equals(xmlSct, periodicPaymentInitiationMultipartBody.xmlSct) &&
        Objects.equals(jsonStandingorderType, periodicPaymentInitiationMultipartBody.jsonStandingorderType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xmlSct, jsonStandingorderType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeriodicPaymentInitiationMultipartBody {\n");
    
    sb.append("    xmlSct: ").append(toIndentedString(xmlSct)).append("\n");
    sb.append("    jsonStandingorderType: ").append(toIndentedString(jsonStandingorderType)).append("\n");
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
