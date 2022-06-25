package com.automation.test;

import com.automation.pages.NewCustomerPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {

    WebDriver driver;
    NewCustomerPage newCustomerPage;

    @BeforeMethod
    public void setUp(){
      System.setProperty("webdriver.chrome.driver" , "/Users/bnm/Desktop/PestRouteTakeHomeProject/src/test/resources/Driver/chromedriver 3");
      driver = new ChromeDriver();
      driver.get("https://awssubscription.pestroutes.com/helpArticle/3");
      driver.manage().window().maximize();
      WebElement userName = driver.findElement(By.xpath("//input[@id='inputUser']"));
      userName.sendKeys("10264");
      WebElement passWord = driver.findElement(By.xpath("//input[@id='inputPassword']"));
      passWord.sendKeys("Candidate10264");
      WebElement logIn = driver.findElement(By.xpath("//body/div[@id='outterWrapper']/div[@id='innerWrapper']/form[@id='credentialsForm']/div[1]/input[1]"));
      logIn.click();

      newCustomerPage = new NewCustomerPage(driver);


    }


    @AfterMethod
    public void cleanUp(){
    // driver.quit();


    }





}
