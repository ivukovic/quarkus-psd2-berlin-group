package io.swagger.model;

import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Message codes defined for PIIS for HTTP Error code 404 (NOT FOUND).
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Message codes defined for PIIS for HTTP Error code 404 (NOT FOUND).
 */
public enum MessageCode404PIIS {
  UNKNOWN("RESOURCE_UNKNOWN");

  private String value;

  MessageCode404PIIS(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MessageCode404PIIS fromValue(String text) {
    for (MessageCode404PIIS b : MessageCode404PIIS.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
