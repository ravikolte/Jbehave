package steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.steps.Steps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UILoginsteps extends Steps{

	WebDriver  driver = null;
	
	@Given("I am at login page")
	public void openBrowser()
	{
	   System.setProperty("webdriver.chrome.driver", "C:/Users/Ravi/Desktop/Bhanu/testprojectcuc/JbehaveDemo/drivers/chromedriver.exe");
	   driver = new ChromeDriver();
	  driver.get("https://www.google.com");
	                 
	}
	
	@Then("Enter search string")
	public void EnterSearchString()
	{
	  driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("UFC");	
	}

	@Then("Click on Enter")
	public void Enter()
	{
		driver.findElement(By.xpath("//input[@name='btnK']")).click();

	}
	
}
