package guru.xel.steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.linkText;

public class WebSteps {

    @Step("Open GitHub main page")
    public void openGitHubMainPage() {
        open("/");
    }

    @Step("Search Selenide repo")
    public void searchSelenideRepo() {
        $(".header-search-input").click();
        $(".header-search-input").sendKeys("Selenide");
        $(".header-search-input").submit();
    }

    @Step("Click to Wikis")
    public void openWikiPage() {
        $(linkText("Wikis")).click();
    }

    @Step("Check for the presence of SoftAssertions among the list of pages (Pages)")
    public void shouldBeSoftAssertionsInPages() {
        $(withText("SoftAssertions")).should(Condition.exist);
    }

    @Step("Click to SoftAssertions")
    public void clickToSoftAssertions() {
        $(linkText("SoftAssertions")).click();
    }

    @Step("Check for the presence of SoftAssertions among the list of pages (Pages)")
    public void sholdBeJunitInPage() {
        $(withText("com.codeborne.selenide.junit5.SoftAssertsExtension")).should(Condition.exist);
    }

}
