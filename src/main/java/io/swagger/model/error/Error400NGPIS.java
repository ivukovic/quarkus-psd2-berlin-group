package io.swagger.model.error;

import io.swagger.util.ObjectUtil;

import java.util.List;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.model.LinksAll;
import io.swagger.model.msg.TppMessage400PIS;

/**
  * NextGenPSD2 specific definition of reporting error information in case of a HTTP error code 400. 
 **/
@Schema(description = "NextGenPSD2 specific definition of reporting error information in case of a HTTP error code 400. ")
public class Error400NGPIS {

	@Schema(description = "")
	private List<TppMessage400PIS> tppMessages = null;

	@Schema(description = "")
	private LinksAll _links = null;

	/**
	  * Get tppMessages
	  * @return tppMessages
	 **/
	@JsonProperty("tppMessages")
	public List<TppMessage400PIS> getTppMessages() {
		return tppMessages;
	}

	public void setTppMessages(List<TppMessage400PIS> tppMessages) {
		this.tppMessages = tppMessages;
	}

	public Error400NGPIS tppMessages(List<TppMessage400PIS> tppMessages) {
		this.tppMessages = tppMessages;
		return this;
	}

	public Error400NGPIS addTppMessagesItem(TppMessage400PIS tppMessagesItem) {
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

	public Error400NGPIS _links(LinksAll _links) {
		this._links = _links;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Error400NGPIS {\n");

		sb.append("    tppMessages: ").append(ObjectUtil.toIndentedString(tppMessages)).append("\n");
		sb.append("    _links: ").append(ObjectUtil.toIndentedString(_links)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
