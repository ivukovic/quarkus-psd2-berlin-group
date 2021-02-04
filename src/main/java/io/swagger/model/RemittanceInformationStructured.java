package io.swagger.model;

import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Structured remittance information. 
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "Structured remittance information. ")

public class RemittanceInformationStructured   {
  private @Valid String reference = null;
  private @Valid String referenceType = null;
  private @Valid String referenceIssuer = null;

  /**
   **/
  public RemittanceInformationStructured reference(String reference) {
    this.reference = reference;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("reference")
  @NotNull
 @Size(max=35)
  public String getReference() {
    return reference;
  }
  public void setReference(String reference) {
    this.reference = reference;
  }

  /**
   **/
  public RemittanceInformationStructured referenceType(String referenceType) {
    this.referenceType = referenceType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("referenceType")
 @Size(max=35)
  public String getReferenceType() {
    return referenceType;
  }
  public void setReferenceType(String referenceType) {
    this.referenceType = referenceType;
  }

  /**
   **/
  public RemittanceInformationStructured referenceIssuer(String referenceIssuer) {
    this.referenceIssuer = referenceIssuer;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("referenceIssuer")
 @Size(max=35)
  public String getReferenceIssuer() {
    return referenceIssuer;
  }
  public void setReferenceIssuer(String referenceIssuer) {
    this.referenceIssuer = referenceIssuer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemittanceInformationStructured remittanceInformationStructured = (RemittanceInformationStructured) o;
    return Objects.equals(reference, remittanceInformationStructured.reference) &&
        Objects.equals(referenceType, remittanceInformationStructured.referenceType) &&
        Objects.equals(referenceIssuer, remittanceInformationStructured.referenceIssuer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reference, referenceType, referenceIssuer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemittanceInformationStructured {\n");
    
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    referenceType: ").append(toIndentedString(referenceType)).append("\n");
    sb.append("    referenceIssuer: ").append(toIndentedString(referenceIssuer)).append("\n");
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
