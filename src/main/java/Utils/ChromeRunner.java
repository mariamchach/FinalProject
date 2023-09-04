package Utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.*;
import org.testng.annotations.*;
import static com.codeborne.selenide.Selenide.*;

public class ChromeRunner {

    @BeforeMethod(description = "ბრაუზერის გამართვა და გახსნა")
    public void setUp() {
        open("https://tkt.ge/");
        Configuration.browserSize = "1920x1080";

    }
    @AfterMethod (description = "ქეშის გასუფთავება და ბრაუზერის დახურვა")
    public void tearDown() {
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWindow();
        Selenide.closeWebDriver();
    }


}


