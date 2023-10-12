package main_pageis;

import org.openqa.selenium.WebDriver;
import pages.base.base.BasePaige;
import pages.base.base.elements.ElementsPage;

public class Main_paige extends BasePaige {

    public Main_paige(WebDriver driver) {
        super(driver);
    }
    public static final String HOME_BANNER = "//div[@class='home-banner'][a[@href='https://www.toolsqa.com/selenium-training/']]";
    public static final String BLOCK_XPATH = "//div[@class='card mt-4 top-card']";
    public static final String CATEGORY_BLOCK_XPATH = BLOCK_XPATH + "/div[div/h5[text()='%s']]";
    public void openCategory(String categoryName){
        click(String.format(CATEGORY_BLOCK_XPATH,categoryName));
    }
    public ElementsPage openCategoryElements(){
        openCategory("Elements");
        return new ElementsPage(driver);
    }
    public void  openCategoryForms(){
        openCategory("Forms");
    }
}
