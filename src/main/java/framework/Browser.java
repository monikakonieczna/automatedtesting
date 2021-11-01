package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Browser {
    static WebDriver driver = null;

    public static void openBrowser(String browserType) {
        System.out.println("openBrowser");
        //if (browserType.equals("Chrome"))
        System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver/chromedriver.exe");

        //try to set preferences

        //ChromeOptions options = new ChromeOptions();
        //options.addArguments("headless");
        //options.addArguments("--disable-infobars");
        //driver = new ChromeDriver(options);
        driver = new ChromeDriver();

    }

    public static void goTo(String url) {
        driver.get(url);

    }

    public static String tittle() {
        return driver.getTitle();
    }

    public static void close() {
        driver.close();
    }
}
