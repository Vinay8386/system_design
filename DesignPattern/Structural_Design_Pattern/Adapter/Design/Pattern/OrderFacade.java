package DesignPattern.Structural_Design_Pattern.Adapter.Design.Pattern;

public class OrderFacade {

    private PaymentService paymentService;

    public OrderFacade(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder(FoodItem foodItem) {
        paymentService.makePayment(foodItem.getCost());
        System.out.println("Order placed successfully");
    }
}

