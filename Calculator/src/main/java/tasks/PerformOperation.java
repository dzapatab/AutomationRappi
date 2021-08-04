package tasks;

import hooks.BaseMobileTest;
import static interactions.CustomWait.waitInSeconds;
import interactions.Delete;
import interactions.ReturnResult;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static models.ResultOperations.*;
import static userinterfaces.CalculatorElements.*;

public class PerformOperation extends BaseMobileTest {

    static WebDriverWait wait = new WebDriverWait(driver, 60);

    public static void sum(String numberOne, String numberTwo){
        wait.until(ExpectedConditions.elementToBeClickable(sameButton));
        mobileElement(numberOne).click();
        sum.click();
        mobileElement(numberTwo).click();
        waitInSeconds(2);
        setResultSum(ReturnResult.theOfOperation());
    }

    public static void subtraction(String numberOne, String numberTwo){
        wait.until(ExpectedConditions.elementToBeClickable(sameButton));
        Delete.value();
        mobileElement(numberOne).click();
        subtraction.click();
        mobileElement(numberTwo).click();
        waitInSeconds(2);
        setResultsubtraction(ReturnResult.theOfOperation());
    }

    public static void multiplication(String numberOne, String numberTwo){
        wait.until(ExpectedConditions.elementToBeClickable(sameButton));
        Delete.value();
        mobileElement(numberOne).click();
        multiplication.click();
        mobileElement(numberTwo).click();
        waitInSeconds(2);
        setResultMultiplication(ReturnResult.theOfOperation());
    }

    public static void division(String numberOne, String numberTwo){
        wait.until(ExpectedConditions.elementToBeClickable(sameButton));
        Delete.value();
        mobileElement(numberOne).click();
        division.click();
        mobileElement(numberTwo).click();
        waitInSeconds(2);
        setResultDivision(ReturnResult.theOfOperation());
    }

}
