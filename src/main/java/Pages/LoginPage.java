package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Keyworks.Keyworks;
import PageObject.LoginPOM;

public class LoginPage extends LoginPOM 
{
	WebDriver driver;
	Keyworks keyworks;
	// constructor method
	public LoginPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		keyworks = new Keyworks(driver);
	}

	public void inputUserNamePassword(String username, String password) 
	{
//		txtUserName.sendKeys(username);
//		txtPassword.sendKeys(password);
//		btnLogin.click();
		keyworks.SendKey(txtUserName, username);
		keyworks.SendKey(txtPassword, password);
		keyworks.ClickOn(btnLogin);
	}
}
