package com.bridgelabz.program;

import org.junit.Assert;
import org.junit.Test;


public class UserRegistrationTest {

	@Test 
	public void givenFirstName_WhenValid_shouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean actual = userRegistration.firstNameValidate("Shankar");
		Assert.assertTrue(actual);
		
	}
	@Test
    public void givenFirstName_WhenNotValid_shouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.firstNameValidate("S");
        Assert.assertFalse(result);
    }
	
	@Test
    public void givenLastName_WhenValid_shouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.lastNameValidate("Patil");
        Assert.assertTrue(result);
    }
	 @Test
	 public void givenLastName_WhenNotValid_shouldReturnFalse() {
	     UserRegistration userRegistration = new UserRegistration();
	     boolean result = userRegistration.lastNameValidate("SP");
	     Assert.assertFalse(result);
	 }
	 @Test
	    public void givenEmail_WhenValid_shouldReturnTrue() {
	        UserRegistration userRegistration = new UserRegistration();
	        boolean result = userRegistration.emailValidate("abc.xyz@bl.co.in");
	        Assert.assertTrue(result);
	    }

	    @Test
	    public void givenEmail_WhenNotValid_shouldReturnFalse() {
	        UserRegistration userRegistration = new UserRegistration();
	        boolean result = userRegistration.emailValidate("abc.xyz@bl.in");
	        Assert.assertFalse(result);
	    }
	 @Test
	    public void givenPhone_WhenValid_shouldReturnTrue() {
	        UserRegistration userRegistration = new UserRegistration();
	        boolean result = userRegistration.phoneNumberValidate("91 9518760487");
	        Assert.assertTrue(result);
	    }

	    @Test
	    public void givenPhone_WhenNotValid_shouldReturnFalse() {
	        UserRegistration userRegistration = new UserRegistration();
	        boolean result = userRegistration.phoneNumberValidate("7410514253");
	        Assert.assertFalse(result);
	    }
	    @Test
	    public void givenPassword_WhenValid_shouldReturnTrue() {
	        UserRegistration userRegistration = new UserRegistration();
	        boolean result = userRegistration.passwordValidate("tdudAd21$");
	        Assert.assertTrue(result);
	    }

	    @Test
	    public void givenPassword_WhenNotValid_shouldReturnFalse() {
	        UserRegistration userRegistration = new UserRegistration();
	        boolean result = userRegistration.passwordValidate("fisjs23#%");
	        Assert.assertFalse(result);
	    }


}