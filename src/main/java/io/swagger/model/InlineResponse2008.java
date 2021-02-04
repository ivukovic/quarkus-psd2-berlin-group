package io.swagger.model;

import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Equals \&quot;true\&quot; if sufficient funds are available at the time of the request,  \&quot;false\&quot; otherwise. 
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "Equals \"true\" if sufficient funds are available at the time of the request,  \"false\" otherwise. ")

public class InlineResponse2008   {
  private @Valid Boolean fundsAvailable = null;

  /**
   **/
  public InlineResponse2008 fundsAvailable(Boolean fundsAvailable) {
    this.fundsAvailable = fundsAvailable;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("fundsAvailable")
  @NotNull

  public Boolean getFundsAvailable() {
    return fundsAvailable;
  }
  public void setFundsAvailable(Boolean fundsAvailable) {
    this.fundsAvailable = fundsAvailable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2008 inlineResponse2008 = (InlineResponse2008) o;
    return Objects.equals(fundsAvailable, inlineResponse2008.fundsAvailable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundsAvailable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2008 {\n");
    
    sb.append("    fundsAvailable: ").append(toIndentedString(fundsAvailable)).append("\n");
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
