package TestNGprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterex {

	WebDriver driver;
	
	@BeforeTest
	public void Lanuching() {

		System.setProperty("webdriver.chrome.driver", "/Users/Saranya/Downloads/chromedriver 4");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@Parameters({"uname","pname"})
	@Test
	public void login(String Admin, String admin123) {

		WebElement user = driver.findElement(By.id("txtUsername"));
		user.sendKeys(Admin);

		WebElement pass = driver.findElement(By.id("txtPassword"));
		pass.sendKeys(admin123);

		driver.findElement(By.id("btnLogin")).click();

	}

}
