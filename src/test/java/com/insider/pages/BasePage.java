package com.insider.pages;

import com.insider.utulities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@id='wt-cli-accept-all-btn'])[1]")
    public WebElement AcceptAllButton;


}


