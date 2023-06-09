package com.keyin;

public class BrowserNavigationMain {
    public static void main(String[] args) {
        BrowserHistory history = new BrowserHistory();

        String url1 = "https://www.youtube.com";
        String url2 = "https://www.facebook.com";
        String url3 = "https://www.ign.com";
        String url4 = "https://www.reddit.com";

        history.visit(url1);
        history.visit(url2);
        history.visit(url3);
        history.visit(url4);

        // Initial History
        history.printHistory();

        // Going Back 3 Pages
        history.goBack();
        history.goBack();
        history.goBack();
        //System.out.println("\n");
        history.printHistory();

        // Going Forward 1 Page
        history.goForward();
        history.printHistory();

        // Going Forward 2 More Pages
        history.goForward();
        history.goForward();
        history.printHistory();

    }
}