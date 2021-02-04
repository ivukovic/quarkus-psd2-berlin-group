package io.swagger.model;

import org.eclipse.microprofile.openapi.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * It is contained in addition to the data element &#x27;chosenScaMethod&#x27; if challenge data is needed for SCA. In rare cases this attribute is also used in the context of the &#x27;startAuthorisationWithPsuAuthentication&#x27; link. 
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "It is contained in addition to the data element 'chosenScaMethod' if challenge data is needed for SCA. In rare cases this attribute is also used in the context of the 'startAuthorisationWithPsuAuthentication' link. ")

public class ChallengeData   {
  private @Valid byte[] image = null;
  private @Valid List<String> data = new ArrayList<String>();
  private @Valid String imageLink = null;
  private @Valid Integer otpMaxLength = null;
public enum OtpFormatEnum {

    CHARACTERS(String.valueOf("characters")), INTEGER(String.valueOf("integer"));


    private String value;

    OtpFormatEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static OtpFormatEnum fromValue(String v) {
        for (OtpFormatEnum b : OtpFormatEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}
  private @Valid OtpFormatEnum otpFormat = null;
  private @Valid String additionalInformation = null;

  /**
   * PNG data (max. 512 kilobyte) to be displayed to the PSU, Base64 encoding, cp. [RFC4648]. This attribute is used only, when PHOTO_OTP or CHIP_OTP is the selected SCA method. 
   **/
  public ChallengeData image(byte[] image) {
    this.image = image;
    return this;
  }

  
  @ApiModelProperty(value = "PNG data (max. 512 kilobyte) to be displayed to the PSU, Base64 encoding, cp. [RFC4648]. This attribute is used only, when PHOTO_OTP or CHIP_OTP is the selected SCA method. ")
  @JsonProperty("image")

  public byte[] getImage() {
    return image;
  }
  public void setImage(byte[] image) {
    this.image = image;
  }

  /**
   * A collection of strings as challenge data.
   **/
  public ChallengeData data(List<String> data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(value = "A collection of strings as challenge data.")
  @JsonProperty("data")

  public List<String> getData() {
    return data;
  }
  public void setData(List<String> data) {
    this.data = data;
  }

  /**
   * A link where the ASPSP will provides the challenge image for the TPP.
   **/
  public ChallengeData imageLink(String imageLink) {
    this.imageLink = imageLink;
    return this;
  }

  
  @ApiModelProperty(value = "A link where the ASPSP will provides the challenge image for the TPP.")
  @JsonProperty("imageLink")

  public String getImageLink() {
    return imageLink;
  }
  public void setImageLink(String imageLink) {
    this.imageLink = imageLink;
  }

  /**
   * The maximal length for the OTP to be typed in by the PSU.
   **/
  public ChallengeData otpMaxLength(Integer otpMaxLength) {
    this.otpMaxLength = otpMaxLength;
    return this;
  }

  
  @ApiModelProperty(value = "The maximal length for the OTP to be typed in by the PSU.")
  @JsonProperty("otpMaxLength")

  public Integer getOtpMaxLength() {
    return otpMaxLength;
  }
  public void setOtpMaxLength(Integer otpMaxLength) {
    this.otpMaxLength = otpMaxLength;
  }

  /**
   * The format type of the OTP to be typed in. The admitted values are \&quot;characters\&quot; or \&quot;integer\&quot;.
   **/
  public ChallengeData otpFormat(OtpFormatEnum otpFormat) {
    this.otpFormat = otpFormat;
    return this;
  }

  
  @ApiModelProperty(value = "The format type of the OTP to be typed in. The admitted values are \"characters\" or \"integer\".")
  @JsonProperty("otpFormat")

  public OtpFormatEnum getOtpFormat() {
    return otpFormat;
  }
  public void setOtpFormat(OtpFormatEnum otpFormat) {
    this.otpFormat = otpFormat;
  }

  /**
   * Additional explanation for the PSU to explain e.g. fallback mechanism for the chosen SCA method. The TPP is obliged to show this to the PSU. 
   **/
  public ChallengeData additionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

  
  @ApiModelProperty(value = "Additional explanation for the PSU to explain e.g. fallback mechanism for the chosen SCA method. The TPP is obliged to show this to the PSU. ")
  @JsonProperty("additionalInformation")

  public String getAdditionalInformation() {
    return additionalInformation;
  }
  public void setAdditionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChallengeData challengeData = (ChallengeData) o;
    return Objects.equals(image, challengeData.image) &&
        Objects.equals(data, challengeData.data) &&
        Objects.equals(imageLink, challengeData.imageLink) &&
        Objects.equals(otpMaxLength, challengeData.otpMaxLength) &&
        Objects.equals(otpFormat, challengeData.otpFormat) &&
        Objects.equals(additionalInformation, challengeData.additionalInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(image, data, imageLink, otpMaxLength, otpFormat, additionalInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChallengeData {\n");
    
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    imageLink: ").append(toIndentedString(imageLink)).append("\n");
    sb.append("    otpMaxLength: ").append(toIndentedString(otpMaxLength)).append("\n");
    sb.append("    otpFormat: ").append(toIndentedString(otpFormat)).append("\n");
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
