package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class UITest {
	public static WebDriver driver;

	@BeforeClass
	public void setUp() {
		// Initialize ChromeDriver
		System.setProperty("webdriver.chrome.driver", "C:/Program Files/Driver/chromedriver-win64/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void checkProductName() throws InterruptedException {
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(5000);
		WebElement firstResult = driver.findElement(By.cssSelector(".a-size-medium"));
		if (firstResult.getText().contains("Apple iPhone")) {
			System.out.println("Item contains Apple iPhone");
		}
	}

	@AfterClass
	public void tearDown() {
		// Close the browser
		if (driver != null) {
			driver.quit();
		}
	}
}
