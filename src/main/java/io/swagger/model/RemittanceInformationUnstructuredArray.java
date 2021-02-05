package io.swagger.model;

import java.util.ArrayList;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import io.swagger.util.ObjectUtil;

/**
  * Array of unstructured remittance information. 
 **/
@Schema(description = "Array of unstructured remittance information. ")
public class RemittanceInformationUnstructuredArray extends ArrayList<String> {

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RemittanceInformationUnstructuredArray {\n");
		sb.append("    ").append(ObjectUtil.toIndentedString(super.toString())).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
