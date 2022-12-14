package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	
	
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		
		
   WebElement userInputField=driver.findElement(By.xpath("//input[@id='user-name']"));

    userInputField.sendKeys("standard_user");

 
  WebElement passwordField=driver.findElement(By.xpath("//input[@id='password']"));
  passwordField.sendKeys("secret_sauce");
  
 
  WebElement loginButton= driver.findElement(By.xpath("//input[@id='login-button']"));
  
     loginButton.click();
     
     
 //   WebElement loginError=driver.findElement(By.xpath("//h3[@data-test='error']"));
     
   // String loginErrorMsg= loginError.getText();
    
     
//    WebElement logo=  driver.findElement(By.xpath("//div[@class='login_logo']"));
//    
//     logo.isDisplayed();
     
     
     
      Select se= new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
     
      se.selectByVisibleText("Price (high to low)");
	}   
       
      public void selectValueFromDropDownByby(String itemToSelect, WebElement ele){
          Select ProductDropDown = new Select(ele);
          try{
              ProductDropDown.selectByVisibleText(itemToSelect);
          }catch (Exception e){
              ProductDropDown.selectByIndex(1);
          }

      }
     
     

 
 
          
 
 
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
   
     
    
     
     
     
     
     
     
     
		
    
   
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		

		
	
	
	

}
	

