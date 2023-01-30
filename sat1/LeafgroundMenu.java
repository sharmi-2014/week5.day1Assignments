package week5.sat1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LeafgroundMenu {
	public static void main(String[] args) throws IOException {
		
		 ChromeDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   driver.get("https://www.leafground.com/menu.xhtml");
		   
		  driver.findElement(By.xpath("(//span[text()='Customers'])[1]")).click();
	      WebElement customer = driver.findElement(By.xpath("(//span[text()='New'])[1]"));
	      
	      Actions builder=new Actions(driver);
	      builder.moveToElement(customer).perform();
	
	      File source = driver.getScreenshotAs(OutputType.FILE);
	     
	      File dest = new File("snap/drag.png");
	
		  FileUtils.copyFile(source, dest);
		  
		  WebElement orders = driver.findElement(By.xpath("(//span[text()='Orders'])[1]"));
	
		  builder.moveToElement(orders).perform();
		  
		  WebElement shipments = driver.findElement(By.xpath("//span[text()='Shipments']"));
		  
		  builder.moveToElement(shipments).perform();
		  
		  WebElement profile = driver.findElement(By.xpath("(//span[text()='Profile'])[1]"));
		  
		  builder.moveToElement(profile).perform();
		  
		  
		  
		  
		  
	}
}
