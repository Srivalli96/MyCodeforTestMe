package cucumber_demo1.cucumber_2;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Tagsdemo {
	@Given("application is up and running")
	public void application_is_up_and_running() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("running code");
	}

	@Then("User able to login")
	public void user_able_to_login() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Login code");
	}

	@Given("user searching the prod with code")
	public void user_searching_the_prod_with_code() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("product code");
	}

	@Then("user able to add it to cart")
	public void user_able_to_add_it_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Add to cart code");
	}

	@Given("user able to see the items count on cart")
	public void user_able_to_see_the_items_count_on_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("count on cart code");
	}

	@Then("user decides to remove an item")
	public void user_decides_to_remove_an_item() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("remove an item code");
	}

	@Given("user has active order")
	public void user_has_active_order() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("order code");
	}

	@Then("user verifies the status of the order")
	public void user_verifies_the_status_of_the_order() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("status code");
	}

}
