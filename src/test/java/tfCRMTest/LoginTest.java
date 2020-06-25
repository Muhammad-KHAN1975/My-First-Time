package tfCRMTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

;

public class LoginTest {

	public static void main(String[] args) {
		launchBrowser();
		loginTest();
		tearDown();
	}

	static WebDriver driver;

	public static void launchBrowser() {

		// setting the properties for chrome driver
		System.setProperty("webdriver.chrome.driver",
				"\\Winter2020Selenium\\objectspy.space1\\Drivers\\chromedriver.exe");

		// creating web driver object
		driver = new ChromeDriver();

		// maximizing window
		driver.manage().window().maximize();


	}

	public static void loginTest() {

		// go to the link
		driver.get("http://techfios.com/test/billing/?ng=admin/");

		// identifying the username box and passing username
		driver.findElement(By.id("username")).sendKeys(" techfiosdemo@gmail.com");

		// identifying the password box and passing password
		driver.findElement(By.id("password")).sendKeys("abc123");

		// identifying the login button box and click it.
		driver.findElement(By.className("login")).click();

	}

	public static void tearDown() {

		// closing the driver
		driver.close();

	}

}
