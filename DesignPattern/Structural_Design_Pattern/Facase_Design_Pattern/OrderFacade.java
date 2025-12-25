package DesignPattern.Structural_Design_Pattern.Facase_Design_Pattern;


public class OrderFacade {

    private PaymentService paymentService;
    private DeliveryService deliveryService;
    private NotificationService notificationService;

    public OrderFacade(){
        this.paymentService = new PaymentService();
        this.deliveryService = new DeliveryService();
        this.notificationService = new NotificationService();
    }

    public void placeOrder(FoodItem foodItem) {

        double totalAmount = foodItem.getCost();

        paymentService.makePayment(totalAmount);
        deliveryService.assignDeliveryPartner();
        notificationService.sendOrderNotification();

        System.out.println("Order placed successfully!");
    }
}
