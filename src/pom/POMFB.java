package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.BasePage;
import generics.ExcelLibrary;

public class POMFB extends BasePage implements AutoConstant {
	
	@FindBy(xpath="(//a[@role='button'])[1]")
	private WebElement createNewAccountButton;
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstnameTextField;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastnameTextField;

	@FindBy(xpath="//input[@name='reg_email__']")
	private WebElement mobilenoTextField;
	
	
	@FindBy(xpath="(//input[@type='password'])[2]")
	private WebElement passwordTextField;
	
	@FindBy(xpath="//select[@name='birthday_day']")
	private WebElement birthdayDateDropDownList;
	
	@FindBy(xpath="//select[@name='birthday_month']")
	private WebElement birthdayMonthDropDownList;
	
	@FindBy(xpath="//select[@name='birthday_year']")
	private WebElement birthdayYearDropDownList;
	
	@FindBy(xpath="//label[.=\"Male\"]")
	private WebElement genderRadioButton;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement signupButton;
	
	public POMFB(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	public void signup() throws IOException, InterruptedException {
		
		firstnameTextField.sendKeys(ExcelLibrary.getCellValue(1, 0));
		lastnameTextField.sendKeys(ExcelLibrary.getCellValue(1, 1));
		Thread.sleep(3000);
		mobilenoTextField.sendKeys("9927065719");
		passwordTextField.sendKeys("era132435");
		
		selectByvisibletext(birthdayDateDropDownList,"1");
		selectByvisibletext(birthdayMonthDropDownList, ExcelLibrary.getCellValue(1, 5));
		selectByvisibletext(birthdayYearDropDownList,"1995");
		
		genderRadioButton.click();
		signupButton.click();
	}
	
	
}
