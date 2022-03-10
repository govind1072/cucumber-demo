package stepdefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PrintData {

	@Given("^Chrome browser should be opened$")
	public void chrome_browser_should_be_opened() throws Throwable {
	    System.out.println("print Given Condition.");
	}

	@When("^Zephyrcodecontest website is launched$")
	public void zephyrcodecontest_website_is_launched() throws Throwable {
		System.out.println("print When Condition .");
	}

	@When("^the form is submitted with all fields filled$")
	public void the_form_is_submitted_with_all_fields_filled() throws Throwable {
		System.out.println("print When Condition");
	}

	@Then("^Successfully submitted message should be shown$")
	public void successfully_submitted_message_should_be_shown() throws Throwable {
		System.out.println("print Then Condition");
	}

	@When("^the form is filled with \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void the_form_is_filled_with(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
		System.out.println("print When Condition");
	}

	@When("^the form is filled with \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_form_is_filled_with_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		System.out.println("print When Condition");
	}

	@When("^clicked on submit button$")
	public void clicked_on_submit_button() throws Throwable {
		System.out.println("print When Condition");
	}

	@Then("^Go back to Welcome page and verify title$")
	public void go_back_to_Welcome_page_and_verify_title() throws Throwable {
		System.out.println("print Then Condition");
	}

	


}
