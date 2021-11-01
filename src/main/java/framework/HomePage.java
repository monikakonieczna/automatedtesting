package framework;

public class HomePage {
    static String url = "https://www.google.com";
    static String tittle = "Google";

    public void goTo() {
        Browser.goTo(url);
    }
    public boolean isAt(){
        return Browser.tittle().equals(tittle);

    }
}
