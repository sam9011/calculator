package com.calculator.service;

import org.springframework.stereotype.Service;

import com.calculator.CalculatorException;
import com.calculator.request.CalculaterRequest;

@Service("calculatorService")
public class CalculatorService {

	public Integer add(CalculaterRequest request) {
		
		return request.getFirstVal() + request.getSecVal();
	}

	public Integer substract(CalculaterRequest request) {
		
		return request.getFirstVal() - request.getSecVal();
	}

	public Integer devide(CalculaterRequest request) throws CalculatorException{
		
		if(0==request.getSecVal()) {
			throw new CalculatorException("1001","0 can not be devid");
		}
		
		return request.getFirstVal() / request.getSecVal();
	}

	public Integer multi(CalculaterRequest request) {
		
		return request.getFirstVal() * request.getSecVal();
	}

}
