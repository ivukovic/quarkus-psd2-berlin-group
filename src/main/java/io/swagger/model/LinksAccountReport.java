package io.swagger.model;

import java.util.HashMap;

import javax.validation.constraints.NotNull;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LinksAccountReport extends HashMap<String, HrefType> {

	@Schema(required = true, description = "")
	private HrefType account = null;

	@Schema(description = "")
	private HrefType first = null;

	@Schema(description = "")
	private HrefType next = null;

	@Schema(description = "")
	private HrefType previous = null;

	@Schema(description = "")
	private HrefType last = null;

	/**
	  * Get account
	  * @return account
	 **/
	@JsonProperty("account")
	@NotNull
	public HrefType getAccount() {
		return account;
	}

	public void setAccount(HrefType account) {
		this.account = account;
	}

	public LinksAccountReport account(HrefType account) {
		this.account = account;
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

	public LinksAccountReport first(HrefType first) {
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

	public LinksAccountReport next(HrefType next) {
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

	public LinksAccountReport previous(HrefType previous) {
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

	public LinksAccountReport last(HrefType last) {
		this.last = last;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LinksAccountReport {\n");
		sb.append("    ").append(toIndentedString(super.toString())).append("\n");
		sb.append("    account: ").append(toIndentedString(account)).append("\n");
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
