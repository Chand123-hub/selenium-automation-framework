package TestBHF;
import org.openqa.selenium.By ;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BHFPages.Getinvolvedpage;
import BHFPages.Homepage;
import BHFPages.Waystogivepage;
import Base.BaseTest;


public class NavigationTest extends BaseTest{

	//Data driven
	    @DataProvider(name = "contactData")
	    public Object[][] getContactData() {

	        return new Object[][] {
	            { "Chandana", "GS", "chandana@test.com", "(800) 230-2273", "Areas to Support" },
	           // { "Ravi", "Kumar", "ravi@test.com", "(800) 230-2278", "Events & Fundraisers" },
	           // { "Anita", "Sharma", "anita@test.com", "(800) 230-2290", "Ways to Give" }
	        };
	    }
	

	@Test(dataProvider = "contactData")
	public void verifywaystogivenav(String firstName,
            String lastName,
            String email,
            String phone,
            String messageType) {
		
		Homepage home = new Homepage(driver);
		home.clickwaystogive();
		
		Waystogivepage give = new Waystogivepage(driver);

    give.hoverOnAbout();
   // give.hoverfoundstaff();
    //give.clickCeopresident();
    give.clickContactUs();
    give.fillContactUsForm(firstName, lastName, email, phone);
    give.selectMessageType(messageType);
	give.submitContactUsForm();
	driver.navigate().back();
	
	
	 Getinvolvedpage get = new  Getinvolvedpage(driver);
	 
	// get.hovergetinvolve();
	// get.clicktellbannerstories();
	 get.Searchnav();
	 //suggestion selection
	 get.Autosuggestsearch("Banner", "cancer center innovation");
	 
	
	}	
		
         
		
			
	}	
	
	
	
		


