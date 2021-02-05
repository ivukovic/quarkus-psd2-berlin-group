package io.swagger.model;

import java.util.ArrayList;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import io.swagger.util.ObjectUtil;

/**
  * An array of all authorisationIds.
 **/
@Schema(description = "An array of all authorisationIds.")
public class AuthorisationsList extends ArrayList<String> {

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AuthorisationsList {\n");
		sb.append("    ").append(ObjectUtil.toIndentedString(super.toString())).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
