package Page;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Propertyfile {
	 Properties prop;

@Test
	 public void configReader() {
		 
		 prop= new Properties();
		try {
			 File src= new File("C:\\Users\\mdandotiya\\eclipse-workspace\\AutomationTest\\Doc\\employeeInfo.properties");

				FileInputStream file= new  FileInputStream(src);
			prop.load(file);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(prop.getProperty("url"));
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(prop.getProperty("usernameField"))).sendKeys(prop.getProperty("username"));
		 
		 
	 }


	
}
		
		
	 
	 
	 



