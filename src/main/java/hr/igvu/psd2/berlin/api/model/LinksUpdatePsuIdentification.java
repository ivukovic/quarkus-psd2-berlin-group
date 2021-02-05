package hr.igvu.psd2.berlin.api.model;

import java.util.HashMap;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import hr.igvu.psd2.util.ObjectUtil;

/**
  * A list of hyperlinks to be recognised by the TPP. The actual hyperlinks used in the response depend on the dynamical decisions of the ASPSP when processing the request.  **Remark:** All links can be relative or full links, to be decided by the ASPSP.  Type of links admitted in this response, (further links might be added for ASPSP  defined extensions):  - 'scaStatus': The link to retrieve the scaStatus of the corresponding authorisation sub-resource. - 'selectAuthenticationMethod': This is a link to a resource, where the TPP can select the applicable second factor authentication methods for the PSU, if there are several available authentication methods and if the PSU is already sufficiently authenticated.. If this link is contained, then there is also the data element \"scaMethods\" contained in the response body. 
 **/
@Schema(description = "A list of hyperlinks to be recognised by the TPP. The actual hyperlinks used in the response depend on the dynamical decisions of the ASPSP when processing the request.  **Remark:** All links can be relative or full links, to be decided by the ASPSP.  Type of links admitted in this response, (further links might be added for ASPSP  defined extensions):  - 'scaStatus': The link to retrieve the scaStatus of the corresponding authorisation sub-resource. - 'selectAuthenticationMethod': This is a link to a resource, where the TPP can select the applicable second factor authentication methods for the PSU, if there are several available authentication methods and if the PSU is already sufficiently authenticated.. If this link is contained, then there is also the data element \"scaMethods\" contained in the response body. ")
public class LinksUpdatePsuIdentification extends HashMap<String, HrefType> {

	@Schema(description = "")
	private HrefType scaStatus = null;

	@Schema(description = "")
	private HrefType selectAuthenticationMethod = null;

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

	public LinksUpdatePsuIdentification scaStatus(HrefType scaStatus) {
		this.scaStatus = scaStatus;
		return this;
	}

	/**
	  * Get selectAuthenticationMethod
	  * @return selectAuthenticationMethod
	 **/
	@JsonProperty("selectAuthenticationMethod")
	public HrefType getSelectAuthenticationMethod() {
		return selectAuthenticationMethod;
	}

	public void setSelectAuthenticationMethod(HrefType selectAuthenticationMethod) {
		this.selectAuthenticationMethod = selectAuthenticationMethod;
	}

	public LinksUpdatePsuIdentification selectAuthenticationMethod(HrefType selectAuthenticationMethod) {
		this.selectAuthenticationMethod = selectAuthenticationMethod;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LinksUpdatePsuIdentification {\n");
		sb.append("    ").append(ObjectUtil.toIndentedString(super.toString())).append("\n");
		sb.append("    scaStatus: ").append(ObjectUtil.toIndentedString(scaStatus)).append("\n");
		sb.append("    selectAuthenticationMethod: ").append(ObjectUtil.toIndentedString(selectAuthenticationMethod)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
