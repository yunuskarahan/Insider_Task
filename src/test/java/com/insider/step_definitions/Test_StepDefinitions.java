package com.insider.step_definitions;

import com.insider.pages.*;
import com.insider.utulities.BrowserUtils;
import com.insider.utulities.ConfigurationReader;
import com.insider.utulities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static org.junit.Assert.*;

public class Test_StepDefinitions {

    HomePage homePage = new HomePage();
    CareerPage careerPage = new CareerPage();
    JobsLeverPage jobsLeverPage = new JobsLeverPage();
    QaPage qaPage =new QaPage();



    Actions actions = new Actions(Driver.getDriver());



    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        BrowserUtils.waitForPageToLoad(10);

        BrowserUtils.waitForClickablility(homePage.AcceptAllButton,10);
        homePage.AcceptAllButton.click();




    }
    @Then("the user should see the {string}in the title on the homepage")
    public void theUserShouldSeeTheInTheTitleOnTheHomepage(String expectedHomePageTitle) {
        assertEquals(expectedHomePageTitle,Driver.getDriver().getTitle());

    }
    @When("user click on the more menu")
    public void user_click_on_the_more_menu() {
        BrowserUtils.waitForClickablility(homePage.moreMenu,15);
        homePage.moreMenu.click();

        assertTrue(homePage.moreDropDownMenu.isDisplayed());
    }
    @Then("the user should see the Careers menu in the other menu")
    public void theUserShouldSeeTheCareersMenuInTheOtherMenu() {

        assertTrue(homePage.careersButton.isDisplayed());
    }
    @Then("the user clicks on the career page")
    public void the_user_clicks_on_the_career_page() {
        BrowserUtils.waitForClickablility(homePage.careersButton,10);
        actions.moveToElement(homePage.careersButton).perform();
        homePage.careersButton.click();





    }
    @Then("the user should see the page title is {string}")
    public void theUserShouldSeeThePageTitleIs(String expectedCareersPageTitle) {
        BrowserUtils.waitForVisibility(careerPage.fydjButton,10);
        assertEquals(expectedCareersPageTitle,Driver.getDriver().getTitle());

    }
    @And("the user should see the  {string} teams header")
    public void theUserShouldSeeTheTeamsHeader(String expectedTeamsHeader) {

        BrowserUtils.scrollToElement(careerPage.teamsHeader);
        assertEquals(expectedTeamsHeader,careerPage.teamsHeader.getText());
        System.out.println("a: "+ careerPage.teamsHeader.getText());

    }
    @And("the user should see the {string} location header")
    public void theUserShouldSeeTheLocationHeader(String expectedLocationHeader) {

        BrowserUtils.scrollToElement(careerPage.teamsHeader);
        assertEquals(expectedLocationHeader,careerPage.locationsHeader.getText());
        System.out.println("b: "+ careerPage.locationsHeader.getText());

    }
    @And("the user should see the {string} life at inseder header")
    public void theUserShouldSeeTheLifeAtInsederHeader(String expectedLifeAndInsederHeader) {
        BrowserUtils.scrollToElement(careerPage.teamsHeader);
        assertEquals(expectedLifeAndInsederHeader,careerPage.lifeAndInsederHeader.getText());
        System.out.println("c: "+ careerPage.lifeAndInsederHeader.getText());
    }
    @Then("the user clicks on the see all teams button")
    public void the_user_clicks_on_the_see_all_teams_button() {
        BrowserUtils.waitForClickablility(careerPage.seeAllTeamsButton,15);
        JavascriptExecutor executor = (JavascriptExecutor)Driver.getDriver();
        executor.executeScript("arguments[0].click();",careerPage.seeAllTeamsButton);


    }
    @Then("the user should see all the jobs")
    public void the_user_should_see_all_the_jobs(List<String> expectedJobTitleList) {

        for (int i = 0; i<careerPage.jobList.size();i++){
            BrowserUtils.waitForVisibility(careerPage.jobList.get(i),10);
            String actualJobTitleList = careerPage.jobList.get(i).getText();
            assertEquals(expectedJobTitleList.get(i),actualJobTitleList);

            System.out.println("actualJobTitleList = " + actualJobTitleList);
        }

    }
    @Then("the user clicks on the quality assurance menu")
    public void the_user_clicks_on_the_quality_assurance_menu() {

        BrowserUtils.scrollToElement(careerPage.qualityAssuranceLink);
        BrowserUtils.waitForClickablility(careerPage.qualityAssuranceLink,15);

        JavascriptExecutor executor = (JavascriptExecutor)Driver.getDriver();
        executor.executeScript("arguments[0].click();",careerPage.qualityAssuranceLink);


    }
    @Then("the user should be see the header {string}")
    public void the_user_should_be_see_the_header(String expectedQualityAssuranceHeader) {
        BrowserUtils.waitForPageToLoad(15);
        assertEquals(expectedQualityAssuranceHeader,qaPage.qualityAssuranceHeader.getText());

    }
    @Then("the user should be See all QA jobs button")
    public void the_user_should_be_see_all_qa_jobs_button() {
        BrowserUtils.waitForVisibility(qaPage.seeAllQaJobsButton,10);
        assertTrue(qaPage.seeAllQaJobsButton.isDisplayed());

    }
    @Then("the user clicks on the See all QA jobs button")
    public void the_user_clicks_on_the_see_all_qa_jobs_button() {
        BrowserUtils.waitForClickablility(qaPage.seeAllQaJobsButton,10);
        JavascriptExecutor executor = (JavascriptExecutor)Driver.getDriver();
        executor.executeScript("arguments[0].click();",qaPage.seeAllQaJobsButton);

    }
    @Then("the user should see that the department name is {string} in the filtering")
    public void the_user_should_see_that_the_department_name_is_in_the_filtering(String expectedDepartmentNameTitle) {

        BrowserUtils.waitForVisibility(qaPage.filterByDepartment,10);
        assertEquals(expectedDepartmentNameTitle,qaPage.filterByDepartment.getAttribute("title"));
    }
    @Then("the user clicks on the location filtering button")
    public void the_user_clicks_on_the_location_filtering_button() {
        BrowserUtils.waitForClickablility(qaPage.filterByLocation,10);
        qaPage.filterByLocation.click();



    }
    @Then("the user should see that the entire location filter menu opens")
    public void the_user_should_see_that_the_entire_location_filter_menu_opens() {

        BrowserUtils.waitForVisibility(qaPage.locationMenu,10);
        assertTrue(qaPage.locationMenu.getAttribute("aria-expanded").equals("true"));

    }
    @Then("the user clicks on Istanbul, Turkey")
    public void the_user_clicks_on_istanbul_turkey() {
        BrowserUtils.waitForClickablility(qaPage.istanbulOptions,10);
        qaPage.istanbulOptions.click();


    }
    @Then("the user should see that the location name is {string} in the filtering")
    public void the_user_should_see_that_the_location_name_is_in_the_filtering(String expectedLocationNameTitle) {
        BrowserUtils.waitForVisibility(qaPage.filterByLocation,10);
        assertEquals(expectedLocationNameTitle,qaPage.filterByLocation.getAttribute("title"));

    }
    @Then("the user should only see the {string} and {string}  results")
    public void theUserShouldOnlySeeTheAndResults(String expectedLocationName, String expectedDepartmanName) {

        BrowserUtils.scrollToElement(qaPage.resultFirst);
        BrowserUtils.waitFor(5);

        for (int i = 0; i<qaPage.locationResult.size();i++){
            BrowserUtils.waitForVisibility(qaPage.locationResult.get(i),10);
            String actualLocationName = qaPage.locationResult.get(i).getText();
            assertEquals(expectedLocationName,actualLocationName);

            System.out.println("actualLocationName = " + actualLocationName);
        }
        for (int i = 0; i<qaPage.departmentResult.size();i++){
            BrowserUtils.waitForVisibility(qaPage.departmentResult.get(i),10);
            String actualDepartmanName = qaPage.departmentResult.get(i).getText();
            assertEquals(expectedDepartmanName,actualDepartmanName);

            System.out.println("actualDepartmanName = " + actualDepartmanName);
        }
        


    }




    @Then("the user should see the Apply Now button")
    public void theUserShouldSeeTheApplyNowButton() {

      BrowserUtils.scrollToElement(qaPage.applyNowButton);
      actions.moveToElement(qaPage.applyNowButton).build().perform();
        assertTrue(qaPage.applyNowButton.isDisplayed());

    }
    @Then("the user clicks on Apply Now Button")
    public void the_user_clicks_on_apply_now_button() {

        /*actions.moveToElement(qaPage.applyNowButton).build().perform();
        BrowserUtils.waitForClickablility(qaPage.applyNowButton,10);
        qaPage.applyNowButton.click();*/

        BrowserUtils.waitForClickablility(qaPage.applyNowButton,10);
        JavascriptExecutor executor = (JavascriptExecutor)Driver.getDriver();
        executor.executeScript("arguments[0].click();",qaPage.applyNowButton);


    }


    @Then("the user should see the {string} url")
    public void theUserShouldSeeTheUrl(String expectedUrl) {
        BrowserUtils.waitFor(6);
        Driver.getDriver().getWindowHandles().forEach(tab->Driver.getDriver().switchTo().window(tab));
        String actualUrl = Driver.getDriver().getCurrentUrl();
        assertEquals(expectedUrl,actualUrl.substring(8, actualUrl.lastIndexOf(".co")+3));

        assertTrue(jobsLeverPage.applyForThisJobButton.isDisplayed());

    }




}
