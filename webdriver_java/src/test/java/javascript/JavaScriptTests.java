package javascript;

import base.BaseTests;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class JavaScriptTests extends BaseTests {

    /************************************************************
     NOTE: We did not add assertions to these tests in the video
    ************************************************************/

    @Test
    public void testScrollToTable(){
        var table = homePage.clickLargeAndDeepDom().scrollToTable();
        assertTrue(table.isDisplayed(), "Table not displayed");

    }

    @Test
    public void testScrollToFifthParagraph(){
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }
}
