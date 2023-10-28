package com.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.calculator.CalculatorException;
import com.calculator.request.CalculaterRequest;
import com.calculator.service.CalculatorService;

@RestController("/api")
public class CalculatorController {
	
	@Autowired
	private CalculatorService calculatorService;

	@PostMapping("/add")
	private Integer add(@RequestBody CalculaterRequest request) {
		
		return calculatorService.add(request);
	}
	
	@PostMapping("/substract")
	private Integer substract(@RequestBody CalculaterRequest request) {
		
		return calculatorService.substract(request);
	}
	
	@PostMapping("/devide")
	private Integer devide(@RequestBody CalculaterRequest request) {
		
		try {
			return calculatorService.devide(request);
		} catch (CalculatorException e) {
			// return zero in case of can not devide by 0
			return 0;
		}
	}
	
	@PostMapping("/multi")
	private Integer multi(@RequestBody CalculaterRequest request) {
		
		return calculatorService.multi(request);
	}
}
