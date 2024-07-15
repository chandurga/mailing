package com.jagriti.bmtplus.pages.eventOrMeeting;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import com.jagriti.bmtplus.pages.eventOrMeeting.data.Tags;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://dev.bmtplus.com/node/add/event
public class CreateEventPage extends Page<CreateEventPage> {
    protected CreateEventPage() {
        super(CreateEventPage.class);
    }

    @As("inputEditFieldEventTitle")
    private SelenideElement inputEditFieldEventTitle = $("input[id='edit-field-event-title-und-0-value']");

    @As("selectEditFieldEventTags")
    private SelenideElement selectEditFieldEventTags = $("select[id='edit-field-event-tags-und']");

    @As("inputEditFieldEventAttending")
    private SelenideElement inputEditFieldEventAttending = $("input[id='edit-field-event-attending-und-0-target-id']");

    @As("inputResult")
    private SelenideElement inputResult = $x("//*[@id='autocomplete']");

    @As("selectCenter")
    private SelenideElement selectCenter = $("select[id='edit-og-group-ref-und']");

    @As("inputEditFieldEventAttended")
    private SelenideElement inputEditFieldEventAttended = $("input[id='edit-field-event-attended-und-0-target-id']");

    @As("inputEditSubmit")
    private SelenideElement inputEditSubmit = $("input[id='edit-submit']");

    @As("successMessageOfMeeting")
    private SelenideElement successMessageOfMeeting = $("h1[id='page-title']");

    @As("errorMessage")
    private SelenideElement errorMessage = $("div[class^='messages error']");

    @As("linkRepeatThisEventsMeeting")
    private SelenideElement linkRepeatThisEventsMeeting = $(byText("Repeat this events/meeting"));

    @As("inputEditDaysMonday")
    private SelenideElement inputEditDaysMonday = $("#edit-days-monday");

    @As("inputEditRecurUntil")
    private SelenideElement inputEditRecurUntil = $("input[id='edit-until']");

    @As("liEventMailSentDurgaprasad")
    private SelenideElement liEventMailSentDurgaprasad = $("html > body > div:nth-of-type(2) > div > div:nth-of-type(4) > div > div > div > ul > li:nth-of-type(1)");

    public CreateEventPage enterTheTitleOFTheEvent(String title) {
        inputEditFieldEventTitle.shouldBe(visible).setValue(title);
        return this;
    }

    public CreateEventPage setSelectEditFieldEventTags(Tags tags) {
        selectEditFieldEventTags.shouldBe(visible).selectOptionContainingText(tags.getText());
        return this;
    }

    public CreateEventPage setSelectEditFieldEventTags(String tags) {
        selectEditFieldEventTags.shouldBe(visible).selectOptionContainingText(tags);
        return this;
    }

    public CreateEventPage enterTheEventAttending(String attending) {
        inputEditFieldEventAttending.shouldBe(visible).setValue(attending);
        return this;
    }

    public CreateEventPage clickOnResult() {
        inputResult.shouldBe(visible, Duration.ofSeconds(10)).click();
        return this;
    }

    public CreateEventPage enterTheEventAttended(String attended) {
        inputEditFieldEventAttended.shouldBe(visible).setValue(attended);
        return this;
    }

    public CreateEventPage setSelectCenter(String center) {
        selectCenter.shouldBe(visible).selectOptionContainingText(center);
        return this;
    }

    public CreateEventPage clickOnSaveButton() {
        inputEditSubmit.shouldBe(visible).click();
        return this;
    }

    public CreateEventPage assertThatSuccessMessageOfMeeting(EventData eventData) {
        successMessageOfMeeting.shouldBe(visible).shouldHave(Condition.text(eventData.getTitle()));
        return this;
    }

    public CreateEventPage assertThatErrorMessage() {
        errorMessage.shouldBe(visible).shouldHave(Condition.text("Tags field is required."));
        return this;
    }

    public CreateEventPage clickOnLinkRepeatThisEventsMeeting() {
        linkRepeatThisEventsMeeting.shouldBe(visible).click();
        return this;
    }

    public CreateEventPage clickOnCheckBoxOfDaysMonday() {
        inputEditDaysMonday.shouldBe(visible).click();
        return this;
    }

    public CreateEventPage enterTheInputEditRecurUntilTheDate(String date) {
        inputEditRecurUntil.shouldBe(visible).sendKeys(date);
        return this;
    }

    public CreateEventPage assertThatEventMailSentDurgaPrasadMessage(String mail) {
        liEventMailSentDurgaprasad.shouldBe(visible).shouldHave(Condition.text(mail));
        return this;
    }
}