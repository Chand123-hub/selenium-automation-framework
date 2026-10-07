package BHFPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ourcampaginpage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	//constructors
	public Ourcampaginpage (WebDriver driver) {
		this.driver= driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	//locators
	By Ourcampagin = By.xpath("//a[text()='Our Campaign']");
	By Bannerchildren = By.xpath("//a[p[text()=\"Banner Children's\"]]");
	By Bannerchildcare = By.xpath("//a[contains(@href,'Banner-Childrens-Care')]");
	By Bannerchildtalent = By.xpath("//a[contains(@href,'/Areas-to-Support/Banner-Childrens/Banner-Childrens-Talent')]");
	By areasToSupport = By.xpath("//li[@class='breadcrumb-item']/a[@href='/Areas-to-Support']");
	By backtobhf = By.xpath("//a[text()='Back To Banner Health Foundation']");

	
	//methods/actions
	public void campaginpage() {
	driver.findElement(Ourcampagin).click();
	
	WebElement bannerChildrens = wait.until(ExpectedConditions.elementToBeClickable(Bannerchildren));
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView({block:'center'});",bannerChildrens);
	js.executeScript("arguments[0].click();", bannerChildrens);
	
	WebElement childcare = wait.until(ExpectedConditions.elementToBeClickable(Bannerchildcare));
	js.executeScript("arguments[0].scrollIntoView({block:'center'});", childcare);
	js.executeScript("arguments[0].click();", childcare);
	
	wait.until(ExpectedConditions.urlContains("Banner-Childrens-Care")); //stale element exception
	
	driver.findElement(Bannerchildtalent).click();
	
	driver.findElement(areasToSupport).click();
	driver.findElement(backtobhf).click();
	
	
	
	driver.close();
	
	
	}
	

	

}
