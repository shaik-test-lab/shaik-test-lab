package com.qspiders.trello.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloLogin_to_continue {
	WebDriver driver;
	public TrelloLogin_to_continue(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css = "input[name = 'password']")
	private WebElement Atlasian_passwordtextField;
	@FindBy(xpath = "//h5[text()='Log in to continue']")
	private WebElement atlasianloginTextverify;
	@FindBy(xpath = "//span[@class='css-178ag6o' and .='Log in']")
	private WebElement AtlasianLoginButton;
	// login to continue atlasin page
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getAtlasian_passwordtextField() {
		return Atlasian_passwordtextField;
	}
	public void setAtlasian_passwordtextField(WebElement atlasian_passwordtextField) {
		Atlasian_passwordtextField = atlasian_passwordtextField;
	}
	public WebElement getAtlasianloginTextverify() {
		return atlasianloginTextverify;
	}
	public void setAtlasianloginTextverify(WebElement atlasianloginTextverify) {
		this.atlasianloginTextverify = atlasianloginTextverify;
	}
	public WebElement getAtlasianLoginButton() {
		return AtlasianLoginButton;
	}
	public void setAtlasianLoginButton(WebElement atlasianLoginButton) {
		AtlasianLoginButton = atlasianLoginButton;
	}
}
