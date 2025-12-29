package DesignPattern.Behavioral_Design_Pattern.ChainOfResponsibility_Design_Pattern;

public class OrderClient {

    public static void main(String[] args) {

        OrderApprover manager = new Manager();
        OrderApprover director = new Director();
        OrderApprover ceo = new CEO();

        manager.setNext(director);
        director.setNext(ceo);

        manager.approveOrder(800);
        manager.approveOrder(3000);
        manager.approveOrder(10000);
    }
}

