import com.codeborne.selenide.Condition;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class TestSelenide {



    @Test
    public void testGoogle(){
        open("https://www.google.com/");
        $x("//input[@name='q']").setValue("selenium").pressEnter();
        $x("//div[@id='result-stats']").shouldBe(Condition.visible);
    }
}
