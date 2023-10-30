package TestNG_Class;

import org.testng.annotations.Test;

import Utilities.Utilities_;

public class ExTest extends Utilities_ {
	
	
  @Test
  public void tc1_validate_login_funtionality() {
	  test=reports.createTest ("Launch Browser and Go to Website");
		  // browser initialized
		  // implicit wait given
		  // maximize screen
		  //go to URI
		  //test.log(Status.PASS, "User Launched the Website Successfully"); 
	     test. info("User Successfully land on Homepage and Title Veified");
		 //validate page title 
		 test.pass ("HomePage title verified");
		 System.out.println("welcome to easy automation labs.");
  }

           
  @Test
  public void tc2_Registratin_vatidation() {
	  test=reports.createTest("Validate Login ").assignAuthor ("Maria").assignDevice("window").assignCategory("smoke");
	  //type email and password in login field 
	  // click on login button 
	  test.warning("alert Displaying");
	  //accept the alert
	  //verified homepage after loging successfuly.
	  
	  test.pass ("user logged in to the application successfully");}

	
  
  @Test
  public void tc3() {
	  test=reports. createTest("Validate Dashboard ").assignAuthor ("Maria"). assignCategory("regression") ;
			  //click on dashboard 
			  // verify assert the Title
          test. fail("Title is not verified");
			  //accept the alert
			  //verified homepage after loging successfuly 
	      test.skip("Test skipped");
  }
  
  
  
  
  
  
  
  
}
