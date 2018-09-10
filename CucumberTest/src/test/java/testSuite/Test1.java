package testSuite;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test1 {

	@Given("^Jeff has brought microwave for \\$(\\d+)$")
	public void jeff_has_brought_microwave_for_$(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		System.out.println("Microwave has been purchased for " + arg1);
	}

	@Given("^Jeff has a receipt$")
	public void jeff_has_a_receipt() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		System.out.println("Jeff has received a receipt");
	}

	@When("^Jeff returns the microwave$")
	public void jeff_returns_the_microwave() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		System.out.println("Jeff has returned the faulty microwave");
	}

	@Then("^Jeff should receive refund of \\$(\\d+)$")
	public void jeff_should_receive_refund_of_$(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		System.out.println("Jeff has received the amount of " + arg1);
	}
}
