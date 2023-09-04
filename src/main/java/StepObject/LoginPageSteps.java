package StepObject;
import PageObject.LoginPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.time.Duration;

public class LoginPageSteps extends LoginPage {
    @Step("პოპ აპის გათიშვა")
    public LoginPageSteps Confirm() {
        confirmbutton.click();
        return this;
    }

    @Step("ავტორიზაციის ბათონზე დაკლიკება")
    public LoginPageSteps AuthorizationButton() {
        authorizationbutton.click();
        return this;
    }

    @Step("მეილის ინფუთის შევსება მნიშვნელობით: {email}")
    public LoginPageSteps Email(String email) {
        emailinput.setValue(email);
        emailinput.shouldNotBe(Condition.empty);
        return this;
    }

    @Step("ფასვორდის ინფუთის შევსება მნიშვნელობით: {password}")
    public LoginPageSteps Password(String password) {
        passwordinput.setValue(password);
        passwordinput.shouldNotBe(Condition.empty);
        return this;
    }

    @Step("შესვლა ღილაკზე დაკლიკება")
    public LoginPageSteps LoginButton() {
        loginbutton.click();
        return this;
    }

}
