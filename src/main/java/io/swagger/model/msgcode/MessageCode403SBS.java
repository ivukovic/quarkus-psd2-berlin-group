package io.swagger.model.msgcode;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Message codes defined for signing baskets for HTTP Error code 403 (FORBIDDEN).
 */
public enum MessageCode403SBS {
	CONSENT_UNKNOWN("CONSENT_UNKNOWN"),

	SERVICE_BLOCKED("SERVICE_BLOCKED"),

	RESOURCE_UNKNOWN("RESOURCE_UNKNOWN"),

	RESOURCE_EXPIRED("RESOURCE_EXPIRED");

	private String value;

	MessageCode403SBS(String value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static MessageCode403SBS fromValue(String text) {
		for (MessageCode403SBS b : MessageCode403SBS.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}

}
