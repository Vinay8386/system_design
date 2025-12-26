package DesignPattern.Structural_Design_Pattern.Bridge_Design_Pattern;

public abstract class Order {

    protected PaymentMethod paymentMethod; //this is protected so accessible to subclass

    protected Order(PaymentMethod paymentMethod){
        this.paymentMethod=paymentMethod;
    }

    public abstract void placeOrder(double amount);
}
