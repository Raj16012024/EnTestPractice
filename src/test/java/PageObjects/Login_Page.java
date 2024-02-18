package PageObjects;

import BrowserControl.Web_Connector;

public class Login_Page extends Web_Connector {
    /***** Locators *******/

    private String UsernameXpath = "//input[@id='user-name']";
    private String PasswordXPath = "//input[@id='password']";
    private String LoginXpath = "//input[@value='Login']";

    /***** Getters and Setters ******/

    /**
     * Set Username Field
     * @Param UserName
     */
    public void setUserName (String UserName) {
        BasePage.findElementByXpath(10, UsernameXpath).clear();
        BasePage.findElementByXpath(10,UsernameXpath).sendKeys(UserName);
    }
    /**
     * Set Password Field
     * @Param UserName
     */
    public void setPassWord (String PassWord) {
        BasePage.findElementByXpath(10, PasswordXPath).clear();
        BasePage.findElementByXpath(10, PasswordXPath).sendKeys(PassWord);
    }
    /**
     * Click Login Button
     */
    public void clickLoginButton () {
        BasePage.findElementByXpath(10,LoginXpath).click();
    }
















}
