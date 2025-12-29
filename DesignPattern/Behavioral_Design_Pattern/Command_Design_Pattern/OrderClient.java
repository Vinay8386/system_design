package DesignPattern.Behavioral_Design_Pattern.Command_Design_Pattern;

public class OrderClient {

    public static void main(String[] args) {

        OrderService orderService = new OrderService();

        OrderCommand placeOrder =
                new PlaceOrderCommand(orderService);

        OrderCommand cancelOrder =
                new CancelOrderCommand(orderService);

        OrderInvoker invoker = new OrderInvoker();

        invoker.setCommand(placeOrder);
        invoker.pressButton();

        invoker.setCommand(cancelOrder);
        invoker.pressButton();
    }
}

