package hr.igvu.psd2.berlin.api.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import hr.igvu.psd2.util.ObjectUtil;

/**
  * Content of the body of a Select PSU authentication method request 
 **/
@Schema(description = "Content of the body of a Select PSU authentication method request ")
public class SelectPsuAuthenticationMethod implements OneOfbody {

	@Schema(required = true, description = "")
	private String authenticationMethodId = null;

	/**
	  * Get authenticationMethodId
	  * @return authenticationMethodId
	 **/
	@JsonProperty("authenticationMethodId")
	@NotNull
	@Size(max = 35)
	public String getAuthenticationMethodId() {
		return authenticationMethodId;
	}

	public void setAuthenticationMethodId(String authenticationMethodId) {
		this.authenticationMethodId = authenticationMethodId;
	}

	public SelectPsuAuthenticationMethod authenticationMethodId(String authenticationMethodId) {
		this.authenticationMethodId = authenticationMethodId;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SelectPsuAuthenticationMethod {\n");

		sb.append("    authenticationMethodId: ").append(ObjectUtil.toIndentedString(authenticationMethodId)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
