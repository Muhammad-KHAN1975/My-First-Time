package tfCRMTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) {

		String browser = "firefox";
		// String browser = "Firefox";

		WebDriver driver;

		if (browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"\\Winter2020Selenium\\objectspy.space1\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browser == "firefox") {
			// } else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Winter2020Selenium\\crmtechfios\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

	}
}
