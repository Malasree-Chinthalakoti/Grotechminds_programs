package Selenium_launch;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_launchbrowser1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com");
driver.getWindowHandle();
driver.getWindowHandles();
driver.manage().window().maximize();
driver.manage().window().minimize();
System.out.println(driver.getWindowHandle());
System.out.println(driver.getWindowHandles());
driver.close();
driver.quit();
	}
}
