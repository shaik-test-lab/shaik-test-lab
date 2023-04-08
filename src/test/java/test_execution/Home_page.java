package test_execution;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.qspiders.trello.genericutility.End_to_End_BaseClass;
import com.qspiders.trello.genericutility.ExcelUtility;
import com.qspiders.trello.genericutility.Functional_BaseClass;
import com.qspiders.trello.genericutility.WebDriverUtility;
import com.qspiders.trello.pomrepository.TrelloHomepage;
import com.qspiders.trello.pomrepository.TrelloLogin_to_continue;
import com.qspiders.trello.pomrepository.TrelloLoginpage;
import com.qspiders.trello.pomrepository.TrelloLogout_page;
import com.qspiders.trello.pomrepository.TrelloUserBoardPage;

public class Home_page extends End_to_End_BaseClass {
	public TrelloLogin_to_continue webelementlogincontinue;
	public TrelloUserBoardPage webelementboards;
	@Test()
public void TL_001_EndtoEnd() throws IOException, Throwable{
	webdriverutil.elementVisibility(driver, webelementLogin.getLogincontinue_button()).click();
	String atlasian_url = excel_data.getDataFromExcel("Atlasian_page", 1, 1);
	boolean url_contains_atlasian = webdriverutil.verifyPartial_length_Url(driver,atlasian_url);
	if(url_contains_atlasian){
		Reporter.log("pass: validation of the atlasian page url is done");
		String title_atlasian = excel_data.getDataFromExcel("Atlasian_page", 2, 1);
		boolean title_atlasian_valid= webdriverutil.verifyCompleteTitle(driver, title_atlasian);
		if(title_atlasian_valid){
			Reporter.log("pass: validation of the atlasian page title is done");
			webelementlogincontinue = new TrelloLogin_to_continue(driver);
			webelementboards = new TrelloUserBoardPage(driver);
			String password = excel_data.getDataFromExcel("Atlasian_page", 3, 1);
			webdriverutil.elementVisibility(driver,webelementlogincontinue.getAtlasian_passwordtextField()).sendKeys(password);
			webdriverutil.elementVisibility(driver,webelementlogincontinue.getAtlasianLoginButton()).click();
			String boards_page_url = excel_data.getDataFromExcel("boardspage", 1, 1);
			boolean boards_page_url_valid = webdriverutil.verifyPartialUrl(driver,boards_page_url);
			if(boards_page_url_valid){
				Reporter.log("pass: validation of the boards page url is done");
				String boards_page_title = excel_data.getDataFromExcel("boardspage", 2, 1);
				boolean boards_page_title_valid= webdriverutil.verifyCompleteTitle(driver, boards_page_title);
				if(boards_page_title_valid){
					Reporter.log("pass: validation of boards page title is done");
					webdriverutil.elementVisibility(driver,webelementboards.getCreate_board()).click();
					String board_title = excel_data.getDataFromExcel("boardspage",3, 1);
					webdriverutil.elementVisibility(driver,webelementboards.getBoards_title_textField()).sendKeys(board_title);
					webdriverutil.elementVisibility(driver, webelementboards.getCreate_board_submitbutton()).click();
					String list_title = excel_data.getDataFromExcel("boardspage", 4, 1);
					webdriverutil.elementVisibility(driver, webelementboards.getEnter_listTitle_textfield()).sendKeys(list_title);
					webdriverutil.elementVisibility(driver, webelementboards.getAddListbutton()).click();
					webdriverutil.implicitWait(driver);
					webdriverutil.menu_options_click(driver,webelementboards.getAll_add_a_buttons(), 0);
					String title1 = excel_data.getDataFromExcel("boardspage",5, 1);
					webdriverutil.elementVisibility(driver,webelementboards.getTitle_of_card_txtarea()).sendKeys(title1);
					webdriverutil.elementVisibility(driver, webelementboards.getAdd_card_button()).click();
					String title2 = excel_data.getDataFromExcel("boardspage",6, 1);
					webdriverutil.elementVisibility(driver,webelementboards.getTitle_of_card_txtarea()).sendKeys(title2);
					webdriverutil.elementVisibility(driver, webelementboards.getAdd_card_button()).click();
					String title3 = excel_data.getDataFromExcel("boardspage",7, 1);
					webdriverutil.elementVisibility(driver,webelementboards.getTitle_of_card_txtarea()).sendKeys(title3);
					webdriverutil.elementVisibility(driver, webelementboards.getAdd_card_button()).click();
					Reporter.log("creating of the cast with name of spiderman, ironman, hulk. is pass");
					webdriverutil.elementVisibility(driver,webelementboards.getAddCard_cancel_button()).click();
					webdriverutil.elementVisibility(driver, webelementboards.getAccounts_icon()).click();
					webdriverutil.elementVisibility(driver, webelementboards.getLogout_button()).click();
					TrelloLogout_page webelementlogout = new TrelloLogout_page(driver);
					webdriverutil.elementVisibility(driver,webelementlogout.getLogout_page_logoutbutton()).click();;
					String end_title = excel_data.getDataFromExcel("homepage", 1, 1);
					boolean end_title_verify = webdriverutil.verifyCompleteTitle(driver, end_title);
					if(end_title_verify){
						Reporter.log("pass: validation of home page after end to end scinero is pass");
					}else {Reporter.log("fail: validation of home page after end to end scinero is fail");}}
				else {Reporter.log("fail: validation of boards page title is fail");}}
			else {Reporter.log("fail: validation of boards page url is fail");}}
		else {Reporter.log("fail: the validation of atlasian page title is fail");}}
	else {Reporter.log("fail: the validation of atlasian page url is fail");}}
@Test()
public void TL_002_EndtoEnd() throws IOException, Throwable{
	webdriverutil.elementVisibility(driver, webelementLogin.getLogincontinue_button()).click();
	String atlasian_url = excel_data.getDataFromExcel("Atlasian_page", 1, 1);
	boolean url_contains_atlasian = webdriverutil.verifyPartial_length_Url(driver,atlasian_url);
	if(url_contains_atlasian){
		Reporter.log("pass: validation of the atlasian_login page url is done");
		String title_atlasian = excel_data.getDataFromExcel("Atlasian_page", 2, 1);
		boolean title_atlasian_valid= webdriverutil.verifyCompleteTitle(driver, title_atlasian);
		if(title_atlasian_valid){
			Reporter.log("pass: validation of the atlasian_login page title is done");
			webelementlogincontinue = new TrelloLogin_to_continue(driver);
			webelementboards = new TrelloUserBoardPage(driver);
			String password = excel_data.getDataFromExcel("Atlasian_page", 3, 1);
			webdriverutil.elementVisibility(driver,webelementlogincontinue.getAtlasian_passwordtextField()).sendKeys(password);
			webdriverutil.elementVisibility(driver,webelementlogincontinue.getAtlasianLoginButton()).click();
			webdriverutil.implicitWait(driver);
			String boards_page_url = excel_data.getDataFromExcel("boardspage", 1, 1);
			boolean boards_page_url_valid = webdriverutil.verifyPartialUrl(driver,boards_page_url);
			if(boards_page_url_valid){
				Reporter.log("pass: validation of the boards page url is done");
				String boards_page_title = excel_data.getDataFromExcel("boardspage", 2, 1);
				boolean boards_page_title_valid= webdriverutil.verifyCompleteTitle(driver, boards_page_title);
				if(boards_page_title_valid){
					Reporter.log("pass: validation of boards page title is done");
					webdriverutil.elementVisibility(driver,webelementboards.getCreate_board()).click();
					String board_title = excel_data.getDataFromExcel("boardspage",3, 1);
					webdriverutil.elementVisibility(driver,webelementboards.getBoards_title_textField()).sendKeys(board_title);
					webdriverutil.elementVisibility(driver, webelementboards.getCreate_board_submitbutton()).click();
					String list_title = excel_data.getDataFromExcel("boardspage", 4, 1);
					webdriverutil.elementVisibility(driver, webelementboards.getEnter_listTitle_textfield()).sendKeys(list_title);
					webdriverutil.elementVisibility(driver, webelementboards.getAddListbutton()).click();
					webdriverutil.menu_options_click(driver,webelementboards.getAll_add_a_buttons(), 0);//this will give the add buttons of list which are having title
					String title1 = excel_data.getDataFromExcel("boardspage",5, 1);
					webdriverutil.elementVisibility(driver,webelementboards.getTitle_of_card_txtarea()).sendKeys(title1);
					webdriverutil.elementVisibility(driver, webelementboards.getAdd_card_button()).click();
					String title2 = excel_data.getDataFromExcel("boardspage",6, 1);
					webdriverutil.elementVisibility(driver,webelementboards.getTitle_of_card_txtarea()).sendKeys(title2);
					webdriverutil.elementVisibility(driver, webelementboards.getAdd_card_button()).click();
					String title3 = excel_data.getDataFromExcel("boardspage",7, 1);
					webdriverutil.elementVisibility(driver,webelementboards.getTitle_of_card_txtarea()).sendKeys(title3);
					webdriverutil.elementVisibility(driver, webelementboards.getAdd_card_button()).click();
					webdriverutil.implicitWait(driver);
					Reporter.log("creating of the cast with name of spiderman, ironman, hulk. is pass");
					webdriverutil.elementVisibility(driver,webelementboards.getBoard_created_page_menubar()).click();
					webdriverutil.implicitWait(driver);
					webdriverutil.elementVisibility(driver, webelementboards.getBoard_created_page_menubar_more()).click();
					webdriverutil.implicitWait(driver);
					webdriverutil.elementVisibility(driver,webelementboards.getBoard_created_page_menubar_more_CloseBoard()).click();
                    webdriverutil.elementVisibility(driver,webelementboards.getBoard_created_page_menubar_more_CloseBoard_close()).click();
                    webdriverutil.elementVisibility(driver,webelementboards.getDelete_board_permenently()).click();
                    webdriverutil.elementVisibility(driver,webelementboards.getDelete_board_permenently_delete_button()).click();
                	webdriverutil.elementVisibility(driver, webelementboards.getAccounts_icon()).click();
					webdriverutil.elementVisibility(driver, webelementboards.getLogout_button()).click();
					Reporter.log("deleting of the cast after creating is pass");
					TrelloLogout_page webelementlogout = new TrelloLogout_page(driver);
					webdriverutil.elementVisibility(driver,webelementlogout.getLogout_page_logoutbutton()).click();;
					String end_title = excel_data.getDataFromExcel("homepage", 1, 1);
					boolean end_title_verify = webdriverutil.verifyCompleteTitle(driver, end_title);
					if(end_title_verify){Reporter.log("pass: validation of home page after end to end scinero is pass");}
					else {Reporter.log("fail: validation of home page after end to end scinero is fail");}
                }else{Reporter.log("fail: validation of boards page title is fail");}
			}else{Reporter.log("fail: validation of boards page url  is fail");}
		}else{Reporter.log("fail: validation of atlasian_login page title is fail");}
	}else{Reporter.log("fail: validation of atlasian_login page url is fail");}
}
}
