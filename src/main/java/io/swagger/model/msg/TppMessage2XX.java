package io.swagger.model.msg;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.model.msgcode.MessageCode2XX;

public class TppMessage2XX {

	@Schema(required = true, description = "")
	private TppMessageCategory category = null;

	@Schema(required = true, description = "")
	private MessageCode2XX code = null;

	@Schema(description = "")
	private String path = null;

	@Schema(description = "")
	private String text = null;

	/**
	  * Get category
	  * @return category
	 **/
	@JsonProperty("category")
	@NotNull
	public TppMessageCategory getCategory() {
		return category;
	}

	public void setCategory(TppMessageCategory category) {
		this.category = category;
	}

	public TppMessage2XX category(TppMessageCategory category) {
		this.category = category;
		return this;
	}

	/**
	  * Get code
	  * @return code
	 **/
	@JsonProperty("code")
	@NotNull
	public MessageCode2XX getCode() {
		return code;
	}

	public void setCode(MessageCode2XX code) {
		this.code = code;
	}

	public TppMessage2XX code(MessageCode2XX code) {
		this.code = code;
		return this;
	}

	/**
	  * Get path
	  * @return path
	 **/
	@JsonProperty("path")
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public TppMessage2XX path(String path) {
		this.path = path;
		return this;
	}

	/**
	  * Get text
	  * @return text
	 **/
	@JsonProperty("text")
	@Size(max = 500)
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public TppMessage2XX text(String text) {
		this.text = text;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TppMessage2XX {\n");

		sb.append("    category: ").append(toIndentedString(category)).append("\n");
		sb.append("    code: ").append(toIndentedString(code)).append("\n");
		sb.append("    path: ").append(toIndentedString(path)).append("\n");
		sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
