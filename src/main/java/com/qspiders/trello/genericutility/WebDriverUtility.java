package com.qspiders.trello.genericutility;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
/**
 * this method is used to perform explicit wait
 * @author shaikshavali
 */
public void implicitWait(WebDriver driver){
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}

public WebElement elementVisibility(WebDriver driver,WebElement element){
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	WebElement visibleElement = wait.until(ExpectedConditions.visibilityOf(element));
	return visibleElement;
}

 public boolean verifyCompleteTitle(WebDriver driver,String expectedString){
	WebDriverWait wait = new  WebDriverWait(driver,Duration.ofSeconds(5));
	Boolean verification = wait.until(ExpectedConditions.titleIs(expectedString));
	String title=driver.getTitle();
	if(title.equals(expectedString)) {
	return verification;
	}
	else {
		return false;
	}
	}
 public boolean verifyPartialUrl(WebDriver driver,String expectedString) {
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	Boolean verification = wait.until(ExpectedConditions.urlToBe(expectedString));
	String url = driver.getCurrentUrl();
	if(url.equals(expectedString)){
		return verification;
	}
	else {
		return false;
	}
	}
 public boolean verify_logo(WebDriver driver,WebElement element,String expectedattribute,String attvalue){
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	WebElement element_log = wait.until(ExpectedConditions.visibilityOf(element));
	String attribute = element_log.getAttribute(attvalue);
	if(attribute.equals(expectedattribute)){
		return true;
	}
	else {
		return false;
	}
	}
 public boolean verify_logo(WebDriver driver,WebElement element,String expectedlogohight){
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	WebElement element_log = wait.until(ExpectedConditions.visibilityOf(element));
	String height = element_log.getCssValue("Height");
	if(height.equals(expectedlogohight)){
		return true;
	}
	else {
		return false;
	}
	}
 public boolean verify_text(WebDriver driver,WebElement element,String expectedtext){
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	 WebElement element_text = wait.until(ExpectedConditions.visibilityOf(element));
	 String text = element_text.getText();
	 if(text.equals(expectedtext)){
		 return true;
	 }
	 else {
		 return false;
	 }
	 }
 public boolean verifyPageUrl(WebDriver driver,WebElement element,String expectedString) {
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	Boolean verification = wait.until(ExpectedConditions.urlToBe(expectedString));
	String url = driver.getCurrentUrl();
	driver.navigate().back();
	if(url.equals(expectedString)){
		return verification;
	}
	else {
		return false;
	}
}
 public boolean verifyPartial_length_Url(WebDriver driver,String expectedString) {
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	 boolean url = wait.until(ExpectedConditions.urlContains(expectedString));
	 if(url){
		return true;
	}
	else {
		return false;
	}
 }
 
 public void menu_options_click(WebDriver driver,List<WebElement> element,int index){
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		 List<WebElement> visibleElement = wait.until(ExpectedConditions.visibilityOfAllElements(element));
		for (int i = 0; i < visibleElement.size(); i++) {
			if(i==index){
				visibleElement.get(index).click();
			}
		}
		 
	}

 public WebElement element_active(WebDriver driver){
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement element = driver.switchTo().activeElement();
		return element;
	}
}