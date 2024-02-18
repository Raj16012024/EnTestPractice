package BrowserControl;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Cucumber_Hooks extends Web_Connector {
    @Before
    public void setup() {
        openBrowser();
    }

    @After
    public void teardown() {
        closeBrowser();
    }

}
