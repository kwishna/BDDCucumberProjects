package testFiles;

import cucumber.api.java.en.*;

public class TC_001 {
	
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new cucumber.api.PendingException();
		System.out.println("i_want_to_write_a_step_with_precondition()");
	}

	@Given("some other precondition")
	public void some_other_precondition() {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new cucumber.api.PendingException();
		System.out.println("some_other_precondition()");
	}

	@When("I complete action")
	public void i_complete_action() {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new cucumber.api.PendingException();
		System.out.println("i_complete_action()");
	}

	@When("some other action")
	public void some_other_action() {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new cucumber.api.PendingException();
		System.out.println("some_other_action()");
	}

	@When("yet another action")
	public void yet_another_action() {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new cucumber.api.PendingException();
		System.out.println("yet_another_action()");
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new cucumber.api.PendingException();
		System.out.println("i_validate_the_outcomes()");
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new cucumber.api.PendingException();
		System.out.println("check_more_outcomes()");
	}

	@Given("I want to write a step with (.*) this")
	public void i_want_to_write_a_step_with_name(String s) {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new cucumber.api.PendingException();
		System.out.println("i_want_to_write_a_step_with_name(int int1) :: "+s);
	}

	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(int int1) {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new cucumber.api.PendingException();
		System.out.println("i_check_for_the_in_step :: "+int1);
	}

	@Then("I verify the {} in step")
	public void i_verify_the_status_in_step(String s) {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new cucumber.api.PendingException();
		System.out.println("i_verify_the_success_in_step :: "+s);
	}

//	@Then("I verify the Fail in step")
//	public void i_verify_the_Fail_in_step() {
//	    // Write code here that turns the phrase above into concrete actions
//	//    throw new cucumber.api.PendingException();
//	}
	
}
