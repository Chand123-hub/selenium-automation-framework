package BHFPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waystogivepage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	//locators
	By aboutHover = By.cssSelector( "ul.subnavigation-menu > li.dropdown > a.subnavigation-menu-link.has-submenu");
	By contactUs = By.xpath("//ul[contains(@class,'subnavigation-menu')]" + "/li[a[normalize-space()='About']]" + "//a[normalize-space()='Contact Us']");
	By hoverclickfoundationstaff = By.xpath("//ul[contains(@class,'subnavigation-menu')]" + "/li[a[normalize-space()='About']]" + "//a[normalize-space()='Foundation Staff']");
	By clickceopresident = By.xpath("//ul[contains(@class,'subnavigation-menu')]" + "/li[a[normalize-space()='About']]" + "//a[normalize-space()='President & CEO']");
	
	
	//constructor
	public Waystogivepage(WebDriver driver) {
		this.driver =driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	//method 

public void hoverOnAbout() {
    WebElement about = wait.until(ExpectedConditions.visibilityOfElementLocated(aboutHover));
new Actions(driver).moveToElement(about).pause(Duration.ofMillis(500)).perform();
}

public void hoverfoundstaff() {
	WebElement about = wait.until(ExpectedConditions.visibilityOfElementLocated(hoverclickfoundationstaff));
	new Actions(driver).moveToElement(about).pause(Duration.ofMillis(500)).perform();
	
}
public void clickCeopresident() {
	WebElement president = wait.until(ExpectedConditions.visibilityOfElementLocated(clickceopresident));
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", president);
	
	}

public void clickContactUs() {
WebElement contact = wait.until(ExpectedConditions.visibilityOfElementLocated(contactUs));
((JavascriptExecutor) driver).executeScript("arguments[0].click();", contact);
}

By firstname = By.id("field164095483-first");
By Lastname = By.name("field164095483-last");
By email = By.id("field164095486");
By phnumber = By.id("field164095492");
By dropdownmsg = By.id("field164095500");
By submitform = By.id("fsSubmitButton5734022");


public void fillContactUsForm(String fName, String lname, String Email, String phn) {
	wait.until(ExpectedConditions.visibilityOfElementLocated(firstname)).sendKeys(fName);
	driver.findElement(Lastname).sendKeys(lname);
	driver.findElement(email).sendKeys(Email);
	driver.findElement(phnumber).sendKeys(phn);
}
	public void selectMessageType(String optionText) {

	    WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownmsg));

	    Select select = new Select(dropdown);
	    select.selectByVisibleText(optionText);
	}

public void submitContactUsForm() {

    WebElement submit = wait.until(ExpectedConditions.elementToBeClickable(submitform));

    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", submit);

}



	
	
	
}

