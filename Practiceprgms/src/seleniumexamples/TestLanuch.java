package seleniumexamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLanuch {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}

}
