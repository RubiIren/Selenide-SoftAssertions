package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FindJunit5 {
    @Test
    void Junit5() {
        Configuration.headless = false;
        //Открыть страницу Selenide в Github
        open("https://github.com/selenide/selenide");
        //Перейдите в раздел Wiki проекта
        $(byText("Wiki")).click();
        //Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $(byClassName("js-wiki-more-pages-link")).click();
        $(byClassName("wiki-rightbar")).shouldHave(text("SoftAssertions"));
       //Открыть страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
        $(byText("SoftAssertions")).click();
        $(byClassName("markdown-body")).shouldHave(text("Using JUnit5 extend test class"));
    }
}