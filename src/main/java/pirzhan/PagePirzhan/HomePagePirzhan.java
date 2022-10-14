package pirzhan.PagePirzhan;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePagePirzhan extends BasePagePirzhan{

    @FindBy(xpath = "(//div[@class='tl-bold-link'])[1]")
    private WebElement usersButton;
    @FindBy(xpath = "//th[text()='User']")
    private WebElement usersText;

    @FindBy(xpath = "(//div[@class='tl-bold-link'])[2]")
    private WebElement coursesButton;

    @FindBy(xpath = "(//div[@class='tl-bold-link'])[3]")
    private WebElement categoriesButton;

    @FindBy(xpath = "(//div[@class='tl-bold-link'])[4]")
    private WebElement groupsButton;

    @FindBy(xpath = "(//div[@class='tl-bold-link'])[5]")
    private WebElement branchesButton;

    @FindBy(xpath = "(//div[@class='tl-bold-link'])[6]")
    private WebElement eventEngineButton;

    @FindBy(xpath = "(//div[@class='tl-bold-link'])[7]")
    private WebElement userTypes;

    @FindBy(xpath = "(//div[@class='tl-bold-link'])[8]")
    private WebElement importExportButton;

    @FindBy(xpath = "(//div[@class='tl-bold-link'])[9]")
    private WebElement reportsButton;

    @FindBy(xpath = "(//div[@class='tl-bold-link'])[10]")
    private WebElement accountsSettingsButton;

    public HomePagePirzhan buttonUsers(){
        helpersPirzhan.click(usersButton);
        Assertions.assertEquals("USER",helpersPirzhan.getText(usersText));
        driverPirzhan.navigate().back();
        return this;
    }

}
