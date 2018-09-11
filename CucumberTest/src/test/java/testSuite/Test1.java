package testSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test1 {
	WebDriver driver;

	@Given("^Refund of any faulty item as per the guidelines$")
	public void refund_of_any_faulty_item_as_per_the_guidelines()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		System.out.println("Refund of the item as per the guidelines");
	}

	@Given("^Jeff has brought microwave for (\\d+)$")
	public void jeff_has_brought_microwave_for(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		System.out.println("Jeff has brought the microwave for " + arg1);
	}

	@Given("^Jeff has a receipt$")
	public void jeff_has_a_receipt() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
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
		// throw new PendingException();
		System.out.println("Jeff has received the amount for " + arg1);
	}

	@Given("^Application is opened$")
	public void application_is_opened() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		System.out
				.println("Application has opened successfully and the title of the page is "
						+ driver.getTitle());
		Thread.sleep(3000);

	}

	@When("^User enters the userName as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enters_the_userName_and_password(String arg1, String arg2)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		driver.findElement(By.xpath("//input[@name='userName']"))
				.sendKeys(arg1);
		driver.findElement(By.xpath("//input[@name='password']"))
				.sendKeys(arg2);
		driver.findElement(By.xpath("//input[@name='login']")).click();

		System.out.println("Entered userName and password");

		Thread.sleep(2000);
	}

	@Then("^User should be able to login to the portal$")
	public void user_should_be_able_to_login_to_the_portal() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		String str = driver.findElement(By.linkText("SIGN-OFF")).getText();

		if (str.equalsIgnoreCase("SIGN-OFF")) {
			System.out.println("User is successfully logged into the portal");
		} else
			System.out.println("Login is not successful");

		driver.findElement(By.linkText("SIGN-OFF")).click();
		System.out.println("Log out is successful");
		driver.close();
	}

}
