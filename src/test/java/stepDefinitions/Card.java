package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Card {

	
	@Given("^User is onlanding page$")
	public void user_is_onlanding_page() throws Throwable {
	    System.out.println("Landing page");
	}

	@When("^User logs into appln with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_logs_into_appln_with_and(String arg1, String arg2) throws Throwable {
		System.out.println(arg1);
		
		System.out.println(arg2);
	}

	@Then("^Credit Home Page is loaded$")
	public void credit_Home_Page_is_loaded() throws Throwable {
		System.out.println("credit homepage");
	}

	@Then("^Card displayed are \"([^\"]*)\"$")
	public void card_diplayed_are(String dis) throws Throwable {
	   
		System.out.println(dis);
	}
}
