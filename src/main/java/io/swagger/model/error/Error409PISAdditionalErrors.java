package io.swagger.model.error; import io.swagger.util.ObjectUtil;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.model.msgcode.MessageCode409PIS;

/**
  * This is a data element to support the declaration of additional errors in the context of [RFC7807].
 **/
@Schema(description = "This is a data element to support the declaration of additional errors in the context of [RFC7807].")
public class Error409PISAdditionalErrors {

	@Schema(description = "")
	private String title = null;

	@Schema(description = "")
	private String detail = null;

	@Schema(required = true, description = "")
	private MessageCode409PIS code = null;

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

	public Error409PISAdditionalErrors title(String title) {
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

	public Error409PISAdditionalErrors detail(String detail) {
		this.detail = detail;
		return this;
	}

	/**
	  * Get code
	  * @return code
	 **/
	@JsonProperty("code")
	@NotNull
	public MessageCode409PIS getCode() {
		return code;
	}

	public void setCode(MessageCode409PIS code) {
		this.code = code;
	}

	public Error409PISAdditionalErrors code(MessageCode409PIS code) {
		this.code = code;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Error409PISAdditionalErrors {\n");

		sb.append("    title: ").append(ObjectUtil.toIndentedString(title)).append("\n");
		sb.append("    detail: ").append(ObjectUtil.toIndentedString(detail)).append("\n");
		sb.append("    code: ").append(ObjectUtil.toIndentedString(code)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	
}
