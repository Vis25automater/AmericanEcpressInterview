package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserDetail extends BasePage {

	public UserDetail(WebDriver driver) {

		super(driver);
	}

	@FindBy(xpath = "//label[@class='css-13gukjc']")

	WebElement mr;

	@FindBy(id = "fieldControl-input-firstName")

	public WebElement firstName;

	@FindBy(id = "fieldControl-input-lastName")

	WebElement lastName;

	@FindBy(id = "fieldControl-input-dateOfBirth")

	WebElement dateBirth;

	@FindBy(id = "fieldControl-input-email")

	WebElement inputEmail;

	@FindBy(id = "fieldControl-input-mobilePhoneNumber")

	WebElement mobilenumber;

	@FindBy(xpath = "//button[@type='submit']")

	WebElement submit;

	@FindBy(xpath = "//h2[contains(text(),'Vos informations personnelles')]")

	WebElement readTextpersonal;

	public void tickbox() {

		mr.click();

	}

	public void enterfirstname(String dob) {
		firstName.sendKeys(dob);

	}

	public void enterdateBirth(String fname) {
		dateBirth.sendKeys(fname);

	}

	public void enterlastname(String lname) {
		lastName.sendKeys(lname);

	}

	public void enterEmail(String email) {
		inputEmail.sendKeys(email);

	}

	public void enterPhone(String phone) {
		mobilenumber.sendKeys(phone);

	}

	public void submitdetails() {

		submit.click();
	}

	public String getTextpersonal() {
		try {

			return readTextpersonal.getText();

		} catch (Exception e) {
			return (e.getMessage());
		}

	}


}
