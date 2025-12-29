package DesignPattern.Behavioral_Design_Pattern.Iterator_design_Pattern;

public class OrderClient {

    public static void main(String[] args) {

        FoodMenu menu = new FoodMenu();
        menu.addItem("Pizza");
        menu.addItem("Burger");
        menu.addItem("Pasta");

        Iterator<String> iterator = menu.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

