package Selenium_launch;

import org.openqa.selenium.chrome.ChromeDriver;

public class Title1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com");
String title=driver.getTitle();
System.out.println(title);
	}

}
