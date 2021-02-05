package io.swagger.model;

import java.util.ArrayList;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

/**
  * Array of transaction details.
 **/
@Schema(description = "Array of transaction details.")
public class TransactionList extends ArrayList<Transactions> {

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TransactionList {\n");
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
