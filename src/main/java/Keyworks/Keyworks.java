package Keyworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class Keyworks 
{
	WebDriver driver;
	// constructor method
	public Keyworks(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void ClickOn(WebElement element)
	{
		Actions actions = new Actions(driver);
        actions.click(element).perform();;
	}
	
	public void SendKey(WebElement element, String text)
	{
		Actions actions = new Actions(driver);
        actions.sendKeys(element, text).perform();
	}
}
