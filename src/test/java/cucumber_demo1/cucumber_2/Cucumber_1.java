package cucumber_demo1.cucumber_2;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Cucumber_1 {
	@Given("Application is launched")
	
	public void application_is_launched() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	    System.out.println("Coding for application launching");
	}

	@When("User enters Credentials")
	public void user_enters_Credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	    System.out.println("Code for entering credencials");
	}

}
