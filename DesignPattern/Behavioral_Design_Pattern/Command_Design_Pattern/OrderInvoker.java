package DesignPattern.Behavioral_Design_Pattern.Command_Design_Pattern;

public class OrderInvoker {

    private OrderCommand command;

    public void setCommand(OrderCommand command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}

