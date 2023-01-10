package com.insider.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.nio.file.Watchable;
import java.util.List;

public class QaPage extends BasePage {


    @FindBy(xpath = "//h1[@class='big-title big-title-media mt-4 mt-lg-0']")
    public WebElement qualityAssuranceHeader;

    @FindBy(xpath = "//a[contains(text(),'See all QA jobs')]")
    public WebElement seeAllQaJobsButton;

    @FindBy(id = "select2-filter-by-department-container")
    public WebElement filterByDepartment;

    @FindBy(id = "select2-filter-by-location-container")
    public WebElement filterByLocation;

    @FindBy(xpath = "(//span[@role='combobox'])[1]")
    public WebElement locationMenu;

    @FindBy(xpath = "//ul[@class='select2-results__options']/li[.='Istanbul, Turkey']")
    public WebElement istanbulOptions;

    @FindBy(xpath = "//span[@class='position-department text-large font-weight-600 text-primary']")
    public List<WebElement> departmentResult;

    @FindBy(xpath = "//div[@class='position-location text-large']")
    public List<WebElement> locationResult;


    @FindBy(xpath = "(//div[@class='position-list-item-wrapper bg-light'])[1]")
    public WebElement resultFirst;

    @FindBy(xpath = "(//a[@class='btn btn-navy rounded pt-2 pr-5 pb-2 pl-5'])[1]")
    public WebElement applyNowButton;











    ////div[@id='jobs-list']//div[@data-animate-way='bottom-top'] = iş listesi
    //data-location
    //data-team


    //(//a[.='Apply Now'])[1] apply now


}
