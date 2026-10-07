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
	
	By getinvolved = By.xpath("//a[text()='Get Involved']");
	By hovergetinvolve = By.xpath("//a[@href ='/get-involved']");
	By tellbannerstory =By.xpath("//a[@href = '/get-involved/tell-your-banner-story']");
    

	
	//constructor
	public Getinvolvedpage(WebDriver driver) {
		this.driver =driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
	}
	
	//methods
	
	public void getinvolve() {
	driver.findElement(getinvolved).click();
	 WebElement about = wait.until(ExpectedConditions.visibilityOfElementLocated(hovergetinvolve));
	 new Actions(driver).moveToElement(about).pause(Duration.ofMillis(500)).perform();
	}
	public void clicktellbannerstories() {
		WebElement bannerstory = wait.until(ExpectedConditions.visibilityOfElementLocated(tellbannerstory));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", bannerstory);
	}
	
	
    
    
	}

	
	
		
		


