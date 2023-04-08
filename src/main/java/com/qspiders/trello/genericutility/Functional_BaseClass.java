package com.qspiders.trello.genericutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Functional_BaseClass {
FileUtility prop_file_data = new FileUtility();
public WebDriver driver;

@BeforeMethod
public void driver_execution() throws Throwable{
	
	String value = prop_file_data.Read_data_common_prop("browser_chrome");
	if(value.equals("chrome")) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(opt);
	}
	else if(value.equals("edge")) {
		driver = new EdgeDriver();
	}
	else if(value.equals("firefox")) {
		driver = new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.get(prop_file_data.Read_data_common_prop("homepage_url"));
	
}
@AfterMethod
public void driver_terminate(){
	driver.manage().window().minimize();
	driver.quit();
}
}
