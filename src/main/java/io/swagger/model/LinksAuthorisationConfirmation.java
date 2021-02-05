package io.swagger.model;

import java.util.HashMap;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * A list of hyperlinks to be recognised by the TPP. The actual hyperlinks used in the response depend on the dynamical decisions of the ASPSP when processing the request.  **Remark:** All links can be relative or full links, to be decided by the ASPSP.  Type of links admitted in this response, (further links might be added for ASPSP  defined extensions):  - 'scaStatus': The link to retrieve the status of the corresponding transaction resource. 
 **/
@Schema(description = "A list of hyperlinks to be recognised by the TPP. The actual hyperlinks used in the response depend on the dynamical decisions of the ASPSP when processing the request.  **Remark:** All links can be relative or full links, to be decided by the ASPSP.  Type of links admitted in this response, (further links might be added for ASPSP  defined extensions):  - 'scaStatus': The link to retrieve the status of the corresponding transaction resource. ")
public class LinksAuthorisationConfirmation extends HashMap<String, HrefType> {

	@Schema(description = "")
	private HrefType scaStatus = null;

	/**
	  * Get scaStatus
	  * @return scaStatus
	 **/
	@JsonProperty("scaStatus")
	public HrefType getScaStatus() {
		return scaStatus;
	}

	public void setScaStatus(HrefType scaStatus) {
		this.scaStatus = scaStatus;
	}

	public LinksAuthorisationConfirmation scaStatus(HrefType scaStatus) {
		this.scaStatus = scaStatus;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LinksAuthorisationConfirmation {\n");
		sb.append("    ").append(toIndentedString(super.toString())).append("\n");
		sb.append("    scaStatus: ").append(toIndentedString(scaStatus)).append("\n");
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
