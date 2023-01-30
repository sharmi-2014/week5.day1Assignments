package week5.sat1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDrag {
	
	public static void main(String[] args) {
		
		 ChromeDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   driver.get("https://www.leafground.com/drag.xhtml");
		  WebElement drag = driver.findElement(By.xpath("//span[text()='Drag me around']"));
		  System.out.println(drag.getLocation());
	
		  Actions builder =new Actions(driver);
		  builder.dragAndDropBy(drag,232,245 ).perform();
		  //verify
		  System.out.println(drag.getLocation());
	}
}
