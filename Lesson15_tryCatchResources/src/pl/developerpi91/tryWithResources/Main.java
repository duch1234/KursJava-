package pl.developerpi91.tryWithResources;

import pl.developerpi91.tryWithResources.*;

public class Main {
    public static void main(String[] args) {

        try(
                HtmlTag h1 = new HtmlTag("h1");
                HtmlTag em = new HtmlTag("em");
        ) {
            em.body("moj tekst");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
