package com.listeners;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


 @Listeners(ListenersClass.class)
 
public class TestCases {
	
	
    @Test
    public void Test1() {
    	System.out.println("My Test1 Cases Pass");
    }
	
    
    @Test
    public void Test2() {
    	System.out.println("My Test2 Cases Fail");
    	Assert.assertTrue(false);
    }
    
 
    
    
	
    

}
