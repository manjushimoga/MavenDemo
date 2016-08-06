package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DemoA {
	
	@Test
	public void testA(){
		
//		System.setProperty("webdriver.gecko.driver", "C:\\Manjunatha\\SelRel\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
		
//		driver.quit();
	}

}
