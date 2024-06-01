package Selenium_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Grotechdraganddrop_total {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		WebElement drag1=driver.findElement(By.xpath("(//div[@id='container'])[1]"));
		
		WebElement drag2=driver.findElement(By.xpath("(//div[@id='container'])[2]"));
		WebElement drag3=driver.findElement(By.xpath("(//div[@id='container'])[3]"));
		WebElement drag4=driver.findElement(By.xpath("(//div[@id='container'])[4]"));
		WebElement drag5=driver.findElement(By.xpath("(//div[@id='container'])[5]"));
		WebElement drag6=driver.findElement(By.xpath("(//div[@id='container'])[6]"));
		WebElement drag7=driver.findElement(By.xpath("(//div[@id='container'])[7]"));
		WebElement drag8=driver.findElement(By.xpath("(//div[@id='container'])[8]"));
		WebElement drag9=driver.findElement(By.xpath("(//div[@id='container'])[9]"));
		WebElement drag10=driver.findElement(By.xpath("(//div[@id='container'])[10]"));
		WebElement drag11=driver.findElement(By.xpath("(//div[@id='container'])[11]"));
		WebElement drag12=driver.findElement(By.xpath("(//div[@id='container'])[12]"));
		
		WebElement drop=driver.findElement(By.xpath("//div[@id='div2']"));
		
		
		Actions a=new Actions(driver);
		a.dragAndDrop(drag1,drop).perform();
		a.dragAndDrop(drop,drag1).perform();
		
		a.dragAndDrop(drag2,drop).perform();
		a.dragAndDrop(drop,drag2).perform();
		
		a.dragAndDrop(drag3,drop).perform();
		a.dragAndDrop(drop,drag3).perform();
		
		a.dragAndDrop(drag4,drop).perform();
		a.dragAndDrop(drop,drag4).perform();
		
		a.dragAndDrop(drag5,drop).perform();
		a.dragAndDrop(drop,drag5).perform();
		
		a.dragAndDrop(drag6,drop).perform();
		a.dragAndDrop(drop,drag6).perform();
		
		a.dragAndDrop(drag7,drop).perform();
		a.dragAndDrop(drop,drag7).perform();
		
		a.dragAndDrop(drag8,drop).perform();
		a.dragAndDrop(drop,drag8).perform();
		
		a.dragAndDrop(drag9,drop).perform();
		a.dragAndDrop(drop,drag9).perform();
		
		a.dragAndDrop(drag10,drop).perform();
		a.dragAndDrop(drop,drag10).perform();
		
		a.dragAndDrop(drag11,drop).perform();
		a.dragAndDrop(drop,drag11).perform();
		
		a.dragAndDrop(drag12,drop).perform();
		a.dragAndDrop(drop,drag12).perform();
		
		}
	}


