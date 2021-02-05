package hr.igvu.psd2.berlin.api.model.error; import java.util.List;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import hr.igvu.psd2.berlin.api.model.LinksAll;
import hr.igvu.psd2.berlin.api.model.msg.TppMessage400AIS;
import hr.igvu.psd2.util.ObjectUtil;

/**
  * NextGenPSD2 specific definition of reporting error information in case of a HTTP error code 400. 
 **/
@Schema(description = "NextGenPSD2 specific definition of reporting error information in case of a HTTP error code 400. ")
public class Error400NGAIS {

	@Schema(description = "")
	private List<TppMessage400AIS> tppMessages = null;

	@Schema(description = "")
	private LinksAll _links = null;

	/**
	  * Get tppMessages
	  * @return tppMessages
	 **/
	@JsonProperty("tppMessages")
	public List<TppMessage400AIS> getTppMessages() {
		return tppMessages;
	}

	public void setTppMessages(List<TppMessage400AIS> tppMessages) {
		this.tppMessages = tppMessages;
	}

	public Error400NGAIS tppMessages(List<TppMessage400AIS> tppMessages) {
		this.tppMessages = tppMessages;
		return this;
	}

	public Error400NGAIS addTppMessagesItem(TppMessage400AIS tppMessagesItem) {
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

	public Error400NGAIS _links(LinksAll _links) {
		this._links = _links;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Error400NGAIS {\n");

		sb.append("    tppMessages: ").append(ObjectUtil.toIndentedString(tppMessages)).append("\n");
		sb.append("    _links: ").append(ObjectUtil.toIndentedString(_links)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	
}
