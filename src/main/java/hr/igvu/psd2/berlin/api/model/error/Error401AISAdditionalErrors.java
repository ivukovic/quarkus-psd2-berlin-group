package hr.igvu.psd2.berlin.api.model.error; import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import hr.igvu.psd2.berlin.api.model.msgcode.MessageCode401AIS;
import hr.igvu.psd2.util.ObjectUtil;

/**
  * This is a data element to support the declaration of additional errors in the context of [RFC7807].
 **/
@Schema(description = "This is a data element to support the declaration of additional errors in the context of [RFC7807].")
public class Error401AISAdditionalErrors {

	@Schema(description = "")
	private String title = null;

	@Schema(description = "")
	private String detail = null;

	@Schema(required = true, description = "")
	private MessageCode401AIS code = null;

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

	public Error401AISAdditionalErrors title(String title) {
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

	public Error401AISAdditionalErrors detail(String detail) {
		this.detail = detail;
		return this;
	}

	/**
	  * Get code
	  * @return code
	 **/
	@JsonProperty("code")
	@NotNull
	public MessageCode401AIS getCode() {
		return code;
	}

	public void setCode(MessageCode401AIS code) {
		this.code = code;
	}

	public Error401AISAdditionalErrors code(MessageCode401AIS code) {
		this.code = code;
		return this;
	}

	

	
}
