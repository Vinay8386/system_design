package DesignPattern.Behavioral_Design_Pattern.ChainOfResponsibility_Design_Pattern;

public abstract class AbstractApprover implements OrderApprover{

    protected OrderApprover next;

    @Override
    public void setNext(OrderApprover next) {
        this.next = next;
    }
}
