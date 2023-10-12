package waits;

import browuser.Brawser;
import main_pageis.Main_paige;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.base.base.elements.ElementsPage;

import java.time.Duration;

public class Wait_Test {
    private WebDriver driver;
    // private BasePaige basePaige;
    private Main_paige mainPaige;
    private ElementsPage elementsPage;

    @BeforeClass
    public void beforeClass(){
        driver = Brawser.createDriver();
        mainPaige = new Main_paige(driver);
        mainPaige.openStartPage();
    }
    @AfterClass
    public void afterClass(){
        driver.quit();
    }
    @Test
    public void step_01(){
        String xpath = "//button[@id='visibleAfter']";
        elementsPage =mainPaige.openCategoryElements();
        elementsPage.click("//span[text()='Dynamic Properties']");
        elementsPage.waitElementDisplayed(xpath);
        elementsPage.click(xpath);
        Assert.assertTrue(elementsPage.findElement(xpath).isEnabled());

    }
    @Test
    public void step_02(){
        elementsPage.openStartPage();
        mainPaige.openCategoryElements();
        elementsPage.click("//span[text()='Dynamic Properties']");
        String xpath ="//button[@id='enableAfter']";
        new WebDriverWait(driver,Duration.ofSeconds(10)).until(d->elementsPage.findElement(xpath).isEnabled());
        Assert.assertTrue(elementsPage.findElement(xpath).isEnabled());
    }
}
