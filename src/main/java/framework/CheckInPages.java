package framework;

public class CheckInPages {
    static String url = "http://https://www.google.com";
    static String tittle = "Google";

    public void goTo() {
        Browser.goTo(url);
    }

    public boolean isAt() {
        return Browser.tittle().equals(tittle);

    }
}
