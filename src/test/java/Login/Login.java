package Login;

import Pages.LoginPage;
import Pages.HomePage;
import Browser.BrowserFactory;
import Browser.BrowserFactory.browserType;

import org.junit.Before;
import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;



@RunWith(Parameterized.class)
public class Login {
	static WebDriver driver;
	static browserType type = browserType.Chrome;
    private String username;
    private String password;
	
    @Parameterized.Parameters
    public static Collection<Object[]>  loginInfor() {
        return Arrays.asList(new Object[][]
        	        	{
        		        	{"standard_user", "secret_sauce"}, 
        		        	{"problem_user", "secret_sauce"},
        			        {"performance_glitch_user", "secret_sauce"}
        	        	});
    }
    
    public Login(String username, String password)
    {
	    this.username = username;
	    this.password =password;
    }
    
	@Before
	public void InitTest()
	{
		driver = BrowserFactory.getDriver(type);
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void testLogin() 
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.inputUserNamePassword(username, password);
		HomePage homePage = new HomePage(driver);
		homePage.verifyHomePage();	
	}
	
	@After
	public void testCleanUp() 
	{
		driver.close();
	}
	
	@AfterClass
	public static void classCleanUp() 
	{
		driver.quit();
	}
}
