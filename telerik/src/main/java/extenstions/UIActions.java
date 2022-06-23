package extenstions;


import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import utilites.CommonOps;


public class UIActions extends CommonOps {

    @Step("Click on element")
    public static void click(WebElement elem) {
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
    }

    @Step("Clear element")
    public static void clear(WebElement elem) {
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.clear();
    }

    @Step("update text")
    public static void updateText(WebElement elem, String text) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(text);
    }

    @Step("drop down by visible text")
    public static void dropDownVisibleText(WebElement elem, String text) {
        Select dropDown = new Select(elem);
        wait.until(ExpectedConditions.visibilityOf(elem));
        dropDown.selectByVisibleText(text);
    }

    @Step("drop down by index")
    public static void dropDownByIndex(WebElement elem, int index) {
        Select dropDown = new Select(elem);
        wait.until(ExpectedConditions.visibilityOf(elem));
        dropDown.selectByIndex(index);
    }

    @Step("mouse hover")
    public static void mouseHover(WebElement elem1) {
        action.moveToElement(elem1).click().build().perform();
    }


    @Step("iframe - get in the Payment by Credit Card box")
    public static void iframe(WebElement elem) {
        driver.switchTo().frame(elem);
    }

    @Step("iframe - exit ")
    public static void defaultFrame() {
        driver.switchTo().defaultContent();
    }



    @Step("switch to new window opened")
    public static void switchToNewWindow(String newWin){
        for(String winHandle: driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
            if(driver.getTitle().equals(newWin))
                break;
        }
    }
    @Step("scroll down")
    public static void scrollDown() {
        ((JavascriptExecutor)driver).executeScript("scroll(0,-1400)");
    }
}


