package pirzhan.WebDriversPirzhan;

import org.openqa.selenium.WebDriver;
import pirzhan.configReaderPirzhan.ConfigReaderPirzhan;

public class DriverPirzhan {


    public DriverPirzhan() {
    }


    public static WebDriver driverPirzhan;

    public static WebDriver getDriverPirzhan(){
        if (driverPirzhan == null){
            switch (ConfigReaderPirzhan.getPropertyPirzhan("browser").toLowerCase().trim()){
                case ("chrome"):
                    driverPirzhan = ChromeWebDriverPirzhan.loadChromeDriverPirzhan();
                    break;
                case ("edge"):
                    driverPirzhan = EdgeWebDriverPirzhan.loadEdgeDriverPirzhan();
                    break;
                default:
                    driverPirzhan = ChromeWebDriverPirzhan.loadChromeDriverPirzhan();
            }
        }
        return driverPirzhan;
    }

    public static void closeDriverPirzhan(){
        try {
            if (driverPirzhan != null){
                driverPirzhan.close();
                driverPirzhan.quit();
                driverPirzhan = null;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
