package io.swagger.model.error; import io.swagger.util.ObjectUtil;

import java.util.List;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.model.LinksAll;
import io.swagger.model.msg.TppMessage401PIIS;

/**
  * NextGenPSD2 specific definition of reporting error information in case of a HTTP error code 401. 
 **/
@Schema(description = "NextGenPSD2 specific definition of reporting error information in case of a HTTP error code 401. ")
public class Error401NGPIIS {

	@Schema(description = "")
	private List<TppMessage401PIIS> tppMessages = null;

	@Schema(description = "")
	private LinksAll _links = null;

	/**
	  * Get tppMessages
	  * @return tppMessages
	 **/
	@JsonProperty("tppMessages")
	public List<TppMessage401PIIS> getTppMessages() {
		return tppMessages;
	}

	public void setTppMessages(List<TppMessage401PIIS> tppMessages) {
		this.tppMessages = tppMessages;
	}

	public Error401NGPIIS tppMessages(List<TppMessage401PIIS> tppMessages) {
		this.tppMessages = tppMessages;
		return this;
	}

	public Error401NGPIIS addTppMessagesItem(TppMessage401PIIS tppMessagesItem) {
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

	public Error401NGPIIS _links(LinksAll _links) {
		this._links = _links;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Error401NGPIIS {\n");

		sb.append("    tppMessages: ").append(ObjectUtil.toIndentedString(tppMessages)).append("\n");
		sb.append("    _links: ").append(ObjectUtil.toIndentedString(_links)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	
}
