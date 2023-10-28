package com.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.calculator.request.CalculaterRequest;
import com.calculator.service.CalculatorService;

@SpringBootTest
class CalculatorApplicationTests {

	@Autowired
	private CalculatorService service ;
	
	
	@Test
	void add() {
		
		CalculaterRequest request = null;
		Integer ans = null;
		
		request = prepareRequest();
		ans = service.add(request);
		assertEquals(25,ans);
	}
	
	@Test
	void sub() {
		CalculaterRequest request = null;
		Integer ans = null;
		
		request = prepareRequest();
		ans = service.substract(request);
		assertEquals(10-15,ans);
		
	}
	
	@Test
	void devide() throws CalculatorException {
		CalculaterRequest request = null;
		Integer ans = null;
		
		request = prepareRequest();
		ans = service.devide(request);
		assertEquals((10/15),ans);
	}
	
	@Test
	void multi() {
		CalculaterRequest request = null;
		Integer ans = null;
		
		request = prepareRequest();
		ans = service.multi(request);
		assertEquals((10*15),ans);
	}
	
	private CalculaterRequest prepareRequest() {
		CalculaterRequest request = new CalculaterRequest();
		request.setFirstVal(10);
		request.setSecVal(15);
		return request;
	}
}
