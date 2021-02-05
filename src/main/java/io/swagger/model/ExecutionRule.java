package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * \&quot;following\&quot; or \&quot;preceding\&quot; supported as values.  This data attribute defines the behaviour when recurring payment dates falls on a weekend or bank holiday.  The payment is then executed either the \&quot;preceding\&quot; or \&quot;following\&quot; working day. ASPSP might reject the request due to the communicated value, if rules in Online-Banking are not supporting  this execution rule. 
 */
public enum ExecutionRule {
	FOLLOWING("following"),

	PRECEDING("preceding");

	private String value;

	ExecutionRule(String value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static ExecutionRule fromValue(String text) {
		for (ExecutionRule b : ExecutionRule.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}

}
