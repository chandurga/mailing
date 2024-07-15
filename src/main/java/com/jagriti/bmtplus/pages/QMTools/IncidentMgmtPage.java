package com.jagriti.bmtplus.pages.QMTools;

import com.codeborne.selenide.As;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.jagriti.bmtplus.pages.Page;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

// page_url =
// https://dev.bmtplus.com/node/add/patient-complication?field_complication_patient=3754076
public class IncidentMgmtPage extends Page<IncidentMgmtPage> {
  protected IncidentMgmtPage() {
    super(IncidentMgmtPage.class);
  }

  String mailSent =
      "Incidence report mail sent to: durgaprasad@jagriti.co.in\n"
          + "Incidence report mail sent to: gokul@example.co.in\n"
          + "Incidence report mail sent to: deepanrajt@jagriti.co.in\n"
          + "Incidence report mail sent to: amitsedai@jagriti.co.in";

  @As("linkTools")
  private SelenideElement linkTools = $("a[class='menu_icon menu-4248 sf-depth-1 menuparent']");

  @As("linkIncident")
  private SelenideElement linkIncident = $(By.partialLinkText("Incident Mgmt"));

  @As("linkTryingIssueExpiredDrugs")
  private SelenideElement linkTryingIssueExpiredDrugs =
      $(byText("Trying to issue expired drugs to patient"));

  @As("inputEditIgnorePastOrders")
  private SelenideElement inputEditIgnorePastOrders = $("input[id='edit-ignore-past-orders']");

  @As("ulIncidenceReportMailSent")
  private SelenideElement ulIncidenceReportMailSent = $("div[class$='warning'] ul");

  public IncidentMgmtPage moveOnLinkOnQMTools() {
    actions().moveToElement(linkTools.shouldBe(visible)).build().perform();
    return this;
  }

  public IncidentMgmtPage clickOnLinkIncident() {
    actions().moveToElement(linkIncident.shouldBe(visible)).click().build().perform();
    return this;
  }

  public IncidentMgmtPage assertThatLinkTryingIssueExpiredDrugs() {
    linkTryingIssueExpiredDrugs
        .scrollIntoView(true)
        .shouldBe(visible)
        .shouldHave(Condition.text("Trying to issue expired drugs to patient"));
    return this;
  }

  public IncidentMgmtPage clickOnInputEditIgnorePastOrders() {
    inputEditIgnorePastOrders.shouldBe(visible).click();
    return this;
  }

  public IncidentMgmtPage assertThatMailIsSendingToTheRequiredUsers() {
    ulIncidenceReportMailSent.shouldBe(visible).shouldHave(Condition.text(mailSent));
    return this;
  }
}
