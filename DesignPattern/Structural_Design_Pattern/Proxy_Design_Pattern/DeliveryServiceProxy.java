package DesignPattern.Structural_Design_Pattern.Proxy_Design_Pattern;

public class DeliveryServiceProxy implements DeliveryService{

    private RealDeliveryService realDeliveryService;
    private boolean isAuthenticated;

    public DeliveryServiceProxy(boolean isAuthenticated){
        this.isAuthenticated=isAuthenticated;
    }

    @Override
    public void trackOrder(String orderId) {
        if(!isAuthenticated){
            System.out.println("Access denied: User not authenticated");
            return;
        }

        if(realDeliveryService==null){
            realDeliveryService = new RealDeliveryService(); // lazy loading
        }

        System.out.println("Logging: Tracking request for order " + orderId);
        realDeliveryService.trackOrder(orderId);
    }
}
