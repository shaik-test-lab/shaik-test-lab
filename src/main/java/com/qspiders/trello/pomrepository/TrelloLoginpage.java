package com.qspiders.trello.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloLoginpage {
WebDriver driver;
public TrelloLoginpage(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(css = "input[id='user']")
private WebElement login_textField ;
@FindBy(xpath = "//h1[text()='Log in to Trello']")
private WebElement loginTextVerify;
@FindBy(css = "input[type = 'submit']")
private WebElement logincontinue_button;

//all getter and setter methods starts from here....
public WebDriver getDriver() {
	return driver;
}
public void setDriver(WebDriver driver) {
	this.driver = driver;
}
public WebElement getLogin_textField() {
	return login_textField;
}
public void setLogin_textField(WebElement login_textField) {
	this.login_textField = login_textField;
}
public WebElement getLoginTextVerify() {
	return loginTextVerify;
}
public void setLoginTextVerify(WebElement loginTextVerify) {
	this.loginTextVerify = loginTextVerify;
}
public WebElement getLogincontinue_button() {
	return logincontinue_button;
}
public void setLogincontinue_button(WebElement logincontinue_button) {
	this.logincontinue_button = logincontinue_button;
}


}
