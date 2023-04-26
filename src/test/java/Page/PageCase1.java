package Page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class PageCase1 extends BasePage{
    public PageCase1(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

      @AndroidFindBy(id = "android:id/button2")
      public MobileElement navigationOkButton;

      @AndroidFindBy(id="com.imdb.mobile:id/navigation_you")
      public MobileElement profileIcon;

      @AndroidFindBy (id="com.imdb.mobile:id/sign_in_button")
      public  MobileElement signInButton;

      @AndroidFindBy (id="com.imdb.mobile:id/imdb_auth_portal")
      public MobileElement signInImdbButton;

      @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='ap_email']")
      public MobileElement email;

      @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='ap_password']")
      public MobileElement password;

      @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='signInSubmit']")
      public MobileElement signInSubmit;




        public void clickNavigationOkButton(){

            navigationOkButton.click();
        }

        public void clickProfileİcon(){

         profileIcon.click();
        }

        public void clickSignInButton(){
            signInButton.click();

        }

        public void clickSignInImdbButton(){

            signInImdbButton.click();
        }

        public void setEmail(){

            email.sendKeys("qamobiltestekibi@gmail.com");
        }

        public void setPassword(){

            password.sendKeys("24af3535");
        }
        public void clickSignInSubmit(){
            signInSubmit.click();
        }
    }
