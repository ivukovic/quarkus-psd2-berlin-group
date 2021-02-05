package io.swagger.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Content of the body of a Select PSU authentication method request 
 **/
@Schema(description = "Content of the body of a Select PSU authentication method request ")
public class SelectPsuAuthenticationMethod implements OneOfbody, OneOfbody1, OneOfbody2, OneOfbody3, OneOfbody4, OneOfbody5, OneOfbody6, OneOfbody7 {

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

		sb.append("    authenticationMethodId: ").append(toIndentedString(authenticationMethodId)).append("\n");
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
