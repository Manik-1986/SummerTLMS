package pirzhan.PagePirzhan.userPagePirzhan;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pirzhan.PagePirzhan.BasePagePirzhan;
import pirzhan.configReaderPirzhan.MockGeneratorPirzhan;

import java.awt.*;


public class UserPagePirzhan extends BasePagePirzhan {
    @FindBy(xpath = "(//a[@href='https://manik8687.talentlms.com/user/create'])[2]")
    private WebElement usersButton;

    @FindBy(css = "[title='З. Зарина']")  ////th[text()='User']
    private WebElement zarinaText;

    @FindBy(css = "[title='Users']")
    private WebElement userText;

    @FindBy(xpath = "//input[@name='name']")
    private WebElement firstNameInputField;

    @FindBy(xpath = "//input[@name='surname']")
    private WebElement lastNameInputField;

    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailAddressInputField;

    @FindBy(xpath = "//input[@name='login']")
    private WebElement userNameInputField;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordInputField;

    @FindBy(xpath = "//textarea[@class='span6']")
    private WebElement bioInputField;

    @FindBy(xpath = "(//span[@class='select2-arrow'])[1]")
    private WebElement typeButton;

    @FindBy(xpath = "(//div[@class='select2-result-label'])[4]")
    private WebElement learnTypeButton;

    @FindBy(xpath = "(//span[@class='select2-arrow'])[2]")
    private WebElement zoneButton;

    @FindBy(xpath = "(//input[@type='text'])[14]")
    private WebElement writeInput;

    @FindBy(xpath = "//input[@id='deactivate_user']")
    private WebElement deactivateButton;

    @FindBy(xpath = "(//td[@class='day '])[13]")
    private WebElement day19;

    @FindBy(xpath = "//input[@name='restrict_email']")
    private WebElement emailButton;

    @FindBy(xpath = "//input[@name='submit_personal_details']")
    private WebElement addButton;

    public UserPagePirzhan buttonUser(){
        helpersPirzhan.click(usersButton);
        Assertions.assertEquals("З. Зарина".toUpperCase(),helpersPirzhan.getText(zarinaText));
        Assertions.assertEquals("Users",helpersPirzhan.getText(userText));
        return this;
    }
    public UserPagePirzhan verifyText(){
        Assertions.assertEquals("З. Зарина".toUpperCase(),helpersPirzhan.getText(zarinaText));
        Assertions.assertEquals("Users",helpersPirzhan.getText(userText));
        return this;
    }
    public UserPagePirzhan inputFirstName(String value){
        helpersPirzhan.sendKeys(firstNameInputField,value);
        return this;
    }
    public UserPagePirzhan inputLastName(String value){
        helpersPirzhan.sendKeys(lastNameInputField,value);
        return this;
    }

    public UserPagePirzhan inputEmailAddress(String email){
        helpersPirzhan.sendKeys(emailAddressInputField,email);
        return this;
    }
    public UserPagePirzhan inputUserName(String value){
        helpersPirzhan.sendKeys(userNameInputField,value);
        return this;
    }

    public UserPagePirzhan inputPassword(String password){
        helpersPirzhan.sendKeys(passwordInputField,password);
        return this;
    }

    public UserPagePirzhan inputBIO(String bio){
        helpersPirzhan.sendKeys(bioInputField,bio);
        return this;
    }
    public UserPagePirzhan buttonType(){
        helpersPirzhan.click(typeButton);
        helpersPirzhan.click(learnTypeButton);
        return this;
    }
    public UserPagePirzhan buttonZone() throws AWTException {
        helpersPirzhan.click(zoneButton);
        helpersPirzhan.sendKeys(writeInput,MockGeneratorPirzhan.pirzhanGeneratorMockNumber(), Keys.ENTER);
        helpersPirzhan.click(deactivateButton);
        helpersPirzhan.click(day19);
        helpersPirzhan.click(emailButton);
        helpersPirzhan.click(addButton);
        return this;
    }

    @FindBy(xpath = "(//div[@class='tl-bold-link'])[1]")
    private WebElement clickUser;

    @FindBy(css = "[style='width: 13px;']")
    private WebElement clickUserButton;

    @FindBy(xpath = "(//input[@type='checkbox'])[1]")
    private WebElement userButton;

    @FindBy(css = "[data-id='1']")
    private WebElement clickAdmin;

    @FindBy(xpath = "//a[@class='btn dropdown-toggle']")
    private WebElement massButton;

    @FindBy(xpath = "(//a[@class='massaction'])[3]")
    private WebElement deleteButton;

    @FindBy(xpath = "//a[@class='btn deleteusers btn-danger']")
    private WebElement delete;

    @FindBy(css = "[title='Home']")
    private WebElement titleHome;

    public UserPagePirzhan buttonUsers(){
        helpersPirzhan.click(clickUser);
        helpersPirzhan.click(clickUserButton);
        helpersPirzhan.click(clickAdmin);
        return this;
    }
    public UserPagePirzhan deleteUsers(){
        helpersPirzhan.click(massButton);
        helpersPirzhan.click(deleteButton);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        helpersPirzhan.click(delete);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return this;
    }
    public UserPagePirzhan getTExt(){
        Assertions.assertEquals("Home",helpersPirzhan.getText(titleHome));
        return this;
    }
}
