package DesignPattern.Structural_Design_Pattern.Proxy_Design_Pattern;

public class RealDeliveryService implements DeliveryService{

    public RealDeliveryService() {
        System.out.println("Connecting to real delivery system...");
    }

    @Override
    public void trackOrder(String orderId) {
        System.out.println("Tracking order: " + orderId);
    }
}
