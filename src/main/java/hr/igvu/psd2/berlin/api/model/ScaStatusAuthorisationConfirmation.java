package hr.igvu.psd2.berlin.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * This data element is containing information about the status of the SCA method in an authorisation confirmation response.   The following codes are defined for this data type.    * &#x27;finalised&#x27;: if the transaction authorisation and confirmation was successfule.   * &#x27;failed&#x27;: if the transaction authorisation or confirmation was not successful. 
 */
public enum ScaStatusAuthorisationConfirmation {
	FINALISED("finalised"),

	FAILED("failed");

	private String value;

	ScaStatusAuthorisationConfirmation(String value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static ScaStatusAuthorisationConfirmation fromValue(String text) {
		for (ScaStatusAuthorisationConfirmation b : ScaStatusAuthorisationConfirmation.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}

}
