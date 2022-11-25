package com.SerialExecution;

import org.testng.annotations.Test;

public class SerialExecution {

	//thread port is 1 two testes
	@Test
   public void testOne() {
		System.out.println("Test One1 = "+Thread.currentThread().getId());
		
	}
	
	@Test
	   public void testTwo() {
			System.out.println("Test Two2 = "+Thread.currentThread().getId());
			
		}
	
	
	
	
}
