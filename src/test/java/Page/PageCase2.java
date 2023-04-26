package Page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

public class PageCase2 extends BasePage
{
    public PageCase2(AppiumDriver appiumDriver)
    {
        super(appiumDriver);
    }

    @AndroidFindBy(id = "navigation_search_browse")
    public MobileElement searchIcon;

    @AndroidFindBy(id = "id/search_src_text")
    public MobileElement searchField;

    @AndroidFindBy(id = "com.imdb.mobile:id/tv_icon")
    public MobileElement streamingTv;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Top 250 TV shows']")
    public MobileElement top250TvSho;

    @AndroidFindBy(className = "com.imdb.mobile.view.AsyncImageView")
    public List <MobileElement> seriesList;

    @AndroidFindBy(id = "com.imdb.mobile:id/watchlist_ribbon")
    public MobileElement watchListIcon;

    @AndroidFindBy(id = "com.imdb.mobile:id/watchlist_ribbon")
    public MobileElement addedWatchListIcon;

    public void  clickSearchIcon()
    {

        searchIcon.click();
    }

    public void scrollToStreamingTv()
    {
        scrollUntilFindElement(streamingTv);

    }

    public void scrollTop250TvShowAndClick()
    {
        scrollUntilFindElement(top250TvSho);
        top250TvSho.click();
    }

    public void clickFirstSeries()
    {
        seriesList.get(0).click();
    }

    public void addToWatchlist()
    {
        watchListIcon.click();
    }

    public boolean watchlistAdded()
    {
       return isDisplayed(addedWatchListIcon);
    }
}


