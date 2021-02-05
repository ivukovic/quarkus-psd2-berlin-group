package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Message codes defined for signing baskets for HTTP Error code 404 (NOT FOUND).
 */
public enum MessageCode404SBS {
	UNKNOWN("RESOURCE_UNKNOWN");

	private String value;

	MessageCode404SBS(String value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static MessageCode404SBS fromValue(String text) {
		for (MessageCode404SBS b : MessageCode404SBS.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}

}
