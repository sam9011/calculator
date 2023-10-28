package com.calculator.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ServiceRequest {
	
	@JsonProperty("description")
	private String responseDescription;
	
	@JsonProperty("responseCode")
	private String responseCode;
	
	/**
	 * @return the responseDescription
	 */
	public String getResponseDescription() {
		return responseDescription;
	}

	/**
	 * @param responseDescription the responseDescription to set
	 */
	public void setResponseDescription(String responseDescription) {
		this.responseDescription = responseDescription;
	}

	/**
	 * @return the responseCode
	 */
	public String getResponseCode() {
		return responseCode;
	}

	/**
	 * @param responseCode the responseCode to set
	 */
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	@Override
	public String toString() {
		return "ServiceRequest [responseDescription=" + responseDescription + ", responseCode=" + responseCode + "]";
	}

	

}
