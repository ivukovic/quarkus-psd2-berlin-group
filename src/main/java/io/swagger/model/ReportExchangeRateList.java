package io.swagger.model;

import java.util.ArrayList;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import io.swagger.util.ObjectUtil;

/**
  * Array of exchange rates.
 **/
@Schema(description = "Array of exchange rates.")
public class ReportExchangeRateList extends ArrayList<ReportExchangeRate> {

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ReportExchangeRateList {\n");
		sb.append("    ").append(ObjectUtil.toIndentedString(super.toString())).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
