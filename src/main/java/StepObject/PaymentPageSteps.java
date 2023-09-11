package StepObject;

import DataObject.PaymentData;
import PageObject.OtherPage;
import PageObject.PaymentPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.time.Duration;

import static DataObject.PaymentData.*;

public class PaymentPageSteps extends PaymentPage {
    OtherPage otherPage = new OtherPage();

    @Step("სერჩის იმფუთში ტექსტის ჩაწერა მნიშვნელობით: {searchword}")
    public PaymentPageSteps SearchVelue(String searchword) {
        searchbut.setValue(searchword).pressEnter();
        Duration.ofMillis(3000);
        return this;
    }

    @Step("ივენთზე კლიკი")
    public PaymentPageSteps GoEvent() {
        eventname.click();
        return this;
    }

    @Step("პლიუს ღილაკზე კლიკი")
    public PaymentPageSteps PlusOne() {
        plusicon.click();
        return this;
    }

    @Step("გაგრძელება ღილაკზე კლიკი")
    public PaymentPageSteps ContinueBtn() {
        conbtn.click();
        return this;
    }

    @Step("აუცილებლად მოსანიშნი ჩექ ბოქსი")
    public PaymentPageSteps CheckBox() {
        checkbox.click();
        return this;

    }

    @Step("გადახდა ღილაკზე დაჭერა")
    public PaymentPageSteps PayStep() {
        pay.click();
        return this;
    }

    @Step("ბარათის ნომრის ჩაწერა მნიშვნელობით {cardnmb}")
    public PaymentPageSteps CardNumber(String cardnmb) {
        cardnumber.setValue(PaymentData.cardnmb);
        return this;
    }

    @Step("ბარათის ვადის შევსება მნიშვნელობით{option}")
    public PaymentPageSteps ExMonth(String option) {
        exmonth.selectOption(PaymentData.option);
        return this;
    }

    @Step("ბარათის ვადის შევსება მნიშვნელობით{optionyear}")
    public PaymentPageSteps ExYear(String optionyear) {
        exyear.selectOption(PaymentData.optionyear);
        return this;
    }

    @Step("cvv კოდის შეყვანა")
    public PaymentPageSteps CvvCvc(String cvv) {
        cvvcvc.setValue(PaymentData.cvv);
        return this;
    }

    @Step("გადახდა ღილაკზე კლიკი")
    public PaymentPageSteps SubmitPayment() {
        paymentsub.click();
        return this;

    }

    @Step("ერორის დალოდება და გამოჩენა")
    public PaymentPageSteps DurationError() {
        iconcircle.shouldBe(Condition.visible, Duration.ofMinutes(2));
        return this;

    }

    @Step("ივენთის წამოღება")
    public PaymentPageSteps RunDay() {
        nameforrun.click();
        return this;
    }

    @Step("წესების პოპ აპის გათიშვა")
    public PaymentPageSteps RulsPop() {
        rulsclick.click();
        return this;

    }

    @Step("სახელის ველის შევსება")
    public PaymentPageSteps NameRun() {
        name.setValue(myname);
        return this;

    }

    @Step("გვარის ველის შევსება")

    public PaymentPageSteps SurNameRun() {
        surname.setValue(mysurname);
        return this;

    }

    @Step("დაბადების თარიღის ველის შევსება")

    public PaymentPageSteps DataClick() {
        datasearch.click();
        return this;

    }

    @Step("ბექ ღილაკზე კლიკი კალენდარზე")

    public PaymentPageSteps BackClick() {
        backclick.click();
        backclick.click();
        backclick.click();
        return this;
    }

    @Step("დაბადების წელზე ღილაკზე კლიკი კალენდარზე")

    public PaymentPageSteps YearClick() {
        year.click();
        return this;

    }

    @Step("დაბადების თვეზე კლიკი კალენდარზე")

    public PaymentPageSteps BirthMonth() {
        birthmon.click();
        return this;

    }

    @Step("დაბადების რიცხვზე კლიკი კალენდარზე")

    public PaymentPageSteps BirthNum() {
        birthnum.click();
        return this;

    }

    @Step("იმეილის ველის შევსება")

    public PaymentPageSteps EmailInp() {
        emailinp.setValue(emailforpay);
        return this;

    }

    @Step("მობილურის ველის შევსება")

    public PaymentPageSteps MobNum() {
        mobnummet.setValue(mobnum);
        return this;

    }

    @Step("სქესის ინფუთზე კლიკი")

    public PaymentPageSteps Gender() {
        gender.click();
        return this;

    }

    @Step("სქესის არჩევა")

    public PaymentPageSteps Genderselect() {
        genderme.click();
        return this;

    }

    @Step("ქვეყნის ველის შევსება")

    public PaymentPageSteps Country() {
        country.setValue(countryforpay);
        return this;

    }

    @Step("გუნდის სახელის ჩაწერა")

    public PaymentPageSteps Team() {
        team.setValue(teamname);
        return this;

    }


}


