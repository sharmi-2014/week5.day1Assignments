package week5.sat1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LibraryValues {
	public static void main(String[] args) {
		
		 ChromeDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   driver.get("https://html.com/tags/table/");
		   
		   List<WebElement> values = driver.findElements(By.xpath("(//div[@class='render'])//tr[2]//td"));
			System.out.println(values.size());
			for (int i = 0; i < values.size(); i++) {
				String absoluteusage=values.get(i).getText();
				System.out.println(absoluteusage);
			}
	}
}
		   
		   
		   
			   
		   
		   
		   
		   
		   
		   
