package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Research_Develop {
	
	@Given("^User is Shadma$")
	public void user_is_Shadma() throws Throwable {
	    
		System.out.println("shadma");
	}

	@When("^enters the userid <userid>$")
	public void enters_the_userid_userid() throws Throwable {
	    System.out.println("id_entered");
	}

	@Then("^authentication success$")
	public void authentication_success() throws Throwable {
		
		System.out.println("success");
	    
	}

	@Given("^User is Babloo$")
	public void user_is_Babloo() throws Throwable {
		System.out.println("babloo");
	}

	@Then("^authentication Fail$")
	public void authentication_Fail() throws Throwable {
	   
		System.out.println("fail");
	}



}
