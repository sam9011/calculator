package com.calculator.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CalculaterRequest extends ServiceRequest{
	
	@JsonProperty("firstVal")
	private Integer firstVal;
	
	@JsonProperty("secVal")
	private Integer secVal;
	
	/**
	 * @return the firstVal
	 */
	public Integer getFirstVal() {
		return firstVal;
	}

	/**
	 * @param firstVal the firstVal to set
	 */
	public void setFirstVal(Integer firstVal) {
		this.firstVal = firstVal;
	}

	/**
	 * @return the secVal
	 */
	public Integer getSecVal() {
		return secVal;
	}


	/**
	 * @param secVal the secVal to set
	 */
	public void setSecVal(Integer secVal) {
		this.secVal = secVal;
	}
	
	@Override
	public String toString() {
		return "CalculaterRequest [firstVal=" + firstVal + ", secVal=" + secVal + "]";
	}
}
