package StepDefinitions;

import BrowserControl.Web_Connector;
import PageObjects.Login_Page;
import Utilities.Constant_Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinitions extends Web_Connector {
    private Login_Page EXPage = new Login_Page();
    @Given("the user navigates to the homepage")
    public void the_user_navigates_to_the_homepage() {
        driver.get(Constant_Utils.BASE_URL);
    }


    @When("the user login with {string} username and {string} password")
    public void theUserLoginWithUsernameAndPassword(String username, String password) throws InterruptedException {
            EXPage.setUserName(username);
            EXPage.setPassWord(password);
            EXPage.clickLoginButton();
            Thread.sleep(2000);
    }
    @Then("the user should see {string} text on the page")
    public void theUserShouldSeeTextOnThePage(String ExpectedText) {
        Assert.assertTrue(driver.getPageSource().contains(ExpectedText));
    }
}

