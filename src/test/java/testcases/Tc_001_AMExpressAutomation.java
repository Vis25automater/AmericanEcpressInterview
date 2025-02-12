package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FrAllcards;
import pages.FrHomePage;
import pages.UserDetail;
import utilities.GenericMethods;
import utilities.Links;

public class Tc_001_AMExpressAutomation {

	public WebDriver driver;
	Links lk = new Links();
	GenericMethods gm = new GenericMethods();

	@BeforeMethod
	public void setup() throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Test(priority = 0)
	public void clickonCartesamericanExpress() {

		driver.get(lk.Homepage());

		FrHomePage homePage = new FrHomePage(driver);
		homePage.clickCartes();
		String confirm = homePage.gettetcard();
		Assert.assertEquals(confirm, "Cartes American Express");

	}

	@Test(priority = 1)
	public void FrAllCards() {

		driver.get(lk.FRallCards());
		FrAllcards forAllcard = new FrAllcards(driver);
		gm.scrolldown(driver, "450");
		gm.handleCookies(driver);
		gm.explicitywait(driver).until(ExpectedConditions.visibilityOf(forAllcard.learnmore));
		forAllcard.clickonLearnmore();
		String title = driver.getTitle();
		Assert.assertEquals("Gold American Express: La Carte à la Hauteur de Votre Quotidien", title);

	}

	@Test(priority = 2)
	public void GoldCardDescriptionPg() {
		
		System.out.println("This Question seems invalid ");
		System.out.println("**************************************************************** ");
		System.out.println("Link3 Gold Card Description page: https://www.americanexpress.com/fr-fr/charge-\r\n"
				+ "cards/apply/personal/gold?sourcecode=A0000FE43V&amp;intlink=fr-amex-cardshop-details-apply-\r\n"
				+ "GoldCardAmericanExpress-siderailPlease clicks on Demandez Votre Carte ");
		System.out.println("**************************************************************** ");
		System.out.println("unable to find Demandez Votre Carte in this page");
		
		

	}

	@Test(priority = 3)
	public void UserDetails() {
		driver.get(lk.userdetails());
		
		UserDetail us = new UserDetail(driver);
		gm.handleCookies(driver);
		us.tickbox();
		gm.scrolldown(driver , "100");
		gm.explicitywait(driver).until(ExpectedConditions.visibilityOf(us.firstName));
		us.enterfirstname("Vishnu");
		us.enterlastname("satheesan");
		us.enterdateBirth("28091993");
		gm.scrolldown(driver , "300");
		us.enterEmail("Vpsathee@gmail.com");
		us.enterPhone("0612123112");
		us.submitdetails();
		String txt= us.getTextpersonal();
		Assert.assertEquals(txt, "Vos informations personnelles");
		System.out.println("First Information page is filled");
	}

	@AfterMethod

	public void shut() {

		driver.quit();
	}

}
