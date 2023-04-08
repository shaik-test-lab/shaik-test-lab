package test_execution;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.qspiders.trello.genericutility.Functional_BaseClass;
import com.qspiders.trello.genericutility.ExcelUtility;
import com.qspiders.trello.genericutility.WebDriverUtility;
import com.qspiders.trello.pomrepository.TrelloHomepage;

public class Functional_validation extends Functional_BaseClass {
@Test()
public void Smoke_test() throws IOException, Throwable{
	ExcelUtility excel_data = new ExcelUtility();
	TrelloHomepage webelement = new TrelloHomepage(driver);
	WebDriverUtility webdriverutil = new WebDriverUtility();
	String title = excel_data.getDataFromExcel("homepage", 1, 1);
	boolean title_verify = webdriverutil.verifyCompleteTitle(driver, title);
	if(title_verify){
		Reporter.log("pass: the validation of trello home page title is done");
		String url = excel_data.getDataFromExcel("homepage", 2, 1);
		boolean url_verify = webdriverutil.verifyPartialUrl(driver, url);
		if(url_verify){
			Reporter.log("pass: the validation of trello home page url is done");
			String feature_button = excel_data.getDataFromExcel("homepage", 3, 1);
			webdriverutil.menu_options_click(driver,webelement.getHome_menuOptions(), 0);
			boolean feature_button_verify = webdriverutil.verify_text(driver,webelement.getFeature_txtVerify(), feature_button);
			if(feature_button_verify){
				Reporter.log("pass: the validation of trello home page feature button is done");
				String Solutions_button = excel_data.getDataFromExcel("homepage", 4, 1);
				webdriverutil.menu_options_click(driver,webelement.getHome_menuOptions(), 1);
			    boolean solutions_button_verify	= webdriverutil.verify_text(driver, webelement.getSolution_txtVerify(), Solutions_button);
			    if(solutions_button_verify){
			    	Reporter.log("pass: the validation of trello home page solutions button is done");
			    	String plans_button = excel_data.getDataFromExcel("homepage", 5, 1);
			    	webdriverutil.menu_options_click(driver,webelement.getHome_menuOptions(), 2);
			    	boolean plans_button_verify= webdriverutil.verify_text(driver, webelement.getPlans_txtVerify(), plans_button);
			    	if(plans_button_verify){
			    		Reporter.log("pass: the validation of trello home page plans button is done");
			    		String pricing_url = excel_data.getDataFromExcel("homepage", 6, 1);
			    		webelement.getPricinglink().click();
			    		boolean pricing_url_verify = webdriverutil.verifyPageUrl(driver,webelement.getPricinglink(), pricing_url);
			    		if(pricing_url_verify){
			    			Reporter.log("pass: the validation of trello home page pricing button is pass");
			    			String resource_button = excel_data.getDataFromExcel("homepage", 7, 1);
			    			webdriverutil.menu_options_click(driver,webelement.getHome_menuOptions(), 3);
			    			boolean resource_button_verify = webdriverutil.verify_text(driver,webelement.getResource_txtVerify(), resource_button);
			    		    if(resource_button_verify){
			    		    	Reporter.log("pass: the validation of trello home page resource button is pass");
			    		    	String value = excel_data.getDataFromExcel("homepage", 8, 0);
			    		    	String expected_attribute = excel_data.getDataFromExcel("homepage",8, 1);
			    		        boolean expected_attribute_verify = webdriverutil.verify_logo(driver,webelement.getLogo(), expected_attribute, value);
			    		        if(expected_attribute_verify){
			    		        	Reporter.log("pass: the validation of trello home page logo attribute is pass");
			    		        	String logo_Height= excel_data.getDataFromExcel("homepage", 9, 1);
			    		        	boolean logo_Height_verify = webdriverutil.verify_logo(driver,webelement.getLogo(), logo_Height);
			    		        	if(logo_Height_verify){
			    		        		Reporter.log("pass: the validation of trello home page logo height is pass");
			    		        		Reporter.log("PASS: VALIDATION OF ALL THE ELEMENTS IN HOME PAGE OF TRELLO IS PASS");
			    		        	}
			    		        	else {
			    		        		Reporter.log("fail: the validation of trello home page logo height is fail");
			    		        	}
			    		        }
			    		        else {
			    		        	Reporter.log("fail: the validation of trello home page logo attribute is fail");
			    		        }
			    		    }
			    		    else {
			    		    	Reporter.log("fail: the validation of trello home page resource button is fail");
			    		    }
			    		}
			    		else{
			    			Reporter.log("fail: the validation of trello home page pricing button is fail");
			    		}
			    	}
			    	else{
			    		Reporter.log("fail: the validation of trello home page plan button is fail");
			    	}
			    }
			    else{
			    	Reporter.log("fail: the validation of trello home page solutions button is fail");
			    }
			}
			else{
				Reporter.log("fail: the validation of trello home page feature button is fail");
			}
		}
		else{
			Reporter.log("fail: the validation of trello home page url is fail");
		}
	}
	else {
		Reporter.log("fail: the validation of trello home page title is fail");
	}
}
}
