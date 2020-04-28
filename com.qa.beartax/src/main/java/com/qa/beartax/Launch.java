package com.qa.beartax;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
//import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.Test;

import com.qa.beartax.base.DriverScript;
import com.qa.beartax.model.BearTaxTestCase;

//import junit.framework.TestCase;

public class Launch extends DriverScript {

	/* Page Elements Initlization */

	@FindBy(xpath = "//img[@class='navbar-brand-img']")
	WebElement bearTaxlogo;
	@FindBy(xpath = "//a[contains(text(),'Products')]")
	WebElement productLabel;
	@FindBy(xpath = "//a[contains(text(),'Features')]")
	WebElement featureLabel;
	@FindBy(partialLinkText = "Exchang")
	WebElement ExchangeLabel;
	@FindBy(id = "blogPage")
	WebElement blogPageLabel;
	@FindBy(partialLinkText = "Prici")
	WebElement PricingLabel;
	@FindBy(partialLinkText = "FAQs")
	WebElement FAQLabel;
	@FindBy(partialLinkText = "Try now for fr")
	WebElement TryButton;
	@FindBy(partialLinkText = "Try for fr")
	WebElement Tryforfreebutton;
	@FindBy(partialLinkText = "Login")
	WebElement LoginButton;

	/* Page initial */
	public Launch() {
		this.initialization();
		PageFactory.initElements(driver, this);
	}

/*Page Action*/
	
		public void mouseOveronElements() {
		Actions act = new Actions(driver);
		act.moveToElement(productLabel).build().perform();
		act.moveToElement(featureLabel).build().perform();
		act.moveToElement(FAQLabel).build().perform();

	}

	
	public void Tryforfreebutton() {
		
		
        Tryforfreebutton.click();
        BearTaxTestCase currentTestCase1 = new BearTaxTestCase();
		currentTestCase1.setElement(Tryforfreebutton);
		currentTestCase1.setText("Prici");
		currentTestCase1.setExpectedResult("https://app.bear.tax/#/signin");
		currentTestCase1.setActualResult(driver.getCurrentUrl());
		if (currentTestCase1.getExpectedResult().equals(currentTestCase1.getActualResult()))
			currentTestCase1.setFinalResult("PASS");
		else
			currentTestCase1.setFinalResult("FAIL");

		this.getRegressionTestSuite().getTestCases().add(currentTestCase1);


	}

	
	
	public void clickonPricing() throws Exception {
		Thread.sleep(2000);
		driver.navigate().back();
		PricingLabel.click();
		BearTaxTestCase currentTestCas = new BearTaxTestCase();
		currentTestCas.setElement(PricingLabel);
		currentTestCas.setText("Prici");
		//PricingLabel.click();
		currentTestCas.setExpectedResult("https://bear.tax/pricing.html");
		currentTestCas.setActualResult(driver.getCurrentUrl());
		if (currentTestCas.getExpectedResult().equals(currentTestCas.getActualResult()))
			currentTestCas.setFinalResult("PASS");
		else
			currentTestCas.setFinalResult("FAIL");

		this.getRegressionTestSuite().getTestCases().add(currentTestCas);

	}
	
	public void loginlandingsignin() throws Exception {
		Thread.sleep(2000);
		driver.navigate().back();
		LoginButton.click();

		BearTaxTestCase currentTestCase3 = new BearTaxTestCase();
		currentTestCase3.setElement(LoginButton);
		currentTestCase3.setText("Loginbutton");
		currentTestCase3.setExpectedResult("https://app.bear.tax/#/signin");
		currentTestCase3.setActualResult(driver.getCurrentUrl());
		if (currentTestCase3.getExpectedResult().equals(currentTestCase3.getActualResult()))
			currentTestCase3.setFinalResult("PASS");
		else
			currentTestCase3.setFinalResult("FAIL");

		this.getRegressionTestSuite().getTestCases().add(currentTestCase3);
	}
	
	public void Tryfornow() throws Exception
	{
		Thread.sleep(2000);
		driver.navigate().back();
	TryButton.click();
	BearTaxTestCase currentTestCase = new BearTaxTestCase();
	currentTestCase.setElement(TryButton);
	currentTestCase.setText("Tryfornowbutton");
	currentTestCase.setExpectedResult("https://app.bear.tax/#/signin");
	currentTestCase.setActualResult(driver.getCurrentUrl());
	if (currentTestCase.getExpectedResult().equals(currentTestCase.getActualResult()))
		currentTestCase.setFinalResult("PASS");
	else
		currentTestCase.setFinalResult("FAIL");

	this.getRegressionTestSuite().getTestCases().add(currentTestCase);
	
	}

	
	
}