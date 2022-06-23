package extenstions;

import com.sun.net.httpserver.Authenticator;
import io.qameta.allure.Step;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.internal.ITestInvoker;
import utilites.CommonOps;

import java.util.List;

import static org.testng.AssertJUnit.*;


public class Verification extends CommonOps {
    @Step("assert text in element")
    public static void verifyTextInElement(WebElement elem, String expected) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertEquals(elem.getText(), expected);
    }

    @Step("soft assert text in element")
    public static void verifyTextInElementSoft(WebElement elem, String expected) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        softAssert.assertEquals(elem.getText(),expected);
    }

    @Step("verify text in element changed")
    public static void verifyTextInElementChanged(WebElement elem, String expected) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertNotSame(elem.getText(), expected);
    }

    @Step("verify element displayed")
    public static void verifyElementToBeClickable(WebElement elem) {
        wait.until(ExpectedConditions.elementToBeClickable(elem));
    }

    @Step("visibility of object")
    public static void visibilityOfObjects(List<WebElement> elems) {
        for (WebElement elem : elems) {
            softAssert.assertTrue(elem.isDisplayed(), "sorry" + elem.getText() + "is not displayed");
        }
        softAssert.assertAll("some elements are not displayed");
    }

    public static void verifyElemNotDisplayed(WebElement elem) {
        try {
            elem.isDisplayed();
            Assert.fail();
        } catch (NoSuchElementException e) {
            // report - not exists
        }
    }
    public static void verifyCheckBoxSelected(WebElement elem) {
            wait.until(ExpectedConditions.visibilityOf(elem));
            elem.isSelected();
    }
}




