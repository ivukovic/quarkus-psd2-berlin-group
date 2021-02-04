package io.swagger.model;

import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * This is the overall lifecycle status of the consent.  Valid values are:   - &#x27;received&#x27;: The consent data have been received and are technically correct.      The data is not authorised yet.   - &#x27;rejected&#x27;: The consent data have been rejected e.g. since no successful authorisation has taken place.   - &#x27;valid&#x27;: The consent is accepted and valid for GET account data calls and others as specified in the consent object.   - &#x27;revokedByPsu&#x27;: The consent has been revoked by the PSU towards the ASPSP.   - &#x27;expired&#x27;: The consent expired.   - &#x27;terminatedByTpp&#x27;: The corresponding TPP has terminated the consent by applying the DELETE method to the consent resource.   - &#x27;partiallyAuthorised&#x27;: The consent is due to a multi-level authorisation, some but not all mandated authorisations have been performed yet.  The ASPSP might add further codes. These codes then shall be contained in the ASPSP&#x27;s documentation of the XS2A interface  and has to be added to this API definition as well. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * This is the overall lifecycle status of the consent.  Valid values are:   - &#x27;received&#x27;: The consent data have been received and are technically correct.      The data is not authorised yet.   - &#x27;rejected&#x27;: The consent data have been rejected e.g. since no successful authorisation has taken place.   - &#x27;valid&#x27;: The consent is accepted and valid for GET account data calls and others as specified in the consent object.   - &#x27;revokedByPsu&#x27;: The consent has been revoked by the PSU towards the ASPSP.   - &#x27;expired&#x27;: The consent expired.   - &#x27;terminatedByTpp&#x27;: The corresponding TPP has terminated the consent by applying the DELETE method to the consent resource.   - &#x27;partiallyAuthorised&#x27;: The consent is due to a multi-level authorisation, some but not all mandated authorisations have been performed yet.  The ASPSP might add further codes. These codes then shall be contained in the ASPSP&#x27;s documentation of the XS2A interface  and has to be added to this API definition as well. 
 */
public enum ConsentStatus {
  RECEIVED("received"),
    REJECTED("rejected"),
    VALID("valid"),
    REVOKEDBYPSU("revokedByPsu"),
    EXPIRED("expired"),
    TERMINATEDBYTPP("terminatedByTpp"),
    PARTIALLYAUTHORISED("partiallyAuthorised");

  private String value;

  ConsentStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ConsentStatus fromValue(String text) {
    for (ConsentStatus b : ConsentStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
