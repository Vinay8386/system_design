package DesignPattern.Behavioral_Design_Pattern.Command_Design_Pattern;

public class CancelOrderCommand implements OrderCommand {

    private OrderService orderService;

    public CancelOrderCommand(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public void execute() {
        orderService.cancelOrder();
    }
}

