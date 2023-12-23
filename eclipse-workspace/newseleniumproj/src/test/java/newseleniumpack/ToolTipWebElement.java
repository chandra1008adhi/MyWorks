package newseleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTipWebElement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");
		driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.xpath("//input[@id='age']")).getAttribute("title"));
		System.out.println(driver.findElement(By.linkText("ThemeRoller")).getAttribute("title"));
	}

}
