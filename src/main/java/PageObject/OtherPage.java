
package PageObject;

import DataObject.LoginPageData;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class OtherPage {
    public SelenideElement
            confirmbutton = $(byText("ვეთანხმები")),
            otherclick = $(byText("სხვა")),
            monthclick = $(byClassName("sc-bbffd70a-0"), 3),

            thirdevents = $(byClassName("sc-ac258bb7-6"), 2),
            buybutton = $(byClassName("gaFdoT")),
            continuebutton = $(byId("continueButton2"), 1),
            continuebuttonsec = $(byId("continueButton1"), 1),
            plusicon = $(byClassName("icon-plus"), 1),
            plusiconsecond = $(byClassName("icon-plus"), 2),
            plusiconisdisable = $(byClassName("sc-dd8c3697-15")),
            ticketssize = $(byClassName("kjxCcO"));

}
