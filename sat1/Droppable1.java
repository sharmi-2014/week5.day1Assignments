package week5.sat1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Droppable1 {

	public static void main(String[] args) {
		
		 ChromeDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   driver.get("https://jqueryui.com/droppable/");
		  driver.findElement(By.xpath("//a[text()='Droppable']")).click();
		  driver.switchTo().frame(0);
	WebElement source = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
	
	WebElement target = driver.findElement(By.xpath("//p[text()='Drop here']"));
		
	Actions builder= new Actions(driver);
	builder.dragAndDrop(source, target).perform();
	System.out.println(source.getCssValue("color"));
	String cssvalue = driver.findElement(By.xpath("//p[text()='Dropped!']")).getText();
	
	System.out.println(cssvalue);
	
	
	
	}	
}
