package com.thetestingacademy.ex15_Relative_locators;

import com.thetestingacademy.ex07_WaitHelper.WaitHelpers;
import com.thetestingacademy.utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Lab44_RL_P3 extends CommonToAll {

    @Test
    public void test_relative_locator_aqiin() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.aqi.in/real-time-most-polluted-city-ranking");
        driver.manage().window().maximize();


        WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder=\"Search\"]"));
        searchBox.sendKeys("india" + Keys.ENTER);


        new WaitHelpers().waitJVM(5000);

        //div[contains(@class,"location-name")]/p
        // List of elements
        List<WebElement> locations = driver.findElements(By.xpath("//div[contains(@class,\"location-name\")]/p"));

        for (WebElement location : locations){

            String rank = driver.findElement(with(By.tagName("p")).toLeftOf(location)).getText();
            String aqi = driver.findElement(with(By.tagName("p")).toRightOf(location)).getText();


            System.out.println("| +" + rank + " | " + location.getText() + " | " + aqi + " | ");





        }





    }

}
