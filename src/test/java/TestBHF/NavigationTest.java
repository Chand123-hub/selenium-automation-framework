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
	@Test
	public void verifywaystogivenav() {
		
		Homepage home = new Homepage(driver);
		home.clickwaystogive();
		
Waystogivepage give = new Waystogivepage(driver);

    give.hoverOnAbout();
    give.hoverfoundstaff();
    
   	
Getinvolvedpage get = new  Getinvolvedpage(driver);
	 
	get.getinvolve();
	get.clicktellbannerstories();
	 
	
	}	
		
         
		
			
	}	
	
	
	
		


