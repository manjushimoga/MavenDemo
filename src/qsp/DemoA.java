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

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class DemoA {
	ExtentReports er=new ExtentReports("./ExtentReport/ExtentReport.html");
	@Test
	public void testA(XmlTest x) throws MalformedURLException{
//		String browser=x.getParameter("browser");
//		String remoteip=x.getParameter("ipaddr");
////		System.setProperty("webdriver.gecko.driver", "C:\\Manjunatha\\SelRel\\geckodriver.exe");
////		URL remote_addr=new URL("http://10.10.4.166:4444/wd/hub");
//		URL remote_addr=new URL(remoteip);
//		DesiredCapabilities dc=new DesiredCapabilities();
//		dc.setBrowserName(browser);
		
		ExtentTest et = er.startTest("testA");
		et.log(LogStatus.PASS,"Hi---- Bangalore");
		er.endTest(et);
	
		WebDriver driver=new FirefoxDriver();
//		WebDriver driver=new RemoteWebDriver(remote_addr,dc);
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
		
//	driver.close();
	}
	
	@Test
	public void testB(XmlTest x) throws MalformedURLException{
		
		ExtentTest et = er.startTest("testB");
		et.log(LogStatus.FAIL,"Hi---- Chennai");
		er.endTest(et);		
		WebDriver driver=new FirefoxDriver();
//		WebDriver driver=new RemoteWebDriver(remote_addr,dc);
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
		er.flush();
//	driver.close();
	}
	
	

}
