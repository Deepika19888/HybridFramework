package com.qa.beartax.model;

import java.util.ArrayList;
import java.util.List;

public class BearTaxTestSuite {

	private List<BearTaxTestCase> testCases;
	private int noOfTestCases;
	private int noOfSuccessCases;
	private int noOfFailureCases;

	public List<BearTaxTestCase> getTestCases() {
		return testCases;
	}

	public void setTestCases(List<BearTaxTestCase> testCases) {
		this.testCases = testCases;
	}

	public int getNoOfTestCases() {
		return noOfTestCases;
	}

	public void setNoOfTestCases(int noOfTestCases) {
		this.noOfTestCases = noOfTestCases;
	}

	public int getNoOfSuccessCases() {
		return noOfSuccessCases;
	}

	public void setNoOfSuccessCases(int noOfSuccessCases) {
		this.noOfSuccessCases = noOfSuccessCases;
	}

	public int getNoOfFailureCases() {
		return noOfFailureCases;
	}

	public void setNoOfFailureCases(int noOfFailureCases) {
		this.noOfFailureCases = noOfFailureCases;
	}

	public BearTaxTestSuite(List<BearTaxTestCase> testCases, int noOfTestCases, int noOfSuccessCases,
			int noOfFailureCases) {
		
		super();
		this.testCases = testCases;
		this.noOfTestCases = noOfTestCases;
		this.noOfSuccessCases = noOfSuccessCases;
		this.noOfFailureCases = noOfFailureCases;
	}

	public BearTaxTestSuite() {
		super();
		this.testCases = new ArrayList<BearTaxTestCase>();
	}

}
