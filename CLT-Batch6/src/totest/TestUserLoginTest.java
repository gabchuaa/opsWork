package totest;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

public class TestUserLoginTest {
    
	
	@Before
	public void setup() {
	System.out.println("Before test");
	}
	
	
   //To test if login input is true, check result will return pass 
	//else fail
	@Test
    public void testLogin() {
        TestUserLogin ref = new TestUserLogin();
        ref.id="1234@gmail.com";
        ref.password ="abcd1234";
        assertTrue("Verify is true",ref.login());
       
    }
	//To test if login input is false, check result will return pass 
	//else fail
	@Test
    public void testLogin1() {
        TestUserLogin ref = new TestUserLogin();
        ref.id="1234@gmail.com";
        ref.password ="abcd1234";
        assertFalse("Verify is false",ref.login());
    }

	
	

	//@Test public void testLogout() {
		
		 //}
	
	 // @Test public void testAfterLoginOption() {
	 //
	// }
	 

}
