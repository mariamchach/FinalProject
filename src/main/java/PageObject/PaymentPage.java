package PageObject;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class PaymentPage {
    public SelenideElement
            searchbut = $(byId("desktop-search-input")),
            plusicon = $(byClassName("icon-plus"), 1),
            checkbox = $(byClassName("sc-446775f8-1"), 1),
            pay = $(byId("payButton"), 0),
            conbtn = $(byId("continueButton2")),
            cardnumber = $(byId("cardNumber")),
            exmonth = $(byId("expmonth")),
            exyear = $(byId("expyear")),
            cvvcvc = $(byId("cvc2")),
            paymentsub = $(byId("payment-submit")),
            errtxt = $(byClassName("beBkpY")),
            iconcircle = $(byClassName("icon-alert-circle")),
            nameforrun = $(byText("თბილისი ჰილს სამთო გარბენი")),
            rulsclick = $(byText("გასაგებია")),
            name = $(byClassName("sc-873df991-2")),
            surname = $(byClassName("sc-873df991-2"), 1),
            emailinp = $(byClassName("sc-873df991-2"), 3),
            mobnummet = $(byClassName("sc-873df991-2"), 4),
            country = $(byClassName("sc-873df991-2"), 5),
            team = $(byClassName("sc-873df991-2"), 6),

            gender = $(byClassName("sc-60233cef-0")),
            genderme = $(byClassName("sc-60233cef-5"), 1),

            datasearch = $(byClassName("bSZtmz")),
            backclick = $(byClassName("icon-arrow")),
            year = $(byText("1994")),
            birthmon = $(byText("ნოე")),
            birthnum = $(byClassName("react-calendar__month-view__days__day"), 2),
            eventname = $(byText("გოლფის სასწავლო კურსი \"Green Card\" Powered by Visa"));

}
