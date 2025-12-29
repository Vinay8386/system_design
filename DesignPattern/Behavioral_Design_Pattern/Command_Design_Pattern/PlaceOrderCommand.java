package DesignPattern.Behavioral_Design_Pattern.Command_Design_Pattern;

public class PlaceOrderCommand implements OrderCommand{

    private OrderService orderService;

    public PlaceOrderCommand(OrderService orderService){
        this.orderService=orderService;
    }

    @Override
    public void execute() {
        orderService.placeOrder();
    }
}
