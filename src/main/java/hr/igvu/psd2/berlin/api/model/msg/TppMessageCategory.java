package hr.igvu.psd2.berlin.api.model.msg; import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import hr.igvu.psd2.util.ObjectUtil;

/**
 * Category of the TPP message category.
 */
public enum TppMessageCategory {
	ERROR("ERROR"),

	WARNING("WARNING");

	private String value;

	TppMessageCategory(String value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static TppMessageCategory fromValue(String text) {
		for (TppMessageCategory b : TppMessageCategory.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}

}