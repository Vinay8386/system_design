package DesignPattern.Structural_Design_Pattern.Decorator_Design_Pattern;

public class OrderClient {

    public static void main(String[] args) {

        FoodItem order = new Pizza(); // base item

        order = new ExtraCheeseDecorator(order);
        order = new ToppingsDecorator(order);

        System.out.println(order.getDescription());
        System.out.println("Total Cost: " + order.getCost());
    }
}

