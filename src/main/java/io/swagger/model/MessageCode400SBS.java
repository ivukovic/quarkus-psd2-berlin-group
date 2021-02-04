package io.swagger.model;

import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Message codes defined for signing baskets for HTTP Error code 400 (BAD_REQUEST).
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Message codes defined for signing baskets for HTTP Error code 400 (BAD_REQUEST).
 */
public enum MessageCode400SBS {
  FORMAT_ERROR("FORMAT_ERROR"),
    PARAMETER_NOT_CONSISTENT("PARAMETER_NOT_CONSISTENT"),
    PARAMETER_NOT_SUPPORTED("PARAMETER_NOT_SUPPORTED"),
    SERVICE_INVALID("SERVICE_INVALID"),
    RESOURCE_UNKNOWN("RESOURCE_UNKNOWN"),
    RESOURCE_EXPIRED("RESOURCE_EXPIRED"),
    RESOURCE_BLOCKED("RESOURCE_BLOCKED"),
    TIMESTAMP_INVALID("TIMESTAMP_INVALID"),
    PERIOD_INVALID("PERIOD_INVALID"),
    SCA_METHOD_UNKNOWN("SCA_METHOD_UNKNOWN"),
    SCA_INVALID("SCA_INVALID"),
    CONSENT_UNKNOWN("CONSENT_UNKNOWN"),
    REFERENCE_MIX_INVALID("REFERENCE_MIX_INVALID");

  private String value;

  MessageCode400SBS(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MessageCode400SBS fromValue(String text) {
    for (MessageCode400SBS b : MessageCode400SBS.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
