package com.insider.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{


    @FindBy(xpath = "//span[.='More']")
    public WebElement moreMenu;
    @FindBy(xpath = "//div[@class='dropdown-menu show']")
    public WebElement moreDropDownMenu;

    @FindBy(xpath = "//h5[contains(text(),'Careers')]")
    public  WebElement careersButton;

}
