package io.swagger.model;

import java.util.HashMap;

import javax.validation.constraints.NotNull;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.util.ObjectUtil;

/**
  * A list of hyperlinks to be recognised by the TPP.  Type of links admitted in this response:   - \"download\": a link to a resource, where the transaction report might be downloaded from in    case where transaction reports have a huge size.  Remark: This feature shall only be used where camt-data is requested which has a huge size. 
 **/
@Schema(description = "A list of hyperlinks to be recognised by the TPP.  Type of links admitted in this response:   - \"download\": a link to a resource, where the transaction report might be downloaded from in    case where transaction reports have a huge size.  Remark: This feature shall only be used where camt-data is requested which has a huge size. ")
public class LinksDownload extends HashMap<String, HrefType> {

	@Schema(required = true, description = "")
	private HrefType download = null;

	/**
	  * Get download
	  * @return download
	 **/
	@JsonProperty("download")
	@NotNull
	public HrefType getDownload() {
		return download;
	}

	public void setDownload(HrefType download) {
		this.download = download;
	}

	public LinksDownload download(HrefType download) {
		this.download = download;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LinksDownload {\n");
		sb.append("    ").append(ObjectUtil.toIndentedString(super.toString())).append("\n");
		sb.append("    download: ").append(ObjectUtil.toIndentedString(download)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
