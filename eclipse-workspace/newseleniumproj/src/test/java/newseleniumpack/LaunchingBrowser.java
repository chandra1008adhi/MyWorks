package newseleniumpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchingBrowser {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.yahoo.com/");
		System.out.println("Title = "+driver.getTitle());
		System.out.println("Url = "+driver.getCurrentUrl());
		Thread.sleep(3000);
		System.out.println("page source = "+driver.getPageSource());
	}

}
