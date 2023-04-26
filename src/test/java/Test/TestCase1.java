package Test;

import Page.PageCase1;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TestCase1 extends BaseClass {

    WebDriver wait;
    public PageCase1 pageCase1;


    @BeforeEach
    public void before() {
        pageCase1 = new PageCase1(driver);
    }

    @Test
    public void testLogin() throws InterruptedException{

        pageCase1.clickNavigationOkButton();
        pageCase1.clickProfileİcon();
        Thread.sleep(4000);
        pageCase1.clickSignInButton();
        pageCase1.clickSignInImdbButton();
        pageCase1.setEmail();
        pageCase1.setPassword();
        pageCase1.clickSignInSubmit();
    }

}
