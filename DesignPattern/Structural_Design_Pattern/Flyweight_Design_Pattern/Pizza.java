package DesignPattern.Structural_Design_Pattern.Flyweight_Design_Pattern;

public class Pizza implements FoodItem{

    private final String name = "Pizza";
    private final double price = 200;

    @Override
    public void showDetails(String orderId) {
        System.out.println("OrderId: " + orderId +
                " | Item: " + name +
                " | Price: ₹" + price);
    }
}
