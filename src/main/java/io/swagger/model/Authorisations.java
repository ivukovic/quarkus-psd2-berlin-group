package io.swagger.model;

import javax.validation.constraints.NotNull;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.util.ObjectUtil;

/**
  * An array of all authorisationIds.
 **/
@Schema(description = "An array of all authorisationIds.")
public class Authorisations {

	@Schema(required = true, description = "")
	private AuthorisationsList authorisationIds = null;

	/**
	  * Get authorisationIds
	  * @return authorisationIds
	 **/
	@JsonProperty("authorisationIds")
	@NotNull
	public AuthorisationsList getAuthorisationIds() {
		return authorisationIds;
	}

	public void setAuthorisationIds(AuthorisationsList authorisationIds) {
		this.authorisationIds = authorisationIds;
	}

	public Authorisations authorisationIds(AuthorisationsList authorisationIds) {
		this.authorisationIds = authorisationIds;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Authorisations {\n");

		sb.append("    authorisationIds: ").append(ObjectUtil.toIndentedString(authorisationIds)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
