package io.swagger.model;

import java.util.ArrayList;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import io.swagger.util.ObjectUtil;

/**
  * Array of transaction details.
 **/
@Schema(description = "Array of transaction details.")
public class TransactionList extends ArrayList<Transactions> {

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TransactionList {\n");
		sb.append("    ").append(ObjectUtil.toIndentedString(super.toString())).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
