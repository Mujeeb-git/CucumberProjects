package stepDefs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test1 {
	WebDriver driver;
	JavascriptExecutor jse;

	@Given("^Application is opened$")
	public void application_is_opened() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
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

	@When("^Register with country name as \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
	public void register_with_country_name_as_and(String arg1, String arg2,
			String arg3) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		jse = (JavascriptExecutor) driver;
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(3000);
		Select countryDrpdwn = new Select(driver.findElement(By
				.xpath("//select[@name='country']")));
		countryDrpdwn.selectByVisibleText(arg1);
		

		WebElement userName = driver.findElement(By.xpath("//*[@id='email']"));
		jse.executeScript("arguments[0].scrollIntoView(true);", userName);
		userName.sendKeys(arg2);

		WebElement password = driver.findElement(By
				.xpath("//input[@name='password']"));
		jse.executeScript("arguments[0].scrollIntoView(true);", password);
		password.sendKeys(arg3);

		WebElement cPassword = driver.findElement(By
				.xpath("//input[@name='confirmPassword']"));
		jse.executeScript("arguments[0].scrollIntoView(true);", cPassword);
		cPassword.sendKeys(arg3);

		WebElement submitBtn = driver.findElement(By
				.xpath("//input[@name='register']"));
		jse.executeScript("arguments[0].scrollIntoView(true);", submitBtn);
		submitBtn.click();

		Thread.sleep(3000);

	}

	@Then("^User should be registered succesfully the \"([^\"]*)\"$")
	public void user_should_be_registered_succesfully(String arg1)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		String msg = driver.findElement(By.xpath("//a/font/b")).getText();
		if (msg.equalsIgnoreCase("Note: Your user name is " + arg1 + ".")) {
			System.out.println("User: " + arg1 + " is successfully registered");
		} else
			System.out.println("User: " + arg1 + " is not registered");

		Thread.sleep(1000);
		driver.close();

	}

	@Given("^the following users exist$")
	public void the_following_users_exist(DataTable arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		// throw new PendingException();
		List<List<String>> dataSet = arg1.raw();
		int rowCount = dataSet.size();
		int colCount = dataSet.get(0).size();
		
		for (int i = 1; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				System.out.println("Data" + i+"-" +j + " is: "
						+ dataSet.get(i).get(j));
			}

		}

	}
}
