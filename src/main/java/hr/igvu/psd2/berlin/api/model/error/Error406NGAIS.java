package hr.igvu.psd2.berlin.api.model.error; import java.util.List;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import hr.igvu.psd2.berlin.api.model.LinksAll;
import hr.igvu.psd2.berlin.api.model.msg.TppMessage406AIS;
import hr.igvu.psd2.util.ObjectUtil;

/**
  * NextGenPSD2 specific definition of reporting error information in case of a HTTP error code 406. 
 **/
@Schema(description = "NextGenPSD2 specific definition of reporting error information in case of a HTTP error code 406. ")
public class Error406NGAIS {

	@Schema(description = "")
	private List<TppMessage406AIS> tppMessages = null;

	@Schema(description = "")
	private LinksAll _links = null;

	/**
	  * Get tppMessages
	  * @return tppMessages
	 **/
	@JsonProperty("tppMessages")
	public List<TppMessage406AIS> getTppMessages() {
		return tppMessages;
	}

	public void setTppMessages(List<TppMessage406AIS> tppMessages) {
		this.tppMessages = tppMessages;
	}

	public Error406NGAIS tppMessages(List<TppMessage406AIS> tppMessages) {
		this.tppMessages = tppMessages;
		return this;
	}

	public Error406NGAIS addTppMessagesItem(TppMessage406AIS tppMessagesItem) {
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

	public Error406NGAIS _links(LinksAll _links) {
		this._links = _links;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Error406NGAIS {\n");

		sb.append("    tppMessages: ").append(ObjectUtil.toIndentedString(tppMessages)).append("\n");
		sb.append("    _links: ").append(ObjectUtil.toIndentedString(_links)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	
}