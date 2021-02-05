package io.swagger.model;

import java.util.ArrayList;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import io.swagger.util.ObjectUtil;

/**
  * A list of balances regarding this account, e.g. the current balance, the last booked balance. The list might be restricted to the current balance. 
 **/
@Schema(description = "A list of balances regarding this account, e.g. the current balance, the last booked balance. The list might be restricted to the current balance. ")
public class BalanceList extends ArrayList<Balance> {

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BalanceList {\n");
		sb.append("    ").append(ObjectUtil.toIndentedString(super.toString())).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
