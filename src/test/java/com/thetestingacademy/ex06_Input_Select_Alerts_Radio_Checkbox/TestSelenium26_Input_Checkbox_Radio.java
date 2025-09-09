package com.thetestingacademy.ex06_Input_Select_Alerts_Radio_Checkbox;

import com.thetestingacademy.utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium26_Input_Checkbox_Radio extends CommonToAll {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");

        // Input
        WebElement firstname =  driver.findElement(By.name("firstname"));
        WebElement firstname1 =  driver.findElement(By.xpath("//input[@name='firstname']"));
        firstname.sendKeys("the testing academy");


        // Radio Button
        WebElement radiobox = driver.findElement(By.id("exp-1"));
        radiobox.click();

        // checkbox
        WebElement checkbox = driver.findElement(By.id("profession-0"));
        checkbox.click();




        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // CHeck Box
        driver.quit();



    }
}
