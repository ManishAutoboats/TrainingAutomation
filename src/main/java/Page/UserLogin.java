package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserLogin {
	String sheetName = "Sheet1";
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
	
		WebDriverManager.chromedriver().setup();
 driver=new ChromeDriver();	
		driver.get(("https://www.saucedemo.com/"));
		
		driver.manage().window().maximize();
		
		
	}
	
 @DataProvider
public Object[][] testdata() {
		Object data[][]= TestUtill.getTestData(sheetName);
		return data;
	}

	
	
	@Test(dataProvider="testdata")
	public void login(String uname,String pass) throws Exception {
		
	WebElement username= driver.findElement(By.xpath("//input[@id='user-name']"));
	  username.sendKeys(uname);
	WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
	password.sendKeys(pass);
	Thread.sleep(3000);
		
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
