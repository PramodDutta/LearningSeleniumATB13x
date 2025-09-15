package com.thetestingacademy.ex15_Relative_locators;

import com.thetestingacademy.utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Lab43_RL_P2 extends CommonToAll {
    @Test
    public void test_relative_locator_codepen(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://codepen.io/AbdullahSajjad/full/LYGVRgK");
        driver.manage().window().maximize();

        driver.switchTo().frame("result");

        driver.findElement(By.xpath("//form[@id=\"form\"]/button")).click();
        // //button[text()="Submit"]

        WebElement username_element = driver.findElement(By.xpath("//input[@id='username']"));


        WebElement error_element = driver.findElement(with(By.tagName("small")).below(username_element));


        String errorText = error_element.getText();
        Assert.assertEquals(errorText,"Username must be at least 3 characters");











        closeBrowser(driver);

    }
}
