package PageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class HomePOM 
{
	@FindBy(xpath = "//*[@class = 'inventory_item']")
	public List<WebElement> lblItems;
}
