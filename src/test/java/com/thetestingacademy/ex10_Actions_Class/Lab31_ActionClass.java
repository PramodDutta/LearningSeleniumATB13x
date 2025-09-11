package com.thetestingacademy.ex10_Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lab31_ActionClass  {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        String URL = "https://awesomeqa.com/practice.html";
        driver.get(URL);
        driver.manage().window().maximize();


        // Keys - Action classes
        WebElement firstName = driver.findElement(By.name("firstname"));
        Actions actions = new Actions(driver);

        actions.keyDown(Keys.SHIFT)
                .sendKeys(firstName,"the testing academy")
                .keyUp(Keys.SHIFT).build().perform();


        Thread.sleep(5000);
        driver.quit();


    }
}
