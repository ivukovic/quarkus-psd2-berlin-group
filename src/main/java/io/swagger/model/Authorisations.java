package io.swagger.model;

import io.swagger.model.AuthorisationsList;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * An array of all authorisationIds.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "An array of all authorisationIds.")

public class Authorisations   {
  private @Valid AuthorisationsList authorisationIds = null;

  /**
   **/
  public Authorisations authorisationIds(AuthorisationsList authorisationIds) {
    this.authorisationIds = authorisationIds;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("authorisationIds")
  @NotNull

  public AuthorisationsList getAuthorisationIds() {
    return authorisationIds;
  }
  public void setAuthorisationIds(AuthorisationsList authorisationIds) {
    this.authorisationIds = authorisationIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Authorisations authorisations = (Authorisations) o;
    return Objects.equals(authorisationIds, authorisations.authorisationIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorisationIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Authorisations {\n");
    
    sb.append("    authorisationIds: ").append(toIndentedString(authorisationIds)).append("\n");
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
