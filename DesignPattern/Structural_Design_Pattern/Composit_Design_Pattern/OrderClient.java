package DesignPattern.Structural_Design_Pattern.Composit_Design_Pattern;

/**
 * OrderClient represents the entry point of the application.
 *
 * This class demonstrates the evolution of client code when using
 * the Composite Design Pattern and how it becomes more optimized
 * and decoupled by introducing Factory and Facade patterns.
 *
 * Initially, the client was responsible for:
 * - Creating individual food items (Pizza, Burger)
 * - Creating the composite object (ComboMeal)
 * - Managing the composition logic
 *
 * This approach works for understanding the Composite pattern,
 * but it tightly couples the client with concrete implementations.
 *
 * In the optimized approach, object creation and composition logic
 * are delegated to Factory and Facade layers.
 * The client now interacts only with OrderFacade,
 * making the system easier to maintain, extend, and test.
 */
public class OrderClient {

    public static void main(String[] args) {

        /*
         * Code using only Composite Design Pattern
         *
         * FoodItem pizza = new Pizza();
         * FoodItem burger = new Burger();
         *
         * ComboMeal combo = new ComboMeal();
         * combo.addItem(pizza);
         * combo.addItem(burger);
         *
         * System.out.println("Total cost: ₹" + combo.getCost());
         * combo.showDetails();
         */

        /*
         * Optimized client code using Factory and Facade patterns.
         * The client is now decoupled from concrete food item classes
         * and relies only on the Facade for placing orders.
         */
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.placeOrder("COMBO_MEAL");
    }
}
