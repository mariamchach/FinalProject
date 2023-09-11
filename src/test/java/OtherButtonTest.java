import PageObject.OtherPage;
import StepObject.LoginPageSteps;
import StepObject.OtherPageSteps;
import Utils.ChromeRunner;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.*;

import static DataObject.LoginPageData.*;
import static DataObject.OtherPageData.*;
import static com.codeborne.selenide.Selenide.*;

public class OtherButtonTest extends ChromeRunner {
    OtherPageSteps otherPageSteps = new OtherPageSteps();
    LoginPageSteps loginPageSteps = new LoginPageSteps();
    OtherPage otherPage = new OtherPage();

    @Test
    @Description("მიმდინარე თვის არააქტიური ივენთების რაოდენობა")
    @Severity(SeverityLevel.NORMAL)
    public void OtherButtonClick() {
        otherPageSteps.ConfirmPoPApp();
        otherPageSteps.OtherButton();
        otherPageSteps.MonthsButton();
        otherPageSteps.EventsSize();
    }

    @Test
    @Description("ბილეთების ყიდვის რაოდენობის შემოწმება")
    @Severity(SeverityLevel.NORMAL)
    public void BuyTickets() {
        loginPageSteps.Confirm()
                .AuthorizationButton()
                .Email(email)
                .PasswordForPos(passwordforpos)
                .LoginButton()
                .ProfileIcon();
        otherPageSteps.OtherButton();
        otherPageSteps.MonthsButton();
        otherPageSteps.ThirdEvent();
        otherPageSteps.BuyButton();
        otherPageSteps.ClickClick();
        otherPageSteps.Conbutton();
        Assert.assertEquals(otherPageSteps.ticketssize.getText(),chart, " მხოლოდ 10 ბილეთის ყიდვის შესაძლებლობა");

    }
}
