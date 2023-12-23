package newseleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InputBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		WebElement inputBox=driver.findElement(By.xpath("//input[@placeholder='Search store']"));
		inputBox.sendKeys("sample");
		Thread.sleep(5000);
		inputBox.clear();
		inputBox.sendKeys("diamond");
		Thread.sleep(5000);
		inputBox.clear();
		System.out.println(inputBox.getAttribute("class"));
		System.out.println(inputBox.getAttribute("id"));
		System.out.println(inputBox.getAttribute("placeholder"));
		System.out.println(inputBox.getText());
		
	}

}
