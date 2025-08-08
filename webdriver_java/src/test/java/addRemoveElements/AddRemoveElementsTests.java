package addRemoveElements;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AddRemoveElementsTests extends BaseTests {

    @Test
    public void testAddRemoveElements() {
        var addRemovePage = homePage.clickAddRemove();

        // Add an element
        addRemovePage.clickAddElementButton();
        // Verify the element is added
        assertTrue(addRemovePage.isElementPresent(), "Element was not added");

        // Remove the element
        addRemovePage.clickDeleteElementButton();
        // Verify the element is removed
        assertFalse(addRemovePage.isElementPresent(), "Element was not removed");
    }
}
