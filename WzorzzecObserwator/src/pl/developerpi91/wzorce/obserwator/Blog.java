package pl.developerpi91.wzorce.obserwator;

import java.util.HashSet;
import java.util.Set;

public class Blog implements Observable {

    public String blogName;
    private Set<Observer> observers;

    public Blog(String blogName) {
        this.blogName = blogName;
        this.observers = new HashSet<>();
    }

    public void publishNewArticle(String title, String shortDescription){
        System.out.println(title);
        System.out.println(shortDescription);
        System.out.println("Artticle was published succesfully");

        ArticleEvent(title);
    }
    private void ArticleEvent(String title){

        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
        System.out.println("Observer added: " + observer.toString());
    }

    @Override
    public void removeObserver(Observer observer) {
        System.out.println("Observer removed: " + observer.toString());

    }

    @Override
    public void notifyObservers() {
        System.out.println("Dear obsrver we have some news fot you!!!");
        for (Observer observer: observers) {
            observer.update();
        }
    }
}
