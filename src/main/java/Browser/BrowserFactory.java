package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserFactory {

    public enum browserType {
        Chrome,
        Firefox,
        Edge
    }
    public static WebDriver getDriver(browserType type){
        WebDriver driver = null;

        switch (type){
            case Chrome:
        		WebDriverManager.chromedriver().setup();
        		driver = new ChromeDriver();	
                break;
            case Firefox:
        		WebDriverManager.firefoxdriver().setup();
        		driver = new FirefoxDriver();	
                break;
            case Edge:
        		WebDriverManager.edgedriver().setup();
        		driver = new EdgeDriver();	
                break;
        }
        return driver;
    }
}
