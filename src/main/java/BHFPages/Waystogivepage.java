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
	By aboutHover = By.xpath("//a[@href ='/about']");
	By hoverclickfoundationstaff = By.xpath("//a[@href ='/about/foundation-staff']");
	By President = By.xpath("//a[text()='President']");
	
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
	
	driver.findElement(President).click();
	

	
}




	
}

