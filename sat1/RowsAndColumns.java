package week5.sat1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RowsAndColumns {

	public static void main(String[] args) {
		
		 ChromeDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   driver.get("https://html.com/tags/table/");
		   List<WebElement> rowcount = driver.findElements(By.xpath("//div[@class='render']//table//tr[1]"));
		 System.out.println(rowcount.size());
		 List<WebElement> columncount = driver.findElements(By.xpath("//div[@class='render']//table//tr//td"));
	System.out.println(columncount.size());
	/*for (int i = 0; i < columncount.size(); i++) {
		String values=columncount.get(i).getText();
		System.out.println(values);*/
	
	}
}
