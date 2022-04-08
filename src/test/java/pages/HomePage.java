package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {
    @FindBy(id = "buttonClick")
    WebElement click_button;
    @FindBy(id = "buttonClickMsg")
    WebElement click_message;
    @FindBy(id = "buttonDblClick")
    WebElement double_click_button;
    @FindBy(id = "buttonDblClickMsg")
    WebElement double_click_message;
    @FindBy(id = "buttonMouseOver")
    WebElement mouse_over_button;
    @FindBy(id = "buttonMouseOverMsg")
    WebElement mouse_over_message;
    @FindBy(xpath = "//*[@id=\"InputTextObjects\"][1]//input")
    List<WebElement> inputs;
    @FindBy(id = "propagate")
    WebElement propagate_button;
    @FindBy(xpath = "//*[@id=\"InputTextObjects\"]//button[2]")
    WebElement clear_all_button;
    ///////////////////////////////////////////////////////////
    WebDriver driver;

    ///////////////////////////////////////////////////////////
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnTheButtonClickButton() {
        this.click_button.click();
    }

    public void checkClickDoneMessage() {
        Assert.assertTrue("The message isn't displayed", this.click_message.isDisplayed());
        Assert.assertEquals("Wrong displayed message", this.click_message.getText(), "Click Done");
    }


    public void clickOnTheDbClickButtonClickButton() {
        this.double_click_button.click();
    }

    public void checkDblClickDoneMessage() {

        Assert.assertTrue("The message isn't displayed", this.double_click_message.isDisplayed());
        Assert.assertEquals("Wrong displayed message", this.double_click_message.getText(), "Click Done");
    }


    public void mouseOverTheMouseOverButton() {
        Actions action = new Actions(driver);
        action.moveToElement(this.mouse_over_button).perform();
    }

    public void checkMouseOverDoneMessage() {

        Assert.assertTrue("The message isn't displayed", this.mouse_over_message.isDisplayed());
        Assert.assertEquals("Wrong displayed message", this.mouse_over_message.getText(), "MouseOver Done");
    }

    public void insertInTheFristInput() {
        inputs.get(0).sendKeys("1");
    }

    public void clickOnPropagateButton() {
        this.propagate_button.click();
    }

    public void validateOtherThreeInputFields() throws InterruptedException {
        Thread.sleep(2000);
        for (int i = 1; i <= 3; i++) {

            Assert.assertEquals("Inputs dosen't  match", inputs.get(i).getAttribute("value"), "1");

        }
    }
    public void clickOnClearButton() {
        this.clear_all_button.click();
    }

    public void validateAllInputFieldsAreCleared() throws InterruptedException {
        Thread.sleep(2000);
        for (int i = 1; i <= 3; i++) {
            Assert.assertEquals("Inputs dosen't  match", inputs.get(i).getAttribute("value"), "");
        }
    }
}
