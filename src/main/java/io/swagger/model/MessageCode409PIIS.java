package io.swagger.model;

import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Message codes defined for PIIS for HTTP Error code 409 (CONFLICT).
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Message codes defined for PIIS for HTTP Error code 409 (CONFLICT).
 */
public enum MessageCode409PIIS {
  INVALID("STATUS_INVALID");

  private String value;

  MessageCode409PIIS(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MessageCode409PIIS fromValue(String text) {
    for (MessageCode409PIIS b : MessageCode409PIIS.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
