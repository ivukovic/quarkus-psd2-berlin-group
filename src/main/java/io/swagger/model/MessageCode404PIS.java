package io.swagger.model;

import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Message codes defined for PIS for HTTP Error code 404 (NOT FOUND).
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Message codes defined for PIS for HTTP Error code 404 (NOT FOUND).
 */
public enum MessageCode404PIS {
  RESOURCE_UNKNOWN("RESOURCE_UNKNOWN"),
    PRODUCT_UNKNOWN("PRODUCT_UNKNOWN");

  private String value;

  MessageCode404PIS(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MessageCode404PIS fromValue(String text) {
    for (MessageCode404PIS b : MessageCode404PIS.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
