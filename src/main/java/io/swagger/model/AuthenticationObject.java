package io.swagger.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Authentication object. 
 **/
@Schema(description = "Authentication object. ")
public class AuthenticationObject {

	@Schema(required = true, description = "")
	private AuthenticationType authenticationType = null;

	@Schema(description = "Depending on the \"authenticationType\". This version can be used by differentiating authentication tools used within performing OTP generation in the same authentication type. This version can be referred to in the ASPSP?s documentation. ")
	/**
	  * Depending on the \"authenticationType\". This version can be used by differentiating authentication tools used within performing OTP generation in the same authentication type. This version can be referred to in the ASPSP?s documentation.   
	 **/
	private String authenticationVersion = null;

	@Schema(required = true, description = "")
	private String authenticationMethodId = null;

	@Schema(example = "SMS OTP on phone +49160 xxxxx 28", description = "This is the name of the authentication method defined by the PSU in the Online Banking frontend of the ASPSP. Alternatively this could be a description provided by the ASPSP like \"SMS OTP on phone +49160 xxxxx 28\". This name shall be used by the TPP when presenting a list of authentication methods to the PSU, if available. ")
	/**
	  * This is the name of the authentication method defined by the PSU in the Online Banking frontend of the ASPSP. Alternatively this could be a description provided by the ASPSP like \"SMS OTP on phone +49160 xxxxx 28\". This name shall be used by the TPP when presenting a list of authentication methods to the PSU, if available.   
	 **/
	private String name = null;

	@Schema(example = "Detailed information about the SCA method for the PSU.", description = "Detailed information about the SCA method for the PSU. ")
	/**
	  * Detailed information about the SCA method for the PSU.   
	 **/
	private String explanation = null;

	/**
	  * Get authenticationType
	  * @return authenticationType
	 **/
	@JsonProperty("authenticationType")
	@NotNull
	public AuthenticationType getAuthenticationType() {
		return authenticationType;
	}

	public void setAuthenticationType(AuthenticationType authenticationType) {
		this.authenticationType = authenticationType;
	}

	public AuthenticationObject authenticationType(AuthenticationType authenticationType) {
		this.authenticationType = authenticationType;
		return this;
	}

	/**
	  * Depending on the \&quot;authenticationType\&quot;. This version can be used by differentiating authentication tools used within performing OTP generation in the same authentication type. This version can be referred to in the ASPSP?s documentation. 
	  * @return authenticationVersion
	 **/
	@JsonProperty("authenticationVersion")
	public String getAuthenticationVersion() {
		return authenticationVersion;
	}

	public void setAuthenticationVersion(String authenticationVersion) {
		this.authenticationVersion = authenticationVersion;
	}

	public AuthenticationObject authenticationVersion(String authenticationVersion) {
		this.authenticationVersion = authenticationVersion;
		return this;
	}

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

	public AuthenticationObject authenticationMethodId(String authenticationMethodId) {
		this.authenticationMethodId = authenticationMethodId;
		return this;
	}

	/**
	  * This is the name of the authentication method defined by the PSU in the Online Banking frontend of the ASPSP. Alternatively this could be a description provided by the ASPSP like \&quot;SMS OTP on phone +49160 xxxxx 28\&quot;. This name shall be used by the TPP when presenting a list of authentication methods to the PSU, if available. 
	  * @return name
	 **/
	@JsonProperty("name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AuthenticationObject name(String name) {
		this.name = name;
		return this;
	}

	/**
	  * Detailed information about the SCA method for the PSU. 
	  * @return explanation
	 **/
	@JsonProperty("explanation")
	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	public AuthenticationObject explanation(String explanation) {
		this.explanation = explanation;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AuthenticationObject {\n");

		sb.append("    authenticationType: ").append(toIndentedString(authenticationType)).append("\n");
		sb.append("    authenticationVersion: ").append(toIndentedString(authenticationVersion)).append("\n");
		sb.append("    authenticationMethodId: ").append(toIndentedString(authenticationMethodId)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
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
