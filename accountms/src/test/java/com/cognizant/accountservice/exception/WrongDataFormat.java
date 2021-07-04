package com.cognizant.accountservice.exception;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import com.cognizant.accountservice.exceptionhandling.WrongDateFormatException;

public class WrongDataFormat {
	
	@Test
	public void WrongFormatException() {
		
		 WrongDateFormatException e1=new  WrongDateFormatException("hello");
		 WrongDateFormatException e2=new  WrongDateFormatException("hello");
		assertThat(e1).isNotEqualTo(e2);
		
	}
	
	@Test
	public void WrongFormatExceptionNull() {
		
		 WrongDateFormatException e1=new  WrongDateFormatException();
		 WrongDateFormatException e2=new  WrongDateFormatException();
		assertThat(e1).isNotEqualTo(e2);
		
	}

}
