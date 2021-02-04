package io.swagger.model;

import io.swagger.model.AccountReference;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Optional if supported by API provider.  Is asking for additional information as added within this structured object. The usage of this data element requires at least one of the entries \&quot;accounts\&quot;,  \&quot;transactions\&quot; or \&quot;balances\&quot; also to be contained in the object.  If detailed accounts are referenced, it is required in addition that any account addressed within  the additionalInformation attribute is also addressed by at least one of the attributes \&quot;accounts\&quot;,  \&quot;transactions\&quot; or \&quot;balances\&quot;. 
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "Optional if supported by API provider.  Is asking for additional information as added within this structured object. The usage of this data element requires at least one of the entries \"accounts\",  \"transactions\" or \"balances\" also to be contained in the object.  If detailed accounts are referenced, it is required in addition that any account addressed within  the additionalInformation attribute is also addressed by at least one of the attributes \"accounts\",  \"transactions\" or \"balances\". ")

public class AdditionalInformationAccess   {
  private @Valid List<AccountReference> ownerName = new ArrayList<AccountReference>();
  private @Valid List<AccountReference> trustedBeneficiaries = new ArrayList<AccountReference>();

  /**
   * Is asking for account owner name of the accounts referenced within.  If the array is empty in the request, the TPP is asking for the account  owner name of all accessible accounts.  This may be restricted in a PSU/ASPSP authorization dialogue.  If the array is empty, also the arrays for accounts, balances or transactions shall be empty, if used. The ASPSP will indicate in the consent resource after a successful authorisation,  whether the ownerName consent can be accepted by providing the accounts on which the ownerName will  be delivered.  This array can be empty. 
   **/
  public AdditionalInformationAccess ownerName(List<AccountReference> ownerName) {
    this.ownerName = ownerName;
    return this;
  }

  
  @ApiModelProperty(value = "Is asking for account owner name of the accounts referenced within.  If the array is empty in the request, the TPP is asking for the account  owner name of all accessible accounts.  This may be restricted in a PSU/ASPSP authorization dialogue.  If the array is empty, also the arrays for accounts, balances or transactions shall be empty, if used. The ASPSP will indicate in the consent resource after a successful authorisation,  whether the ownerName consent can be accepted by providing the accounts on which the ownerName will  be delivered.  This array can be empty. ")
  @JsonProperty("ownerName")

  public List<AccountReference> getOwnerName() {
    return ownerName;
  }
  public void setOwnerName(List<AccountReference> ownerName) {
    this.ownerName = ownerName;
  }

  /**
   * Optional if supported by API provider. Is asking for the trusted beneficiaries related to the accounts referenced within and related to the PSU. If the array is empty in the request, the TPP is asking for the lists of trusted beneficiaries of all accessible accounts.  This may be restricted in a PSU/ASPSP authorization dialogue by the PSU if also the account lists addressed  by the tags “accounts”, “balances” or “transactions” are empty. The ASPSP will indicate in the consent resource after a successful authorisation,  whether the trustedBeneficiaries consent can be accepted by providing the accounts on which the list of trusted beneficiaries will be delivered.  This array can be empty. 
   **/
  public AdditionalInformationAccess trustedBeneficiaries(List<AccountReference> trustedBeneficiaries) {
    this.trustedBeneficiaries = trustedBeneficiaries;
    return this;
  }

  
  @ApiModelProperty(value = "Optional if supported by API provider. Is asking for the trusted beneficiaries related to the accounts referenced within and related to the PSU. If the array is empty in the request, the TPP is asking for the lists of trusted beneficiaries of all accessible accounts.  This may be restricted in a PSU/ASPSP authorization dialogue by the PSU if also the account lists addressed  by the tags “accounts”, “balances” or “transactions” are empty. The ASPSP will indicate in the consent resource after a successful authorisation,  whether the trustedBeneficiaries consent can be accepted by providing the accounts on which the list of trusted beneficiaries will be delivered.  This array can be empty. ")
  @JsonProperty("trustedBeneficiaries")

  public List<AccountReference> getTrustedBeneficiaries() {
    return trustedBeneficiaries;
  }
  public void setTrustedBeneficiaries(List<AccountReference> trustedBeneficiaries) {
    this.trustedBeneficiaries = trustedBeneficiaries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalInformationAccess additionalInformationAccess = (AdditionalInformationAccess) o;
    return Objects.equals(ownerName, additionalInformationAccess.ownerName) &&
        Objects.equals(trustedBeneficiaries, additionalInformationAccess.trustedBeneficiaries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerName, trustedBeneficiaries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalInformationAccess {\n");
    
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    trustedBeneficiaries: ").append(toIndentedString(trustedBeneficiaries)).append("\n");
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
