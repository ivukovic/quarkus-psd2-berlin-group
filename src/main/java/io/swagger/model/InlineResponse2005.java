package io.swagger.model;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

/**
  * Body of the Text response for a successful read transaction list request. The body has the structure of a MT94x message. The response body consists of an MT940 or MT942 format in a text structure. The MT942 may include pending payments which are not yet finally booked. The ASPSP will decide on the format due to the chosen parameters, specifically on the chosen dates relative to the time of the request.
 **/
@Schema(description = "Body of the Text response for a successful read transaction list request. The body has the structure of a MT94x message. The response body consists of an MT940 or MT942 format in a text structure. The MT942 may include pending payments which are not yet finally booked. The ASPSP will decide on the format due to the chosen parameters, specifically on the chosen dates relative to the time of the request.")
public class InlineResponse2005 implements OneOfinlineResponse2005 {

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InlineResponse2005 {\n");

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
