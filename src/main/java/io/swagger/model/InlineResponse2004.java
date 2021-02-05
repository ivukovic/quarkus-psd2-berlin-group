package io.swagger.model;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

/**
  * Body of the XML response for a successful read transaction list request. The body has the structure of a either a camt.052 or camt.053 message. The camt.052 may include pending payments which are not yet finally booked. The ASPSP will decide on the format due to the chosen parameters, specifically on the chosen dates relative to the time of the request. In addition the ASPSP might offer camt.054x structure e.g. in a corporate setting.
 **/
@Schema(description = "Body of the XML response for a successful read transaction list request. The body has the structure of a either a camt.052 or camt.053 message. The camt.052 may include pending payments which are not yet finally booked. The ASPSP will decide on the format due to the chosen parameters, specifically on the chosen dates relative to the time of the request. In addition the ASPSP might offer camt.054x structure e.g. in a corporate setting.")
public class InlineResponse2004 implements OneOfinlineResponse2004 {

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InlineResponse2004 {\n");

		sb.append("}");
		return sb.toString();
	}

}
