package guru.xel;

import guru.xel.steps.WebSteps;
import org.junit.jupiter.api.Test;

public class SelenideGithubTest extends TestBase{

    @Test
    public void testAnnotatedStep() {
        WebSteps steps = new WebSteps();

        steps.openGitHubMainPage();
        steps.searchSelenideRepo();
        steps.openWikiPage();
        steps.shouldBeSoftAssertionsInPages();
        steps.clickToSoftAssertions();
        steps.sholdBeJunitInPage();

    }

}
