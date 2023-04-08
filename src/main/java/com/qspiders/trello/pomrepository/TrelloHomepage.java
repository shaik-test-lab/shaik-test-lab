package com.qspiders.trello.pomrepository;
import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloHomepage {
 WebDriver driver;
 public TrelloHomepage(WebDriver driver){
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
 }

 @FindAll(@FindBy(css="button[data-testid='bignav-tab']"))
 private List<WebElement> Home_menuOptions;
 
 @FindBy(xpath="(//a[contains(text(),'Log in')])[1]")
 private WebElement login_button;

 @FindBy(xpath="//h3[text() = 'Explore the features that help your team succeed']")
 private WebElement Feature_txtVerify;
 
 @FindBy(xpath="//h3[contains(text(),'Take a page out of these pre')]")
 private WebElement Solution_txtVerify;
 
 @FindBy(xpath="(//p[text() = 'Free plan'])[1]")
 private WebElement plans_txtVerify;
 
 @FindBy(xpath="//h3[text()='Learn & connect']")
 private WebElement Resource_txtVerify;
 
 @FindBy(xpath="//button[text()='Solutions']/../..//*[@aria-label='Atlassian Trello']")
 private WebElement Logo;
 
 @FindBy(xpath="(//a[text()='Pricing'])[1]")
 private WebElement pricinglink;


 //all getter and setter methods.
 
 public WebDriver getDriver() {
	return driver;
}

public void setDriver(WebDriver driver) {
	this.driver = driver;
}

public List<WebElement> getHome_menuOptions() {
	return Home_menuOptions;
}

public void setHome_menuOptions(List<WebElement> home_menuOptions) {
	Home_menuOptions = home_menuOptions;
}

public WebElement getFeature_txtVerify() {
	return Feature_txtVerify;
}

public void setFeature_txtVerify(WebElement feature_txtVerify) {
	Feature_txtVerify = feature_txtVerify;
}

public WebElement getSolution_txtVerify() {
	return Solution_txtVerify;
}

public void setSolution_txtVerify(WebElement solution_txtVerify) {
	Solution_txtVerify = solution_txtVerify;
}

public WebElement getPlans_txtVerify() {
	return plans_txtVerify;
}

public void setPlans_txtVerify(WebElement plans_txtVerify) {
	this.plans_txtVerify = plans_txtVerify;
}

public WebElement getResource_txtVerify() {
	return Resource_txtVerify;
}

public void setResource_txtVerify(WebElement resource_txtVerify) {
	Resource_txtVerify = resource_txtVerify;
}

public WebElement getLogo() {
	return Logo;
}

public void setLogo(WebElement logo) {
	Logo = logo;
}

public WebElement getPricinglink() {
	return pricinglink;
}

public void setPricinglink(WebElement pricinglink) {
	this.pricinglink = pricinglink;
}
public WebElement getLogin_button() {
	return login_button;
}

public void setLogin_button(WebElement login_button) {
	this.login_button = login_button;
}

}
