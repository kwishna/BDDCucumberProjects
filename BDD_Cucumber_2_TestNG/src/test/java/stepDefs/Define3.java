package stepDefs;

import cucumber.api.java8.En;

public class Define3 implements En{
	
	public Define3() {

			Given("context \"([a-zA-Z]{1,})\"", (s) -> {
			    // Write code here that turns the phrase above into concrete actions
			//    throw new cucumber.api.PendingException();
				System.out.println("Context3 ----------------");
			});

			When("event \"([a-zA-Z]{1,})\"", (s) -> {
			    // Write code here that turns the phrase above into concrete actions
			//    throw new cucumber.api.PendingException();
				System.out.println("Event3 ----------------");
			});

			Then("outcome \"([a-zA-Z]{1,})\"", (s) -> {
			    // Write code here that turns the phrase above into concrete actions
			//    throw new cucumber.api.PendingException();
				System.out.println("Outcome3 ----------------");
			});
			
			Then("more of the \"([a-zA-Z]{1,})\"", (s) -> {
			    // Write code here that turns the phrase above into concrete actions
			//   throw new cucumber.api.PendingException();
				System.out.println("More Of The Same3 ----------------");
			});
		
		
	}
}
