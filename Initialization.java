package page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Initialization {

	



		
		private static WebDriver driver = null;
	    private static final String Hotel="https://www.facebook.com/";
	    
	    public static WebDriver getDriver() {
	        return driver;
	    }

	    public static void setDriver(WebDriver driver) {
	    	Initialization.driver = driver;
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    }

	    @BeforeClass
	    public void intializeWebDriver() {
	        System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
	        driver = new ChromeDriver();

//	        System.setProperty("webdriver.gecko.driver", "/Users/mohammadmuntakim1/Downloads/geckodriver");
//	        driver = new FirefoxDriver();
	        
	        driver.get(Hotel);
	    }
	    
	    @AfterClass
	    public void tearDown() throws InterruptedException {
	        if(driver != null) {
	            driver.manage().deleteAllCookies();
	            Thread.sleep(4000);
	            driver.close();
	        }
	    }
	}


