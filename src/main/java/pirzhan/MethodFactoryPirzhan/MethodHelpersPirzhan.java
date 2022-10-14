package pirzhan.MethodFactoryPirzhan;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pirzhan.PagePirzhan.BasePagePirzhan;
import pirzhan.WebDriversPirzhan.DriverPirzhan;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class MethodHelpersPirzhan {

    public MethodHelpersPirzhan waitElementToBeClicked(WebElement element){
        new WebDriverWait(DriverPirzhan.getDriverPirzhan(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }

    public MethodHelpersPirzhan waitElementToBeDisplayed(WebElement element){
        new WebDriverWait(DriverPirzhan.getDriverPirzhan(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(element));
        return this;
    }

    public MethodHelpersPirzhan sendKeys(WebElement element,String str){
        waitElementToBeDisplayed(element);
        element.sendKeys(str);
        return this;
    }
    public MethodHelpersPirzhan sendKeys(WebElement element, String str, Keys enter){
        waitElementToBeDisplayed(element);
        element.sendKeys(str,enter);
        return this;
    }
    public MethodHelpersPirzhan click(WebElement element){
        waitElementToBeClicked(element);
        waitElementToBeDisplayed(element);
        element.click();
        return this;
    }

    public String getText(WebElement element){
        waitElementToBeDisplayed(element);
        return element.getText();
    }
    public MethodHelpersPirzhan loops(int num) throws Exception {
        Robot robot = new Robot();
        for (int i = 0; i < num; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_CONTROL);
        }
        return this;
    }
    public MethodHelpersPirzhan getTExt(WebElement element){
        waitElementToBeDisplayed(element);
        getText(element);return this;
    }

    public MethodHelpersPirzhan sleep(long num){
        try {
            Thread.sleep(num);
        }catch (Exception e){
            e.printStackTrace();
        }
        return this;
    }
    public MethodHelpersPirzhan down(int num)throws  Exception{
        Robot robot = new Robot();
        for (int i = 0; i < num; i++) {
            robot.keyPress(KeyEvent.VK_PAGE_DOWN);
            robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
        }
        return this;
    }
//    public MethodHelpersPirzhan frameSwitch(WebElement element){
//        driverPirzhan.switchTo().frame(element);
//        element.click();
//        return this;
//    }
}
