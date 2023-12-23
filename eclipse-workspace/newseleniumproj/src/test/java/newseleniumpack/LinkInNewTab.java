package newseleniumpack;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkInNewTab {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://askomdch.com/");
		driver.findElement(By.linkText("Women")).sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
			Set ids=driver.getWindowHandles();
			ArrayList listofids = new ArrayList(ids);
			System.out.println(listofids);
			driver.switchTo().window((String)listofids.get(1));
			System.out.println("Title= "+driver.getTitle());
			Thread.sleep(5000);
			driver.switchTo().window((String)listofids.get(0));
			System.out.println("Title= "+driver.getTitle());
			System.out.println("url= "+driver.getCurrentUrl());
			
	}

}
