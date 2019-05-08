package pl.developerpi91.wzorce.obserwator;

public class Main {

    public static void main(String[] args) {
        Blog blog = new Blog("Mój Blog");
        Observator pawel = new Observator("Pawel","pawelMail");
        blog.addObserver(pawel);
        blog.publishNewArticle("newArticle","description");

    }
}
