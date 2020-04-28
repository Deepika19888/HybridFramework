package com.qa.beartax;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.beartax.base.DriverScript;

public class SignUpPage extends DriverScript {
	public  XSSFWorkbook wrk;
	/* Page Elements */
	@FindBy(xpath = "//input[@placeholder='Your Last name']")
	WebElement LastnameText;
	@FindBy(xpath = "//input[@placeholder='Your First name']")
	WebElement FirstnameText;
	@FindBy(xpath = "//input[@placeholder='test@example.com']")
	WebElement EmailField;
	@FindBy(xpath = "//input[@id='inputPassword']")
	WebElement PasswordField;
	/* Page Initialization */

	public SignUpPage() {
		this.signupInitialization();
		PageFactory.initElements(driver, this);
	}

	@Test
/*Page Action*/
public void excelDataRead() throws Exception
{
		
		File src = new File("/Users/arunkumarhariharan/Desktop/FebClass/Class/com.qa.beartax/Resource/beartax.xlsx");
FileInputStream fis = new FileInputStream(src);

XSSFWorkbook workbook = new XSSFWorkbook(fis);

String rowdata = workbook.getSheetAt(0).getRow(0).getCell(0).toString();
System.out.println(rowdata);

String coldata = workbook.getSheetAt(0).getRow(0).getCell(1).toString();
System.out.println(coldata);

//Total Active Rows
int rowcount = workbook.getSheetAt(0).getLastRowNum()+1;
System.out.println("No of Active Rows "+rowcount);

System.out.println("***********************************************");

for(int i=0;i<rowcount;i++)
{
	String row = workbook.getSheetAt(0).getRow(i).getCell(0).toString();
	String col = workbook.getSheetAt(0).getRow(i).getCell(1).toString();
	System.out.println(row+" "+col);
	
}

}
	public void check() {
		LastnameText.sendKeys("deepika");
	}

}
