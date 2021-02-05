package io.swagger.model.error; import io.swagger.util.ObjectUtil;

import java.util.List;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.model.LinksAll;
import io.swagger.model.msg.TppMessage405AIS;

/**
  * NextGenPSD2 specific definition of reporting error information in case of a HTTP error code 401. 
 **/
@Schema(description = "NextGenPSD2 specific definition of reporting error information in case of a HTTP error code 401. ")
public class Error405NGAIS {

	@Schema(description = "")
	private List<TppMessage405AIS> tppMessages = null;

	@Schema(description = "")
	private LinksAll _links = null;

	/**
	  * Get tppMessages
	  * @return tppMessages
	 **/
	@JsonProperty("tppMessages")
	public List<TppMessage405AIS> getTppMessages() {
		return tppMessages;
	}

	public void setTppMessages(List<TppMessage405AIS> tppMessages) {
		this.tppMessages = tppMessages;
	}

	public Error405NGAIS tppMessages(List<TppMessage405AIS> tppMessages) {
		this.tppMessages = tppMessages;
		return this;
	}

	public Error405NGAIS addTppMessagesItem(TppMessage405AIS tppMessagesItem) {
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

	public Error405NGAIS _links(LinksAll _links) {
		this._links = _links;
		return this;
	}


	
}
