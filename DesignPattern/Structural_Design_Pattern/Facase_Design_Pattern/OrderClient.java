package DesignPattern.Structural_Design_Pattern.Facase_Design_Pattern;

public class OrderClient {
    public static void main(String[] args) {
        FoodItem food = new Pizza();
        food = new ExtraCheeseDecorator(food);
        food = new ToppingsDecorator(food);

        OrderFacade orderFacade = new OrderFacade();
        orderFacade.placeOrder(food);
    }
}

