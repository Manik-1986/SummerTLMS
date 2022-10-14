package steps.stepPirzhan;

import pirzhan.PagePirzhan.BasePagePirzhan;
import pirzhan.PagePirzhan.HomePagePirzhan;
import pirzhan.PagePirzhan.LoginPagePirzhan;
import pirzhan.PagePirzhan.userPagePirzhan.UserPagePirzhan;

public class BaseStepsFactoryPirzhan extends BasePagePirzhan {
    protected LoginPagePirzhan loginPagePirzhan = new LoginPagePirzhan();
    protected HomePagePirzhan homePagePirzhan = new HomePagePirzhan();
    protected UserPagePirzhan userPagePirzhan = new UserPagePirzhan();
}
