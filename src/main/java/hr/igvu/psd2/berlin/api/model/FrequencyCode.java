package hr.igvu.psd2.berlin.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The following codes from the \&quot;EventFrequency7Code\&quot; of ISO 20022 are supported: - \&quot;Daily\&quot; - \&quot;Weekly\&quot; - \&quot;EveryTwoWeeks\&quot; - \&quot;Monthly\&quot; - \&quot;EveryTwoMonths\&quot; - \&quot;Quarterly\&quot; - \&quot;SemiAnnual\&quot; - \&quot;Annual\&quot; - \&quot;MonthlyVariable\&quot; 
 */
public enum FrequencyCode {
	DAILY("Daily"),

	WEEKLY("Weekly"),

	EVERYTWOWEEKS("EveryTwoWeeks"),

	MONTHLY("Monthly"),

	EVERYTWOMONTHS("EveryTwoMonths"),

	QUARTERLY("Quarterly"),

	SEMIANNUAL("SemiAnnual"),

	ANNUAL("Annual"),

	MONTHLYVARIABLE("MonthlyVariable");

	private String value;

	FrequencyCode(String value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static FrequencyCode fromValue(String text) {
		for (FrequencyCode b : FrequencyCode.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}

}
