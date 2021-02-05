package io.swagger.model.error; import io.swagger.util.ObjectUtil;

import java.util.List;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.model.LinksAll;
import io.swagger.model.msg.TppMessage404SBS;

/**
  * NextGenPSD2 specific definition of reporting error information in case of a HTTP error code 404. 
 **/
@Schema(description = "NextGenPSD2 specific definition of reporting error information in case of a HTTP error code 404. ")
public class Error404NGSBS {

	@Schema(description = "")
	private List<TppMessage404SBS> tppMessages = null;

	@Schema(description = "")
	private LinksAll _links = null;

	/**
	  * Get tppMessages
	  * @return tppMessages
	 **/
	@JsonProperty("tppMessages")
	public List<TppMessage404SBS> getTppMessages() {
		return tppMessages;
	}

	public void setTppMessages(List<TppMessage404SBS> tppMessages) {
		this.tppMessages = tppMessages;
	}

	public Error404NGSBS tppMessages(List<TppMessage404SBS> tppMessages) {
		this.tppMessages = tppMessages;
		return this;
	}

	public Error404NGSBS addTppMessagesItem(TppMessage404SBS tppMessagesItem) {
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

	public Error404NGSBS _links(LinksAll _links) {
		this._links = _links;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Error404NGSBS {\n");

		sb.append("    tppMessages: ").append(ObjectUtil.toIndentedString(tppMessages)).append("\n");
		sb.append("    _links: ").append(ObjectUtil.toIndentedString(_links)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	
}
