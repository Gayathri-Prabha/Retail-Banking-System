package com.cognizant.accountservice.exception;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;


import com.cognizant.accountservice.exceptionhandling.WrongDateProvidedException;

public class WrongDataProvidedTest {
	
	
	@Test
	public void WrongDataException() {
		
		WrongDateProvidedException e1=new WrongDateProvidedException("hello");
		WrongDateProvidedException e2=new WrongDateProvidedException("hello");
		assertThat(e1).isNotEqualTo(e2);
		
	}
	
	@Test
	public void WrongDataExceptionNull() {
		
		WrongDateProvidedException e1=new WrongDateProvidedException();
		WrongDateProvidedException e2=new WrongDateProvidedException();
		assertThat(e1).isNotEqualTo(e2);
		
	}

}
