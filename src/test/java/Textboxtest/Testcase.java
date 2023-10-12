package Textboxtest;

import browuser.Brawser;
import main_pageis.Main_paige;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.base.base.BasePaige;
import pages.base.base.elements.ElementsPage;

import java.time.Duration;

import static constants.Constant.URLS.START_PAGE_URL;

public class Testcase {
    private WebDriver driver;
   // private BasePaige basePaige;
    private Main_paige mainPaige;
    private ElementsPage elementsPage;

    @BeforeClass
    public void beforeClass(){
       driver = Brawser.createDriver();
      // basePaige = new BasePaige(driver);
       mainPaige = new Main_paige(driver);
       mainPaige.openStartPage();
       //basePaige.openStartPage();
    }
    @AfterClass
    public void afterClass(){
        driver.quit();
    }
    @Test
    public void step_01(){
      // basePaige.click("//div[@class='card mt-4 top-card']/div[div/h5[text()='Elements']]");
        elementsPage =mainPaige.openCategoryElements();
        String text = mainPaige.getText("//div[@class='col-12 mt-4 col-md-6']");
        String textResult = "Please select an item from left to start practice.";
        Assert.assertTrue(text.equals(textResult));
        Assert.assertEquals(text,textResult);

    }
}
