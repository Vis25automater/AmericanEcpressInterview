package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.GenericMethods;

public class FrAllcards extends BasePage {

	GenericMethods gm = new GenericMethods();

	public FrAllcards(WebDriver driver) {

		super(driver);
	}

	@FindBy(xpath = "(//div[@class='button parbase'])[2]")

	public WebElement learnmore;

	public void scrolltoLearnmore() {

		gm.scrolltopoint(driver, learnmore);

	}
	
	public void clickonLearnmore() {
		
		try {
			learnmore.click();
		  } catch (Exception e) {
		     JavascriptExecutor executor = (JavascriptExecutor) driver;
		     executor.executeScript("arguments[0].click();",learnmore);
		  }
	
	}
}
