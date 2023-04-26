package Page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;

public class BasePage
{
    AppiumDriver driver;

    public BasePage(AppiumDriver appiumDriver)
    {
        this.driver = appiumDriver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void waitGenericMethod(MobileElement element)
    {
        FluentWait<AppiumDriver> wait =
                new FluentWait<>(driver)
                        .withTimeout(Duration.ofSeconds(10))
                        .pollingEvery(Duration.ofSeconds(1))
                        .ignoring(NoSuchElementException.class)
                        .withMessage("element not found");

        wait.until(ExpectedConditions.visibilityOf(element));
        Assertions.assertTrue(element.isDisplayed());

    }

    public void scrollUntilFindElement(MobileElement element)
    {
        try
        {
            int counter = 0;
            while (!isDisplayed(element) && counter < 5)
            {
                scrollDown();
                counter++;
            }
        }
        catch (Exception e)
        {
            System.out.println("fail");
        }
    }


    public void scrollFromRightToLeft(MobileElement element)
    {
        Dimension dimension = driver.manage().window().getSize();
        int width = dimension.getWidth();

        int startX = width - element.getLocation().getX() - 10;
        int startY = element.getLocation().getY(); // (int) (height * 0.2);
        int endX = element.getLocation().getX() - 100;
        int endY = element.getLocation().getY();
        //perform swipe from right to left
        new TouchAction((AppiumDriver) driver).longPress(PointOption.point(startX, startY)).moveTo(PointOption.point(endX, endY)).release().perform();
    }


    public void scrollDown()
    {

        int height = driver.manage().window().getSize().getHeight();
        int width = driver.manage().window().getSize().getWidth();

        TouchAction touchAction = new TouchAction(driver);
        touchAction.press(point(width / 2, (int) (height * 0.8))).waitAction(waitOptions(Duration.ofMillis(400))).moveTo(point(width / 2, (int) (height * 0.5))).release().perform();
    }


    public static boolean isDisplayed(MobileElement element)
    {
        try
        {
            return element.isDisplayed();
        }
        catch (Exception e)
        {
            return false;
        }
    }

}



