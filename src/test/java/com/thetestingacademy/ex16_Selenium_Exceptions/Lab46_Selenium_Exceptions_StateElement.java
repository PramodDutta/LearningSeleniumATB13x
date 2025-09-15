package com.thetestingacademy.ex16_Selenium_Exceptions;

import com.thetestingacademy.utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab46_Selenium_Exceptions_StateElement extends CommonToAll {


    @Test
    public void test_selenium_exceptions() {


        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        System.out.println("Start of program");

        WebElement search_input_box  = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));


        driver.navigate().refresh();
        // org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found
        //  (Session info: chrome=140.0.7339.133)

        search_input_box.sendKeys("the testing academy"+ Keys.ENTER);




    }
}
