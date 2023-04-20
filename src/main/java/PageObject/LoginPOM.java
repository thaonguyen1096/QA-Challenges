package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class LoginPOM 
{

	@FindBy(id = "user-name")
	protected WebElement txtUserName;

	@FindBy(id = "password")
	protected WebElement txtPassword;
	
	@FindBy(id="login-button")
	protected WebElement btnLogin;	
}
