package DesignPattern.Behavioral_Design_Pattern.Observer_Design_Pattern;

public interface OrderSubject {
    void registerObserver(OrderObserver observer);
    void removeObserver(OrderObserver observer);
    void notifyObservers();
}

