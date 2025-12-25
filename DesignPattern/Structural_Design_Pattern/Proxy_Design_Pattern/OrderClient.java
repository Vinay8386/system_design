package DesignPattern.Structural_Design_Pattern.Proxy_Design_Pattern;

public class OrderClient {
    public static void main(String[] args) {
        DeliveryService deliveryService=new DeliveryServiceProxy(true);
        deliveryService.trackOrder("ORD463");
    }
}
