package io.swagger.model;

import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Message codes defined for PIIS for HTTP Error code 403 (FORBIDDEN).
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Message codes defined for PIIS for HTTP Error code 403 (FORBIDDEN).
 */
public enum MessageCode403PIIS {
  CONSENT_UNKNOWN("CONSENT_UNKNOWN"),
    SERVICE_BLOCKED("SERVICE_BLOCKED"),
    RESOURCE_UNKNOWN("RESOURCE_UNKNOWN"),
    RESOURCE_EXPIRED("RESOURCE_EXPIRED");

  private String value;

  MessageCode403PIIS(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MessageCode403PIIS fromValue(String text) {
    for (MessageCode403PIIS b : MessageCode403PIIS.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
