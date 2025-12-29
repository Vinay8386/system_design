package DesignPattern.Behavioral_Design_Pattern.Strategy_Design_Pattern;

/**
 * OrderClient demonstrates different ways of using the Strategy Design Pattern
 * to perform payment in an application.
 *
 * This class shows:
 * 1. Constructor Injection (fixed strategy)
 * 2. Setter Injection (flexible strategy)
 * 3. Factory + Strategy (recommended for UI-driven systems)
 *
 * The purpose is to help beginners understand:
 * - How payment behavior can be changed
 * - When to use which approach
 * - How real applications handle user-selected options
 */
public class OrderClient {

    /**
     * Application entry point.
     *
     * Below examples show multiple ways to inject PaymentStrategy
     * into PaymentService. Only one approach is used at a time
     * based on the requirement.
     */
    public static void main(String[] args) {

        /*
         * ===============================
         * 1️⃣ Constructor Injection
         * ===============================
         *
         * - Strategy is fixed at object creation time
         * - Payment method cannot be changed later
         * - Useful when behavior should remain constant
         *
         * Example:
         * PaymentService upiPayment =
         *         new PaymentService(new UpiPayment());
         * upiPayment.pay(500);
         *
         * PaymentService cardPayment =
         *         new PaymentService(new CardPayment());
         * cardPayment.pay(1000);
         */

        /*
        PaymentService upiPayment =
                new PaymentService(new UpiPayment());
        upiPayment.pay(500);

        PaymentService cardPayment =
                new PaymentService(new CardPayment());
        cardPayment.pay(1000);
        */

        /*
         * ===============================
         * 2️⃣ Setter Injection
         * ===============================
         *
         * - Strategy can be changed at runtime
         * - Same PaymentService object is reused
         * - Useful when user can switch payment method (UI scenario)
         *
         * Example:
         * User first selects UPI, then switches to Card
         */

        PaymentService paymentService = new PaymentService();

        paymentService.setPaymentStrategy(new UpiPayment());
        paymentService.pay(500);

        paymentService.setPaymentStrategy(new CardPayment());
        paymentService.pay(1000);

        /*
         * ===============================
         * 3️⃣ Factory + Strategy (Best Practice)
         * ===============================
         *
         * - Client does NOT create payment objects directly
         * - Factory decides which strategy to create
         * - Ideal for real-world applications where input comes from UI
         *
         * Flow:
         * User selects payment type -> Factory creates strategy ->
         * Strategy is injected into PaymentService
         *
         * Example:
         * String userSelectedPayment = "UPI"; // from UI
         *
         * PaymentStrategy strategy =
         *         PaymentStrategyFactory.getPaymentStrategy(userSelectedPayment);
         *
         * PaymentService paymentService = new PaymentService(strategy);
         * paymentService.pay(500);
         */

        /*
        String userSelectedPayment = "UPI"; // from UI

        PaymentStrategy strategy =
                PaymentStrategyFactory.getPaymentStrategy(userSelectedPayment);

        PaymentService paymentService = new PaymentService(strategy);
        paymentService.pay(500);
        */
    }
}


