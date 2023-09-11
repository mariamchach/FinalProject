package StepObject;

import PageObject.OtherPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.testng.Assert;

import java.util.Collections;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.*;

public class OtherPageSteps extends OtherPage {
    @Step("პოპ აპის გათიშვა")
    public OtherPageSteps ConfirmPoPApp() {
        confirmbutton.click();
        return this;
    }


    @Step("ბათონი სხვა-ზე კლიკი")
    public OtherPage OtherButton() {
        otherclick.click();
        return this;
    }

    @Step("მიმდინარე თვეზე კლიკი")
    public OtherPage MonthsButton() {
        monthclick.click();
        return this;
    }

    @Step("არააქტიური ივენთების რაოდენობა")
    public OtherPage EventsSize() {
        String price = "sc-ac258bb7-9";
        String titlet = "sc-ac258bb7-6";
        ElementsCollection title = $$(byClassName(titlet));
        ElementsCollection pricesection = $$(byClassName(price));
        int fortitle = title.size();
        int forprice = pricesection.size();
        int nonactiveevents = fortitle - forprice;
        Assert.assertEquals(fortitle - forprice, title.size() - pricesection.size(), "არააქტიური ივენთების რაოდენობა");
        System.out.println(nonactiveevents);
        return this;
    }

    @Step("ივენთზე ქლიქი")
    public OtherPage ThirdEvent() {
        thirdevents.click();
        return this;
    }

    @Step("ყიდვა ბათონზე კლიკი")
    public OtherPage BuyButton() {
        buybutton.click();
        continuebutton.isDisplayed();
        return this;
    }

    @Step("გაგრძელება ღილაკის შემოწმება, 12 ქლიქი")
    public OtherPage ClickClick() {
        plusicon.click();
        plusiconsecond.click();
        plusiconsecond.click();
        plusiconsecond.click();
        plusiconsecond.click();
        plusiconsecond.click();
        plusiconsecond.click();
        plusiconsecond.click();
        plusiconsecond.click();
        plusiconsecond.click();
        plusiconsecond.click();
        plusicon.click();
        plusiconisdisable.shouldBe(Condition.disabled);
        return this;
    }

    @Step("გაგრძელება ღილაკზე ქლიქი")
    public OtherPage Conbutton() {
        continuebuttonsec.click();
        return this;
    }

}