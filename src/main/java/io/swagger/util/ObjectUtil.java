package io.swagger.util;

public final class ObjectUtil {

	private ObjectUtil() {

	}

	private static final String _NULL = "null";

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	public static String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return _NULL;
		}
		return o.toString().replace("\n", "\n    ");
	}
}
