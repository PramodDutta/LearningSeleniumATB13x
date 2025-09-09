package com.thetestingacademy.ex06_Input_Select_Alerts_Radio_Checkbox;

import com.thetestingacademy.ex07_WaitHelper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium29_Modal {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

//        new WaitHelpers().waitJVM(5000);
        new WaitHelpers().waitForVisibility(driver,5000, "//span[@data-cy='closeModal']");
        WebElement e = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        e.click();
    }
}
