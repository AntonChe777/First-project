package select;
import browuser.Brawser;
import main_pageis.Main_paige;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Select_Test {
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
        mainPaige.openURL("https://demoqa.com/select-menu");
       /* String locator = "//select[@id='oldSelectMenu']";
        Select select = new Select(mainPaige.findElement(locator));
        select.selectByVisibleText("Purple");
        Assert.assertTrue(mainPaige.findElement(locator + "/option[1]").getText().equals("Purple"));*/
        String locator = "//div[@class='css-2613qy-menu";
        mainPaige.click("//div[div[(text()='Select Option')]]");
        mainPaige.waitElementDisplayed(locator, 20);
        mainPaige.click(locator + );
        mainPaige.click();
    }
}
