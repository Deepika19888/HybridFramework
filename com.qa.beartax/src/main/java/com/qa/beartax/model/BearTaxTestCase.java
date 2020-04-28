package com.qa.beartax.model;

import org.openqa.selenium.WebElement;

public class BearTaxTestCase {

	private WebElement element;
	private String text;
	private String expectedResult;
	private String actualResult;
	private String finalResult;
	

	public BearTaxTestCase() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BearTaxTestCase(WebElement element, String text, String expectedResult, String actualResult,
			String finalResult) {
		super();
		this.element = element;
		this.text = text;
		this.expectedResult = expectedResult;
		this.actualResult = actualResult;
		this.finalResult = finalResult;
	}

	public WebElement getElement() {
		return element;
	}

	public void setElement(WebElement element) {
		this.element = element;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getExpectedResult() {
		return expectedResult;
	}

	public void setExpectedResult(String expectedResult) {
		this.expectedResult = expectedResult;
	}

	public String getActualResult() {
		return actualResult;
	}

	public void setActualResult(String actualResult) {
		this.actualResult = actualResult;
	}

	public String getFinalResult() {
		return finalResult;
	}

	public void setFinalResult(String finalResult) {
		this.finalResult = finalResult;
	}

}
