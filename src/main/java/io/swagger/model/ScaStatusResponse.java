package io.swagger.model;

import io.swagger.model.ScaStatus;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Body of the JSON response with SCA Status.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "Body of the JSON response with SCA Status.")

public class ScaStatusResponse  implements OneOfinlineResponse2002  {
  private @Valid ScaStatus scaStatus = null;
  private @Valid String psuMessage = null;
  private @Valid Boolean trustedBeneficiaryFlag = null;

  /**
   **/
  public ScaStatusResponse scaStatus(ScaStatus scaStatus) {
    this.scaStatus = scaStatus;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("scaStatus")
  @NotNull

  public ScaStatus getScaStatus() {
    return scaStatus;
  }
  public void setScaStatus(ScaStatus scaStatus) {
    this.scaStatus = scaStatus;
  }

  /**
   **/
  public ScaStatusResponse psuMessage(String psuMessage) {
    this.psuMessage = psuMessage;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("psuMessage")
 @Size(max=500)
  public String getPsuMessage() {
    return psuMessage;
  }
  public void setPsuMessage(String psuMessage) {
    this.psuMessage = psuMessage;
  }

  /**
   **/
  public ScaStatusResponse trustedBeneficiaryFlag(Boolean trustedBeneficiaryFlag) {
    this.trustedBeneficiaryFlag = trustedBeneficiaryFlag;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("trustedBeneficiaryFlag")

  public Boolean getTrustedBeneficiaryFlag() {
    return trustedBeneficiaryFlag;
  }
  public void setTrustedBeneficiaryFlag(Boolean trustedBeneficiaryFlag) {
    this.trustedBeneficiaryFlag = trustedBeneficiaryFlag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScaStatusResponse scaStatusResponse = (ScaStatusResponse) o;
    return Objects.equals(scaStatus, scaStatusResponse.scaStatus) &&
        Objects.equals(psuMessage, scaStatusResponse.psuMessage) &&
        Objects.equals(trustedBeneficiaryFlag, scaStatusResponse.trustedBeneficiaryFlag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scaStatus, psuMessage, trustedBeneficiaryFlag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScaStatusResponse {\n");
    
    sb.append("    scaStatus: ").append(toIndentedString(scaStatus)).append("\n");
    sb.append("    psuMessage: ").append(toIndentedString(psuMessage)).append("\n");
    sb.append("    trustedBeneficiaryFlag: ").append(toIndentedString(trustedBeneficiaryFlag)).append("\n");
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
