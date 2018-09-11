package stepDefs;

import java.util.List;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCollection {
	WebDriver driver;
	@Test
	public void method1() throws Exception{
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com");
		System.out
				.println("Application has opened successfully and the title of the page is "
						+ driver.getTitle());
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Cruises")).click();
		WebElement tableEle=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/th/table/tbody"));
		
		List<WebElement> t_rows=tableEle.findElements(By.tagName("tr"));
		
		System.out.println(t_rows.size());
		
		for(WebElement row: t_rows){
			
			List<WebElement> t_cols=row.findElements(By.tagName("td"));
			
			for(WebElement col : t_cols){
				if(col.getText().equalsIgnoreCase("sat"))
				System.out.println(row.getText());
			}
			
		}
		
		driver.close();
		
		
		
		
	}

}
