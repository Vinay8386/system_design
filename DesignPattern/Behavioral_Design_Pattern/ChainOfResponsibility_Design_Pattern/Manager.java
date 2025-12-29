package DesignPattern.Behavioral_Design_Pattern.ChainOfResponsibility_Design_Pattern;

public class Manager extends AbstractApprover {

    @Override
    public void approveOrder(int amount) {
        if (amount <= 1000) {
            System.out.println("Manager approved order of ₹" + amount);
        } else if (next != null) {
            next.approveOrder(amount);
        }
    }
}

