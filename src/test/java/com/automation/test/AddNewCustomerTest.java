package com.automation.test;

import com.automation.pages.NewCustomerPage;
import org.testng.annotations.Test;

public class AddNewCustomerTest extends BaseTest {

    @Test

    public void addNewUserTest() throws InterruptedException {
        newCustomerPage.addNewCustomer();
    }
}
