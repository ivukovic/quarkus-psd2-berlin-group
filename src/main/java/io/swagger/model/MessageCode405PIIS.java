package io.swagger.model;

import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Message codes defined for PIIS for HTTP Error code 405 (METHOD NOT ALLOWED).
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Message codes defined for PIIS for HTTP Error code 405 (METHOD NOT ALLOWED).
 */
public enum MessageCode405PIIS {
  INVALID("SERVICE_INVALID");

  private String value;

  MessageCode405PIIS(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MessageCode405PIIS fromValue(String text) {
    for (MessageCode405PIIS b : MessageCode405PIIS.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
