package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FrHomePage extends BasePage {

		public FrHomePage(WebDriver driver) {

			super(driver);
		}

		@FindBy(xpath = " (//div[@class='product-nav-item-content '])[1]")

		WebElement cartesAmericanexpressCard;

		@FindBy(xpath = "(//span[normalize-space()='Cartes American Express'])[1]")

		WebElement pageElementcard;

		public void clickCartes() {

			cartesAmericanexpressCard.click();

		}

		public String gettetcard() {
			try {

				return pageElementcard.getText();

			} catch (Exception e) {
				return (e.getMessage());
			}

		}

	}



