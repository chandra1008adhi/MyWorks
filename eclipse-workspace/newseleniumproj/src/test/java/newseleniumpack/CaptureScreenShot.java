package newseleniumpack;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenShot {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//Full Page Screen Shot
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File(".//screeshots//homepage.png");
		try {
			FileUtils.copyFile(src, trg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Screenshot of a portion of a page
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement section= driver.findElement(By.xpath("//div[@class='_3oBhRa col col-2-5 _4H6HH5']"));
		src=section.getScreenshotAs(OutputType.FILE);
		trg=new File(".//screeshots//Section.png");
		try {
			FileUtils.copyFile(src, trg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Screenshot of a web element of a page
				driver.navigate().to("https://www.amazon.com/");
				driver.manage().window().maximize();
				WebElement input = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
				src=input.getScreenshotAs(OutputType.FILE);
				trg=new File(".//screeshots//Input.png");
				try {
					FileUtils.copyFile(src, trg);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
}
