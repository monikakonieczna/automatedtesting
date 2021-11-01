import framework.Browser;
import framework.Pages;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DemoTest {
    @Test
    public void canGoToHomePage(){
        Browser.openBrowser("Chrome");
        Pages.homePage().goTo();
        Assertions.assertTrue(Pages.homePage().isAt());
    }

    @Test
    public void canGoToCheckInPage(){
        Pages.checkInPages().goTo();
        Assertions.assertTrue(Pages.homePage().isAt());
    }

    @AfterAll
    public static void cleanUp(){
        Browser.close();
    }


}
