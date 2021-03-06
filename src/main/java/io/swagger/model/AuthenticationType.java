package io.swagger.model;

import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Type of the authentication method.  More authentication types might be added during implementation projects and documented in the ASPSP documentation.    - &#x27;SMS_OTP&#x27;: An SCA method, where an OTP linked to the transaction to be authorised is sent to the PSU through a SMS channel.   - &#x27;CHIP_OTP&#x27;: An SCA method, where an OTP is generated by a chip card, e.g. a TOP derived from an EMV cryptogram.      To contact the card, the PSU normally needs a (handheld) device.      With this device, the PSU either reads the challenging data through a visual interface like flickering or      the PSU types in the challenge through the device key pad.      The device then derives an OTP from the challenge data and displays the OTP to the PSU.   - &#x27;PHOTO_OTP&#x27;: An SCA method, where the challenge is a QR code or similar encoded visual data      which can be read in by a consumer device or specific mobile app.      The device resp. the specific app than derives an OTP from the visual challenge data and displays      the OTP to the PSU.   - &#x27;PUSH_OTP&#x27;: An OTP is pushed to a dedicated authentication APP and displayed to the PSU.   - &#x27;SMTP_OTP&#x27;: An OTP is sent via email to the PSU. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of the authentication method.  More authentication types might be added during implementation projects and documented in the ASPSP documentation.    - &#x27;SMS_OTP&#x27;: An SCA method, where an OTP linked to the transaction to be authorised is sent to the PSU through a SMS channel.   - &#x27;CHIP_OTP&#x27;: An SCA method, where an OTP is generated by a chip card, e.g. a TOP derived from an EMV cryptogram.      To contact the card, the PSU normally needs a (handheld) device.      With this device, the PSU either reads the challenging data through a visual interface like flickering or      the PSU types in the challenge through the device key pad.      The device then derives an OTP from the challenge data and displays the OTP to the PSU.   - &#x27;PHOTO_OTP&#x27;: An SCA method, where the challenge is a QR code or similar encoded visual data      which can be read in by a consumer device or specific mobile app.      The device resp. the specific app than derives an OTP from the visual challenge data and displays      the OTP to the PSU.   - &#x27;PUSH_OTP&#x27;: An OTP is pushed to a dedicated authentication APP and displayed to the PSU.   - &#x27;SMTP_OTP&#x27;: An OTP is sent via email to the PSU. 
 */
public enum AuthenticationType {
  SMS_OTP("SMS_OTP"),
    CHIP_OTP("CHIP_OTP"),
    PHOTO_OTP("PHOTO_OTP"),
    PUSH_OTP("PUSH_OTP"),
    SMTP_OTP("SMTP_OTP");

  private String value;

  AuthenticationType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AuthenticationType fromValue(String text) {
    for (AuthenticationType b : AuthenticationType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
