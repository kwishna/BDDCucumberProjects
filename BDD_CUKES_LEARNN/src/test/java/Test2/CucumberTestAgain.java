package Test2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Reporter;

import cucumber.api.java.en.*;

public class CucumberTestAgain {
	
	public Logger logger;
	
	public CucumberTestAgain() {
		 logger = LogManager.getLogger("krishna");
	}
	
	@Given("^I ([a-zA-Z]{1,}) to write a step with precondition ok$") // () Means We Are Accepting The Word As Parameter
	public void i_want_to_write_a_step_with_precondition(String s) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // throw new PendingException();
		logger.trace(":: COM  :: LEVEL :: TRACE trace ::-");
		logger.info(":: COM  :: LEVEL :: TRACE info ::-");
		logger.debug(":: COM  :: LEVEL :: TRACE debug ::-");
		logger.warn(":: COM  :: LEVEL :: TRACE warn ::-");
		logger.error(":: COM  :: LEVEL :: TRACE error ::-");
		logger.fatal(":: COM  :: LEVEL :: TRACE fatal ::-");
		
		Reporter.log(s);
	}

	@Given("^some ([a-zA-Z]{1,}) precondition ok$")	// () Means We Are Accepting The Word As Parameter
	public void some_other_precondition(String k) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new PendingException();
		Reporter.log(k);
	}

	@When("^I [a-zA-Z]{1,} action ok$")	// No () Means We Are Not Accepting The Word As Parameter
	public void i_complete_action() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new PendingException();
		System.out.println();
	}

	@When("^some [a-zA-Z]{1,} action ok$")
	public void some_other_action() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	//   throw new PendingException();
	}

	@When("^yet [a-zA-Z]{1,} action ok$")
	public void yet_another_action() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new PendingException();
	}

	@Then("^I [a-zA-Z]{1,} the outcomes ok$")
	public void i_validate_the_outcomes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new PendingException();
	}

	@Then("^check [a-zA-Z]{1,} outcomes ok$")
	public void check_more_outcomes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new PendingException();
	}
	
	
	
	
	
	@Given("^I want to write a step with (\\w+) okx$")
	public void i_want_to_write_a_step_with_name(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	//   throw new PendingException();
		System.out.println("::::: "+arg1+" ::::::");
		Reporter.log(arg1);
	}

	@When("^I check for the (\\d+) in step okx$")
	public void i_check_for_the_in_step(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	//   throw new PendingException();
		System.out.println("::::: "+arg1+" ::::::");
		Reporter.log(""+arg1);
	}

	@Then("^I verify the (\\w+) in step okx$")
	public void i_verify_the_success_in_step(String s) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new PendingException();
		System.out.println("::::: "+s+" ::::::");
		Reporter.log(s);
	}

}


