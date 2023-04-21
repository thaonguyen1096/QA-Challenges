package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.assertEquals;

import PageObject.HomePOM;
import io.qameta.allure.Step;

public class HomePage extends HomePOM
{
	WebDriver driver;
	// constructor method
	public HomePage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@Step("Verify Home Pages")
	public void verifyHomePage()
	{
		assertEquals("Swag Labs", driver.getTitle());
		assertEquals(6, lblItems.size());
	}
}
