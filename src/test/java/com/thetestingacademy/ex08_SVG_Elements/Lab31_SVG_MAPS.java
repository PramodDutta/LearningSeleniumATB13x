package com.thetestingacademy.ex08_SVG_Elements;

import com.thetestingacademy.ex07_WaitHelper.WaitHelpers;
import com.thetestingacademy.utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Lab31_SVG_MAPS extends CommonToAll {

    @Test
    public void test_India_map_SVG() {

        WebDriver driver = new ChromeDriver();
        String URL = "https://www.amcharts.com/svg-maps/?map=india";
        driver.get(URL);
        driver.manage().window().maximize();

        WaitHelpers waitHelpers = new WaitHelpers();
//        waitHelpers.waitJVM(3000);
        waitHelpers.waitForVisibility(driver,3,"//*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']");


        List<WebElement> states = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']"));
        for(WebElement state: states){
            System.out.println(state.getDomAttribute("aria-label"));
            if(state.getDomAttribute("aria-label").contains("Tripura")){
                state.click();
            }


        }

        closeBrowser(driver);








    }


}
