package navigation;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class NavigationTests extends BaseTests {

    @Test
    public void testNavigator(){
        homePage.clickDynamicLoading().clickExample1();
        //assertEquals();
        assertTrue(getCurrentUrl().contains("/dynamic_loading/1"),
                "Did not navigate to Example 1 page.");

        getWindowManager().goBack();
        assertTrue(getCurrentUrl().contains("dynamic_loading"),
                "Did not navigate back");

        String beforeRefresh = getCurrentUrl();
        getWindowManager().refreshPage();
        assertEquals(beforeRefresh,getCurrentUrl(), "Did not refresh");

        getWindowManager().goForward();
        assertTrue(getCurrentUrl().contains("dynamic_loading/1"),"Did not navigate forward");

        getWindowManager().goTo("https://google.com");
        assertTrue(getCurrentUrl().contains("google.com"),"Did not navigate to Google");

    }

    @Test
    public void testSwitchTab(){
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTab("New Window");
        assertEquals(getTitle(), "New Window","Did not switch to new window");
    }
}
