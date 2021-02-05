package hr.igvu.psd2.berlin.api.model;

import java.util.ArrayList;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import hr.igvu.psd2.util.ObjectUtil;

/**
  * Array of structured remittance information. 
 **/
@Schema(description = "Array of structured remittance information. ")
public class RemittanceInformationStructuredArray extends ArrayList<RemittanceInformationStructured> {

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RemittanceInformationStructuredArray {\n");
		sb.append("    ").append(ObjectUtil.toIndentedString(super.toString())).append("\n");
		sb.append("}");
		return sb.toString();
	}

}