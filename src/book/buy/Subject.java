package book.buy;

public interface Subject {
    void removeObserver(Observer observer);
    void registerObserver(Observer observer);
    void notifyObserver();
}
