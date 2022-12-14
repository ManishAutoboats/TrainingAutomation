package Page;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeSceenshot {
	
	WebDriver driver;
	
    @BeforeMethod
	public void takeScreenshot() throws Exception {
		WebDriverManager.chromedriver().setup();

	 driver = new ChromeDriver();

		driver.get("https://www.browserstack.com/");

		driver.manage().window().maximize();
		
		
		
		TakesScreenshot scrshot= ((TakesScreenshot)driver);
		   
	File scrfile=	scrshot.getScreenshotAs(OutputType.FILE);
	
	File Destfile= new File("C:\\Users\\mdandotiya\\eclipse-workspace\\AutomationTest\\Screenshots\\"+System.currentTimeMillis()+".png");
	
	FileUtils.copyFile(scrfile, Destfile);
	
		

	}
    @Test(priority=1,description="Login test cases")
    public void login() {
    	System.out.println("Testing");
    }
    
    @Test(priority=2,description="Logout test case")
    public void logout() {
    	System.out.println("logout");
    	
    }
    
    @Test
    public void addToCart() {
    	System.out.println("Testing add to cart");
    }
    @AfterMethod
    public void tearDown() {
    	driver.quit();
    }
   
    
    

}
