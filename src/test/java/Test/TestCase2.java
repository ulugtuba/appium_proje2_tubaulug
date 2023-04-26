package Test;

import Page.PageCase1;
import Page.PageCase2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TestCase2 extends BaseClass
{

    WebDriver wait;
    public PageCase1 pageCase1;
    public PageCase2 pageCase2;



    @BeforeEach
    public void before()
    {
        pageCase1 = new PageCase1(driver);
        pageCase2 = new PageCase2(driver);
    }


    @Test
    public void testWatchList() throws InterruptedException{

        pageCase1.clickNavigationOkButton();
        pageCase1.clickProfileİcon();
        Thread.sleep(4000);
        pageCase1.clickSignInButton();
        pageCase1.clickSignInImdbButton();
        pageCase1.setEmail();
        pageCase1.setPassword();
        pageCase1.clickSignInSubmit();
        Thread.sleep(4000);
        pageCase2.clickSearchIcon();
        pageCase2.scrollToStreamingTv();
        pageCase2.scrollTop250TvShowAndClick();
        pageCase2.addToWatchlist();
        pageCase1.clickProfileİcon();

        Assertions.assertTrue(pageCase2.watchlistAdded());
    }
}
