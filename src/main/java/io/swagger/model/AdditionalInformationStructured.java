package io.swagger.model;

import io.swagger.model.StandingOrderDetails;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Is used if and only if the bookingStatus entry equals \&quot;information\&quot;.  Every active standing order related to the dedicated payment account result into one entry. 
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "Is used if and only if the bookingStatus entry equals \"information\".  Every active standing order related to the dedicated payment account result into one entry. ")

public class AdditionalInformationStructured   {
  private @Valid StandingOrderDetails standingOrderDetails = null;

  /**
   **/
  public AdditionalInformationStructured standingOrderDetails(StandingOrderDetails standingOrderDetails) {
    this.standingOrderDetails = standingOrderDetails;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("standingOrderDetails")
  @NotNull

  public StandingOrderDetails getStandingOrderDetails() {
    return standingOrderDetails;
  }
  public void setStandingOrderDetails(StandingOrderDetails standingOrderDetails) {
    this.standingOrderDetails = standingOrderDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalInformationStructured additionalInformationStructured = (AdditionalInformationStructured) o;
    return Objects.equals(standingOrderDetails, additionalInformationStructured.standingOrderDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(standingOrderDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalInformationStructured {\n");
    
    sb.append("    standingOrderDetails: ").append(toIndentedString(standingOrderDetails)).append("\n");
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
