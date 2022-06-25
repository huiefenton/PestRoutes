package com.automation.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class NewCustomerPage {

    @FindBy(xpath = "//a[contains(text(),'New Customer')]")
    WebElement newCustomerLink;
    @FindBy(xpath = "//input[@name=\"fname\"]")
    WebElement firstName;
    @FindBy(xpath = "//input[@name=\"lname\"]")
    WebElement lastName;
    @FindBy(xpath = "//input[@name=\"email\"]")
    WebElement customerEmail;
    @FindBy(xpath = "//input[@name=\"companyName\"]")
    WebElement companyName;
    @FindBy(xpath = "//select[@name=\"sourceID\"]")
    WebElement selectedSource;
    @FindBy(xpath = "//select[@name=\"commercialAccount\"]")
    WebElement residentProperty;
    @FindBy(xpath = "//select[@name=\"isMultiUnit\"]")
    WebElement singleUnit;
    @FindBy(xpath = "//select[@name=\"subPropertyTypeID\"]")
    WebElement subProperty;
    @FindBy(xpath = "//input[@name=\"emailReminders\"]")
    WebElement emailReminders;
    @FindBy(xpath = "//input[@name=\"phoneReminders\"]")
    WebElement phoneReminders;
    @FindBy(xpath = "//input[@name=\"purpleDragon\"]")
    WebElement purpleDragon;


    @FindBy(xpath = "//input[@name=\"address\"]" )
    WebElement customerAddress;
    @FindBy(xpath = "//input[@name=\"zip\"]")
    WebElement customerZipCode;
    @FindBy(xpath = "//input[@name=\"phone1\"]")
    WebElement customerPhone1;
    @FindBy(xpath = "//input[@name=\"ext1\"]")
    WebElement customerExt1;
    @FindBy(xpath = "//input[@name=\"phone2\"]")
    WebElement customerPhone2;
    @FindBy(xpath = "//input[@name=\"ext2\"]")
    WebElement customerExt2;
    @FindBy(xpath = "//textarea[@name=\"specialScheduling\"]")
    WebElement specialScheduling;
    @FindBy(xpath = "//button[@id=\"globalCustomerSaveButton\"]")
    WebElement saveBtn;



    WebDriver driver;

    public NewCustomerPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void addNewCustomer() throws InterruptedException {
        newCustomerLink.click();
        Thread.sleep(5000);
        firstName.sendKeys("Bill");
        lastName.sendKeys("Jane");
        customerEmail.sendKeys("BillJane@gmail.com");
        companyName.sendKeys("PestControl1");
        Select select_Source = new Select(selectedSource);
        select_Source.selectByVisibleText("Marketing");
        Select select_Property = new Select(residentProperty);
        select_Property.selectByIndex(1);
        Select single_Unit = new Select(singleUnit);
        single_Unit.selectByIndex(1);
        Select sub_Property = new Select(subProperty);
        sub_Property.selectByIndex(2);
        specialScheduling.sendKeys("Entering notes here pulls the customer out of Intelligent Routing and Fill Routes");
        emailReminders.click();
        phoneReminders.click();
        purpleDragon.click();

        customerAddress.sendKeys("106 south st");
        customerZipCode.sendKeys("24108");
        customerPhone1.sendKeys("(007)-000-0000");
        customerExt1.sendKeys("12382");
        customerPhone2.sendKeys("(102)-111-1111");
        customerExt2.sendKeys("45662");
        saveBtn.click();








    }





















}
