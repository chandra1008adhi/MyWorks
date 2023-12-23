package newseleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementStatus {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		WebElement we = driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[4]/a"));
		System.out.println(we.isDisplayed());
		System.out.println(we.isEnabled());
		Thread.sleep(5000);
		WebElement maleRadio=driver.findElement(By.xpath("//input[@id='gender-male']"));
		System.out.println(maleRadio.isSelected());
	}

}
