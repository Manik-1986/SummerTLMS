package pirzhan.WebDriversPirzhan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class EdgeWebDriverPirzhan {


    public static WebDriver loadEdgeDriverPirzhan(){
        WebDriverManager.edgedriver().setup();
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized");

        WebDriver driverPirzhan = new EdgeDriver(options);
        driverPirzhan.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driverPirzhan;
    }
}
