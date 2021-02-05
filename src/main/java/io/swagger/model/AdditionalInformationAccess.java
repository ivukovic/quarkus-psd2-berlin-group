package io.swagger.model;

import java.util.List;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Optional if supported by API provider.  Is asking for additional information as added within this structured object. The usage of this data element requires at least one of the entries \"accounts\",  \"transactions\" or \"balances\" also to be contained in the object.  If detailed accounts are referenced, it is required in addition that any account addressed within  the additionalInformation attribute is also addressed by at least one of the attributes \"accounts\",  \"transactions\" or \"balances\". 
 **/
@Schema(description = "Optional if supported by API provider.  Is asking for additional information as added within this structured object. The usage of this data element requires at least one of the entries \"accounts\",  \"transactions\" or \"balances\" also to be contained in the object.  If detailed accounts are referenced, it is required in addition that any account addressed within  the additionalInformation attribute is also addressed by at least one of the attributes \"accounts\",  \"transactions\" or \"balances\". ")
public class AdditionalInformationAccess {

	@Schema(description = "Is asking for account owner name of the accounts referenced within.  If the array is empty in the request, the TPP is asking for the account  owner name of all accessible accounts.  This may be restricted in a PSU/ASPSP authorization dialogue.  If the array is empty, also the arrays for accounts, balances or transactions shall be empty, if used. The ASPSP will indicate in the consent resource after a successful authorisation,  whether the ownerName consent can be accepted by providing the accounts on which the ownerName will  be delivered.  This array can be empty. ")
	/**
	  * Is asking for account owner name of the accounts referenced within.  If the array is empty in the request, the TPP is asking for the account  owner name of all accessible accounts.  This may be restricted in a PSU/ASPSP authorization dialogue.  If the array is empty, also the arrays for accounts, balances or transactions shall be empty, if used. The ASPSP will indicate in the consent resource after a successful authorisation,  whether the ownerName consent can be accepted by providing the accounts on which the ownerName will  be delivered.  This array can be empty.   
	 **/
	private List<AccountReference> ownerName = null;

	@Schema(description = "Optional if supported by API provider. Is asking for the trusted beneficiaries related to the accounts referenced within and related to the PSU. If the array is empty in the request, the TPP is asking for the lists of trusted beneficiaries of all accessible accounts.  This may be restricted in a PSU/ASPSP authorization dialogue by the PSU if also the account lists addressed  by the tags “accounts”, “balances” or “transactions” are empty. The ASPSP will indicate in the consent resource after a successful authorisation,  whether the trustedBeneficiaries consent can be accepted by providing the accounts on which the list of trusted beneficiaries will be delivered.  This array can be empty. ")
	/**
	  * Optional if supported by API provider. Is asking for the trusted beneficiaries related to the accounts referenced within and related to the PSU. If the array is empty in the request, the TPP is asking for the lists of trusted beneficiaries of all accessible accounts.  This may be restricted in a PSU/ASPSP authorization dialogue by the PSU if also the account lists addressed  by the tags “accounts”, “balances” or “transactions” are empty. The ASPSP will indicate in the consent resource after a successful authorisation,  whether the trustedBeneficiaries consent can be accepted by providing the accounts on which the list of trusted beneficiaries will be delivered.  This array can be empty.   
	 **/
	private List<AccountReference> trustedBeneficiaries = null;

	/**
	  * Is asking for account owner name of the accounts referenced within.  If the array is empty in the request, the TPP is asking for the account  owner name of all accessible accounts.  This may be restricted in a PSU/ASPSP authorization dialogue.  If the array is empty, also the arrays for accounts, balances or transactions shall be empty, if used. The ASPSP will indicate in the consent resource after a successful authorisation,  whether the ownerName consent can be accepted by providing the accounts on which the ownerName will  be delivered.  This array can be empty. 
	  * @return ownerName
	 **/
	@JsonProperty("ownerName")
	public List<AccountReference> getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(List<AccountReference> ownerName) {
		this.ownerName = ownerName;
	}

	public AdditionalInformationAccess ownerName(List<AccountReference> ownerName) {
		this.ownerName = ownerName;
		return this;
	}

	public AdditionalInformationAccess addOwnerNameItem(AccountReference ownerNameItem) {
		this.ownerName.add(ownerNameItem);
		return this;
	}

	/**
	  * Optional if supported by API provider. Is asking for the trusted beneficiaries related to the accounts referenced within and related to the PSU. If the array is empty in the request, the TPP is asking for the lists of trusted beneficiaries of all accessible accounts.  This may be restricted in a PSU/ASPSP authorization dialogue by the PSU if also the account lists addressed  by the tags “accounts”, “balances” or “transactions” are empty. The ASPSP will indicate in the consent resource after a successful authorisation,  whether the trustedBeneficiaries consent can be accepted by providing the accounts on which the list of trusted beneficiaries will be delivered.  This array can be empty. 
	  * @return trustedBeneficiaries
	 **/
	@JsonProperty("trustedBeneficiaries")
	public List<AccountReference> getTrustedBeneficiaries() {
		return trustedBeneficiaries;
	}

	public void setTrustedBeneficiaries(List<AccountReference> trustedBeneficiaries) {
		this.trustedBeneficiaries = trustedBeneficiaries;
	}

	public AdditionalInformationAccess trustedBeneficiaries(List<AccountReference> trustedBeneficiaries) {
		this.trustedBeneficiaries = trustedBeneficiaries;
		return this;
	}

	public AdditionalInformationAccess addTrustedBeneficiariesItem(AccountReference trustedBeneficiariesItem) {
		this.trustedBeneficiaries.add(trustedBeneficiariesItem);
		return this;
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
	private static String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
