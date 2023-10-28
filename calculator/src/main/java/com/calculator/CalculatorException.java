package com.calculator;

public class CalculatorException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String errorCode;
	
	private String errorDesc;
	
	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * @return the errorDesc
	 */
	public String getErrorDesc() {
		return errorDesc;
	}

	/**
	 * @param errorDesc the errorDesc to set
	 */
	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

	
	public CalculatorException(String errorCode,String errorDesc) {
		this.errorCode = errorCode;
		this.errorDesc = errorDesc;
	}

	public CalculatorException() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CalculatorException [errorCode=" + errorCode + ", errorDesc=" + errorDesc + "]";
	}

}
