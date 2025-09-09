package com.thetestingacademy.ex06_Input_Select_Alerts_Radio_Checkbox;

import com.thetestingacademy.utils.CommonToAll;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium28_Alerts extends CommonToAll {



    @Test
    public void test_alerts(){

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

//        WebElement element = driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]"));
//        WebElement elementConfirm = driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]"));

        WebElement elementPrompt= driver.findElement(By.cssSelector("button[onclick='jsPrompt()']"));


//        element.click();
//        elementConfirm.click();
        elementPrompt.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        String name = "Pramod";
        alert.sendKeys(name);
        alert.accept();
//        alert.dismiss();

        String result = driver.findElement(By.id("result")).getText();
//        Assert.assertEquals(result,"You successfully clicked an alert");
//        Assert.assertEquals(result,"You clicked: Ok");
//        Assert.assertEquals(result,"You clicked: Cancel");
        Assert.assertEquals(result,"You entered: "+name);


        closeBrowser(driver);











    }

}
