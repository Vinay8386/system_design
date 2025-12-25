package DesignPattern.Structural_Design_Pattern.Adapter.Design.Pattern;

/**
 * Adapter class that allows the application to use RazorPay payment gateway
 * through the PaymentService interface.
 *
 * This class implements the Adapter Design Pattern by converting the
 * application's expected payment method (makePayment)
 * into the method provided by the third-party RazorPay gateway (payAmount).
 *
 * The adapter acts as a bridge between:
 * - Target Interface: PaymentService
 * - Adaptee: RazorPayGateway
 *
 * This approach ensures loose coupling and allows easy replacement
 * of payment gateways without modifying existing business logic.
 */
public class RazorPayAdapter implements PaymentService {

    /**
     * Reference to the third-party RazorPay payment gateway.
     */
    private RazorPayGateway razorPayGateway;

    /**
     * Constructs a RazorPayAdapter with the given RazorPay gateway.
     *
     * @param razorPayGateway the third-party payment gateway to be adapted
     */
    public RazorPayAdapter(RazorPayGateway razorPayGateway) {
        this.razorPayGateway = razorPayGateway;
    }

    /**
     * Processes the payment by delegating the call to the RazorPay gateway.
     *
     * This method translates the application's payment request
     * into a format understood by the RazorPay gateway.
     *
     * @param amount the payment amount to be processed
     */
    @Override
    public void makePayment(double amount) {
        razorPayGateway.payAmount((int) amount); //Adapter is written by us and We read RazorPay’s documentation and We intentionally map
    }
}

