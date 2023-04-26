package Page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

public class PageCase3 extends BasePage
{
    public PageCase3(AppiumDriver appiumDriver)
    {
        super(appiumDriver);
    }

    @AndroidFindBy(id = "com.imdb.mobile:id/image")
    public List <MobileElement> series;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Cast']")
    public MobileElement cast;

    @AndroidFindBy(id = "com.imdb.mobile:id/recycler_view")
    public MobileElement people;


    public void clickFirstItem()
    {
        series.get(0).click();
    }

    public void scrollToCast()
    {
        scrollUntilFindElement(cast);
    }

    public void swipePerson()
    {

        scrollFromRightToLeft(people);
    }

    public void select5thPerson()
    {
        scrollUntilFindElement(series.get(0));
    }

}
