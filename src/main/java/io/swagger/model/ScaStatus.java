package io.swagger.model;

import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * This data element is containing information about the status of the SCA method applied.   The following codes are defined for this data type.    * &#x27;received&#x27;:     An authorisation or cancellation-authorisation resource has been created successfully.   * &#x27;psuIdentified&#x27;:     The PSU related to the authorisation or cancellation-authorisation resource has been identified.   * &#x27;psuAuthenticated&#x27;:     The PSU related to the authorisation or cancellation-authorisation resource has been identified and authenticated e.g. by a password or by an access token.   * &#x27;scaMethodSelected&#x27;:     The PSU/TPP has selected the related SCA routine.      If the SCA method is chosen implicitly since only one SCA method is available,      then this is the first status to be reported instead of &#x27;received&#x27;.   * &#x27;unconfirmed&#x27;:     SCA is technically successfully finalised by the PSU, but the authorisation resource needs a confirmation command by the TPP yet.    * &#x27;started&#x27;:     The addressed SCA routine has been started.   * &#x27;finalised&#x27;:     The SCA routine has been finalised successfully (including a potential confirmation command).      This is a final status of the authorisation resource.   * &#x27;failed&#x27;:     The SCA routine failed.     This is a final status of the authorisation resource.   * &#x27;exempted&#x27;:     SCA was exempted for the related transaction, the related authorisation is successful.     This is a final status of the authorisation resource. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * This data element is containing information about the status of the SCA method applied.   The following codes are defined for this data type.    * &#x27;received&#x27;:     An authorisation or cancellation-authorisation resource has been created successfully.   * &#x27;psuIdentified&#x27;:     The PSU related to the authorisation or cancellation-authorisation resource has been identified.   * &#x27;psuAuthenticated&#x27;:     The PSU related to the authorisation or cancellation-authorisation resource has been identified and authenticated e.g. by a password or by an access token.   * &#x27;scaMethodSelected&#x27;:     The PSU/TPP has selected the related SCA routine.      If the SCA method is chosen implicitly since only one SCA method is available,      then this is the first status to be reported instead of &#x27;received&#x27;.   * &#x27;unconfirmed&#x27;:     SCA is technically successfully finalised by the PSU, but the authorisation resource needs a confirmation command by the TPP yet.    * &#x27;started&#x27;:     The addressed SCA routine has been started.   * &#x27;finalised&#x27;:     The SCA routine has been finalised successfully (including a potential confirmation command).      This is a final status of the authorisation resource.   * &#x27;failed&#x27;:     The SCA routine failed.     This is a final status of the authorisation resource.   * &#x27;exempted&#x27;:     SCA was exempted for the related transaction, the related authorisation is successful.     This is a final status of the authorisation resource. 
 */
public enum ScaStatus {
  RECEIVED("received"),
    PSUIDENTIFIED("psuIdentified"),
    PSUAUTHENTICATED("psuAuthenticated"),
    SCAMETHODSELECTED("scaMethodSelected"),
    STARTED("started"),
    UNCONFIRMED("unconfirmed"),
    FINALISED("finalised"),
    FAILED("failed"),
    EXEMPTED("exempted");

  private String value;

  ScaStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ScaStatus fromValue(String text) {
    for (ScaStatus b : ScaStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
