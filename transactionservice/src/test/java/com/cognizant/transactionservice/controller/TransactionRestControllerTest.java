package com.cognizant.transactionservice.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.cognizant.transactionservice.repository.TransactionRepository;
import com.cognizant.transactionservice.service.TransactionService;
import com.cognizant.transactionservice.service.TransactionServiceInterface;
import com.cognizant.transactionservice.util.AccountInput;

@WebMvcTest
@ExtendWith(SpringExtension.class)

public class TransactionRestControllerTest {
	@SuppressWarnings("unused")
	@Autowired
	private MockMvc mockMvc;
	@MockBean
	private TransactionRepository transactionRepository;
	@Mock
	TransactionService transactionService;
	@Test
	public void withdrawTest() throws Exception
	{
		//when(TransactionService.hasPermission("token")).thenReturn(new AuthenticationResponse("", "", true));
		AccountInput accInp=new AccountInput();
		when(transactionService.makeWithdraw("token", accInp));
		mockMvc.perform(get("/withdraw").header("Authorization", "token")).andExpect(status().isOk());
		
	}
	
	@Test
	public void amountTest()
	{
		
	}

}
