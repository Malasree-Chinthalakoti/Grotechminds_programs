package Selenium_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Dlogin%2Bamazon%2Baccount%26adgrpid%3D59671903835%26ext_vrnc%3Dhi%26hvadid%3D590652406969%26hvdev%3Dc%26hvlocphy%3D1007740%26hvnetw%3Dg%26hvqmt%3Db%26hvrand%3D3070834976469458104%26hvtargid%3Dkwd-294882733100%26hydadcr%3D24542_2265395%26tag%3Dgooginhydr1-21%26ref%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	WebElement un=driver.findElement(By.name("email"));
	un.sendKeys("malasrirekha@gmail.com");
	//WebElement cn=driver.findElement(By.id("continue"));
	//cn.click();
	WebElement ct=driver.findElement(By.id("createAccountSubmit"));
	ct.click();
	WebElement cn=driver.findElement(By.name("customerName"));
	cn.sendKeys("malasri");
	WebElement pn=driver.findElement(By.id("ap_phone_number"));
	pn.sendKeys("1234567890");
	WebElement pw=driver.findElement(By.id("ap_password"));
	pw.sendKeys("mana1231");
	WebElement pn1=driver.findElement(By.id("continue"));
	pn1.click();
	//WebElement pn2=driver.findElement(By.tagName("button"));
	//pn2.click();
	}

}
