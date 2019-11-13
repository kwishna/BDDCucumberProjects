package stepDefs;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import cucumber.api.java8.En;
import io.cucumber.datatable.DataTable;
import cucumber.api.java.en.*;

public class StepsDefs implements En{
	
	public StepsDefs() {
			
			Given("I want to write a step with precondition",() -> {
			    // Write code here that turns the phrase above into concrete actions
			   
			});

			Given("some other precondition", () -> {
			    // Write code here that turns the phrase above into concrete actions
			    
			});

			When("I complete action", () -> {
			    // Write code here that turns the phrase above into concrete actions
			    
			});

			When("some other action", () -> {
			    // Write code here that turns the phrase above into concrete actions
			    
			});

			When("yet another action", (DataTable a) -> {
			    // Write code here that turns the phrase above into concrete actions
			    System.out.println(a.asMap(String.class, String.class));
			});

			Then("I validate the outcomes", () -> {
			    // Write code here that turns the phrase above into concrete actions
			    
			});

			Then("check more more outcomes", (LocalDate d) -> {
			    // Write code here that turns the phrase above into concrete actions
			    System.out.println(d);
			});
			


			
	}
	
	@And("get me the ((.*)) outcomes")
	public void check_user__with_news_number(int a) {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new cucumber.api.PendingException();
	}
}
