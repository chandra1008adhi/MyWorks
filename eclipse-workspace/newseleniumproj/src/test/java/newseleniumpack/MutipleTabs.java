package newseleniumpack;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MutipleTabs {
	
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://askomdch.com/");
			driver.switchTo().newWindow(WindowType.TAB);
			driver.get("https://jqueryui.com/tooltip/");
			driver.switchTo().newWindow(WindowType.WINDOW);
			driver.get("https://www.google.co.in/webhp?hl=en");
		}

}
