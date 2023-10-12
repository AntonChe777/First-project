package check_box_tests;

import browuser.Brawser;
import main_pageis.Main_paige;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Check_Box_Test {

    private WebDriver driver;

    private Main_paige mainPaige;
    @BeforeClass
    public void beforeClass(){
        driver = Brawser.createDriver();
        mainPaige = new Main_paige(driver);
      //  mainPaige.openStartPage();
    }
    @AfterClass
    public void afterClass(){
        driver.quit();
    }
    @Test
    public void step_01(){
        mainPaige.openURL("https://demoqa.com/checkbox");
        mainPaige.setCheckBox("Home",true);
        mainPaige.setCheckBox("Home",true);
        Assert.assertTrue(mainPaige.getCheckBoxStatus("Home"));
        Assert.assertTrue(mainPaige.getText("//div[@id='result']/span[1]").contains("You have selected"));

    }
}
