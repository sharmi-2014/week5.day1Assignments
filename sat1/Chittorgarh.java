package week5.sat1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chittorgarh {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   driver.get("https://www.chittorgarh.com/");
		   driver.findElement(By.xpath("//a[@title='Stock Market']")).click();
		   driver.findElement(By.xpath("(//a[text()='NSE Bulk Deals'])[1]")).click();
		    List<WebElement> tableRow = driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//tr"));
		   
		   List<String> lst = new ArrayList<String>();
		   
		   for (int i = 1; i < tableRow.size(); i++) {
			   
			   String text = driver.findElement(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//tr["+i+"]//td[3]")).getText();
			System.out.println(text);
			lst.add(text);
		}

		   int listSize = lst.size();
		   
		   System.out.println("List Size " +listSize);
		   
		   Set<String> set = new LinkedHashSet<String>(lst);
		   
		   int setSize = set.size();
		   
		   System.out.println("Set Size "+setSize);
		   
		   if (listSize!=setSize) {
			   
			   System.out.println("There is No Duplicates");
			
		}else {
			
			System.out.println("There is Duplicates Available");
		}
	}

}
