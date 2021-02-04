package io.swagger.model;

import io.swagger.model.HrefType;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * A list of hyperlinks to be recognised by the TPP.  Links of type \&quot;account\&quot; and/or \&quot;cardAccount\&quot;, depending on the nature of the consent. 
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "A list of hyperlinks to be recognised by the TPP.  Links of type \"account\" and/or \"cardAccount\", depending on the nature of the consent. ")

public class LinksGetConsent extends HashMap<String, HrefType>  {
  private @Valid HrefType account = null;
  private @Valid HrefType cardAccount = null;

  /**
   **/
  public LinksGetConsent account(HrefType account) {
    this.account = account;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("account")

  public HrefType getAccount() {
    return account;
  }
  public void setAccount(HrefType account) {
    this.account = account;
  }

  /**
   **/
  public LinksGetConsent cardAccount(HrefType cardAccount) {
    this.cardAccount = cardAccount;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("card-account")

  public HrefType getCardAccount() {
    return cardAccount;
  }
  public void setCardAccount(HrefType cardAccount) {
    this.cardAccount = cardAccount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinksGetConsent _linksGetConsent = (LinksGetConsent) o;
    return Objects.equals(account, _linksGetConsent.account) &&
        Objects.equals(cardAccount, _linksGetConsent.cardAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, cardAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinksGetConsent {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    cardAccount: ").append(toIndentedString(cardAccount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
