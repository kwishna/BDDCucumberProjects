package Runnnn;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberTest2 {
	
	@Given("^I wantz to write a \"([^\"]*)\" with precondition$")
	public void i_wantz_to_write_a_with_precondition(String arg1) throws Throwable {
		
		System.out.println("Running Double Quotes Given");
	}

	@When("^I \"([^\"]*)\" action$")
	public void i_action(String arg1) throws Throwable {
		
		System.out.println("Running Double Quotes When");
	}

	@Then("^I \"([^\"]*)\" the outcomes$")
	public void i_the_outcomes(String arg1) throws Throwable {
		
	    System.out.println("Running Double Quotes Then");
	}


}
