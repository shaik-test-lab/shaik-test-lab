package com.qspiders.trello.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloLogout_page {
	WebDriver driver;
	public TrelloLogout_page(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
  @FindBy(css="button[id='logout-submit']")
  private WebElement logout_page_logoutbutton;


public void setLogout_page_logoutbutton(WebElement logout_page_logoutbutton) {
	this.logout_page_logoutbutton = logout_page_logoutbutton;
}
public WebElement getLogout_page_logoutbutton() {
	// TODO Auto-generated method stub
	return logout_page_logoutbutton;
}
}
