package io.swagger.model;

import javax.validation.constraints.NotNull;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.util.ObjectUtil;

/**
  * JSON based card account report.  This card account report contains transactions resulting from the query parameters. 
 **/
@Schema(description = "JSON based card account report.  This card account report contains transactions resulting from the query parameters. ")
public class CardAccountReport {

	@Schema(required = true, description = "")
	private CardTransactionList booked = null;

	@Schema(description = "")
	private CardTransactionList pending = null;

	@Schema(required = true, description = "")
	private LinksCardAccountReport _links = null;

	/**
	  * Get booked
	  * @return booked
	 **/
	@JsonProperty("booked")
	@NotNull
	public CardTransactionList getBooked() {
		return booked;
	}

	public void setBooked(CardTransactionList booked) {
		this.booked = booked;
	}

	public CardAccountReport booked(CardTransactionList booked) {
		this.booked = booked;
		return this;
	}

	/**
	  * Get pending
	  * @return pending
	 **/
	@JsonProperty("pending")
	public CardTransactionList getPending() {
		return pending;
	}

	public void setPending(CardTransactionList pending) {
		this.pending = pending;
	}

	public CardAccountReport pending(CardTransactionList pending) {
		this.pending = pending;
		return this;
	}

	/**
	  * Get _links
	  * @return _links
	 **/
	@JsonProperty("_links")
	@NotNull
	public LinksCardAccountReport getLinks() {
		return _links;
	}

	public void setLinks(LinksCardAccountReport _links) {
		this._links = _links;
	}

	public CardAccountReport _links(LinksCardAccountReport _links) {
		this._links = _links;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CardAccountReport {\n");

		sb.append("    booked: ").append(ObjectUtil.toIndentedString(booked)).append("\n");
		sb.append("    pending: ").append(ObjectUtil.toIndentedString(pending)).append("\n");
		sb.append("    _links: ").append(ObjectUtil.toIndentedString(_links)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
