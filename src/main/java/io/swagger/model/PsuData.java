package io.swagger.model;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * PSU Data for Update PSU authentication.
 **/
@Schema(description = "PSU Data for Update PSU authentication.")
public class PsuData {

	@Schema(description = "Password.")
	/**
	  * Password.  
	 **/
	private String password = null;

	@Schema(description = "Encrypted password.")
	/**
	  * Encrypted password.  
	 **/
	private String encryptedPassword = null;

	@Schema(description = "Additional password in plaintext.")
	/**
	  * Additional password in plaintext.  
	 **/
	private String additionalPassword = null;

	@Schema(description = "Additional encrypted password.")
	/**
	  * Additional encrypted password.  
	 **/
	private String additionalEncryptedPassword = null;

	/**
	  * Password.
	  * @return password
	 **/
	@JsonProperty("password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public PsuData password(String password) {
		this.password = password;
		return this;
	}

	/**
	  * Encrypted password.
	  * @return encryptedPassword
	 **/
	@JsonProperty("encryptedPassword")
	public String getEncryptedPassword() {
		return encryptedPassword;
	}

	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}

	public PsuData encryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
		return this;
	}

	/**
	  * Additional password in plaintext.
	  * @return additionalPassword
	 **/
	@JsonProperty("additionalPassword")
	public String getAdditionalPassword() {
		return additionalPassword;
	}

	public void setAdditionalPassword(String additionalPassword) {
		this.additionalPassword = additionalPassword;
	}

	public PsuData additionalPassword(String additionalPassword) {
		this.additionalPassword = additionalPassword;
		return this;
	}

	/**
	  * Additional encrypted password.
	  * @return additionalEncryptedPassword
	 **/
	@JsonProperty("additionalEncryptedPassword")
	public String getAdditionalEncryptedPassword() {
		return additionalEncryptedPassword;
	}

	public void setAdditionalEncryptedPassword(String additionalEncryptedPassword) {
		this.additionalEncryptedPassword = additionalEncryptedPassword;
	}

	public PsuData additionalEncryptedPassword(String additionalEncryptedPassword) {
		this.additionalEncryptedPassword = additionalEncryptedPassword;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PsuData {\n");

		sb.append("    password: ").append(toIndentedString(password)).append("\n");
		sb.append("    encryptedPassword: ").append(toIndentedString(encryptedPassword)).append("\n");
		sb.append("    additionalPassword: ").append(toIndentedString(additionalPassword)).append("\n");
		sb.append("    additionalEncryptedPassword: ").append(toIndentedString(additionalEncryptedPassword)).append("\n");
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
