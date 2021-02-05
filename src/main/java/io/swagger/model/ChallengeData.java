package io.swagger.model;

import java.util.List;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.util.ObjectUtil;

/**
  * It is contained in addition to the data element 'chosenScaMethod' if challenge data is needed for SCA. In rare cases this attribute is also used in the context of the 'startAuthorisationWithPsuAuthentication' link. 
 **/
@Schema(description = "It is contained in addition to the data element 'chosenScaMethod' if challenge data is needed for SCA. In rare cases this attribute is also used in the context of the 'startAuthorisationWithPsuAuthentication' link. ")
public class ChallengeData {

	@Schema(description = "PNG data (max. 512 kilobyte) to be displayed to the PSU, Base64 encoding, cp. [RFC4648]. This attribute is used only, when PHOTO_OTP or CHIP_OTP is the selected SCA method. ")
	/**
	  * PNG data (max. 512 kilobyte) to be displayed to the PSU, Base64 encoding, cp. [RFC4648]. This attribute is used only, when PHOTO_OTP or CHIP_OTP is the selected SCA method.   
	 **/
	private byte[] image = null;

	@Schema(description = "A collection of strings as challenge data.")
	/**
	  * A collection of strings as challenge data.  
	 **/
	private List<String> data = null;

	@Schema(description = "A link where the ASPSP will provides the challenge image for the TPP.")
	/**
	  * A link where the ASPSP will provides the challenge image for the TPP.  
	 **/
	private String imageLink = null;

	@Schema(description = "The maximal length for the OTP to be typed in by the PSU.")
	/**
	  * The maximal length for the OTP to be typed in by the PSU.  
	 **/
	private Integer otpMaxLength = null;

	public enum OtpFormatEnum {
		CHARACTERS("characters"), INTEGER("integer");

		private String value;

		OtpFormatEnum(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static OtpFormatEnum fromValue(String text) {
			for (OtpFormatEnum b : OtpFormatEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	@Schema(description = "The format type of the OTP to be typed in. The admitted values are \"characters\" or \"integer\".")
	/**
	  * The format type of the OTP to be typed in. The admitted values are \"characters\" or \"integer\".  
	 **/
	private OtpFormatEnum otpFormat = null;

	@Schema(description = "Additional explanation for the PSU to explain e.g. fallback mechanism for the chosen SCA method. The TPP is obliged to show this to the PSU. ")
	/**
	  * Additional explanation for the PSU to explain e.g. fallback mechanism for the chosen SCA method. The TPP is obliged to show this to the PSU.   
	 **/
	private String additionalInformation = null;

	/**
	  * PNG data (max. 512 kilobyte) to be displayed to the PSU, Base64 encoding, cp. [RFC4648]. This attribute is used only, when PHOTO_OTP or CHIP_OTP is the selected SCA method. 
	  * @return image
	 **/
	@JsonProperty("image")
	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public ChallengeData image(byte[] image) {
		this.image = image;
		return this;
	}

	/**
	  * A collection of strings as challenge data.
	  * @return data
	 **/
	@JsonProperty("data")
	public List<String> getData() {
		return data;
	}

	public void setData(List<String> data) {
		this.data = data;
	}

	public ChallengeData data(List<String> data) {
		this.data = data;
		return this;
	}

	public ChallengeData addDataItem(String dataItem) {
		this.data.add(dataItem);
		return this;
	}

	/**
	  * A link where the ASPSP will provides the challenge image for the TPP.
	  * @return imageLink
	 **/
	@JsonProperty("imageLink")
	public String getImageLink() {
		return imageLink;
	}

	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}

	public ChallengeData imageLink(String imageLink) {
		this.imageLink = imageLink;
		return this;
	}

	/**
	  * The maximal length for the OTP to be typed in by the PSU.
	  * @return otpMaxLength
	 **/
	@JsonProperty("otpMaxLength")
	public Integer getOtpMaxLength() {
		return otpMaxLength;
	}

	public void setOtpMaxLength(Integer otpMaxLength) {
		this.otpMaxLength = otpMaxLength;
	}

	public ChallengeData otpMaxLength(Integer otpMaxLength) {
		this.otpMaxLength = otpMaxLength;
		return this;
	}

	/**
	  * The format type of the OTP to be typed in. The admitted values are \&quot;characters\&quot; or \&quot;integer\&quot;.
	  * @return otpFormat
	 **/
	@JsonProperty("otpFormat")
	public String getOtpFormat() {
		if (otpFormat == null) {
			return null;
		}
		return otpFormat.getValue();
	}

	public void setOtpFormat(OtpFormatEnum otpFormat) {
		this.otpFormat = otpFormat;
	}

	public ChallengeData otpFormat(OtpFormatEnum otpFormat) {
		this.otpFormat = otpFormat;
		return this;
	}

	/**
	  * Additional explanation for the PSU to explain e.g. fallback mechanism for the chosen SCA method. The TPP is obliged to show this to the PSU. 
	  * @return additionalInformation
	 **/
	@JsonProperty("additionalInformation")
	public String getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(String additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	public ChallengeData additionalInformation(String additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ChallengeData {\n");

		sb.append("    image: ").append(ObjectUtil.toIndentedString(image)).append("\n");
		sb.append("    data: ").append(ObjectUtil.toIndentedString(data)).append("\n");
		sb.append("    imageLink: ").append(ObjectUtil.toIndentedString(imageLink)).append("\n");
		sb.append("    otpMaxLength: ").append(ObjectUtil.toIndentedString(otpMaxLength)).append("\n");
		sb.append("    otpFormat: ").append(ObjectUtil.toIndentedString(otpFormat)).append("\n");
		sb.append("    additionalInformation: ").append(ObjectUtil.toIndentedString(additionalInformation)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
