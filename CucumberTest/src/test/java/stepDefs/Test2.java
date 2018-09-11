package stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test2 {

	@Given("^Application(\\d+) is opened$")
	public void application_is_opened(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
		System.out.println("Portal"+arg1+" is opened");
	}

	@When("^User enters the userName(\\d+) as \"([^\"]*)\" and password(\\d+) as \"([^\"]*)\"$")
	public void user_enters_the_userName_as_and_password_as(int arg1,
			String arg2, int arg3, String arg4) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
		System.out.println("user logged into Portal"+arg1);
	}

	@Then("^User should be able to login to the portal(\\d+)$")
	public void user_should_be_able_to_login_to_the_portal(int arg1)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
		System.out.println("User successfully logged into Portal"+arg1);
	}
}
