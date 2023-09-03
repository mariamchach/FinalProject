import StepObject.LoginPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.As;
import org.testng.Assert;
import org.testng.annotations.*;

import static DataObject.LoginPageData.*;
import static DataObject.LoginPageData.*;
import static com.codeborne.selenide.Selenide.*;

public class LoginPageTest extends ChromeRunner {
    LoginPageSteps loginPageSteps = new LoginPageSteps();

    @Test

    public void LoginNegTest() {
        loginPageSteps.Confirm()
                .AuthorizationButton()
                .Email(email)
                .Password(password)
                .LoginButton();
        Assert.assertTrue(loginPageSteps.loginbutton.isEnabled(), "არასწორ პასვორდზე ერორ ტექსტის გამოტანა");

        sleep(3000);

    }

}
