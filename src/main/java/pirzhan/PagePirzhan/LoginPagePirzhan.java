package pirzhan.PagePirzhan;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pirzhan.configReaderPirzhan.ConfigReaderPirzhan;

public class LoginPagePirzhan extends BasePagePirzhan {


    @FindBy(xpath = "//input[@name='login']")
    private WebElement  loginInput;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "(//div[@class='tl-onboarding-end-item tl-onboarding-end-item--hoverable'])[3]")
    private WebElement adminButton;

    public LoginPagePirzhan inputLogin(String str){
        helpersPirzhan.sendKeys(loginInput,str);
        return this;
    }
    public LoginPagePirzhan inputPassword(String str){
        helpersPirzhan.sendKeys(passwordInput,str, Keys.ENTER);
        return this;

    }
    public LoginPagePirzhan buttonAdmin(){
        helpersPirzhan.click(adminButton);
        return this;
    }
    public LoginPagePirzhan login(String url){
        driverPirzhan.get(url);
        inputLogin(ConfigReaderPirzhan.getPropertyPirzhan("login"))
                .inputPassword(ConfigReaderPirzhan.getPropertyPirzhan("password"))
                .buttonAdmin();
        return this;
    }
}
