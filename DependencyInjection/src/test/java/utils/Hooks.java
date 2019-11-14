package utils;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	private DI di;
	
	public Hooks(DI di) {
		this.di = di;
	}

//  private Driver driver;
    
//	public Hooks(Driver driver) {
//		this.driver = driver;
//	}

    @Before
    public void setup(){
    	
    	System.out.println("In the Setup method.");
 //   	driver.initializeDriver();   
    	di.x = 5;
    	di.setDiDriver();
    }

    @After
    public void tearDown(){
        System.out.println("In the TearDown method.");
 //       driver.terminateDriver();
        di.closeDiDriver();
    }
}
