package BHFPages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Getinvolvedpage {
	WebDriver driver;
	WebDriverWait wait;
	
	//locators
	
	By getinvolved = By.cssSelector("ul.subnavigation-menu> li.dropdown:nth-of-type(3) > a.subnavigation-menu-link.has-submenu ");
	By tellbannerstory =By.xpath("//ul[contains(@class,'subnavigation-menu')]" + "/li[a[normalize-space()='Get Involved']]" + "//a[normalize-space()='Tell Your Banner Story']");
    By search = By.tagName("button");
    By entersearchtext =By.name("query");
    By suggestions = By.cssSelector(
    	    "ul.list-group.position-absolute.w-100.mt-1.shadow-sm > li.list-group-item"
    	);

	
	//constructor
	public Getinvolvedpage(WebDriver driver) {
		this.driver =driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
	}
	
	//methods
	
	public void hovergetinvolve() {
	WebElement getInvolved = wait.until(ExpectedConditions.visibilityOfElementLocated(getinvolved));
	new Actions(driver).moveToElement(getInvolved).pause(Duration.ofMillis(500)).perform();
		
	}
	public void clicktellbannerstories() {
		WebElement bannerstory = wait.until(ExpectedConditions.visibilityOfElementLocated(tellbannerstory));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", bannerstory);
	}
	
	public void Searchnav() {
		WebElement find = wait.until(ExpectedConditions.elementToBeClickable(search));
		   ((JavascriptExecutor) driver).executeScript("arguments[0].click();", find);
		   
		   //driver.findElement(entersearchtext).sendKeys("Banner");
		   //driver.findElement(entersearchtext).sendKeys(Keys.ENTER);

	}
	public void Autosuggestsearch(String Banner, String valueToSelect) {
		//keywords
		 driver.findElement(entersearchtext).sendKeys("cancer");


List<WebElement> options = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(suggestions));

    for (WebElement option : options) {
        if (option.getText().equalsIgnoreCase(valueToSelect)) {
            option.click();
            break;
        }

		
    }
    
	}
}
	
	
		
		


