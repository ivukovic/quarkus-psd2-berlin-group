package hr.igvu.psd2.berlin.api.model;

import java.util.ArrayList;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import hr.igvu.psd2.util.ObjectUtil;

/**
  * A list of consentIds.
 **/
@Schema(description = "A list of consentIds.")
public class ConsentIdList extends ArrayList<String> {

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConsentIdList {\n");
		sb.append("    ").append(ObjectUtil.toIndentedString(super.toString())).append("\n");
		sb.append("}");
		return sb.toString();
	}

}