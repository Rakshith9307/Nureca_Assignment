package Components;
import java.util.Calendar;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class DriverBrowser {
	static WebDriver driver;
	Actions action;
	public static WebDriver InitializeDriver() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//src//main//java//Config//chromedriver");
		ChromeOptions choptions = new ChromeOptions();
		choptions = new ChromeOptions();
		choptions.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		choptions.setExperimentalOption("useAutomationExtension", false);
		choptions.addArguments("--test-type");
		choptions.addArguments("--disable-gpu");
		choptions.addArguments("--no-first-run");
		choptions.addArguments("--no-default-browser-check");
		choptions.addArguments("--ignore-certificate-errors");
		driver= new ChromeDriver(choptions);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		return driver;
	}
	
	
	@BeforeClass
	public void beforeTest() {
		String toolType = "Selenium";
		if (toolType.equals("Selenium")) {
			try {
				driver = InitializeDriver();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}
	
	
	/**********************************************************************************************************
	 * @Objective:Perform cleanup activities after Test execution
	 * @InputParameters:
	 * @OutputParameters:
	 * @author:Rakshith M
	 * @Date : 22-July-2021
	 **********************************************************************************************************/
	@AfterClass
	public static void afterTest() {

		if (driver == null) {
			
		} else {

			driver.quit();
			driver = null;
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}


}
