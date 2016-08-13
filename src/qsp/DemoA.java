package qsp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class DemoA {
	
	@Test
	public void testA(XmlTest x) throws MalformedURLException{
//		String browser=x.getParameter("browser");
//		String remoteip=x.getParameter("ipaddr");
////		System.setProperty("webdriver.gecko.driver", "C:\\Manjunatha\\SelRel\\geckodriver.exe");
////		URL remote_addr=new URL("http://10.10.4.166:4444/wd/hub");
//		URL remote_addr=new URL(remoteip);
//		DesiredCapabilities dc=new DesiredCapabilities();
//		dc.setBrowserName(browser);
		WebDriver driver=new FirefoxDriver();
//		WebDriver driver=new RemoteWebDriver(remote_addr,dc);
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
		
//	driver.close();
	}

}
