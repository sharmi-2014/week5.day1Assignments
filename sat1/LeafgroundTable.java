package week5.sat1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundTable {
	
	public static void main(String[] args) {
		
		 ChromeDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   driver.get("https://leafground.com/table.xhtml");
		   List<WebElement> rowcount = driver.findElements(By.xpath("(//table[@role='grid'])[2]//tr"));
		   System.out.println(rowcount.size());
		    List<WebElement> columncount = driver.findElements(By.xpath("(//table[@role='grid'])[2]//tr[1]//td"));
		   System.out.println(columncount.size());
		   String text = driver.findElement(By.xpath("(//table[@role='grid'])[2]//tr[1]")).getText();
		   System.out.println(text);
		   
		   for (int i = 1; i <rowcount.size(); i++) {
			   String text2 = driver.findElement(By.xpath("(//table[@role='grid'])[2]//tr["+i+"]//td[2]")).getText();
				
				System.out.println(text2);
			}
		   
		  }
}
