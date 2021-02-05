package hr.igvu.psd2.berlin.api.model.msg; import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import hr.igvu.psd2.berlin.api.model.msgcode.MessageCode403AIS;
import hr.igvu.psd2.util.ObjectUtil;

public class TppMessage403AIS {

	@Schema(required = true, description = "")
	private TppMessageCategory category = null;

	@Schema(required = true, description = "")
	private MessageCode403AIS code = null;

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

	public TppMessage403AIS category(TppMessageCategory category) {
		this.category = category;
		return this;
	}

	/**
	  * Get code
	  * @return code
	 **/
	@JsonProperty("code")
	@NotNull
	public MessageCode403AIS getCode() {
		return code;
	}

	public void setCode(MessageCode403AIS code) {
		this.code = code;
	}

	public TppMessage403AIS code(MessageCode403AIS code) {
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

	public TppMessage403AIS path(String path) {
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

	public TppMessage403AIS text(String text) {
		this.text = text;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TppMessage403AIS {\n");

		sb.append("    category: ").append(ObjectUtil.toIndentedString(category)).append("\n");
		sb.append("    code: ").append(ObjectUtil.toIndentedString(code)).append("\n");
		sb.append("    path: ").append(ObjectUtil.toIndentedString(path)).append("\n");
		sb.append("    text: ").append(ObjectUtil.toIndentedString(text)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	
}