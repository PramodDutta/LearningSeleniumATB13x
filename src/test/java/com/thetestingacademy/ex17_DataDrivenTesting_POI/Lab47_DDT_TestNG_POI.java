package com.thetestingacademy.ex17_DataDrivenTesting_POI;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lab47_DDT_TestNG_POI {

    @Test(dataProvider = "getData")
    public  void test_vwo_login(String username,String password,String ER){
        System.out.println("Running  ");
        System.out.println(username + " - " + password +" - "  +ER);
        System.out.println();
    }

    //
    @DataProvider
    public Object[][] getData(){
        return new Object[][]{
                new Object[]{"admin@admin.com","pwd123","Expected Result 1"},
                new Object[]{"admin@admin.com","pwd123","Expected Result 2"},
                new Object[]{"admin@admin.com","pwd123","Expected Result 3"}
        };
    }



}
