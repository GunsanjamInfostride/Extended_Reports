package Driver;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Launch_Browser 
{
	public static WebDriver driver;
	public static String path;

@BeforeSuite
public void LaunchBrowser()
{
	WebDriverManager.chromedriver().setup();
	
	
	driver=new ChromeDriver();
	//Implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	
	//Deleting Cookies
	driver.manage().deleteAllCookies();
	
	//Maximize browser window
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
}

@AfterSuite
public void Close_Browser()
{
	//extent.flush();
	driver.close();
}
}

