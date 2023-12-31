package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import pages.JazzPage;
import utils.Parser;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class JazzTest {
    @Test
    void workingHard() throws InterruptedException {
        String url = "https://jazz.sber.ru/uuzt5c?psw=OEUXDx0OXU4EVRAZQhpKXQtfDQ";
        JazzPage jazzPage = new JazzPage();
        Parser parser = new Parser();

        jazzPage.joinServer(url, parser.listOfNames());
        Thread.sleep(1800000); // 3600000 - 1 час, 5400000 - 1.5 часа, 7200000 - 2 часа
        jazzPage.leaveServer(parser.listOfNames());
    }

    @AfterAll
    static void killDriver() {
        closeWebDriver();
    }
}
