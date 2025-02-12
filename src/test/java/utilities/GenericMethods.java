package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericMethods {
	
	
	public void scrolltopoint(WebDriver driver , WebElement xpath) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement point = xpath ;
		js.executeScript("arguments[0].scrollIntoView();", point);
	}
	
 public WebDriverWait explicitywait(WebDriver driver) {
	 
	 WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 
	 return mywait;
 }
 
 
 public  void handleCookies(WebDriver driver) {
	    try {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	        WebElement acceptButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Tout Refuser']")));
	        acceptButton.click();
	        System.out.println("Cookies accepted on new page.");
	    } catch (Exception e) {
	        System.out.println("No cookie pop-up found.");
	    }
	}
 
 public void scrolldown(WebDriver driver , String nxtpoint) {
	 
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	
	 js.executeScript("window.scrollBy(0, arguments[0]);", nxtpoint);
 }

}
