import StepObject.LoginPageSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.*;
import static DataObject.LoginPageData.*;
import static com.codeborne.selenide.Selenide.*;

public class LoginPageTest extends ChromeRunner {
    LoginPageSteps loginPageSteps = new LoginPageSteps();

    @Test
    @Description("მეილის მნიშვნელობის შედარება და არასწორ ინფოზე ერორ ტექსტი")
    @Severity(SeverityLevel.BLOCKER)
    public void LoginNegTest() {
        loginPageSteps.Confirm()
                .AuthorizationButton()
                .Email(email)
                .Password(password)
                .LoginButton();
        Assert.assertEquals(loginPageSteps.emailinput.getValue(), email, "გადაცემული მეილის მნიშვნელობის შედარება");
        Assert.assertEquals(loginPageSteps.errortxt.getText(), errortext, "არასწორ ფასვორდზე ერორ შეტყობინების გამოტანა");

    }

}
