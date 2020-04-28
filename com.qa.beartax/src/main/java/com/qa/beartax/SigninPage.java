package com.qa.beartax;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.qa.beartax.base.DriverScript;
import com.qa.beartax.model.BearTaxTestCase;

public class SigninPage extends DriverScript {
	/*
	 * Page Elements**
	 */
	@FindBy(xpath = "//input[@placeholder='test@example.com']")
	WebElement emailInput;
	@FindBy(id = "inputPassword")
	WebElement PasswordInput;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement SigninButton;

	/* Page initialization */
	public SigninPage() {
		this.signinInitialization();
		PageFactory.initElements(driver, this);
	}

	/* Page Action */
	
	public void sigininProcess() throws Exception {
		emailInput.sendKeys("testingid4me@gmail.com");
		PasswordInput.sendKeys("P3e@cost1");
		SigninButton.click();
		Thread.sleep(3000);
		BearTaxTestCase currentTestCase1 = new BearTaxTestCase();

		currentTestCase1.setExpectedResult("https://app.bear.tax/#/dashboard");
		currentTestCase1.setActualResult(driver.getCurrentUrl());
		if (currentTestCase1.getExpectedResult().equals(currentTestCase1.getActualResult())) {
			currentTestCase1.setFinalResult("PASS");
			String urls = driver.getCurrentUrl();
			System.out.println("Myurl" + urls);
		} else {
			currentTestCase1.setFinalResult("FAIL");
			String urls1 = driver.getCurrentUrl();
			System.out.println("Myurl" + urls1);
		}

		this.getRegressionTestSuite().getTestCases().add(currentTestCase1);

	}
}