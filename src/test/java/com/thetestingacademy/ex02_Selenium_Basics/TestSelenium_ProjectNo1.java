package com.thetestingacademy.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import io.qameta.allure.Link;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_ProjectNo1 {

    @Description("TC#1 - Verify that a particular text exists on the Katalon website ")
    @Link("https://bugz.atlassian.net/browse/VP-1")
    @Test
    public void test_verify_text_katalon(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        Assert.assertEquals(driver.getTitle(),"CURA Healthcare Service");
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/");
        System.out.println(driver.getPageSource());
        if(driver.getPageSource().contains("CURA Healthcare Service")){
            System.out.println("Test Case passed!");
            Assert.assertTrue(true);
        }else{
            System.out.println("Test Case failed!");
            Assert.fail();
        }

        driver.quit();



    }

}
