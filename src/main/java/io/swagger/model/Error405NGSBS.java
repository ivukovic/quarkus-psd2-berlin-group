package io.swagger.model;

import java.util.List;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * NextGenPSD2 specific definition of reporting error information in case of a HTTP error code 401. 
 **/
@Schema(description = "NextGenPSD2 specific definition of reporting error information in case of a HTTP error code 401. ")
public class Error405NGSBS {

	@Schema(description = "")
	private List<TppMessage405SBS> tppMessages = null;

	@Schema(description = "")
	private LinksAll _links = null;

	/**
	  * Get tppMessages
	  * @return tppMessages
	 **/
	@JsonProperty("tppMessages")
	public List<TppMessage405SBS> getTppMessages() {
		return tppMessages;
	}

	public void setTppMessages(List<TppMessage405SBS> tppMessages) {
		this.tppMessages = tppMessages;
	}

	public Error405NGSBS tppMessages(List<TppMessage405SBS> tppMessages) {
		this.tppMessages = tppMessages;
		return this;
	}

	public Error405NGSBS addTppMessagesItem(TppMessage405SBS tppMessagesItem) {
		this.tppMessages.add(tppMessagesItem);
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

	public Error405NGSBS _links(LinksAll _links) {
		this._links = _links;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Error405NGSBS {\n");

		sb.append("    tppMessages: ").append(toIndentedString(tppMessages)).append("\n");
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
