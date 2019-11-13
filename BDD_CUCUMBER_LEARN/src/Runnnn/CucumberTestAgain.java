package Runnnn;


import cucumber.api.PendingException;
import cucumber.api.java.en.*;

public class CucumberTestAgain {
	
	@Given("^I ([a-zA-Z]{1,}) to write a step with precondition$") // () Means We Are Accepting The Word As Parameter
	public void i_want_to_write_a_step_with_precondition(String s) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new PendingException();
	}

	@Given("^some ([a-zA-Z]{1,}) precondition$")	// () Means We Are Accepting The Word As Parameter
	public void some_other_precondition(String k) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new PendingException();
	}

	@When("^I [a-zA-Z]{1,} action$")	// No () Means We Are Not Accepting The Word As Parameter
	public void i_complete_action() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new PendingException();
		System.out.println();
	}

	@When("^some [a-zA-Z]{1,} action$")
	public void some_other_action() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	//   throw new PendingException();
	}

	@When("^yet [a-zA-Z]{1,} action$")
	public void yet_another_action() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new PendingException();
	}

	@Then("^I [a-zA-Z]{1,} the outcomes$")
	public void i_validate_the_outcomes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new PendingException();
	}

	@Then("^check [a-zA-Z]{1,} outcomes$")
	public void check_more_outcomes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new PendingException();
	}
	
	@Given("^I want to write a step with name(.*)$")
	public void i_want_to_write_a_step_with_name(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	//   throw new PendingException();
		System.out.println("::::: "+arg1+" ::::::");
	}

	@When("^I check for the (.*) in step$")
	public void i_check_for_the_in_step(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	//   throw new PendingException();
		System.out.println("::::: "+arg1+" ::::::");
	}

	@Then("^I verify the (.*) in step$")
	public void i_verify_the_success_in_step(String s) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new PendingException();
		System.out.println("::::: "+s+" ::::::");
	}

}


