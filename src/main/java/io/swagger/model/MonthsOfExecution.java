package io.swagger.model;

import org.eclipse.microprofile.openapi.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The format is following the regular expression \\d{1,2}.  The array is restricted to 11 entries.  The values contained in the array entries shall all be different and the maximum value of one entry is 12. This attribute is contained if and only if the frequency equals \&quot;MonthlyVariable\&quot;. Example: An execution on January, April and October each year is addressed by [\&quot;1\&quot;, \&quot;4\&quot;, \&quot;10\&quot;]. 
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "The format is following the regular expression \\d{1,2}.  The array is restricted to 11 entries.  The values contained in the array entries shall all be different and the maximum value of one entry is 12. This attribute is contained if and only if the frequency equals \"MonthlyVariable\". Example: An execution on January, April and October each year is addressed by [\"1\", \"4\", \"10\"]. ")

public class MonthsOfExecution extends ArrayList<String>  {


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonthsOfExecution monthsOfExecution = (MonthsOfExecution) o;
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonthsOfExecution {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
