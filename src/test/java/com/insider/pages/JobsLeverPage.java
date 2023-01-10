package com.insider.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JobsLeverPage extends BasePage{

   @FindBy(xpath = "(//a[@class='postings-btn template-btn-submit shamrock'])[1] ")
    public  WebElement applyForThisJobButton;
}
