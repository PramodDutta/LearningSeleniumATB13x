package com.thetestingacademy.ex12_Windows;

import com.thetestingacademy.utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class Lab38_Windows_Part1 extends CommonToAll {


    @Test
    public void test_windows() {
        WebDriver driver = new ChromeDriver();
        String URL = "https://the-internet.herokuapp.com/windows";
        driver.get(URL);

        String parent_id = driver.getWindowHandle();
        System.out.println(parent_id);
        System.out.println(driver);


        WebElement link_parent = driver.findElement(By.xpath("//a[text()=\"Click Here\"]"));
        link_parent.click();


        // 2 Windows

        Set<String> windows_hanles_ids = driver.getWindowHandles();
        System.out.println(windows_hanles_ids);

        // How do I switch to the child window and
        // verify that there is a text with the name of new window?

        for(String window:  windows_hanles_ids){
            driver.switchTo().window(window);
            if(driver.getPageSource().contains("New Window")){
                System.out.println("Test Cases passed!");
            }

        }

        driver.switchTo().window(parent_id);






        closeBrowser(driver);





    }

}
