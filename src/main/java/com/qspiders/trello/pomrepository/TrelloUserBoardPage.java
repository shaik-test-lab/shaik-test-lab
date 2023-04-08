package com.qspiders.trello.pomrepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloUserBoardPage {
WebDriver driver;
public TrelloUserBoardPage(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//div[@class='board-tile mod-add']")
private WebElement Create_board;//this is used to create board-1
@FindBy(css = "input[data-testid='create-board-title-input']")
private WebElement boards_title_textField;//this is used to give the title to boards page-2
@FindBy(xpath = "//button[@type='button' and text()='Create']")
private WebElement Create_board_submitbutton;//this is used to submit the board created to store-3
@FindBy(xpath = "//textarea[@placeholder='Enter a title for this card…']")
private WebElement Title_of_card_txtarea;//this is used to give title to card--4
@FindBy(xpath = "//input[@type='submit' and @value ='Add card']")
private WebElement Add_card_button;//this button is used to add the title of card-5 
@FindAll(@FindBy(xpath="//a[@class='open-card-composer js-open-card-composer']"))
private List<WebElement> all_add_a_buttons;//this button is used to locate all the added lists
@FindBy(xpath="//span[@class='placeholder']")
private WebElement AddAnotherList;//this is used to add another new list
@FindBy(xpath="//input[@class='list-name-input']")
private WebElement Enter_listTitle_textfield;//this is used to enter the list title
@FindBy(xpath="//input[@type = 'submit' and @value ='Add list']")
private WebElement AddListbutton;//this button is used to add the list 
@FindBy(xpath="//a[@class='icon-lg icon-close dark-hover js-cancel']")
private WebElement AddCard_cancel_button;// this button is used to cancel the adding of cards to list.
@FindAll(@FindBy(xpath="//a[@aria-label='List actions']"))
private List<WebElement> menuicon_to_archive;//this list will carry all the options of each list.
@FindBy(xpath="//a[@class='js-add-card']")
private WebElement add_card_by_menuicon_opt;//this option is used to add the card through option icon
@FindBy(xpath="//a[text()='Archive this list']")
private WebElement archive_list_by_menuicon_opt;//this option is used to archive the list.
@FindBy(xpath="//a[text()='Archive all cards in this list…']")
private WebElement archive_allcardslist_by_menuicon_opt;//this option is used to archive the list.
@FindBy(xpath="//button[@aria-label='Show menu']")
private WebElement board_created_page_menubar;//this will give many options.
@FindBy(xpath="//a[contains(@class,'js-open-more')]")
private WebElement board_created_page_menubar_more;
@FindBy(xpath="//a[contains(@class,'js-close-board')]")
private WebElement board_created_page_menubar_more_CloseBoard;
@FindBy(xpath="//input[@value='Close' and contains(@class,'nch-button--danger') ]")
private WebElement board_created_page_menubar_more_CloseBoard_close;
@FindBy(xpath="//button[contains(text(),'Permanently delete board')]")
private WebElement delete_board_permenently;
@FindBy(xpath="//button[contains(@class,'SEj5vUdI3VvxDc') and text() = 'Delete']")
private WebElement delete_board_permenently_delete_button;
@FindBy(xpath="//div[@class='OUdAuicP657Tka']")
private WebElement accounts_icon;
@FindBy(xpath="//button[@data-testid='account-menu-logout']")
private WebElement logout_button;
//all getter and setter methods
public WebDriver getDriver() {
	return driver;
}
public void setDriver(WebDriver driver) {
	this.driver = driver;
}
public WebElement getCreate_board() {
	return Create_board;
}
public void setCreate_board(WebElement create_board) {
	Create_board = create_board;
}
public WebElement getBoards_title_textField() {
	return boards_title_textField;
}
public void setBoards_title_textField(WebElement boards_title_textField) {
	this.boards_title_textField = boards_title_textField;
}
public WebElement getCreate_board_submitbutton() {
	return Create_board_submitbutton;
}
public void setCreate_board_submitbutton(WebElement create_board_submitbutton) {
	Create_board_submitbutton = create_board_submitbutton;
}
public WebElement getTitle_of_card_txtarea() {
	return Title_of_card_txtarea;
}
public void setTitle_of_card_txtarea(WebElement title_of_card_txtarea) {
	Title_of_card_txtarea = title_of_card_txtarea;
}
public WebElement getAdd_card_button() {
	return Add_card_button;
}
public void setAdd_card_button(WebElement add_card_button) {
	Add_card_button = add_card_button;
}
public List<WebElement> getAll_add_a_buttons() {
	return all_add_a_buttons;
}
public void setAll_add_a_buttons(List<WebElement> all_add_a_buttons) {
	this.all_add_a_buttons = all_add_a_buttons;
}
public WebElement getAddAnotherList() {
	return AddAnotherList;
}
public void setAddAnotherList(WebElement addAnotherList) {
	AddAnotherList = addAnotherList;
}
public WebElement getEnter_listTitle_textfield() {
	return Enter_listTitle_textfield;
}
public void setEnter_listTitle_textfield(WebElement enter_listTitle_textfield) {
	Enter_listTitle_textfield = enter_listTitle_textfield;
}
public WebElement getAddListbutton() {
	return AddListbutton;
}
public void setAddListbutton(WebElement addListbutton) {
	AddListbutton = addListbutton;
}
public WebElement getAddCard_cancel_button() {
	return AddCard_cancel_button;
}
public void setAddCard_cancel_button(WebElement addCard_cancel_button) {
	AddCard_cancel_button = addCard_cancel_button;
}
public List<WebElement> getMenuicon_to_archive() {
	return menuicon_to_archive;
}
public void setMenuicon_to_archive(List<WebElement> menuicon_to_archive) {
	this.menuicon_to_archive = menuicon_to_archive;
}
public WebElement getAdd_card_by_menuicon_opt() {
	return add_card_by_menuicon_opt;
}
public void setAdd_card_by_menuicon_opt(WebElement add_card_by_menuicon_opt) {
	this.add_card_by_menuicon_opt = add_card_by_menuicon_opt;
}
public WebElement getArchive_list_by_menuicon_opt() {
	return archive_list_by_menuicon_opt;
}
public void setArchive_list_by_menuicon_opt(WebElement archive_list_by_menuicon_opt) {
	this.archive_list_by_menuicon_opt = archive_list_by_menuicon_opt;
}
public WebElement getArchive_allcardslist_by_menuicon_opt() {
	return archive_allcardslist_by_menuicon_opt;
}
public void setArchive_allcardslist_by_menuicon_opt(WebElement archive_allcardslist_by_menuicon_opt) {
	this.archive_allcardslist_by_menuicon_opt = archive_allcardslist_by_menuicon_opt;
}
public WebElement getBoard_created_page_menubar() {
	return board_created_page_menubar;
}
public void setBoard_created_page_menubar(WebElement board_created_page_menubar) {
	this.board_created_page_menubar = board_created_page_menubar;
}
public WebElement getBoard_created_page_menubar_more() {
	return board_created_page_menubar_more;
}
public void setBoard_created_page_menubar_more(WebElement board_created_page_menubar_more) {
	this.board_created_page_menubar_more = board_created_page_menubar_more;
}
public WebElement getBoard_created_page_menubar_more_CloseBoard() {
	return board_created_page_menubar_more_CloseBoard;
}
public void setBoard_created_page_menubar_more_CloseBoard(WebElement board_created_page_menubar_more_CloseBoard) {
	this.board_created_page_menubar_more_CloseBoard = board_created_page_menubar_more_CloseBoard;
}
public WebElement getBoard_created_page_menubar_more_CloseBoard_close() {
	return board_created_page_menubar_more_CloseBoard_close;
}
public void setBoard_created_page_menubar_more_CloseBoard_close(
		WebElement board_created_page_menubar_more_CloseBoard_close) {
	this.board_created_page_menubar_more_CloseBoard_close = board_created_page_menubar_more_CloseBoard_close;
}
public WebElement getDelete_board_permenently() {
	return delete_board_permenently;
}
public void setDelete_board_permenently(WebElement delete_board_permenently) {
	this.delete_board_permenently = delete_board_permenently;
}
public WebElement getDelete_board_permenently_delete_button() {
	return delete_board_permenently_delete_button;
}
public void setDelete_board_permenently_delete_button(WebElement delete_board_permenently_delete_button) {
	this.delete_board_permenently_delete_button = delete_board_permenently_delete_button;
}
public WebElement getAccounts_icon() {
	return accounts_icon;
}
public void setAccounts_icon(WebElement accounts_icon) {
	this.accounts_icon = accounts_icon;
}
public WebElement getLogout_button() {
	return logout_button;
}
public void setLogout_button(WebElement logout_button) {
	this.logout_button = logout_button;
}
}
