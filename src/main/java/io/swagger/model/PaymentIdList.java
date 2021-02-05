package io.swagger.model;

import java.util.ArrayList;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

/**
  * A list of paymentIds.
 **/
@Schema(description = "A list of paymentIds.")
public class PaymentIdList extends ArrayList<String> {

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PaymentIdList {\n");
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
