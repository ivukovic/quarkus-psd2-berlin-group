package io.swagger.model;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Link to a resource.
 **/
@Schema(description = "Link to a resource.")
public class HrefType {

	@Schema(description = "")
	private String href = null;

	/**
	  * Get href
	  * @return href
	 **/
	@JsonProperty("href")
	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public HrefType href(String href) {
		this.href = href;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class HrefType {\n");

		sb.append("    href: ").append(toIndentedString(href)).append("\n");
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
