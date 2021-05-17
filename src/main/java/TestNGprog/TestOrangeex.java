package TestNGprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestOrangeex {

	WebDriver driver;

	@BeforeTest
	public void Lanuching() {

		System.setProperty("webdriver.chrome.driver", "/Users/Harish/Desktop/selenium/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	
	@Test
	@Parameters({ "uname", "pname" })
	public void login(String uname, String pname) {

		WebElement user = driver.findElement(By.id("txtUsername"));
		user.sendKeys(uname);

		WebElement pass = driver.findElement(By.id("txtPassword"));
		pass.sendKeys(pname);

		driver.findElement(By.id("btnLogin")).click();

	}

}
