package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


;

public class teest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\s.mollahasani\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://79.175.176.91:8013/");
	}

}
