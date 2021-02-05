package hr.igvu.psd2.berlin.api.model;

import javax.validation.constraints.NotNull;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import hr.igvu.psd2.util.ObjectUtil;

/**
  * JSON based account report. This account report contains transactions resulting from the query parameters.  'booked' shall be contained if bookingStatus parameter is set to \"booked\" or \"both\".  'pending' is not contained if the bookingStatus parameter is set to \"booked\" or \"information\".  'information' Only contained if the bookingStatus is set to \"information\" and if supported by ASPSP. 
 **/
@Schema(description = "JSON based account report. This account report contains transactions resulting from the query parameters.  'booked' shall be contained if bookingStatus parameter is set to \"booked\" or \"both\".  'pending' is not contained if the bookingStatus parameter is set to \"booked\" or \"information\".  'information' Only contained if the bookingStatus is set to \"information\" and if supported by ASPSP. ")
public class AccountReport {

	@Schema(description = "")
	private TransactionList booked = null;

	@Schema(description = "")
	private TransactionList pending = null;

	@Schema(description = "")
	private TransactionList information = null;

	@Schema(required = true, description = "")
	private LinksAccountReport _links = null;

	/**
	  * Get booked
	  * @return booked
	 **/
	@JsonProperty("booked")
	public TransactionList getBooked() {
		return booked;
	}

	public void setBooked(TransactionList booked) {
		this.booked = booked;
	}

	public AccountReport booked(TransactionList booked) {
		this.booked = booked;
		return this;
	}

	/**
	  * Get pending
	  * @return pending
	 **/
	@JsonProperty("pending")
	public TransactionList getPending() {
		return pending;
	}

	public void setPending(TransactionList pending) {
		this.pending = pending;
	}

	public AccountReport pending(TransactionList pending) {
		this.pending = pending;
		return this;
	}

	/**
	  * Get information
	  * @return information
	 **/
	@JsonProperty("information")
	public TransactionList getInformation() {
		return information;
	}

	public void setInformation(TransactionList information) {
		this.information = information;
	}

	public AccountReport information(TransactionList information) {
		this.information = information;
		return this;
	}

	/**
	  * Get _links
	  * @return _links
	 **/
	@JsonProperty("_links")
	@NotNull
	public LinksAccountReport getLinks() {
		return _links;
	}

	public void setLinks(LinksAccountReport _links) {
		this._links = _links;
	}

	public AccountReport _links(LinksAccountReport _links) {
		this._links = _links;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AccountReport {\n");

		sb.append("    booked: ").append(ObjectUtil.toIndentedString(booked)).append("\n");
		sb.append("    pending: ").append(ObjectUtil.toIndentedString(pending)).append("\n");
		sb.append("    information: ").append(ObjectUtil.toIndentedString(information)).append("\n");
		sb.append("    _links: ").append(ObjectUtil.toIndentedString(_links)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
