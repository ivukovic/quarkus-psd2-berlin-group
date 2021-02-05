package hr.igvu.psd2.berlin.api.model.error; import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import hr.igvu.psd2.berlin.api.model.msgcode.MessageCode405AIS;
import hr.igvu.psd2.util.ObjectUtil;

/**
  * This is a data element to support the declaration of additional errors in the context of [RFC7807].
 **/
@Schema(description = "This is a data element to support the declaration of additional errors in the context of [RFC7807].")
public class Error405AISAdditionalErrors {

	@Schema(description = "")
	private String title = null;

	@Schema(description = "")
	private String detail = null;

	@Schema(required = true, description = "")
	private MessageCode405AIS code = null;

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

	public Error405AISAdditionalErrors title(String title) {
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

	public Error405AISAdditionalErrors detail(String detail) {
		this.detail = detail;
		return this;
	}

	/**
	  * Get code
	  * @return code
	 **/
	@JsonProperty("code")
	@NotNull
	public MessageCode405AIS getCode() {
		return code;
	}

	public void setCode(MessageCode405AIS code) {
		this.code = code;
	}

	public Error405AISAdditionalErrors code(MessageCode405AIS code) {
		this.code = code;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Error405AISAdditionalErrors {\n");

		sb.append("    title: ").append(ObjectUtil.toIndentedString(title)).append("\n");
		sb.append("    detail: ").append(ObjectUtil.toIndentedString(detail)).append("\n");
		sb.append("    code: ").append(ObjectUtil.toIndentedString(code)).append("\n");
		sb.append("}");
		return sb.toString();
	}


}
