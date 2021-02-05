package hr.igvu.psd2.berlin.api.model.error; import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import hr.igvu.psd2.berlin.api.model.LinksAll;
import hr.igvu.psd2.berlin.api.model.msgcode.MessageCode405PIS;
import hr.igvu.psd2.util.ObjectUtil;

/**
  * Standardised definition of reporting error information according to [RFC7807]  in case of a HTTP error code 405 for PIS. 
 **/
@Schema(description = "Standardised definition of reporting error information according to [RFC7807]  in case of a HTTP error code 405 for PIS. ")
public class Error405PIS {

	@Schema(required = true, description = "A URI reference [RFC3986] that identifies the problem type.  Remark For Future: These URI will be provided by NextGenPSD2 in future. ")
	/**
	  * A URI reference [RFC3986] that identifies the problem type.  Remark For Future: These URI will be provided by NextGenPSD2 in future.   
	 **/
	private String type = null;

	@Schema(description = "Short human readable description of error type.  Could be in local language.  To be provided by ASPSPs. ")
	/**
	  * Short human readable description of error type.  Could be in local language.  To be provided by ASPSPs.   
	 **/
	private String title = null;

	@Schema(description = "Detailed human readable text specific to this instance of the error.  XPath might be used to point to the issue generating the error in addition. Remark for Future: In future, a dedicated field might be introduced for the XPath. ")
	/**
	  * Detailed human readable text specific to this instance of the error.  XPath might be used to point to the issue generating the error in addition. Remark for Future: In future, a dedicated field might be introduced for the XPath.   
	 **/
	private String detail = null;

	@Schema(required = true, description = "")
	private MessageCode405PIS code = null;

	@Schema(description = "Array of Error Information Blocks.  Might be used if more than one error is to be communicated ")
	/**
	  * Array of Error Information Blocks.  Might be used if more than one error is to be communicated   
	 **/
	private List<Error405PISAdditionalErrors> additionalErrors = null;

	@Schema(description = "")
	private LinksAll _links = null;

	/**
	  * A URI reference [RFC3986] that identifies the problem type.  Remark For Future: These URI will be provided by NextGenPSD2 in future. 
	  * @return type
	 **/
	@JsonProperty("type")
	@NotNull
	@Size(max = 70)
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Error405PIS type(String type) {
		this.type = type;
		return this;
	}

	/**
	  * Short human readable description of error type.  Could be in local language.  To be provided by ASPSPs. 
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

	public Error405PIS title(String title) {
		this.title = title;
		return this;
	}

	/**
	  * Detailed human readable text specific to this instance of the error.  XPath might be used to point to the issue generating the error in addition. Remark for Future: In future, a dedicated field might be introduced for the XPath. 
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

	public Error405PIS detail(String detail) {
		this.detail = detail;
		return this;
	}

	/**
	  * Get code
	  * @return code
	 **/
	@JsonProperty("code")
	@NotNull
	public MessageCode405PIS getCode() {
		return code;
	}

	public void setCode(MessageCode405PIS code) {
		this.code = code;
	}

	public Error405PIS code(MessageCode405PIS code) {
		this.code = code;
		return this;
	}

	/**
	  * Array of Error Information Blocks.  Might be used if more than one error is to be communicated 
	  * @return additionalErrors
	 **/
	@JsonProperty("additionalErrors")
	public List<Error405PISAdditionalErrors> getAdditionalErrors() {
		return additionalErrors;
	}

	public void setAdditionalErrors(List<Error405PISAdditionalErrors> additionalErrors) {
		this.additionalErrors = additionalErrors;
	}

	public Error405PIS additionalErrors(List<Error405PISAdditionalErrors> additionalErrors) {
		this.additionalErrors = additionalErrors;
		return this;
	}

	public Error405PIS addAdditionalErrorsItem(Error405PISAdditionalErrors additionalErrorsItem) {
		this.additionalErrors.add(additionalErrorsItem);
		return this;
	}

	/**
	  * Get _links
	  * @return _links
	 **/
	@JsonProperty("_links")
	public LinksAll getLinks() {
		return _links;
	}

	public void setLinks(LinksAll _links) {
		this._links = _links;
	}

	public Error405PIS _links(LinksAll _links) {
		this._links = _links;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Error405PIS {\n");

		sb.append("    type: ").append(ObjectUtil.toIndentedString(type)).append("\n");
		sb.append("    title: ").append(ObjectUtil.toIndentedString(title)).append("\n");
		sb.append("    detail: ").append(ObjectUtil.toIndentedString(detail)).append("\n");
		sb.append("    code: ").append(ObjectUtil.toIndentedString(code)).append("\n");
		sb.append("    additionalErrors: ").append(ObjectUtil.toIndentedString(additionalErrors)).append("\n");
		sb.append("    _links: ").append(ObjectUtil.toIndentedString(_links)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	
}
