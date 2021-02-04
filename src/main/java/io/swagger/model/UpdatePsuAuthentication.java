package io.swagger.model;

import io.swagger.model.PsuData;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Content of the body of a Update PSU authentication request  Password subfield is used. 
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "Content of the body of a Update PSU authentication request  Password subfield is used. ")

public class UpdatePsuAuthentication  implements OneOfbody, OneOfbody1, OneOfbody2, OneOfbody3, OneOfbody4, OneOfbody5, OneOfbody6, OneOfbody7  {
  private @Valid PsuData psuData = null;

  /**
   **/
  public UpdatePsuAuthentication psuData(PsuData psuData) {
    this.psuData = psuData;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("psuData")
  @NotNull

  public PsuData getPsuData() {
    return psuData;
  }
  public void setPsuData(PsuData psuData) {
    this.psuData = psuData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePsuAuthentication updatePsuAuthentication = (UpdatePsuAuthentication) o;
    return Objects.equals(psuData, updatePsuAuthentication.psuData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(psuData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePsuAuthentication {\n");
    
    sb.append("    psuData: ").append(toIndentedString(psuData)).append("\n");
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
