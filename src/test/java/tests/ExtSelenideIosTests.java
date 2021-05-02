package tests;

import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;


public class ExtSelenideIosTests extends TestBase {

    @Test
    @Tag("iphone")
    @DisplayName("Successful iOS auto test `hello@browserstack.com`.")
    void searchTest() {
        step("Type search", () -> {
            $(MobileBy.AccessibilityId("Text Button")).click();
            $(MobileBy.AccessibilityId("Text Input")).sendKeys("hello@browserstack.com");
        });

        step("Check if any Application found", () -> {
            $$(MobileBy.AccessibilityId("Text Output")).shouldHave(sizeGreaterThan(0));
        });
    }
}