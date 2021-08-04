package userinterfaces;

import hooks.BaseMobileTest;
import io.appium.java_client.MobileElement;

public class CalculatorElements extends BaseMobileTest {

    public static MobileElement sameButton = (MobileElement) driver.findElementById("com.google.android.calculator:id/eq");
    public static MobileElement sum = (MobileElement) driver.findElementById("com.google.android.calculator:id/op_add");
    public static MobileElement subtraction = (MobileElement) driver.findElementById("com.google.android.calculator:id/op_sub");
    public static MobileElement multiplication = (MobileElement) driver.findElementById("com.google.android.calculator:id/op_mul");
    public static MobileElement division = (MobileElement) driver.findElementById("com.google.android.calculator:id/op_div");
    public static MobileElement delete = (MobileElement) driver.findElementById("com.google.android.calculator:id/del");

    public static MobileElement mobileElement(String number){
        MobileElement numbers = (MobileElement) driver.findElementById("com.google.android.calculator:id/digit_"+number);
        return numbers;
    }
}
