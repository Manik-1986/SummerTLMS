package steps.stepPirzhan;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pirzhan.WebDriversPirzhan.DriverPirzhan;
import pirzhan.configReaderPirzhan.ConfigReaderPirzhan;
import pirzhan.configReaderPirzhan.MockGeneratorPirzhan;

import java.awt.*;

public class UserSteps extends BaseStepsFactoryPirzhan{

    @Given("user open web")
    public void user_open_web() {
        loginPagePirzhan.login(ConfigReaderPirzhan.getPropertyPirzhan("qaEnvironment"));
        userPagePirzhan.buttonUser();
        
    }
    @Then("user create new users")
    public void user_create_new_users() throws AWTException {
        for (int i = 0; i < 4; i++) {

            userPagePirzhan
                    .inputFirstName(MockGeneratorPirzhan.pirzhanGeneratorMockFirstName())
                    .inputLastName(MockGeneratorPirzhan.pirzhanGeneratorMockLastName())
                    .inputEmailAddress(MockGeneratorPirzhan.pirzhanGeneratorMockEmail())
                    .inputUserName(MockGeneratorPirzhan.pirzhanGeneratorMockUserName())
                    .inputPassword(MockGeneratorPirzhan.pirzhanGeneratorMockPassword())
                    .inputBIO(MockGeneratorPirzhan.pirzhanGeneratorMockBIO())
                    .buttonType()
                    .buttonZone();
            driverPirzhan.navigate().back();
            userPagePirzhan.verifyText();
        }
        
    }
    @Then("user delete new users")
    public void user_delete_new_users() {
        driverPirzhan.navigate().back();
        userPagePirzhan.buttonUsers()
                .deleteUsers()
                .getTExt();
        DriverPirzhan.closeDriverPirzhan();
        
    }
}
