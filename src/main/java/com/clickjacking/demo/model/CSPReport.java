package com.clickjacking.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CSPReport {

	private String documentUri;

	private String referrer;

	private String blockedUri;

	private String violatedDirective;

	private String originalPolicy;

	private String disposition;

	public CSPReport() {
		super();
	}

	public CSPReport(String documentUri, String referrer, String blockedUri, String violatedDirective,
			String originalPolicy, String disposition) {
		super();
		this.documentUri = documentUri;
		this.referrer = referrer;
		this.blockedUri = blockedUri;
		this.violatedDirective = violatedDirective;
		this.originalPolicy = originalPolicy;
		this.disposition = disposition;
	}

	@JsonProperty(value = "document-uri")
	public String getDocumentUri() {
		return documentUri;
	}

	@JsonProperty(value = "document-uri")
	public void setDocumentUri(String documentUri) {
		this.documentUri = documentUri;
	}

	@JsonProperty(value = "referrer")
	public String getReferrer() {
		return referrer;
	}

	@JsonProperty(value = "referrer")
	public void setReferrer(String referrer) {
		this.referrer = referrer;
	}

	@JsonProperty(value = "blocked-uri")
	public String getBlockedUri() {
		return blockedUri;
	}

	@JsonProperty(value = "blocked-uri")
	public void setBlockedUri(String blockedUri) {
		this.blockedUri = blockedUri;
	}

	@JsonProperty(value = "violated-directive")
	public String getViolatedDirective() {
		return violatedDirective;
	}

	@JsonProperty(value = "violated-directive")
	public void setViolatedDirective(String violatedDirective) {
		this.violatedDirective = violatedDirective;
	}

	@JsonProperty(value = "original-policy")
	public String getOriginalPolicy() {
		return originalPolicy;
	}

	@JsonProperty(value = "original-policy")
	public void setOriginalPolicy(String originalPolicy) {
		this.originalPolicy = originalPolicy;
	}

	@JsonProperty(value = "disposition")
	public String getDisposition() {
		return disposition;
	}

	@JsonProperty(value = "disposition")
	public void setDisposition(String disposition) {
		this.disposition = disposition;
	}

	@Override
	public String toString() {
		return "CSPReport [documentUri=" + documentUri + ", referrer=" + referrer + ", blockedUri=" + blockedUri
				+ ", violatedDirective=" + violatedDirective + ", originalPolicy=" + originalPolicy + ", disposition="
				+ disposition + "]";
	}

}
