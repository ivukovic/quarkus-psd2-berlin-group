package io.swagger.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Structured remittance information. 
 **/
@Schema(description = "Structured remittance information. ")
public class RemittanceInformationStructured {

	@Schema(required = true, description = "")
	private String reference = null;

	@Schema(description = "")
	private String referenceType = null;

	@Schema(description = "")
	private String referenceIssuer = null;

	/**
	  * Get reference
	  * @return reference
	 **/
	@JsonProperty("reference")
	@NotNull
	@Size(max = 35)
	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public RemittanceInformationStructured reference(String reference) {
		this.reference = reference;
		return this;
	}

	/**
	  * Get referenceType
	  * @return referenceType
	 **/
	@JsonProperty("referenceType")
	@Size(max = 35)
	public String getReferenceType() {
		return referenceType;
	}

	public void setReferenceType(String referenceType) {
		this.referenceType = referenceType;
	}

	public RemittanceInformationStructured referenceType(String referenceType) {
		this.referenceType = referenceType;
		return this;
	}

	/**
	  * Get referenceIssuer
	  * @return referenceIssuer
	 **/
	@JsonProperty("referenceIssuer")
	@Size(max = 35)
	public String getReferenceIssuer() {
		return referenceIssuer;
	}

	public void setReferenceIssuer(String referenceIssuer) {
		this.referenceIssuer = referenceIssuer;
	}

	public RemittanceInformationStructured referenceIssuer(String referenceIssuer) {
		this.referenceIssuer = referenceIssuer;
		return this;
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
	private static String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
