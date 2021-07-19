package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinition {
	
	@Given("^User is on Netbanking landng page$")
	
	public void user_is_on_Netbanking_landing_page()
	{
		System.out.println("We are on anding page");
	}

	@When("^User enters Username and password$")
	public void user_enters_Username_and_password() throws Throwable {
		
		System.out.println("username password entered");
	}

	@Then("^User should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
		System.out.println("logged in successfully");
	}

	@Then("^home page should be displayed$")
	public void home_page_should_be_displayed() throws Throwable {
		System.out.println("home page");
	}


}
