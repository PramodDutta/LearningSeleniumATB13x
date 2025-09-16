package com.thetestingacademy.ex17_DataDrivenTesting_POI;

import com.thetestingacademy.utils.UtilExcel;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lab49_DDT_TestNG_POI {

    @Test(dataProvider = "getData")
    public  void test_vwo_login(String username,String password){
        System.out.println("Running  ");
        System.out.println(username + " - " + password);
        System.out.println();
    }

    //
    @DataProvider
    public Object[][] getData(){
        // READ THE DATA FROM THE EXCEL FILE
        // GIVE THEM IN THE 2D ARRAY
        return UtilExcel.getTestDataFromExcel("sheet1");
    }



}
