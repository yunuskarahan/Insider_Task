package com.insider.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CareerPage extends BasePage {

    @FindBy(xpath = "(//h3[@class='category-title-media'])[1]")
    public WebElement teamsHeader;

    @FindBy(xpath = "//h3[@class='category-title-media ml-0']")
    public WebElement locationsHeader;

    @FindBy(xpath = "(//h2[@class='elementor-heading-title elementor-size-default'])[2]")
    public WebElement lifeAndInsederHeader;

    @FindBy(xpath = "//a[@class='btn btn-outline-secondary rounded text-medium mt-5 mx-auto py-3 loadmore']")
    public WebElement seeAllTeamsButton;

    @FindBy(xpath = "//h3[@class='text-center mb-4 mb-xl-5']")
    public List<WebElement> jobList;

    @FindBy(xpath = "//h3[contains(text(),'Quality Assurance')]")
    public WebElement qualityAssuranceLink;

    @FindBy(linkText = "Find your dream job")
    public  WebElement fydjButton;









}
