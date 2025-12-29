package DesignPattern.Behavioral_Design_Pattern.Observer_Design_Pattern;

import java.util.*;

public class Order implements OrderSubject{

    private List<OrderObserver> observers = new ArrayList<>();
    private String orderStatus;

    @Override
    public void registerObserver(OrderObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(OrderObserver observer) {
        observers.remove(observer);
    }

    public void setOrderStatus(String status) {
        this.orderStatus = status;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(orderStatus);
        }
    }
}
