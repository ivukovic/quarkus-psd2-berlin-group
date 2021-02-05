package hr.igvu.psd2.berlin.api.model.msgcode;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Message codes defined for signing baskets for HTTP Error code 409 (CONFLICT).
 */
public enum MessageCode409SBS {
	REFERENCE_STATUS_INVALID("REFERENCE_STATUS_INVALID"),

	STATUS_INVALID("STATUS_INVALID");

	private String value;

	MessageCode409SBS(String value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static MessageCode409SBS fromValue(String text) {
		for (MessageCode409SBS b : MessageCode409SBS.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}

}
