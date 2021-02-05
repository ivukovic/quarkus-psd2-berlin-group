package io.swagger.model;

import java.util.ArrayList;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

/**
  * Might be used by the ASPSP to transport details about transactions within a batch. 
 **/
@Schema(description = "Might be used by the ASPSP to transport details about transactions within a batch. ")
public class EntryDetails extends ArrayList<EntryDetailsElement> {

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class EntryDetails {\n");
		sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
