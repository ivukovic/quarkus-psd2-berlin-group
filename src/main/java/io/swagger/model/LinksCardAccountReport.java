package io.swagger.model;

import java.util.HashMap;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LinksCardAccountReport extends HashMap<String, HrefType> {

	@Schema(description = "")
	private HrefType cardAccount = null;

	@Schema(description = "")
	private HrefType card = null;

	@Schema(description = "")
	private HrefType first = null;

	@Schema(description = "")
	private HrefType next = null;

	@Schema(description = "")
	private HrefType previous = null;

	@Schema(description = "")
	private HrefType last = null;

	/**
	  * Get cardAccount
	  * @return cardAccount
	 **/
	@JsonProperty("cardAccount")
	public HrefType getCardAccount() {
		return cardAccount;
	}

	public void setCardAccount(HrefType cardAccount) {
		this.cardAccount = cardAccount;
	}

	public LinksCardAccountReport cardAccount(HrefType cardAccount) {
		this.cardAccount = cardAccount;
		return this;
	}

	/**
	  * Get card
	  * @return card
	 **/
	@JsonProperty("card")
	public HrefType getCard() {
		return card;
	}

	public void setCard(HrefType card) {
		this.card = card;
	}

	public LinksCardAccountReport card(HrefType card) {
		this.card = card;
		return this;
	}

	/**
	  * Get first
	  * @return first
	 **/
	@JsonProperty("first")
	public HrefType getFirst() {
		return first;
	}

	public void setFirst(HrefType first) {
		this.first = first;
	}

	public LinksCardAccountReport first(HrefType first) {
		this.first = first;
		return this;
	}

	/**
	  * Get next
	  * @return next
	 **/
	@JsonProperty("next")
	public HrefType getNext() {
		return next;
	}

	public void setNext(HrefType next) {
		this.next = next;
	}

	public LinksCardAccountReport next(HrefType next) {
		this.next = next;
		return this;
	}

	/**
	  * Get previous
	  * @return previous
	 **/
	@JsonProperty("previous")
	public HrefType getPrevious() {
		return previous;
	}

	public void setPrevious(HrefType previous) {
		this.previous = previous;
	}

	public LinksCardAccountReport previous(HrefType previous) {
		this.previous = previous;
		return this;
	}

	/**
	  * Get last
	  * @return last
	 **/
	@JsonProperty("last")
	public HrefType getLast() {
		return last;
	}

	public void setLast(HrefType last) {
		this.last = last;
	}

	public LinksCardAccountReport last(HrefType last) {
		this.last = last;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LinksCardAccountReport {\n");
		sb.append("    ").append(toIndentedString(super.toString())).append("\n");
		sb.append("    cardAccount: ").append(toIndentedString(cardAccount)).append("\n");
		sb.append("    card: ").append(toIndentedString(card)).append("\n");
		sb.append("    first: ").append(toIndentedString(first)).append("\n");
		sb.append("    next: ").append(toIndentedString(next)).append("\n");
		sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
		sb.append("    last: ").append(toIndentedString(last)).append("\n");
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
