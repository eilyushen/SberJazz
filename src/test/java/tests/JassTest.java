import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class JassTest {

        @Test
    void workingHard() throws InterruptedException {
            String url = "https://jazz.sber.ru/tghwnk?psw=OBZXBxYVUwwQBlARSQFEHx8MTQ";
            open(url);
            $("[data-testid=continueInBrowser]").shouldBe(Condition.visible).click();
            $("[data-testid=name]").shouldBe(Condition.visible).setValue("111 111 111");
            $("[data-testid=joinConf]").click();
            Thread.sleep(10000);
        }
}
