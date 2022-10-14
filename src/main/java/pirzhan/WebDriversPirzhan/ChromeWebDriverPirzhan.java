package pirzhan.WebDriversPirzhan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeWebDriverPirzhan {


    public static WebDriver loadChromeDriverPirzhan(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        WebDriver driverPirzhan = new ChromeDriver(options);
        driverPirzhan.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driverPirzhan;
    }
}
