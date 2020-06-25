package tfCRMTest;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestJunit {

	WebDriver driver;

	@Before
	public  void launchBrowser() {

		// setting the properties for chrome driver
		System.setProperty("webdriver.chrome.driver",
				"\\Winter2020Selenium\\objectspy.space1\\Drivers\\chromedriver.exe");

		// creating web driver object
		driver = new ChromeDriver();

		// maximizing window
		driver.manage().window().maximize();
		
		// go to the link
		driver.get("http://techfios.com/test/billing/?ng=admin/");

	}
	
	@Test
	public  void loginTest() throws InterruptedException {

		
		// identifying the username box and passing username
		driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");

		// identifying the password box and passing password
		driver.findElement(By.id("password")).sendKeys("abc123");

		// identifying the login button box and click it.
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("login")).click();
		
		

		Thread.sleep(5000);

	}
	
    
	@After
	public  void tearDown() {

		// closing the driver
		driver.close();

	}
}
