package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.WindowType;

import java.util.Collections;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;
import static utils.RandomStringGeneratorHelper.randomNumeric;

public class JazzPage {
    public static final String CONTINUE_IN_BROWSER = "[data-testid=continueInBrowser]";
    public static final String NAME = "[data-testid=name]";
    public static final String JOIN = "[data-testid=joinConf]";

    public void joinServer(String url, List<String> nameList) throws InterruptedException {
        Collections.shuffle(nameList);
        for (String s : nameList) {
            open(url);
            joinServer(s);
            switchTo().newWindow(WindowType.TAB);
            Thread.sleep(Long.parseLong(randomNumeric(3)));
        }
    }

    public void leaveServer(List<String> nameList) throws InterruptedException {
        for (int i = 0; i <= nameList.size(); i++) {
            switchTo().window(nameList.size() - i);
            closeWindow();
            Thread.sleep(Long.parseLong(randomNumeric(3)));
        }
    }

    public void joinServer(String name) {
        $(CONTINUE_IN_BROWSER).shouldBe(Condition.visible).click();
        $(NAME).shouldBe(Condition.visible).setValue(name);
        $(JOIN).click();
    }
}
