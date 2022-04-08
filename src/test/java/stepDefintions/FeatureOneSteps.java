package stepDefintions;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class FeatureOneSteps extends Base {
    HomePage homePage;

    @Given("Navigate to the web page")
    public void navigateToTheWebPage() {
        driver.navigate().to("https://testingwithclarity.com/ClarityTestPage/ClarityTestPage.html");

    }

    @When("User click on the click button")
    public void clickOnTheButtonClickButton() {
        homePage=new HomePage(driver);
        homePage.clickOnTheButtonClickButton();
    }

    @Then("Then click done message should be displayed")
    public void clickDoneMessageShouldBeDisplayed() {
        homePage.checkClickDoneMessage();
    }

    @When("User click on the DblClick button")
    public void clickOnTheButtonDblClickButton() {
        homePage=new HomePage(driver);
        homePage.clickOnTheDbClickButtonClickButton();
    }

    @Then("Then DblClick Done message should be displayed")
    public void DblClickDoneMessageShouldBeDisplayed() {
        homePage.checkDblClickDoneMessage();
    }

    @When("Move the mouse over the MouseOver button")
    public void moveTheMouseOverTheButtonMouseOverButton() {
        homePage=new HomePage(driver);
        homePage.mouseOverTheMouseOverButton();

    }

    @Then("Then MouseOver Done message should be displayed")
    public void mouseoverDoneMessageShouldBeDisplayed() {
        homePage.checkMouseOverDoneMessage();

    }

    @When("User insert a value in the first input text field")
    public void insertAValueInTheFirstInputTextField() {
        homePage=new HomePage(driver);
        homePage.insertInTheFristInput();
    }

    @And("Click on the propagate button")
    public void clickOnThePropagateButton() {
        homePage.clickOnPropagateButton();
    }

    @And("All other input fields contain the same value inserted initially")
    public void validateThatAllOtherThreeInputFieldsContainTheSameValueInsertedInitially() throws InterruptedException {
        homePage.validateOtherThreeInputFields();


    }

    @And("Click on the clear all button")
    public void clickOnTheClearAllButton() {
        homePage.clickOnClearButton();
    }

    @Then("All the four input fields are empty")
    public void validateThatAllTheFourInputFieldsAreEmpty() throws InterruptedException {
        homePage.validateAllInputFieldsAreCleared();
    }
}

