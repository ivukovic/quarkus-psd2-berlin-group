package io.swagger.model;

import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Charge Bearer. ChargeBearerType1Code from ISO20022.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Charge Bearer. ChargeBearerType1Code from ISO20022.
 */
public enum ChargeBearer {
  DEBT("DEBT"),
    CRED("CRED"),
    SHAR("SHAR"),
    SLEV("SLEV");

  private String value;

  ChargeBearer(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ChargeBearer fromValue(String text) {
    for (ChargeBearer b : ChargeBearer.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
