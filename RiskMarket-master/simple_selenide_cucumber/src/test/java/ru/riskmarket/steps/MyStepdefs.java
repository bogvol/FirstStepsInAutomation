package ru.riskmarket.steps;

import com.codeborne.selenide.Condition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;


/**
 * Created by Kengoroo on 20.09.2016.
 */
public class MyStepdefs {
    @Given("^open riskmarket\\.ru$")
    public void openRiskmarketRu() {
        open("http://riskmarket.ru");
    }

    @When("^press button with text \"([^\"]*)\"$")
    public void press(String button) {
        $(byText(button)).waitUntil(Condition.visible, 15000).click();
    }

    @And("^type to input with name \"([^\"]*)\" text: \"([^\"]*)\"$")
    public void typeToInputWithNameText(String input, String text) {
        sleep(1000);
        $(byName(input)).sendKeys(text);
    }

    @And("^select countries: (.*)$")
    public void selectCountries(List<String> countries) {
        for (String str : countries) {
            $("#countryInput").sendKeys(str);
            $("#countryInput").pressEnter();
        }
    }

    @And("^press element with value \"([^\"]*)\"$")
    public void pressElementWithValue(String value) {
        $(byValue(value)).click();
    }

    @And("^wait until login frame disappears$")
    public void waitUntilLoginFrameDisappears() throws Throwable {
        $(".modal-content").waitUntil(Condition.disappears, 7000);
    }

    @And("^specify dates of journey, any available dates$")
    public void specifyTheDatesOfJourneyDepartureDateTomorrowReturnDateOneWeek() {
        $("#preview").click();
        $(".period-control-popup-day-body").$("span[data-ng-click]").click();
        $(".period-control-popup-day-body").$("span[data-ng-click]").click();
    }

    @And("^specify birthday of tourists: (\\d+).(\\d+).(\\d+)$")
    public void specifyBirthdayOfTourists(String day, String month, String year) {
        $(byText("Кто едет")).click();
        $("input[placeholder='дд.мм.гггг']").sendKeys(day + month + year);
    }

    @And("^wait until spinner disappears$")
    public void waitUntilSpinnerDisappears() {
        $(".spinner-container").waitUntil(Condition.disappears, 40000);
    }

    @Then("^element with tag \"([^\"]*)\" should exist$")
    public void elementWithTagShouldExist(String tag) {
        $(tag).shouldBe(Condition.visible);
    }

    @And("^press element with text \"([^\"]*)\"$")
    public void pressElementWithText(String element) {
        press(element);
    }

    @And("^press element with value \"([^\"]*)\" and it should be enabled$")
    public void pressElementWithValueAndItShouldBe(String value) {
        $(byValue(value)).waitUntil(Condition.enabled, 15000).click();
    }

    @Then("^verify that page with url \"([^\"]*)\" is opened$")
    public void verifyThatPageWithUrlIsOpened(String verifyUrl) {
        sleep(3000);
        String currentUrl = url();
        assertThat("ERROR: page's URL doesn't contain " + verifyUrl, currentUrl, containsString(verifyUrl));
    }

    @And("^specify birthday of insurant: (\\d+).(\\d+).(\\d+)$")
    public void specifyBirthdayOfInsurant(String day, String month, String year) {
        $("input[placeholder='дд.мм.гггг']").sendKeys(day + month + year);
    }
}
