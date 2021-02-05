package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Message codes defined for SBS for HTTP Error code 405 (METHOD NOT ALLOWED).
 */
public enum MessageCode405SBS {
	INVALID("SERVICE_INVALID");

	private String value;

	MessageCode405SBS(String value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static MessageCode405SBS fromValue(String text) {
		for (MessageCode405SBS b : MessageCode405SBS.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}

}
