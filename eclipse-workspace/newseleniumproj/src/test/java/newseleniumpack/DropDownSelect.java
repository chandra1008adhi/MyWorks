package newseleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownSelect {
	public static void main(String [] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement drpdwn=driver.findElement(By.xpath("//select[@name='country']"));
		driver.manage().window().maximize();
		Select countrydrpdwn=new Select(drpdwn);
		countrydrpdwn.selectByVisibleText("INDIA");
		Thread.sleep(5000);
		countrydrpdwn.selectByValue("PAKISTAN");
		Thread.sleep(5000);
		countrydrpdwn.selectByIndex(8);
		for(WebElement x:countrydrpdwn.getOptions()) {
			System.out.println(x.getText());
		}
		
	}
}
