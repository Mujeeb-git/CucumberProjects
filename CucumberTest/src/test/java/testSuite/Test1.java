package testSuite;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test1 {
	@Given("^Refund of any faulty item as per the guidelines$")
	public void refund_of_any_faulty_item_as_per_the_guidelines() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Refund of the item as per the guidelines");
	}

	@Given("^Jeff has brought microwave for (\\d+)$")
	public void jeff_has_brought_microwave_for(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Jeff has brought the microwave for "+arg1);
	}

	@Given("^Jeff has a receipt$")
	public void jeff_has_a_receipt() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new PendingException();
		System.out.println("Jeff has received the receipt");
	}

	@When("^Jeff returns the microwave$")
	public void jeff_returns_the_microwave() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println("Jeff has returned the microwave");
	}

	@Then("^Jeff should receive refund of (\\d+)$")
	public void jeff_should_receive_refund_of(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new PendingException();
		System.out.println("Jeff has received the amount for "+arg1);
	}

}
