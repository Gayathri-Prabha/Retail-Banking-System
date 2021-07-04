package com.cognizant.CustomerService.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.cognizant.customerservice.exception.AccessDeniedException;
import com.cognizant.customerservice.exception.CustomerNotFoundException;
import com.cognizant.customerservice.model.CustomErrorResponse;

public class AccessDeniedTest {
	
	//AccessDeniedTest accessDeniedTest=mock(AccessDeniedTest.class);
	@Test
	public void AccessException() {
		
		AccessDeniedException e1=new AccessDeniedException("hello");
		AccessDeniedException e2=new AccessDeniedException("hello");
		assertThat(e1).isNotEqualTo(e2);
		
	}
	
	@Test
	public void AccessExceptionNull() {
		
		AccessDeniedException e1=new AccessDeniedException();
		AccessDeniedException e2=new AccessDeniedException();
		assertThat(e1).isNotEqualTo(e2);
		
	}
	
	/*@Test
	public void customerNotFound()
	{
		
		CustomerNotFoundException ex=new CustomerNotFoundException("hello");
		//globalExceptionHandler.handleConsumerNotFoundException(ex);
		globalExceptionHandler.handleConsumerNotFoundException(ex);
		CustomErrorResponse response = new CustomErrorResponse();
		//response.setTimestamp();
		response.setMessage(ex.getMessage());
		response.setStatus(HttpStatus.NOT_FOUND);
		response.setReason("Invalid Consumer Id Provided");
		//assertEquals(LocalDateTime.now(), response.getTimestamp());
		assertEquals("hello", response.getMessage());
		assertEquals(HttpStatus.NOT_FOUND, response.getStatus());
		assertEquals("Invalid Consumer Id Provided", response.getReason());
		ResponseEntity<?> res=new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		assertEquals(HttpStatus.NOT_FOUND, res.getStatusCode());
	}*/

}
