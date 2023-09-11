package PageObject;

import DataObject.LoginPageData;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public SelenideElement
            confirmbutton = $(byText("ვეთანხმები")),
            authorizationbutton = $(byId("continueButton2")),
            emailinput = $(byClassName("sc-873df991-2"), 0),
            passwordinput = $(byClassName("sc-873df991-2"), 1),
            loginbutton = $(byId("continueButton2"), 0),
            profileicon = $(byClassName("sc-4af2ab87-0")),
            errortxt = $(byText("მომხმარებლის სახელი და პაროლი არასწორია"));


}
