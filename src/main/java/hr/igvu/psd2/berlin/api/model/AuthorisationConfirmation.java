package hr.igvu.psd2.berlin.api.model;

import javax.validation.constraints.NotNull;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import hr.igvu.psd2.util.ObjectUtil;

/**
  * Content of the body of an authorisation confirmation request 
 **/
@Schema(description = "Content of the body of an authorisation confirmation request ")
public class AuthorisationConfirmation implements OneOfbody {

	@Schema(required = true, description = "Confirmation Code as retrieved by the TPP from the redirect based SCA process.")
	/**
	  * Confirmation Code as retrieved by the TPP from the redirect based SCA process.  
	 **/
	private String confirmationCode = null;

	/**
	  * Confirmation Code as retrieved by the TPP from the redirect based SCA process.
	  * @return confirmationCode
	 **/
	@JsonProperty("confirmationCode")
	@NotNull
	public String getConfirmationCode() {
		return confirmationCode;
	}

	public void setConfirmationCode(String confirmationCode) {
		this.confirmationCode = confirmationCode;
	}

	public AuthorisationConfirmation confirmationCode(String confirmationCode) {
		this.confirmationCode = confirmationCode;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AuthorisationConfirmation {\n");

		sb.append("    confirmationCode: ").append(ObjectUtil.toIndentedString(confirmationCode)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
