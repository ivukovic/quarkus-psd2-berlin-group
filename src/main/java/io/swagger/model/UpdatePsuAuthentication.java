package io.swagger.model;

import javax.validation.constraints.NotNull;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.util.ObjectUtil;

/**
  * Content of the body of a Update PSU authentication request  Password subfield is used. 
 **/
@Schema(description = "Content of the body of a Update PSU authentication request  Password subfield is used. ")
public class UpdatePsuAuthentication implements OneOfbody {

	@Schema(required = true, description = "")
	private PsuData psuData = null;

	/**
	  * Get psuData
	  * @return psuData
	 **/
	@JsonProperty("psuData")
	@NotNull
	public PsuData getPsuData() {
		return psuData;
	}

	public void setPsuData(PsuData psuData) {
		this.psuData = psuData;
	}

	public UpdatePsuAuthentication psuData(PsuData psuData) {
		this.psuData = psuData;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class UpdatePsuAuthentication {\n");

		sb.append("    psuData: ").append(ObjectUtil.toIndentedString(psuData)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
