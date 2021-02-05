package io.swagger.model;

import java.util.ArrayList;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

/**
  * A list of balances regarding this account, e.g. the current balance, the last booked balance. The list might be restricted to the current balance. 
 **/
@Schema(description = "A list of balances regarding this account, e.g. the current balance, the last booked balance. The list might be restricted to the current balance. ")
public class BalanceList extends ArrayList<Balance> {

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BalanceList {\n");
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
