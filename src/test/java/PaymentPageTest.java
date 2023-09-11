import StepObject.LoginPageSteps;
import StepObject.OtherPageSteps;
import StepObject.PaymentPageSteps;
import Utils.ChromeRunner;
import io.qameta.allure.*;
import io.qameta.allure.*;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

import static DataObject.LoginPageData.*;
import static DataObject.LoginPageData.*;
import static DataObject.PaymentData.*;
import static com.codeborne.selenide.Selenide.sleep;

public class PaymentPageTest extends ChromeRunner {
    LoginPageSteps loginPageSteps = new LoginPageSteps();
    OtherPageSteps otherPageSteps = new OtherPageSteps();
    PaymentPageSteps paymentPageSteps = new PaymentPageSteps();


    @Test
    @Description("არასწორი ბარათის მონაცემებით გადახდა")
    @Severity(SeverityLevel.BLOCKER)
    public void PaymentNegTest() {
        loginPageSteps.Confirm()
                .AuthorizationButton()
                .Email(email)
                .PasswordForPos(passwordforpos)
                .LoginButton()
                .ProfileIcon();
        paymentPageSteps.SearchVelue(searchword)
                .GoEvent();
        otherPageSteps.BuyButton();
        paymentPageSteps.PlusOne();
        otherPageSteps.Conbutton();
        paymentPageSteps.ContinueBtn()
                .CheckBox()
                .PayStep()
                .CardNumber(cardnmb)
                .ExMonth(option)
                .ExYear(optionyear)
                .CvvCvc(cvv)
                .SubmitPayment()
                .DurationError();
        Assert.assertEquals(paymentPageSteps.errtxt.getText(), texterror, "არასწორი ბარათის მონაცემებით გადახდა");

    }

    @Test
    @Step("აუცილებელი ინფუთების შევსება გადახდისას")
    @Severity(SeverityLevel.NORMAL)
    public void PaymentTest() {
        loginPageSteps.Confirm()
                .AuthorizationButton()
                .Email(email)
                .PasswordForPos(passwordforpos)
                .LoginButton();
        paymentPageSteps.SearchVelue(searchword)
                .RunDay();
        otherPageSteps.BuyButton();
        paymentPageSteps.RulsPop()
                .PlusOne();
        otherPageSteps.Conbutton();
        paymentPageSteps.ContinueBtn()
                .NameRun()
                .SurNameRun()
                .DataClick()
                .BackClick()
                .YearClick()
                .BirthMonth()
                .BirthNum()
                .EmailInp()
                .MobNum()
                .Gender()
                .Genderselect()
                .Country()
                .Team();
        Assert.assertTrue(otherPageSteps.continuebutton.isEnabled(), "აუცილებელი ინფოს შევსება გადახდისას");

    }


}
