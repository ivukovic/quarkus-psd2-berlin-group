package io.swagger.model;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Standardised definition of reporting error information according to [RFC7807]  in case of a HTTP error code 404 for PIIS. 
 **/
@Schema(description = "Standardised definition of reporting error information according to [RFC7807]  in case of a HTTP error code 404 for PIIS. ")
public class Error404PIIS {

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
	private MessageCode404PIIS code = null;

	@Schema(description = "Array of Error Information Blocks.  Might be used if more than one error is to be communicated ")
	/**
	  * Array of Error Information Blocks.  Might be used if more than one error is to be communicated   
	 **/
	private List<Error404PIISAdditionalErrors> additionalErrors = null;

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

	public Error404PIIS type(String type) {
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

	public Error404PIIS title(String title) {
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

	public Error404PIIS detail(String detail) {
		this.detail = detail;
		return this;
	}

	/**
	  * Get code
	  * @return code
	 **/
	@JsonProperty("code")
	@NotNull
	public MessageCode404PIIS getCode() {
		return code;
	}

	public void setCode(MessageCode404PIIS code) {
		this.code = code;
	}

	public Error404PIIS code(MessageCode404PIIS code) {
		this.code = code;
		return this;
	}

	/**
	  * Array of Error Information Blocks.  Might be used if more than one error is to be communicated 
	  * @return additionalErrors
	 **/
	@JsonProperty("additionalErrors")
	public List<Error404PIISAdditionalErrors> getAdditionalErrors() {
		return additionalErrors;
	}

	public void setAdditionalErrors(List<Error404PIISAdditionalErrors> additionalErrors) {
		this.additionalErrors = additionalErrors;
	}

	public Error404PIIS additionalErrors(List<Error404PIISAdditionalErrors> additionalErrors) {
		this.additionalErrors = additionalErrors;
		return this;
	}

	public Error404PIIS addAdditionalErrorsItem(Error404PIISAdditionalErrors additionalErrorsItem) {
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

	public Error404PIIS _links(LinksAll _links) {
		this._links = _links;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Error404PIIS {\n");

		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
		sb.append("    code: ").append(toIndentedString(code)).append("\n");
		sb.append("    additionalErrors: ").append(toIndentedString(additionalErrors)).append("\n");
		sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
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
