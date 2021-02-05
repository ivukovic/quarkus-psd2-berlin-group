package io.swagger.model;

import java.util.HashMap;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.util.ObjectUtil;

/**
  * A list of hyperlinks to be recognised by the TPP.  Links of type \"account\" and/or \"cardAccount\", depending on the nature of the consent. 
 **/
@Schema(description = "A list of hyperlinks to be recognised by the TPP.  Links of type \"account\" and/or \"cardAccount\", depending on the nature of the consent. ")
public class LinksGetConsent extends HashMap<String, HrefType> {

	@Schema(description = "")
	private HrefType account = null;

	@Schema(description = "")
	private HrefType cardAccount = null;

	/**
	  * Get account
	  * @return account
	 **/
	@JsonProperty("account")
	public HrefType getAccount() {
		return account;
	}

	public void setAccount(HrefType account) {
		this.account = account;
	}

	public LinksGetConsent account(HrefType account) {
		this.account = account;
		return this;
	}

	/**
	  * Get cardAccount
	  * @return cardAccount
	 **/
	@JsonProperty("card-account")
	public HrefType getCardAccount() {
		return cardAccount;
	}

	public void setCardAccount(HrefType cardAccount) {
		this.cardAccount = cardAccount;
	}

	public LinksGetConsent cardAccount(HrefType cardAccount) {
		this.cardAccount = cardAccount;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LinksGetConsent {\n");
		sb.append("    ").append(ObjectUtil.toIndentedString(super.toString())).append("\n");
		sb.append("    account: ").append(ObjectUtil.toIndentedString(account)).append("\n");
		sb.append("    cardAccount: ").append(ObjectUtil.toIndentedString(cardAccount)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
