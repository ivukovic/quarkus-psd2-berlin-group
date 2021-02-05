package io.swagger.model.msg; import io.swagger.util.ObjectUtil;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.model.msgcode.MessageCode404SBS;

public class TppMessage404SBS {

	@Schema(required = true, description = "")
	private TppMessageCategory category = null;

	@Schema(required = true, description = "")
	private MessageCode404SBS code = null;

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

	public TppMessage404SBS category(TppMessageCategory category) {
		this.category = category;
		return this;
	}

	/**
	  * Get code
	  * @return code
	 **/
	@JsonProperty("code")
	@NotNull
	public MessageCode404SBS getCode() {
		return code;
	}

	public void setCode(MessageCode404SBS code) {
		this.code = code;
	}

	public TppMessage404SBS code(MessageCode404SBS code) {
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

	public TppMessage404SBS path(String path) {
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

	public TppMessage404SBS text(String text) {
		this.text = text;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TppMessage404SBS {\n");

		sb.append("    category: ").append(ObjectUtil.toIndentedString(category)).append("\n");
		sb.append("    code: ").append(ObjectUtil.toIndentedString(code)).append("\n");
		sb.append("    path: ").append(ObjectUtil.toIndentedString(path)).append("\n");
		sb.append("    text: ").append(ObjectUtil.toIndentedString(text)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}