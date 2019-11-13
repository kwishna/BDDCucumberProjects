package stepDefs;

import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;

public class Define2 {
	
	public Define2() {
		System.out.println("Constructor Define2");
	}
	
	@After
	public void a() {
		System.out.println("Cucumber After");
	}
	
	@Before
	public void b() {
		System.out.println("Cucumber Before");
	}
	
	@AfterStep
	public void c() {
		System.out.println("Cucumber After Step");
	}
	
	@BeforeStep
	public void d() {
		System.out.println("Cucumber Before Step");
	}
	
}
