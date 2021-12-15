package lib.ui;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class NavigationUI extends MainPageObject {
    private static final String MY_LIST_LINK = "//android.widget.FrameLayout[@content-desc='My lists']";

    public NavigationUI(AppiumDriver driver) {
        super(driver);
    }

    public void clickMyList() {
        this.waitForElementAndClick(By.xpath("//android.widget.FrameLayout[@content-desc='My lists']"), "Cannot find navigation button to My lists", 5L);
    }

    public void checkMyListItem(String article_title) {
        this.waitForElementPresent(By.xpath("//*[contains(@text,'" + article_title + "')]"), "Cannot find the second article which have been added into " + article_title + "\n", 15L);
    }
}