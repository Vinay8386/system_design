package DesignPattern.Behavioral_Design_Pattern.ChainOfResponsibility_Design_Pattern;

public interface OrderApprover {
    void setNext(OrderApprover next);
    void approveOrder(int amount);
}

