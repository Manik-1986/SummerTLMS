package pirzhan.PagePirzhan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pirzhan.MethodFactoryPirzhan.MethodHelpersPirzhan;
import pirzhan.WebDriversPirzhan.DriverPirzhan;

abstract public  class BasePagePirzhan {

    public BasePagePirzhan() {
        PageFactory.initElements(DriverPirzhan.getDriverPirzhan(),this);
    }

    protected    MethodHelpersPirzhan helpersPirzhan = new MethodHelpersPirzhan();

    protected  WebDriver driverPirzhan = DriverPirzhan.getDriverPirzhan();


}
