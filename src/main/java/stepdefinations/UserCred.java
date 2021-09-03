package stepdefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserCred {

	@Given("^Open the Firefox and launch the application$")
	public void open_the_Firefox_and_launch_the_application() throws Throwable {
	    
	    System.out.println("Abhijit");
	}

	@When("^Enter the Username and Password$")
	public void enter_the_Username_and_Password() throws Throwable {
	   
		 System.out.println("Miku");
	}

	@Then("^Reset the credential$")
	public void reset_the_credential() throws Throwable {
	   
		 System.out.println("Das");
	}

	
}
