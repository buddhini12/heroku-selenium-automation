package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeysTests extends BaseTests {

    @Test
    public void testBackspace(){
        var keyPage = homePage.clickKeyPresses();
        keyPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPage.getResult(), "You entered: BACK_SPACE");
    }

    @Test
    public void testPi(){
        var keyPage = homePage.clickKeyPresses();
        keyPage.enterPi();
        System.out.println(keyPage.getResult());
        assertEquals(keyPage.getResult(), "You entered: p=3.14","Printed result doesn't match with actual input");
        /*
            NOTE: we didn't finish this test in the video.
            We debugged to watch it enter the pi key
         */

    }
}
