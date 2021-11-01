package framework;

import framework.CheckInPages;
import framework.HomePage;

public class Pages {
    public static HomePage homePage() {
        HomePage homePage = new HomePage();
        return homePage;
    }

    public static CheckInPages checkInPages() {
        CheckInPages checkInPages = new CheckInPages();
        return checkInPages;
    }
}
