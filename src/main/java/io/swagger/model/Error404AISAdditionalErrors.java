package io.swagger.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * This is a data element to support the declaration of additional errors in the context of [RFC7807].
 **/
@Schema(description = "This is a data element to support the declaration of additional errors in the context of [RFC7807].")
public class Error404AISAdditionalErrors {

	@Schema(description = "")
	private String title = null;

	@Schema(description = "")
	private String detail = null;

	@Schema(required = true, description = "")
	private MessageCode404AIS code = null;

	/**
	  * Get title
	  * @return title
	 **/
	@JsonProperty("title")
	@Size(max = 70)
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Error404AISAdditionalErrors title(String title) {
		this.title = title;
		return this;
	}

	/**
	  * Get detail
	  * @return detail
	 **/
	@JsonProperty("detail")
	@Size(max = 500)
	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Error404AISAdditionalErrors detail(String detail) {
		this.detail = detail;
		return this;
	}

	/**
	  * Get code
	  * @return code
	 **/
	@JsonProperty("code")
	@NotNull
	public MessageCode404AIS getCode() {
		return code;
	}

	public void setCode(MessageCode404AIS code) {
		this.code = code;
	}

	public Error404AISAdditionalErrors code(MessageCode404AIS code) {
		this.code = code;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Error404AISAdditionalErrors {\n");

		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
		sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
