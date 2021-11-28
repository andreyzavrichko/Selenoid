import com.codeborne.selenide.Condition;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class UnsplashTest {

    @Test
    public void unsplashTest(){
        open("https://unsplash.com/login");
        $x("//div[@class='form-group']//input[@id='user_email']").setValue("test@test.com").shouldBe(Condition.value("test@test.com"));
        $x("//div[@class='form-group']//input[@id='user_password']").setValue("123456789").shouldBe(Condition.value("123456789"));
        $x("//div[@class='form-group']//input[@name='commit']").shouldBe(Condition.visible).click();

        $x("//div[@class='flash__container']//div[@class='col-xs-10 col-sm-6 center-block flash__message']").shouldBe(Condition.visible);
    }
}
