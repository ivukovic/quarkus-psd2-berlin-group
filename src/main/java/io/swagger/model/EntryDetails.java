package io.swagger.model;

import java.util.ArrayList;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import io.swagger.util.ObjectUtil;

/**
  * Might be used by the ASPSP to transport details about transactions within a batch. 
 **/
@Schema(description = "Might be used by the ASPSP to transport details about transactions within a batch. ")
public class EntryDetails extends ArrayList<EntryDetailsElement> {

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class EntryDetails {\n");
		sb.append("    ").append(ObjectUtil.toIndentedString(super.toString())).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
