package DesignPattern.Structural_Design_Pattern.Adapter.Design.Pattern;

public class OrderClient {

    public static void main(String[] args) {

        FoodItem food = new Pizza();
        food = new ExtraCheeseDecorator(food);

        // TODO: Replace hardcoded adapter creation with Factory Pattern
        // so that adding new payment gateways does not require client changes.
        PaymentService paymentService =
                new RazorPayAdapter(new RazorPayGateway());

        OrderFacade orderFacade = new OrderFacade(paymentService);
        orderFacade.placeOrder(food);
    }
}

