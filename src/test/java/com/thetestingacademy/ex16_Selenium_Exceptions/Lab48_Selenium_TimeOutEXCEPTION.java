package com.thetestingacademy.ex16_Selenium_Exceptions;

import com.thetestingacademy.utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Lab48_Selenium_TimeOutEXCEPTION extends CommonToAll {


    @Test
    public void test_selenium_exceptions() {


        WebDriver driver = new ChromeDriver();
        System.out.println("Start of program");
        driver.get("https://google.com");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='abc']")));


        WebElement search_inputbox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        search_inputbox.sendKeys("the testing academy");

        // org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of element located by By.xpath: //textarea[@id='abc'] (tried for 10 second(s) with 500 milliseconds interval)




    }
}
