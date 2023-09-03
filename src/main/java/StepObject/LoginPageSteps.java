package StepObject;

import PageObject.LoginPage;
import com.codeborne.selenide.Condition;

public class LoginPageSteps extends LoginPage {
    public LoginPageSteps Confirm (){
        confirmbutton.click();
        return this;
    }
    public LoginPageSteps AuthorizationButton(){
        authorizationbutton.click();
        return this;
    }
    public LoginPageSteps Email (String email){
        emailinput.setValue(email);
        emailinput.shouldNotBe(Condition.empty);
        return this;
    }
    public LoginPageSteps Password (String password){
        passwordinput.setValue(password);
        passwordinput.shouldNotBe(Condition.empty);
        return this;
    }
    public LoginPageSteps LoginButton (){
        loginbutton.click();
        return this;
    }







}
