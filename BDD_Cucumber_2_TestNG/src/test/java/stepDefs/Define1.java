package stepDefs;

import cucumber.api.java8.En;

public class Define1 implements En{
	
	public Define1() {

	Given("context ([a-zA-Z]{1,})", (s) -> {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new cucumber.api.PendingException();
		System.out.println("Context ----------------");
	});

	When("event ([a-zA-Z]{1,})", (s) -> {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new cucumber.api.PendingException();
		System.out.println("Event ----------------");
	});

	Then("outcome ([a-zA-Z]{1,})", (s) -> {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new cucumber.api.PendingException();
		System.out.println("Outcome ----------------");
	});
	
	Then("more of the ([a-zA-Z]{1,})", (s) -> {
	    // Write code here that turns the phrase above into concrete actions
	//   throw new cucumber.api.PendingException();
		System.out.println("More Of The Same ----------------");
	});

	Given("....placeholder ([a-zA-Z0-9]{1,}) one....", (s) -> {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new cucumber.api.PendingException();
		System.out.println("Value111111111 ----------------"+s);
	});

	When("....placeholder ([a-zA-Z0-9]{1,}) two....", (s) -> {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new cucumber.api.PendingException();
		System.out.println("Value2222222222 ----------------"+s);
	});

	Then("....placeholder ([a-zA-Z0-9]{1,}) three....", (s) -> {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new cucumber.api.PendingException();
		System.out.println("Value3333333333 ----------------"+s);
	});

	And("....placeholder ([a-zA-Z0-9]{1,}) four....", (s) -> {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new cucumber.api.PendingException();
		System.out.println("Value3333333333 ----------------"+s);
	});
	
	}
	
}
