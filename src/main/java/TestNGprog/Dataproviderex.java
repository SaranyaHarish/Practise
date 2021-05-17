package TestNGprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Dataproviderex 
{
WebDriver driver;
	
	@BeforeMethod
	public void Lanuching() {

		System.setProperty("webdriver.chrome.driver", "/Users/Saranya/Downloads/chromedriver 4");
		driver = new ChromeDriver();
		driver.get("https://adactin.com/HotelApp/index.php");
	}

	
	@DataProvider(name="Regreesion")
	public Object[][] data(){
				Object TestData[][]={{"rakhesh07","Yakesh07"},{"Saran4Harish","kanishka2!"}};
		return TestData ;

	}
	
	
	
	@Test(dataProvider="Regreesion")
	public void login(String uname, String pname) {

		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys(uname);

		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys(pname);

		driver.findElement(By.id("login")).click();

	}

}

