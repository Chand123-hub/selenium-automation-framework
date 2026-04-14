package BHFPages;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {
	WebDriver driver;
	
	//constructor
	public Homepage(WebDriver driver) {
		this.driver = driver;
	}
	//locators
	By waystogive = By.linkText("Ways to Give");
	
	
	//Actions
	public void clickwaystogive() {
	driver.findElement(waystogive).click();
	}
}
	

	
	
	
	
	



