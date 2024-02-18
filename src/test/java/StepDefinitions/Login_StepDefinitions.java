package StepDefinitions;

import BrowserControl.Web_Connector;
import Utilities.Constant_Utils;
import io.cucumber.java.en.Given;

public class Login_StepDefinitions extends Web_Connector {
    @Given("the user navigates to the homepage")
    public void the_user_navigates_to_the_homepage() {
        driver.get(Constant_Utils.BASE_URL);
    }


}
