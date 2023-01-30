package week5.sat1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Droppable2 {
	public static void main(String[] args) {
		
		 ChromeDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   driver.get("https://jqueryui.com/droppable/");
		  driver.findElement(By.xpath("//a[text()='Droppable']")).click();
		  driver.switchTo().frame(0);
		  WebElement source = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
		  WebElement target = driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable']"));
		  
		  Actions builder=new Actions(driver);
		  builder.dragAndDrop(source, target).perform();
	
	
	
	
	
	
	}
}
