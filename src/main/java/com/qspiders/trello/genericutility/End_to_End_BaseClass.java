package com.qspiders.trello.genericutility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qspiders.trello.pomrepository.TrelloHomepage;
import com.qspiders.trello.pomrepository.TrelloLogin_to_continue;
import com.qspiders.trello.pomrepository.TrelloLoginpage;
import com.qspiders.trello.pomrepository.TrelloUserBoardPage;



public class End_to_End_BaseClass {
	public WebDriver driver;
	public FileUtility prop_file_data;
	public ExcelUtility excel_data;
	public WebDriverUtility webdriverutil;
	public TrelloLoginpage webelementLogin;
	public TrelloHomepage webelement;
	
	@BeforeMethod
	public void driver_execution() throws Throwable{
		prop_file_data = new FileUtility();
		excel_data = new ExcelUtility();
		webdriverutil = new WebDriverUtility();
		String value = prop_file_data.Read_data_common_prop("browser_chrome");
		if(value.equals("chrome")) {
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(opt);
			webelementLogin = new TrelloLoginpage(driver);
			webelement = new TrelloHomepage(driver);
			driver.manage().window().maximize();
			driver.get(prop_file_data.Read_data_common_prop("homepage_url"));
			String title = excel_data.getDataFromExcel("homepage", 1, 1);
			boolean title_verify = webdriverutil.verifyCompleteTitle(driver, title);
			if(title_verify){
				Reporter.log("pass: the validation of trello home page title is done");
				String url = excel_data.getDataFromExcel("homepage", 2, 1);
				boolean url_verify = webdriverutil.verifyPartialUrl(driver, url);
				if(url_verify){
					Reporter.log("pass: the validation of trello home page url is done");
					WebElement home_login = webdriverutil.elementVisibility(driver,webelement.getLogin_button());
					JavascriptExecutor jsp = (JavascriptExecutor)driver;
					jsp.executeScript("arguments[0].click();",home_login);
					String expected_url = excel_data.getDataFromExcel("LoginPage", 1, 1);
					boolean loginurl = webdriverutil.verifyPartialUrl(driver,expected_url);
					if(loginurl){
						Reporter.log("pass: the validation of trello login page url is done");
						String expected_title = excel_data.getDataFromExcel("LoginPage", 2, 1);
						boolean logintitle = webdriverutil.verifyCompleteTitle(driver, expected_title);
						if(logintitle){
							Reporter.log("pass: the validation of trello login page title is done");
							String expected_text = excel_data.getDataFromExcel("LoginPage", 3, 1);
							boolean login_page_text = webdriverutil.verify_text(driver,webelementLogin.getLoginTextVerify(), expected_text);
							if(login_page_text){
								Reporter.log("pass: the validation of trello loginpage H3 text is done");
								String email_adress = excel_data.getDataFromExcel("LoginPage", 4, 1);
								webdriverutil.elementVisibility(driver, webelementLogin.getLogin_textField()).sendKeys(email_adress);
							}
							else {
								Reporter.log("fail: the validation of trello loginpage H3 text is fail ");
							}
					}
					else {
						    Reporter.log("fail: the validation of trellopage title is fail");
						}
					}
					else {
						Reporter.log("fail: the validation of trello loginpage url is fail");
					}
					
				}
				else {
					Reporter.log("fail: the validation of trello home page url is fail");
				}
				
			}
			else {
				Reporter.log("fail: the validation of trello home page title is fail");
			}
			
		}
		else if(value.equals("edge")) {
			driver = new EdgeDriver();
		}
		else if(value.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		
		
	}
	@AfterMethod
	public void driver_terminate(){
		driver.manage().window().minimize();
		driver.quit();
	}
	
}
