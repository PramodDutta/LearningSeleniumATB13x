package com.thetestingacademy.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class TestSelenium09_Assertion_TestNG {

    @Description("Verify that the title is visible. ")
    @Test
    public void test_selenium_assertion(){

        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");

        // TestNG Assertion
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com");

        // AssertJ
        assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://www.google.com");

        // Rest Assured? (ValidatableResponse)

        driver.quit();

    }



}
