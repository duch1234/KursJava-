package pl.developerpi91.wzorce.obserwator;

public interface Observable {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();


}
