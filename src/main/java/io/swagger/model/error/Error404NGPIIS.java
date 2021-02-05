package io.swagger.model.error; import io.swagger.util.ObjectUtil;

import java.util.List;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.model.LinksAll;
import io.swagger.model.msg.TppMessage404PIIS;

/**
  * NextGenPSD2 specific definition of reporting error information in case of a HTTP error code 404. 
 **/
@Schema(description = "NextGenPSD2 specific definition of reporting error information in case of a HTTP error code 404. ")
public class Error404NGPIIS {

	@Schema(description = "")
	private List<TppMessage404PIIS> tppMessages = null;

	@Schema(description = "")
	private LinksAll _links = null;

	/**
	  * Get tppMessages
	  * @return tppMessages
	 **/
	@JsonProperty("tppMessages")
	public List<TppMessage404PIIS> getTppMessages() {
		return tppMessages;
	}

	public void setTppMessages(List<TppMessage404PIIS> tppMessages) {
		this.tppMessages = tppMessages;
	}

	public Error404NGPIIS tppMessages(List<TppMessage404PIIS> tppMessages) {
		this.tppMessages = tppMessages;
		return this;
	}

	public Error404NGPIIS addTppMessagesItem(TppMessage404PIIS tppMessagesItem) {
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

	public Error404NGPIIS _links(LinksAll _links) {
		this._links = _links;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Error404NGPIIS {\n");

		sb.append("    tppMessages: ").append(ObjectUtil.toIndentedString(tppMessages)).append("\n");
		sb.append("    _links: ").append(ObjectUtil.toIndentedString(_links)).append("\n");
		sb.append("}");
		return sb.toString();
	}


}