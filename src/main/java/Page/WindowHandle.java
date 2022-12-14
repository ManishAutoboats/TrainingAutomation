package Page;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	public static void main(String[] args) throws Exception {
		
		
	WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		
		driver.manage().window().maximize();
		
		String homePageTitle=driver.getTitle();
		System.out.println(homePageTitle);
		
	WebElement remoteLink=	driver.findElement(By.xpath("//div[@class='ntc__chips-row']/a[@title='Remote']"));
	
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOf(remoteLink));
	
	
	String parentwindow= driver.getWindowHandle();
	
	System.out.println(parentwindow);
	remoteLink.click();
	
	
	
	
Set<String>childwindows=driver.getWindowHandles();  // java collection-----LIST SET

Iterator<String> i= childwindows.iterator();

 while(i.hasNext()) {
	 
	 String child=i.next();
	 
	 if(!parentwindow.equals(child)) {
		 
		 driver.switchTo().window(child);
		 
		String childTitle= driver.getTitle();
		System.out.println(childTitle);
		 Thread.sleep(3000);
		 
		 driver.quit();
	 }
	 
	 
	 
 }
 driver.switchTo().window(parentwindow);
 System.out.println(driver.getTitle());



	
	
	
	
	
	
	
	
		
		
		
		

	}

}
